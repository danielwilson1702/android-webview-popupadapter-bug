package com.myapp

import android.os.Bundle
import android.webkit.WebView
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview)

        val webView = WebView(this)
        val container = findViewById<FrameLayout>(R.id.web_view_container)
        container.addView(webView)

        webView.settings.javaScriptEnabled = true

        webView.loadUrl("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select")
    }
}
