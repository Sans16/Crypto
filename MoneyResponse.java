package com.example.ssanusi.crypto;

import java.util.ArrayList;

public class MoneyResponse {
    ArrayList<Money> data;

    public MoneyResponse(ArrayList<Money> data) {
        this.data = data;
    }

    public ArrayList<Money> getData() {
        return data;
    }

    public void setData(ArrayList<Money> data) {
        this.data = data;
    }
}
