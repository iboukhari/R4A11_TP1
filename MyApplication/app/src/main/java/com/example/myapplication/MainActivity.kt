package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    companion object{
        const val EXTRA_TEXT = "text_to_display"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val textView: TextView = findViewById(R.id.textView)
        val editText: EditText = findViewById(R.id.editText)
        val button: Button = findViewById(R.id.button)

        val buttonNext : Button = findViewById(R.id.next)
        var texteValide = ""



        button.setOnClickListener {
            val saisie = editText.text.toString()
            textView.text = saisie

            if (saisie.isNotBlank()){
                texteValide = saisie
            }
        }

        buttonNext.setOnClickListener{
            if (texteValide != ""){
                val intent = Intent(this@MainActivity, MainActivity2::class.java)
                intent.putExtra(EXTRA_TEXT, editText.text.toString())
                startActivity(intent)
            }
        }
    }


    
}