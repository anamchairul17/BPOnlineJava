package com.example.bponlinejava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class AkmSmaActivity extends AppCompatActivity {

    WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akm_sma);

        WebView webVieSma = (WebView) findViewById(R.id.webview_akm_sma);
       webVieSma.loadUrl("https://www.naufalnabila.com/bintangpelajar/suukses_akm_11.jpg");
       webVieSma.getSettings().getJavaScriptEnabled();
       webVieSma.getSettings().setBuiltInZoomControls(true);
       webVieSma.getSettings().setDisplayZoomControls(false);
       webVieSma.getSettings().setLoadWithOverviewMode(true);
       webVieSma.getSettings().setUseWideViewPort(true);
        
    }
}