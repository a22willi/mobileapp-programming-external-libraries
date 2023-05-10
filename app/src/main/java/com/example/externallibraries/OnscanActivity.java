package com.example.externallibraries;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

public class OnscanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onscan);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String scanResult = extras.getString("scan");
        WebView webView = findViewById(R.id.webView);
        webView.loadUrl(scanResult);
    }
}