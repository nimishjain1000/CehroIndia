package com.example.arora.cehroindia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class OurProgramActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_our_program);

        WebView webview = new WebView(this);
        setContentView(webview);
        webview.loadUrl("http://cehroindia.org/services/");

    }
}
