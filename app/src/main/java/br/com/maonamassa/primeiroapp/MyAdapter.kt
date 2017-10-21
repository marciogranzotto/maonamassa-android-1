package br.com.maonamassa.primeiroapp

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class MyAdapter(var lista: List<String>): RecyclerView.Adapter<MyViewHolder>() {

    override fun onBindViewHolder(holder: MyViewHolder?, position: Int) {
        val texto = lista[position]
        holder?.onBind(texto)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(android.R.layout.simple_list_item_1, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return lista.size
    }


}

class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    fun onBind(texto: String) {
        val textView = itemView.findViewById<TextView>(android.R.id.text1)
        textView.text = texto
    }

}