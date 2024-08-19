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
                titleViewTV.text = "Правила дорожного движения"
                contentPDDTV.text =
                    "1.1. Настоящие Правила дорожного движения устанавливают единый порядок дорожного" +
                            " движения на всей территории Российской Федерации. Другие нормативные акты, " +
                            "касающиеся дорожного движения, должны основываться на требованиях Правил и не противоречить им.\n" +
                            "1.2. В Правилах используются следующие основные понятия и термины:\n" +
                            "\"Автомагистраль\" - дорога, обозначенная знаком 5.1 и имеющая для каждого " +
                            "направления движения проезжие части, отделенные друг от друга разделительной " +
                            "полосой (а при ее отсутствии - дорожным ограждением), без пересечений в одном " +
                            "уровне с другими дорогами, железнодорожными или трамвайными путями, пешеходными или велосипедными дорожками." +
                            "\"Автопоезд\" - механическое транспортное средство, сцепленное с прицепом (прицепами).\n" +
                            "\"Велосипед\" - транспортное средство, кроме инвалидных колясок, которое имеет по крайней" +
                            " мере два колеса и приводится в движение как правило мускульной энергией лиц, находящихся" +
                            " на этом транспортном средстве, при помощи педалей или рукояток и может также иметь электродвигатель" +
                            " номинальной максимальной мощностью в режиме длительной нагрузки, не превышающей 0,25 кВт," +
                            " автоматически отключающийся на скорости более 25 км/ч."
            } else {
                titleViewTV.text = "Информация"
                contentPDDTV.text = null
            }
        }
    }
}