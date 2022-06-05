package com.example.widget

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // agregamos la URL a la que iremos

    private val BASE_URL = "https://ugb.instructure.com/"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // creamos un cliente de chrome
        webView.webChromeClient = object : WebChromeClient(){

        }

        //Creamos un view client
        webView.webViewClient = object : WebViewClient(){

        }

        // activamos java script
        val setting:WebSettings = webView.settings
        setting.javaScriptEnabled = true
        webView.loadUrl(BASE_URL)
    }
}