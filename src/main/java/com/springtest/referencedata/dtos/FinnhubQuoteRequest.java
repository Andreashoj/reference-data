package com.springtest.referencedata.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FinnhubQuoteRequest {
    private String ticker;
    @JsonProperty("c")
    private Double currentPrice;
    @JsonProperty("pc")
    private Double previousClose;
    @JsonProperty("d")
    private Double change;
    @JsonProperty("dp")
    private Double changePercent;
    @JsonProperty("h")
    private Double high;
    @JsonProperty("l")
    private Double low;
    @JsonProperty("o")
    private Double open;
    @JsonProperty("t")
    private Long timestamp;

    public FinnhubQuoteRequest() {}

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

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Double getOpen() {
        return open;
    }

    public void setOpen(Double open) {
        this.open = open;
    }

    public Double getLow() {
        return low;
    }

    public void setLow(Double low) {
        this.low = low;
    }

    public Double getHigh() {
        return high;
    }

    public void setHigh(Double high) {
        this.high = high;
    }
}
