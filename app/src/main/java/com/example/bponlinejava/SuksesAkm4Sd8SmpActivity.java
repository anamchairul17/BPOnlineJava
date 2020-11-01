package com.example.bponlinejava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class SuksesAkm4Sd8SmpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sukses_akm4_sd8_smp);

        WebView webViewSmp = (WebView) findViewById(R.id.webview_akm_sd);
        webViewSmp.loadUrl("https://www.naufalnabila.com/bintangpelajar/sukses_akm_4.jpg");
        webViewSmp.getSettings().getJavaScriptEnabled();
        webViewSmp.getSettings().setBuiltInZoomControls(true);
        webViewSmp.getSettings().setDisplayZoomControls(false);
        webViewSmp.getSettings().setLoadWithOverviewMode(true);
        webViewSmp.getSettings().setUseWideViewPort(true);
    }
}