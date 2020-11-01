package com.example.bponlinejava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class JagoBidangStudiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jago_bidang_studi);

        WebView webViewJago = (WebView) findViewById(R.id.webview_jago_bidstud);
        webViewJago.loadUrl("https://www.naufalnabila.com/bintangpelajar/jago_bidang_studi.jpg");
        webViewJago.getSettings().getJavaScriptEnabled();
        webViewJago.getSettings().setBuiltInZoomControls(true);
        webViewJago.getSettings().setDisplayZoomControls(false);
        webViewJago.getSettings().setLoadWithOverviewMode(true);
        webViewJago.getSettings().setUseWideViewPort(true);
    }
}