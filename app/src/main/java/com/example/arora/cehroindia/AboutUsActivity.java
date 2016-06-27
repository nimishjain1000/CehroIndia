package com.example.arora.cehroindia;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class AboutUsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        WebView webview = new WebView(this);
        setContentView(webview);
        webview.loadUrl("http://cehroindia.org/overview/");

    }
}
