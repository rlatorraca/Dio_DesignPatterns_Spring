package ca.com.rlsp.gof.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Quotes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Dolar amaricano
    private Double USDEUR;
    private Double USDBRL;
    private Double USDGBP;
    private Double USDCAD;
    private Double USDARS;

    //REAL
    private Double BRLEUR;
    private Double BRLUSD;
    private Double BRLGBP;

    // LIBRA ESTERLINA
    private Double GBPUSD;
    private Double GBPBRL;
    private Double GBPEUR;



    public Double getUSDEUR() {
        return USDEUR;
    }

    public Double getUSDBRL() {
        return USDBRL;
    }

    public Double getUSDGBP() {
        return USDGBP;
    }

    public Double getBRLEUR() {
        return BRLEUR;
    }

    public Double getBRLUSD() {
        return BRLUSD;
    }

    public Double getBRLGBP() {
        return BRLGBP;
    }

    public Double getGBPUSD() {
        return GBPUSD;
    }

    public Double getGBPBRL() {
        return GBPBRL;
    }

    public Double getGBPEUR() {
        return GBPEUR;
    }

    public Double getUSDCAD() {
        return USDCAD;
    }

    public Double getUSDARS() {
        return USDARS;
    }

    @JsonProperty("USDEUR")
    @JsonInclude(JsonInclude.Include. NON_NULL)
    public void setUSDEUR(Double USDEUR) {
        this.USDEUR = USDEUR;
    }

    @JsonProperty("USDBRL")
    @JsonInclude(JsonInclude.Include. NON_NULL)
    public void setUSDBRL(Double USDBRL) {
        this.USDBRL = USDBRL;
    }

    @JsonProperty("USDGBP")
    @JsonInclude(JsonInclude.Include. NON_NULL)
    public void setUSDGBP(Double USDGBP) {
        this.USDGBP = USDGBP;
    }

    @JsonProperty("BRLEUR")
    @JsonInclude(JsonInclude.Include. NON_NULL)
    public void setBRLEUR(Double BRLEUR) {
        this.BRLEUR = BRLEUR;
    }
    @JsonProperty("BRLUSD")
    @JsonInclude(JsonInclude.Include. NON_NULL)
    public void setBRLUSD(Double BRLUSD) {
        this.BRLUSD = BRLUSD;
    }
    @JsonProperty("BRLGBP")
    @JsonInclude(JsonInclude.Include. NON_NULL)
    public void setBRLGBP(Double BRLGBP) {
        this.BRLGBP = BRLGBP;
    }
    @JsonProperty("GBPUSD")
    @JsonInclude(JsonInclude.Include. NON_NULL)
    public void setGBPUSD(Double GBPUSD) {
        this.GBPUSD = GBPUSD;
    }
    @JsonProperty("GBPBRL")
    @JsonInclude(JsonInclude.Include. NON_NULL)
    public void setGBPBRL(Double GBPBRL) {
        this.GBPBRL = GBPBRL;
    }
    @JsonProperty("GBPEUR")
    @JsonInclude(JsonInclude.Include. NON_NULL)
    public void setGBPEUR(Double GBPEUR) {
        this.GBPEUR = GBPEUR;
    }

    @JsonProperty("USDCAD")
    @JsonInclude(JsonInclude.Include. NON_NULL)
    public void setUSDCAD(Double USDCAD) {
        this.USDCAD = USDCAD;
    }

    @JsonProperty("USDARS")
    @JsonInclude(JsonInclude.Include. NON_NULL)
    public void setUSDARS(Double USDARS) {
        this.USDARS = USDARS;
    }
}
