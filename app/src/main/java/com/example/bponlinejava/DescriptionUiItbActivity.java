package com.example.bponlinejava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class DescriptionUiItbActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description_ui_itb);

        WebView webViewaja = (WebView) findViewById(R.id.webview_ui_itb);
        webViewaja.loadUrl("https://www.naufalnabila.com/bintangpelajar/deskripsi_ui_itb.png");
        webViewaja.getSettings().getJavaScriptEnabled();
        webViewaja.getSettings().setBuiltInZoomControls(true);
        webViewaja.getSettings().setDisplayZoomControls(false);
        webViewaja.getSettings().setLoadWithOverviewMode(true);
        webViewaja.getSettings().setUseWideViewPort(true);
    }
}