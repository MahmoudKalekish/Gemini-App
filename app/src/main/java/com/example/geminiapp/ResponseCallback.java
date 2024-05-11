package com.example.geminiapp;

public interface ResponseCallback {
    void onResponse(String response);
    void onError(Throwable throwable);
}
