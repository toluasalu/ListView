package com.example.listviewapp.adapter

import android.content.Context
import android.content.Intent
import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.listviewapp.DetailActivity
import com.example.listviewapp.R
import com.example.listviewapp.data.Datasource
import com.example.listviewapp.model.FunFact

class ListAdapter(context: Context, Facts: List<FunFact>): ArrayAdapter<FunFact>(context,0 ,Facts) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view = convertView
         val fact = getItem(position)
        if(view == null){
            view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        }

        val logo = view?.findViewById<ImageView>(R.id.item_image)
        val textView = view?.findViewById<TextView>(R.id.item_title)

        fact?.let { logo?.setImageResource(it.imageResourceId) }
        textView?.text = fact?.name

         view?.setOnClickListener {
             val intent = Intent(parent.context, DetailActivity::class.java)
             intent.putExtra(LOGO_EXTRA,fact?.imageResourceId)
             intent.putExtra(NAME_EXTRA, fact?.name)
             intent.putExtra(DETAIL_EXTRA, fact?.details)
             parent.context.startActivity(intent)
         }

        return view!!
    }

    companion object {
        val LOGO_EXTRA = "logo_extra"
        val DETAIL_EXTRA = "detail_extra"
        val NAME_EXTRA = "name_extra"
    }

}