package com.example.campsitecommander2

import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.campsitecommander2.ui.theme.CampsiteCommander2Theme

class MainScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CampsiteCommander2Theme {
                val layout = LinearLayout(this).apply {
                    orientation = LinearLayout.VERTICAL
                    gravity = Gravity.CENTER
                    setBackgroundColor(Color.parseColor("#0F4C75"))
                    setPadding(50, 50, 50, 50)
                    layoutParams = LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.MATCH_PARENT
                    )
                }

                val title = TextView(this).apply {
                    text = "Campsite Commander"
                    textSize = 26f
                    gravity = Gravity.CENTER
                }

                val tvTotal = TextView(this).apply {

                    text = "Total Items Packed: $ {Data.getTotalItems()}"
                    textSize = 20f
                    setTextColor(Color.parseColor("BBE1FA"))
                    gravity = Gravity.CENTER
                    setPadding(0, 40, 0, 40)
                }
                val btnAdd = android.widget.Button(this).apply {
                    text = "Add Gear"
                    setBackgroundColor(Color.parseColor("#3282B8"))
                    textSize = 18f
                    setInClickListener {
                        startActivity(Intent(this@MainScreen, DetailedView::class.java))
                    }
                }
                layout.addView(title)
                layout.addView(tvTotal)
                layout.addView(btnAdd)
                setContentView(layout)
            }
            fun onResume(){
                super.onResume()
                recreate()

                }
            }

        }
    }

private fun Button.setInClickListener(function: () -> Unit) {
    TODO("Not yet implemented")
}






