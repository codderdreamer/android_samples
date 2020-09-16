package com.example.a9_webview_calismasi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tanimla();
        goster();
        //gosterHtml();

    }

    private void tanimla() {
        webView = findViewById(R.id.webView);
    }

    private void goster() {
        webView.getSettings().setJavaScriptEnabled(true); // web sitesindeki javascript kodlarının çalışmasını onaylamak
        webView.loadUrl("https://www.google.com.tr");
    }

    private void gosterHtml()
    {
        String htmlKod = "<html><head>Webview HTML ORNEGI</head><body><h1>HTML ORNEGI</h1></body></html>";
        webView.loadData(htmlKod,"text/html","UTF-8");
    }
}