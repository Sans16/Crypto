package com.example.ssanusi.crypto.Data.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

class Quotes {

    @SerializedName("USD")
    @Expose
    private USD uSD;

    public USD getUSD() {
        return uSD;
    }

    public void setUSD(USD uSD) {
        this.uSD = uSD;

    }
}
