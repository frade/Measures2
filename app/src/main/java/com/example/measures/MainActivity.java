package com.example.measures;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView measures = (WebView)findViewById(R.id.web1);
        measures.getSettings().setJavaScriptEnabled(true);
        measures.setWebViewClient(new WebViewClient());
        measures.loadUrl("https://script.google.com/a/macros/xsolla.com/s/AKfycbxoPy6wzsaqthabNXfwv2_AaiuuxlV8_bC8zPHXenR6XsVN-V9992upyFLOcuzxW84KuA/exec");
    }
}
