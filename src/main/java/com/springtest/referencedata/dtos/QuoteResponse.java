package com.springtest.referencedata.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class QuoteResponse {
    private String ticker;
    private Double currentPrice;
    private Double previousClose;
    private Double change;
    private Double changePercent;
    private Double high;
    private Double low;
    private Double open;
    private Long timestamp;

    public QuoteResponse(String ticker, Double currentPrice, Double previousClose, Double change, Double changePercent, Double high, Double low, Double open, Long timestamp) {
        this.ticker = ticker;
        this.currentPrice = currentPrice;
        this.previousClose = previousClose;
        this.change = change;
        this.changePercent = changePercent;
        this.high = high;
        this.low = low;
        this.open = open;
        this.timestamp = timestamp;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public Double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(Double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public Double getPreviousClose() {
        return previousClose;
    }

    public void setPreviousClose(Double previousClose) {
        this.previousClose = previousClose;
    }

    public Double getChange() {
        return change;
    }

    public void setChange(Double change) {
        this.change = change;
    }

    public Double getChangePercent() {
        return changePercent;
    }


    public void setChangePercent(Double changePercent) {
        this.changePercent = changePercent;

    }

    public Double getHigh() {
        return high;
    }

    public void setHigh(Double high) {
        this.high = high;
    }

    public Double getLow() {
        return low;
    }

    public void setLow(Double low) {
        this.low = low;
    }

    public Double getOpen() {
        return open;
    }

    public void setOpen(Double open) {
        this.open = open;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
