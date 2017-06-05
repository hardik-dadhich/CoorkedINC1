package com.dadhich.app.crookedinc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
 private WebView mwebview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mwebview=(WebView)findViewById(R.id.web);
        WebSettings webSettings=mwebview.getSettings();
        webSettings.getJavaScriptEnabled();
        mwebview.loadUrl("https://crookedcomputing.weebly.com ");
        mwebview.setWebChromeClient(new WebChromeClient());

    }

    @Override
    public void onBackPressed() {
        if(mwebview.canGoBack())
        {
            mwebview.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}
