package com.votzapp.app;

import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.io.File;


public class NoErrorWebViewClient extends WebViewClient {
    @Override
    public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
        Log.e(String.valueOf(errorCode), description);

        // API level 5: WebViewClient.ERROR_HOST_LOOKUP
        if (errorCode == -2) {
            view.loadUrl("file:///android_asset/www/index.html");
            return;
        }

        // Default behaviour
        super.onReceivedError(view, errorCode, description, failingUrl);
    }
}
