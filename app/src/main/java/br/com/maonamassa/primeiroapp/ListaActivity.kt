package br.com.maonamassa.primeiroapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class ListaActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)

        val recyclerView = findViewById(R.id.recyclerView) as RecyclerView
        val textos = listOf(
                "texto1",
                "texto2",
                "texto3",
                "texto4",
                "texto5",
                "texto6",
                "kfbeiuhraiwjdpaoiwjdpaowjp")

        recyclerView.layoutManager = LinearLayoutManager(this)

        recyclerView.adapter = MyAdapter(textos)

    }
}
