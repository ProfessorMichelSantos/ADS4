package com.aula.aularecursos

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Switch
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.findViewTreeViewModelStoreOwner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val switchClima = findViewById<Switch>(R.id.switchAula2)
        val imageClima = findViewById<ImageView>(R.id.imageViewAula2)
        val botaoClima = findViewById<Button>(R.id.botaoaula2)

        botaoClima.setOnClickListener()
        {
            Toast.makeText(this, "chuvoso", Toast.LENGTH_SHORT).show()
            imageClima.setImageResource(R.drawable.chuvoso)
        }

        switchClima.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                // O switch está ativado
                Toast.makeText(this, "chuvoso", Toast.LENGTH_SHORT).show()
                imageClima.setImageResource(R.drawable.chuvoso)
            } else {
                // O switch está desativado
                Toast.makeText(this, "parcial", Toast.LENGTH_SHORT).show()
                imageClima.setImageResource(R.drawable.parcialmente)

            }
        }

    }
}