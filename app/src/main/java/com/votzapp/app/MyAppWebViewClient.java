package com.votzapp.app;

import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MyAppWebViewClient extends WebViewClient {


    //To prevent the default browser action
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        if (Uri.parse(url).getHost().endsWith("votzapp.com")) {
            return false;
        }

        view.loadUrl(url);
        return true;
    }
}