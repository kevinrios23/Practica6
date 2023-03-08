package mx.edu.itson.practica6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class detalle_pelicula : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_pelicula)
        var iv_pelicula_imagen: ImageView = findViewById<ImageView>(R.id.iv_pelicula_imagen)
        var tv_nombre_pelicula: TextView = findViewById(R.id.tv_nombre_pelicula)
        var tv_pelicula_desc: TextView = findViewById(R.id.tv_pelicula_desc)
        var seatsLeft: TextView = findViewById(R.id.seatLeft)
        var buytickets: Button = findViewById(R.id.buyTickets)
        var ns = 0
        var id = -1
        var title = ""

        val bundle=intent.extras
        if (bundle!=null){
            ns = bundle.getInt("numberSeats")
            title = bundle.getString("titulo")!!
            iv_pelicula_imagen.setImageResource(bundle.getInt("header"))
            tv_nombre_pelicula.setText(bundle.getString("titulo"))
            tv_pelicula_desc.setText(bundle.getString("sipnosis"))
            seatsLeft.setText("$ns seats available")
            id = bundle.getInt("pos")

        }

        if(ns==0){
            buytickets.isActivated = false
        }else{
            buytickets.isActivated = true
            buytickets.setOnClickListener {
                val intent: Intent = Intent(this, SeatSelection::class.java)

                intent.putExtra("movie", id)
                intent.putExtra("name", title)

                this.startActivity(intent)
            }
        }

    }
}