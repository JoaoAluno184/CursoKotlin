package br.com.joao.janelasweb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //permitindo a execução de códigos javascript
        wvPrincipal.settings.javaScriptEnabled = true

        //mantendo a navegaçao na webiview
        wvPrincipal.webViewClient = WebViewClient()

        //carregando um protocolo https
        wvPrincipal.loadUrl("http://google.com")
    }
}
