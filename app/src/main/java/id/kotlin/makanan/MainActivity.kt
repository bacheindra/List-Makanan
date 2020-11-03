package id.kotlin.makanan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val arrayList = ArrayList<Model>()

        arrayList.add(Model("Bakwan", " Gorengan yang terbuat dari sayuran dan tepung terigu", R.drawable.bakwan))
        arrayList.add(Model("Burger", "Roti bundar yang diiris dan ditengahnya di isi daging / sayuran", R.drawable.burger))
        arrayList.add(Model("Kebab",  "Kebab adalah makanan khas dari Timur Tengah", R.drawable.kebab))
        arrayList.add(Model("Lontong", "Lontong merupakan makanan khas Sumatra", R.drawable.lontong))
        arrayList.add(Model("Martabak", "Martabak adalah makanan yang terbuat dari telur dan tepung", R.drawable.martabak))
        arrayList.add(Model("Pecel", "Pecel adalah Makanan khas Jawa terbuat dari Kacang tanah", R.drawable.pecel))
        arrayList.add(Model("Pizza", "Pizza adalah makanan khas Italia", R.drawable.pizza))
        arrayList.add(Model("Risol", "Risol adalah makanan yang terbuat dari tepung dan sayuran", R.drawable.risol))
        arrayList.add(Model("Sate", "Sate adalah daging atau ayam yang ditusuk", R.drawable.sate))
        arrayList.add(Model("Waffle", "Waffle merupakan makanan khas eropa dan amerika", R.drawable.waffle))

        val myAdapter = MyAdapter(arrayList, this)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = myAdapter


    }


//    override fun onCreateOptionsMenu(menu: Menu): Boolean {
//        menuInflater.inflate(R.menu.about, menu)
//        return super.onCreateOptionsMenu(menu)
//
//
//    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        return when (item.itemId) {
            R.id.about -> {
                this.startActivity(Intent(this, AboutActivity::class.java))
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }



}