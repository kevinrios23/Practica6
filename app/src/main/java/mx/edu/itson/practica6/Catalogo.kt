package mx.edu.itson.practica6

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.GridView
import android.widget.ImageView
import android.widget.TextView
import mx.edu.itson.practica6.R.id.tv_pelicula_desc
import org.w3c.dom.Text

class Catalogo : AppCompatActivity() {
    var adapter: PeliculaAdapter? = null
    var peliculas = ArrayList<Pelicula>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catalogo)

        cargarPeliculas()

        adapter = PeliculaAdapter(this, peliculas)

        var gridPeliculas: GridView = findViewById(R.id.gridview)
        gridPeliculas.adapter = adapter

    }

    fun cargarPeliculas(){
        peliculas.add(Pelicula("Big Hero 6",R.drawable.bighero6, R.drawable.headerbighero6, "When a devastating event befalls the city of San Fransokyo and catapults Hiro into the midst of danger, he turns to Baymax and his close friends adrenaline junkie Go Go Tomago, neatnik Wasabi, chemistry whiz Honey Lemon and fanboy Fred. Determined to uncover the mystery, Hiro transforms his friends into a band of high-tech heroes called ‘Big Hero 6.’", arrayListOf<Cliente>()))
        peliculas.add(Pelicula("1917",R.drawable.war, R.drawable.warheader,"On 6 April 1917, aerial reconnaissance has observed that the German army, which has pulled back from a sector of the Western Front in northern France, is not in retreat but has made a strategic withdrawal to the new Hindenburg Line, where they are waiting to overwhelm the British with artillery.", arrayListOf<Cliente>()))
        peliculas.add(Pelicula("Leap Year", R.drawable.leapyear, R.drawable.leapyearheader, "A woman who has an elaborate scheme to propose to her boyfriend on Leap Day, an Irish tradition which occurs every time the date February 29 rolls around, faces a major setback when bad weather threatens to derail her planned trip to Dublin. With the help of an innkeeper, however, her cross-country odyssey just might result in her getting engaged.", arrayListOf<Cliente>()))
        peliculas.add(Pelicula("Men in black",R.drawable.mib, R.drawable.mibheader, "After a government agency makes first contact with aliens in 1961, alien refugees live in secret on Earth by disguising themselves as humans. Men in Black (MIB) is a secret agency that polices these aliens, protects Earth from extraterrestrial threats, and uses memory-erasing neuralyzers to keep alien activity a secret. MIB agents have their former identities erased while retired agents are neuralyzed. ", arrayListOf<Cliente>()))
        peliculas.add(Pelicula("Toy Story", R.drawable.toystory, R.drawable.toystoryheader, "Toy Story is about the 'secret life of toys' when people are not around. When Buzz Lightyear, a space-ranger, takes Woody's place as Andy's favorite toy, Woody doesn't like the situation and gets into a fight with Buzz. Accidentaly Buzz falls out the window and Woody is accused by all the other toys of having killed him. He has to go out of the house to look for him so that they can both return to Andys room. But while on the outside they get into all kind of trouble while trying to get home.", arrayListOf<Cliente>()))
        peliculas.add(Pelicula("Inception",R.drawable.inception, R.drawable.inceptionheader, "Dom Cobb is a skilled thief, the absolute best in the dangerous art of extraction, stealing valuable secrets from deep within the subconscious during the dream state, when the mind is at its most vulnerable. Cobb's rare ability has made him a coveted player in this treacherous new world of corporate espionage, but it has also made him an international fugitive and cost him everything he has ever loved. Now Cobb is being offered a chance at redemption. One last job could give him his life back but only if he can accomplish the impossible, inception. Instead of the perfect heist, Cobb and his team of specialists have to pull off the reverse: their task is not to steal an idea, but to plant one. If they succeed, it could be the perfect crime. But no amount of careful planning or expertise can prepare the team for the dangerous enemy that seems to predict their every move. An enemy that only Cobb could have seen coming.", arrayListOf<Cliente>()))
        peliculas.add(Pelicula("Dr. House", R.drawable.drhouse, R.drawable.drwhoheader, "The series follows the life of anti-social, pain killer addict, witty and arrogant medical doctor Gregory House (Hugh Laurie) with only half a muscle in his right leg. He and his team of medical doctors try to cure complex and rare diseases from very ill ordinary people in the United States of America.", arrayListOf<Cliente>()))
        peliculas.add(Pelicula("Dr. who",R.drawable.drwho, R.drawable.drwhoheader, "Traveling across time and space, the immortal time-lord known as &#39;The Doctor&#39; travels across the Universe with his many companions and his loyal shape-shifting space-ship: The TARDIS. The Doctor faces many threats across many generations: from The Daleks, The Cybermen and his time-lord adversary The Master to the sinister Davros, creator of The Daleks.", arrayListOf<Cliente>()))
        peliculas.add(Pelicula("Friends", R.drawable.friends, R.drawable.friendsheader, "While running from a drug deal gone bad, brilliant young college dropout Mike Ross slips into a job interview with one of New York City&#39;s best legal closers, Harvey Specter. Tired of cookie-cutter law school grads, Harvey takes a gamble by hiring Mike on the spot after recognizing his raw talent and photographic memory. Mike and Harvey are a winning team. Although Mike is a genius, he still has a lot to learn about law; and while Harvey might seem like an emotionless, cold-blooded shark, Mike&#39;s sympathy and concern for their cases and clients will help remind Harvey why he went into law in the first place. Mike&#39;s other allies in the office include the firm&#39;s best paralegal Rachel and Harvey&#39;s no-nonsense assistant Donna. Proving to be an irrepressible duo and invaluable to the practice, Mike and Harvey must keep their secret from everyone including managing partner Jessica and Harvey&#39;s archnemesis Louis, who seems intent on making Mike&#39;s life as difficult as possible.", arrayListOf<Cliente>()))
        peliculas.add(Pelicula("Small Ville",R.drawable.smallville, R.drawable.smallvilleheader, "The numerous miraculous rescues by the local wonder boy Clark have aroused suspicions amongst colonials of Smallville. Interestingly, the boy has managed to downplay his acts of various heroic egresses in the past. They say he&#39;s either too fast or has a penchant for finding trouble. He was found by Martha and Jonathan Kent on the day of the Meteor Shower, and subsequently adopted. Clark&#39;s friend Lex Luthor, the only heir of Luthorcorp, has been secretly investigating grounds for Clark&#39;s outlandish valor. However, on the face of it, Clark just seems a normal boy who&#39;s slightly more secretive than usual.", arrayListOf<Cliente>()))
        peliculas.add(Pelicula("Suits",R.drawable.suits, R.drawable.suitsheader, "While running from a drug deal gone bad, brilliant young college dropout Mike Ross slips into a job interview with one of New York City&#39;s best legal closers, Harvey Specter. Tired of cookie-cutter law-school grads, Harvey takes a gamble by hiring Mike on the spot after recognizing his raw talent and photographic memory. Mike and Harvey are a winning team. Although Mike is a genius, he still has a lot to learn about law; and while Harvey might seem like an emotionless, cold-blooded shark, Mike&#39;s sympathy and concern for their cases and clients will help remind Harvey why he went into law in the first place. Mike&#39;s other allies in the office include the firm&#39;s best paralegal Rachel and Harvey&#39;s no-nonsense assistant Donna. Proving to be an irrepressible duo and invaluable to the practice, Mike and Harvey must keep their secret from everyone including managing partner Jessica and Harvey&#39;s archnemesis Louis, who seems intent on making Mike&#39;s life as difficult as possible.", arrayListOf<Cliente>()))
        peliculas.add(Pelicula("Friends", R.drawable.bones, R.drawable.bones, "Dr. Temperance Brennan is a brilliant, but lonely, anthropologist whom is approached by an ambitious FBI agent, named Seely Booth, to help the bureau solve a series of unsolved crimes by identifying the long-dead bodies of missing persons by their bone structure. But both Agent Booth and Dr. Brennan and her team come up again a variety of interference from red tape, corruption, and local noncooperation.", arrayListOf<Cliente>()))
    }
    class PeliculaAdapter : BaseAdapter{
        var context: Context? = null
        var peliculas = ArrayList<Pelicula>()

        constructor(context: Context,peliculas: ArrayList<Pelicula>){
            this.peliculas=peliculas
            this.context = context
        }

        override fun getCount(): Int {
            return peliculas.size
        }

        override fun getItem(p0: Int): Any {
            return peliculas[p0]
        }

        override fun getItemId(p0: Int): Long {
            return p0.toLong()
        }

        override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
            var pelicula = peliculas[p0]
            var inflator = context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            var vista = inflator.inflate(R.layout.pelicula, null)

            var image: ImageView = vista.findViewById(R.id.iv_pelicula)
            var titulo: TextView = vista.findViewById(R.id.tv_titulo)


            image.setImageResource(pelicula.image)
            titulo.setText(pelicula.titulo)


            image.setOnClickListener{
                var intent = Intent(context, detalle_pelicula::class.java)
                intent.putExtra("titulo", pelicula.titulo)
                intent.putExtra("sipnosis", pelicula.sipnosis)
                intent.putExtra("header", pelicula.header)
                intent.putExtra("imagen", pelicula.image)
                intent.putExtra("numberSeats", (20-pelicula.seats.size))
                intent.putExtra("pos", p0)
                context!!.startActivity(intent)
                }
            return vista
        }

    }
    }