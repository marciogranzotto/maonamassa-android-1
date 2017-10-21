package br.com.maonamassa.primeiroapp

import android.content.Intent
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
        val botaoDeMenos = findViewById(R.id.botaoMenos) as Button

        var numeroDeVezes = 0

        button.setOnClickListener {
            val intent = Intent(this, ListaActivity::class.java)
            startActivity(intent)
        }

        button.setOnLongClickListener {
            numeroDeVezes++
            textView.text = "o botão foi clicado ${numeroDeVezes} vezes"
            true
        }

        botaoDeMenos.setOnClickListener {
            numeroDeVezes--
            textView.text = "o botão foi clicado ${numeroDeVezes} vezes"
        }
    }
}
