package br.com.maonamassa.primeiroapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class SegundaActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        val textView = findViewById(R.id.primeiroTexto) as TextView
        val button = findViewById(R.id.botao) as Button

        button.setOnClickListener {
            textView.text = "o texto mudou"
        }
    }
}
