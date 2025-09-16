package com.copilot.az;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webview);

        // Cấu hình WebView
        webView.setWebViewClient(new WebViewClient()); // Mở web trong app, không chuyển sang trình duyệt
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true); // Bật JavaScript để chơi game online

        // Load trang web
        webView.loadUrl("https://azgame.vn"); // Thay bằng link web/game của bạn
    }

    // Xử lý nút Back để quay lại trang trước trong WebView
    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
