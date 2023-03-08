package mx.edu.itson.practica6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var button: Button = findViewById(R.id.botonP) as Button

        button.setOnClickListener{
            var intent:Intent = Intent(this, Catalogo::class.java)
            startActivity(intent)
        }
    }
}