package com.example.user.perfectweightdanahaburayya


import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.NotificationCompat
import android.support.v4.content.ContextCompat.getSystemService
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_perfect_wieght.*
import kotlinx.android.synthetic.main.fragment_perfect_wieght.view.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class perfectWieght : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                             savedInstanceState: Bundle?): View? {
        val view:View=inflater.inflate(R.layout.fragment_perfect_wieght, container, false)
        val channle = "channle"
        val id = 12345
view.count.setOnClickListener {
   try {


        val hiaght=view.editText.text.toString().toDouble()
        val wight = view.editText2.text.toString().toDouble()
            val res = (wight/(hiaght*hiaght))*10000
       view.textView.text= res.toString()


            var dis = ""
            when{
               res< 18.5->dis="نحيف"
                18.5<res&&res<24.9->dis="وزن مثالي"
                25.0<res&&res<29.5->dis="زيادة في الوزن "
                30<res ->dis="سمين"



            }

           val importance = NotificationManager.IMPORTANCE_HIGH
           val c= NotificationChannel(channle,"اسم القناة  ",importance)

           val notification= NotificationCompat.Builder(this!!.context!!,channle)
                   .setSmallIcon(R.drawable.notification_icon_background)
                   .setContentTitle("تنبيه")
                   .setContentText(dis)
                   .build()
           val g= activity!!.getSystemService(Context.NOTIFICATION_SERVICE)as NotificationManager
          g.createNotificationChannel(c)
       val intent =Intent(context,MainActivity::class.java)

           g.notify(id,notification)



            }
        // Inflate the layout for this fragment
     catch (e:Exception){
         Toast.makeText(activity,"تأكد من المدخلات",Toast.LENGTH_LONG).show()
     }}

 return view}}
