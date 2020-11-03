package id.kotlin.makanan

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row.view.*

class MyAdapter(val arrayList: ArrayList<Model>, val context: Context) :
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItems(model: Model){
            itemView.titleTv.text = model.title
            itemView.descriptionTv.text = model.des
            itemView.imageIv.setImageResource(model.image)

        }
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.row, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(arrayList[position])

        holder.itemView.setOnClickListener{

//            if (position == 0 ) {
//                Toast.makeText(
//                    context,
//                    "Anda Mengklik Bakwan",
//                    Toast.LENGTH_LONG
//                ).show()
//            }
//
//            if (position == 1 ) {
//                Toast.makeText(
//                    context,
//                    "Anda Mengklik Burger",
//                    Toast.LENGTH_LONG
//                ).show()
//            }
//
//            if (position == 2 ) {
//                Toast.makeText(
//                    context,
//                    "Anda Mengklik Kebab",
//                    Toast.LENGTH_LONG
//                ).show()
//            }
//
//            if (position == 3 ) {
//                Toast.makeText(
//                    context,
//                    "Anda Mengklik Lontong",
//                    Toast.LENGTH_LONG
//                ).show()
//            }
//
//            if (position == 4 ) {
//                Toast.makeText(
//                    context,
//                    "Anda Mengklik Martabak",
//                    Toast.LENGTH_LONG
//                ).show()
//            }
//
//            if (position == 5 ) {
//                Toast.makeText(
//                    context,
//                    "Anda Mengklik Pecel",
//                    Toast.LENGTH_LONG
//                ).show()
//            }
//
//            if (position == 6 ) {
//                Toast.makeText(
//                    context,
//                    "Anda Mengklik Pizza",
//                    Toast.LENGTH_LONG
//                ).show()
//            }
//
//            if (position == 7 ) {
//                Toast.makeText(
//                    context,
//                    "Anda Mengklik Bakwan",
//                    Toast.LENGTH_LONG
//                ).show()
//            }
//
//            if (position == 8 ) {
//                Toast.makeText(
//                    context,
//                    "Anda Mengklik Sate",
//                    Toast.LENGTH_LONG
//                ).show()
//            }
//
//            if (position == 9 ) {
//                Toast.makeText(
//                    context,
//                    "Anda Mengklik Waffle",
//                    Toast.LENGTH_LONG
//                ).show()
//            }

            val model= arrayList.get(position)

            var gTitle : String = model.title
            var gDescription : String = model.des
            var gImageView : Int = model.image

            val intent = Intent (context, AnotherActivity::class.java)

            intent.putExtra("iTitle", gTitle)
            intent.putExtra("iDescription", gDescription)
            intent.putExtra("iImageView", gImageView)

            context.startActivity(intent)
        }
    }

}