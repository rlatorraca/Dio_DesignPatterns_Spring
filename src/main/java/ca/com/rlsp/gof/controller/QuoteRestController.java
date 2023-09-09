package ca.com.rlsp.gof.controller;

import ca.com.rlsp.gof.model.CurrencyBase;
import ca.com.rlsp.gof.service.CurrencyBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("quotes")
public class QuoteRestController {

    @Autowired
    private CurrencyBaseService currencyBaseService;

    @GetMapping
    public ResponseEntity<Iterable<CurrencyBase>> getAllQuotes() {
        return ResponseEntity.ok(currencyBaseService.getAllQuotes());
    }

    @PostMapping
    public ResponseEntity<CurrencyBase> saveQuoteOnDB(@RequestBody CurrencyBase currencyBase) {
        currencyBaseService.saveQuoteOnDb(currencyBase);
        return ResponseEntity.ok(currencyBase);
    }
}
