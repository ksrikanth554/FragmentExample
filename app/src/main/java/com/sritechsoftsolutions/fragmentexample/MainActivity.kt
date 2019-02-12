package com.sritechsoftsolutions.fragmentexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var fmanager=supportFragmentManager
        var ftransaction=fmanager.beginTransaction()
        ftransaction.add(R.id.frame1,Home())
        ftransaction.commit()

        home.setOnClickListener{
            var ftransaction=fmanager.beginTransaction()
            ftransaction.replace(R.id.frame1,Home())
            ftransaction.addToBackStack("true")
            ftransaction.commit()

        }
        product.setOnClickListener{
            var ftransaction=fmanager.beginTransaction()
            ftransaction.replace(R.id.frame1,Product())
            ftransaction.addToBackStack("true")
            ftransaction.commit()

        }
        shipping.setOnClickListener{

            var ftransaction=fmanager.beginTransaction()
            ftransaction.replace(R.id.frame1,Shipping())
            ftransaction.addToBackStack("true")
            ftransaction.commit()
        }
        offers.setOnClickListener{

            var ftransaction=fmanager.beginTransaction()
            ftransaction.replace(R.id.frame1,Offers())
            ftransaction.addToBackStack("true")
            ftransaction.commit()
        }
        categories.setOnClickListener{

            var ftransaction=fmanager.beginTransaction()
            ftransaction.replace(R.id.frame1,Categories())
            ftransaction.addToBackStack("true")
            ftransaction.commit()
        }
        bestsellers.setOnClickListener{

            var ftransaction=fmanager.beginTransaction()
            ftransaction.replace(R.id.frame1,Bestsellers())
            ftransaction.addToBackStack("true")
            ftransaction.commit()
        }
        cart.setOnClickListener{

            var ftransaction=fmanager.beginTransaction()
            ftransaction.replace(R.id.frame1,Cart())
            ftransaction.addToBackStack("true")
            ftransaction.commit()
        }

    }
}
