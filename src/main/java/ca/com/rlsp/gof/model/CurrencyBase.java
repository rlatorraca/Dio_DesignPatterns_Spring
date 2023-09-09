package ca.com.rlsp.gof.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;


@Entity
public class CurrencyBase {

    @Id
    private Long timestamp;
    private String source;
    @Transient
    private String currencies;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Quotes quotes;



    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getCurrencies() {
        return currencies;
    }
    @JsonInclude(JsonInclude.Include. NON_NULL)
    public void setCurrencies(String currencies) {
        this.currencies = currencies;
    }

    public Quotes getQuotes() {
        return quotes;
    }

    public void setQuotes(Quotes quotes) {
        this.quotes = quotes;
    }
}
