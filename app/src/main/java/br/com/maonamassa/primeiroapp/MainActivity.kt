package br.com.maonamassa.primeiroapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById(R.id.myButton) as Button
        val textView = findViewById(R.id.myTextView) as TextView

        var numeroDeVezes = 0

        button.setOnClickListener {
            numeroDeVezes++
            textView.text = "o botão foi clicado ${numeroDeVezes} vezes"
        }

        button.setOnLongClickListener {
            numeroDeVezes--
            textView.text = "o botão foi clicado ${numeroDeVezes} vezes"
            true
        }
    }
}
