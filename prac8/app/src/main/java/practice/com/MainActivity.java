package practice.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText urlEditText;
    Button goButton, preButton;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        urlEditText = (EditText) findViewById(R.id.urlEditText);

        goButton = (Button) findViewById(R.id.goButton);
        preButton = (Button) findViewById(R.id.preButton);

        webView = (WebView) findViewById(R.id.webView);

        webView.setWebViewClient(new CookWebViewClient());

        WebSettings webSet = webView.getSettings();
        webSet.setBuiltInZoomControls(true);

        goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                webView.loadUrl(urlEditText.getText().toString());
            }
        });

        preButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                webView.goBack();
            }
        });

    }
}
