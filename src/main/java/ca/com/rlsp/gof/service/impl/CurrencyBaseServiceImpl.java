package ca.com.rlsp.gof.service.impl;

import ca.com.rlsp.gof.model.CurrencyBase;
import ca.com.rlsp.gof.model.CurrencyRepository;
import ca.com.rlsp.gof.service.CurrencyBaseService;
import ca.com.rlsp.gof.service.CurrencyLayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class CurrencyBaseServiceImpl implements CurrencyBaseService {

    @Autowired
    private CurrencyRepository currencyRepository;

    @Autowired
    private CurrencyLayerService currencyLayerService;

    @Value("${mySecret}")
    private String secret;


    @Override
    public void saveQuoteOnDb(CurrencyBase currencyBase) {

        String[] arrayCurrencies = currencyBase.getCurrencies().split(",");

        Long timestamp = currencyBase.getTimestamp();
        CurrencyBase cb = currencyRepository.findByTimestamp(timestamp).orElseGet(() -> {
            CurrencyBase newCb = currencyLayerService.realTimeQuote(secret, currencyBase.getSource(), currencyBase.getCurrencies());
            return newCb;
        });

        currencyBase.setTimestamp(cb.getTimestamp());
        currencyBase.setQuotes(cb.getQuotes());
        // Inserir a cotacao, vinculando as cotas (novo ou existente).
        currencyRepository.save(currencyBase);



    }

    @Override
    public Iterable<CurrencyBase> getAllQuotes() {
        return currencyRepository.findAll();
    }
}
