package com.example.bponlinejava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class SuksesTembusPtnActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sukses_tembus_ptn);

        WebView webViewPtn = (WebView) findViewById(R.id.webview_tembus_ptn);
        webViewPtn.loadUrl("https://www.naufalnabila.com/bintangpelajar/sukses_tembus_ptn.jpg");
        webViewPtn.getSettings().getJavaScriptEnabled();
        webViewPtn.getSettings().setBuiltInZoomControls(true);
        webViewPtn.getSettings().setDisplayZoomControls(false);
        webViewPtn.getSettings().setLoadWithOverviewMode(true);
        webViewPtn.getSettings().setUseWideViewPort(true);
    }
}