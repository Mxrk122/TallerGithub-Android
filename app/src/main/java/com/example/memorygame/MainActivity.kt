package com.example.memorygame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    // Variables que contendran objetos de la app

    private lateinit var rvBoard: RecyclerView
    private lateinit var MovesText: TextView
    private lateinit var PairText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Otorgando objeto
        // COmentario extra
        rvBoard = findViewById(R.id.rvBoard)
        MovesText = findViewById(R.id.MovesText)
        PairText = findViewById(R.id.PairText)

        // Ordenando las cosas

        // Crear adaptador para ordenar el RecyclerView
        rvBoard.adapter = MemoryBoardAdapter(this, 8)
        rvBoard.setHasFixedSize(true)
        rvBoard.layoutManager = GridLayoutManager(this,2)
    }
}