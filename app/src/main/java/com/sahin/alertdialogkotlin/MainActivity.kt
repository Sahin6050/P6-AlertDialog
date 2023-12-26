package com.sahin.alertdialogkotlin

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.sahin.alertdialogkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        /* Uyarı mesajları.

         1-> Toast mesajı
         2-> AlertDialog
         3-> Snackbar

         Context -> Android işletim sisteminde nerede ne olduğunu takip etmek için kullanılan yapıdır.
         1-> Activity Context ->this
         2-> Application Context -> applicationcontext
         */


        Toast.makeText(this@MainActivity,"Welcome to Kotlin",Toast.LENGTH_LONG).show()

        // Lambda

        // İnterface bir nesne oluşturamam bu şekilde yazmam gerekli.

        /*
        binding.button.setOnClickListener(object  : View.OnClickListener{
            override fun onClick(v: View?) {

            }

        })

         */


    }
    fun save(view : View){

        // AlertDialog activity'den çalışır.
        val alert = AlertDialog.Builder(this@MainActivity)
        alert.setTitle("Save")
        alert.setMessage("Are You Sure")
        // Positive Button
        alert.setPositiveButton("Yes",object  : DialogInterface.OnClickListener{
            override fun onClick(dialog: DialogInterface?, which: Int) {
                Toast.makeText(this@MainActivity,"Saved",Toast.LENGTH_LONG).show()
            }

        })
        // Negative Button
        alert.setNegativeButton("No",object : DialogInterface.OnClickListener{
            override fun onClick(dialog: DialogInterface?, which: Int) {
                Toast.makeText(this@MainActivity,"Not Saved",Toast.LENGTH_LONG).show()
            }

        })
        alert.show()

    }
}