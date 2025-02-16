package com.example.user.perfectweightdanahaburayya


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AlertDialog
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.dialog.view.*
import kotlinx.android.synthetic.main.fragment_note_dialog.*
import kotlinx.android.synthetic.main.fragment_note_dialog.view.*
import kotlinx.android.synthetic.main.fragment_perfect_wieght.view.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class noteDialog : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view:View=inflater.inflate(R.layout.fragment_note_dialog, container, false)

        val arrayList=ArrayList<String>()
       view. click.setOnClickListener {


            val inflater=LayoutInflater.from(this!!.activity)
            val v:View=inflater.inflate(R.layout.dialog,null)
           val builder= AlertDialog.Builder(this!!.activity!!)
            builder.setView(v)
            val dialog= builder.create()
            dialog.show()
            v.add.setOnClickListener {
                val ad = v.editText3.text.toString()
                arrayList.add(ad)
                val arrayAdapter= ArrayAdapter<String>(activity,android.R.layout.simple_expandable_list_item_1,arrayList)
              listview.adapter=arrayAdapter
                dialog.cancel()

            }
            v.cancle.setOnClickListener {
                dialog.cancel()
            }

        }

        // Inflate the layout for this fragment
        return view

    }


}
