package cl.awakelab.individualonce

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

/*fun main() {
    var numeroUno = 10
    var numeroDos = 33
    var numeroTres = 66
    val resultado = numeroUno + numeroDos + numeroTres
    println(resultado)
    numeroUno = 55
    println(resultado)
    val promedio = resultado / 3

    println(promedio)
}*/

fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)
    amanda.showProfile()
    atiqah.showProfile()
}

class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        println("name: $name")
        println("Age: $age")
        println("Like to: $hobby")
        if (referrer == null) {
            println("Doesn´t have a referrer")
        } else {
            println("Has a referrer name ${referrer.name} who likes too play ${referrer.hobby} ")
        }

    }
}