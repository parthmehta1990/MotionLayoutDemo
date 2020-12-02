package com.sample.motionlayoutsample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_page_1.setOnClickListener(this@MainActivity)
        btn_animation_2.setOnClickListener(this@MainActivity)
    }

    override fun onClick(p0: View?) {

        when(p0!!.id)
        {
            R.id.btn_page_1->{
                var open_page_1:Intent=Intent(this,AnimationPage1::class.java)
                startActivity(open_page_1)
            }

            R.id.btn_animation_2->{
                var open_page_2:Intent=Intent(this,AnimationPage2::class.java)
                startActivity(open_page_2)
            }
        }

    }
}