package com.example.new_calculator

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var num_1: EditText
    private lateinit var num_2: EditText
    private lateinit var add: Button
    private lateinit var minu: Button
    private lateinit var mul: Button
    private lateinit var share: Button
    private lateinit var tv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.num_1 = findViewById<EditText>(R.id.num_1)
        this.num_2 = findViewById<EditText>(R.id.num_2)
        this.add = findViewById<Button>(R.id.add)
        this.minu = findViewById<Button>(R.id.minu)
        this.mul = findViewById<Button>(R.id.mul)
        this.share = findViewById<Button>(R.id.share)
        this.tv = findViewById<TextView>(R.id.tv)

        this.add.setOnClickListener(this)
        this.minu.setOnClickListener(this)
        this.mul.setOnClickListener(this)
        this.share.setOnClickListener(this)
    }
    override fun onClick(v: View?){
        when(v){
            this.add -> this.f_add()
            this.minu -> this.f_minu()
            this.mul -> this.f_mul()
            this.share -> this.f_share()
        }
    }

    private fun f_add(){
        var user_num_1 = this.num_1.text.toString().toDouble()
        var user_num_2 = this.num_2.text.toString().toDouble()
        var l_add = user_num_1 + user_num_2
        this.tv.text = "$user_num_1 + $user_num_2 = $l_add"
    }

    private fun f_minu(){
        var user_num_1 = this.num_1.text.toString().toDouble()
        var user_num_2 = this.num_2.text.toString().toDouble()
        var l_add = user_num_1 - user_num_2
        this.tv.text = "$user_num_1 - $user_num_2 = $l_add"
    }

    private fun f_mul(){
        var user_num_1 = this.num_1.text.toString().toDouble()
        var user_num_2 = this.num_2.text.toString().toDouble()
        var l_add = user_num_1 * user_num_2
        this.tv.text = "$user_num_1 * $user_num_2 = $l_add"
    }

    private fun f_share(){
        var user_num_1 = this.num_1.text.toString().toDouble()
        var user_num_2 = this.num_2.text.toString().toDouble()
        var l_add = user_num_1 / user_num_2
        this.tv.text = "$user_num_1 / $user_num_2 = $l_add"
    }
}