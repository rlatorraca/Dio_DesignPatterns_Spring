package ca.com.rlsp.gof.service;


import ca.com.rlsp.gof.model.CurrencyBase;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * // "live" - get the most recent exchange rate data
 * https://api.currencylayer.com/live
 *
 * // "historical" - get historical rates for a specific day
 * https://api.currencylayer.com/historical?date=YYYY-MM-DD
 *
 * // "convert" - convert one currency to another
 * https://api.currencylayer.com/convert?from=EUR&to=GBP&amount=100
 *
 * // "timeframe" - request exchange rates for a specific period of time
 * https://api.currencylayer.com/timeframe?start_date=2015-01-01&end_date=2015-05-01
 *
 * // "change" - request any currency's change parameters (margin, percentage)
 * https://api.currencylayer.com/change?currencies=USD,EUR
 */

@Component
@FeignClient(name = "currencylayer", url = "http://api.currencylayer.com/")
public interface CurrencyLayerService {


    @GetMapping("live?access_key={secret}&source={source}&currencies={currencies}")
    CurrencyBase realTimeQuote(
            @PathVariable("secret") String secret,
            @PathVariable("source") String source,
            @PathVariable("currencies") String currencies);


}
