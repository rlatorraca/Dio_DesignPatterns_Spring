package ca.com.rlsp.gof.service;

import ca.com.rlsp.gof.model.CurrencyBase;

public interface CurrencyBaseService {

    void saveQuoteOnDb(CurrencyBase currencyBase);

    Iterable<CurrencyBase> getAllQuotes();
}
