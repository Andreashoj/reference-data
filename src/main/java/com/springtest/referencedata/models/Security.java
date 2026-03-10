package com.springtest.referencedata.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Security {
    @Id
    private String isin;
    private String ticker;
    private String name;
    private String currency;
    private String exchange;
    private String type;

    public Security() { // apparently empty constructor needed for JPA internals
    }

    public Security(String isin, String ticker, String name, String currency, String exchange, String type) {
        this.isin = isin;
        this.ticker = ticker;
        this.name = name;
        this.currency = currency;
        this.exchange = exchange;
        this.type = type;
    }

    public String getIsin() {
        return isin;
    }

    public void setIsin(String isin) {
        this.isin = isin;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
