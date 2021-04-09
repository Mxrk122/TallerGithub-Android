package com.example.memorygame

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MemoryBoardAdapter(private val context: Context, private val numPieces: Int) : // La clase adaptador es asbtracta, estamos haciendo un hijo del adaptador de rvBoard
    RecyclerView.Adapter<MemoryBoardAdapter.ViewHolder>() { // Le pasamos como parametro al adaptador nuestra clase viewholder


    // Metodos de la clase abstracta
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.memory_card, parent, false)
        // Devolver la vista envuelta dentro de un soporte de vista
        return ViewHolder(view)
        
    }

    // Este metodo nos pregunta ¿Cual es la cantidad de elementos que hay en nuestro RecyclerView?
    override fun getItemCount() = numPieces

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(position)
    }

    // declarando una clase de viewholder
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(position: Int) {
            // No-op aun
        }
    }
}
