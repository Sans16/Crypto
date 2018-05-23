package com.example.ssanusi.crypto;

public class Money {
    String id;
    String name;
    String symbol;
    String website_slug;

    public Money(String id, String name, String symbol, String website_slug) {
        this.id = id;
        this.name = name;
        this.symbol = symbol;
        this.website_slug = website_slug;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getWebsite_slug() {
        return website_slug;
    }

    public void setWebsite_slug(String website_slug) {
        this.website_slug = website_slug;
    }
}
