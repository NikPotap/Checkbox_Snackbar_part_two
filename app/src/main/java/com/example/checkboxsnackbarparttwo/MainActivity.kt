package com.example.checkboxsnackbarparttwo

import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var checkBoxCB: CheckBox
    private lateinit var titleViewTV: TextView
    private lateinit var contentPDDTV: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        checkBoxCB = findViewById(R.id.checkBoxCB)
        titleViewTV = findViewById(R.id.titleViewTV)
        contentPDDTV = findViewById(R.id.contentPDDTV)
        checkBoxCB.setOnCheckedChangeListener { view, isChecked ->
            if (isChecked) {
                titleViewTV.text = resources.getString(R.string.rules)
                contentPDDTV.text = resources.getString(R.string.contentPDD)
            } else {
                titleViewTV.text = resources.getString(R.string.infomation)
                contentPDDTV.text = null
            }
        }
    }
}