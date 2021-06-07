package com.example.myprofileapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    var imageView:ImageView?=null
    var educationbtn:Button?=null
    var personalDetailsbtn:Button?=null
    var whatsappbtn:ImageButton?=null
    var fbbtn:ImageButton?=null
    var instabtn:ImageButton?=null
    var twitterbtn:ImageButton?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainscreen)

        imageView=findViewById(R.id.profile)
        educationbtn=findViewById(R.id.education)
        personalDetailsbtn=findViewById(R.id.personalDetails)
        whatsappbtn=findViewById(R.id.whatsapp)
        fbbtn=findViewById(R.id.fb)
        instabtn=findViewById(R.id.insta)
        twitterbtn=findViewById(R.id.twitter)


        imageView?.setOnClickListener {
            var intent:Intent=Intent(MainActivity@this,ProfileActivity::class.java)
            startActivity(intent)
        }
        educationbtn?.setOnClickListener{
            var intent:Intent=Intent(MainActivity@this,EducationActivity::class.java)
            startActivity(intent)
        }
        personalDetailsbtn?.setOnClickListener{
            var intent:Intent=Intent(MainActivity@this,PersonalDetailsActivity::class.java)
            startActivity(intent)
        }
        whatsappbtn?.setOnClickListener{
            var intent:Intent=Intent(Intent.ACTION_VIEW,Uri.parse("https://fir-hosting-prem.web.app"))
            startActivity(intent)
        }
        fbbtn?.setOnClickListener {
            var intent:Intent=Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/"))
            startActivity(intent)
        }
        instabtn?.setOnClickListener{
            var intent:Intent=Intent(Intent.ACTION_VIEW,Uri.parse("https://www.instagram.com/"))
            startActivity(intent)
        }
        twitterbtn?.setOnClickListener{
            var intent:Intent=Intent(Intent.ACTION_VIEW,Uri.parse("https://www.twitter.com/"))
            startActivity(intent)
        }
    }
}