package com.example.bponlinejava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class SuksesTembusSeklanFavoritActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sukses_tembus_seklan_favorit);

        WebView webViewSeklan = (WebView) findViewById(R.id.webview_jago_bidstud);
        webViewSeklan.loadUrl("https://www.naufalnabila.com/bintangpelajar/Screenshot_20201019-141320.jpg");
        webViewSeklan.getSettings().getJavaScriptEnabled();
        webViewSeklan.getSettings().setBuiltInZoomControls(true);
        webViewSeklan.getSettings().setDisplayZoomControls(false);
        webViewSeklan.getSettings().setLoadWithOverviewMode(true);
        webViewSeklan.getSettings().setUseWideViewPort(true);
    }
}