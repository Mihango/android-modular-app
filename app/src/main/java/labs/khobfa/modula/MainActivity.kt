package labs.khobfa.modula

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text_hello.setOnClickListener {
            Toast.makeText(this, "Hello Modular Kotlin Dsl", Toast.LENGTH_LONG).show()
        }
    }
}