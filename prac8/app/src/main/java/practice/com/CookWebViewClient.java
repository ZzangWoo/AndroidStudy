package practice.com;

import android.webkit.WebView;
import android.webkit.WebViewClient;

public class CookWebViewClient extends WebViewClient {

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        return super.shouldOverrideUrlLoading(view, url);
    }
}
