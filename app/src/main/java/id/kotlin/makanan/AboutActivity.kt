package id.kotlin.makanan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Button

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

//        val menu = findViewById<Button>(R.id.about)
//        menu.setOnClickListener {
//            val intent = Intent(this, AboutActivity::class.java)
//
//            startActivity(intent)
//        }
    }
}