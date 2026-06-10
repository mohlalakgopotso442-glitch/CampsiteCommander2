package com.example.campsitecommander2

import android.os.Bundle
import android.provider.ContactsContract
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.campsitecommander2.ui.theme.CampsiteCommander2Theme

class DetailedView : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CampsiteCommander2Theme {
                val scroll = ScrollView(this)
                val layout = LinearLayout(this).apply {
                    orientation = LinearLayout.VERTICAL
                    setBackgroundColor(Color.parseColor("#1B262C"))
                    setPadding(50, 50, 50, 50)
                }
                val etItem = EditText(this).apply { hint = "Item Name" }
                val etCat = EditText(this).apply { hint = "Category e.g Shelter" }
                val etQty = EditText(this).apply { hint = "Quantity" }
                val etCom = EditText(this).apply { hint = "Comments/Notes" }

                val btnsave = android.widget.Button(this).apply {
                    text = "Save Gear"
                    setBackgroundColor(Color.parseColor("#3282B8"))
                    setPadding(0, 20, 0, 20)
                    setOnClickListener {
                        if (etItem.text.isNotEmpty()) {

                        } else {
                            Toast.makeText(
                                this@DetailedView,
                                "Fill Item and Quantity",
                                Toast.LENGTH_SHORT
                            ).show()
                        }

                    }

                }
                layout.addView(etItem)
                layout.addView(etCat)
                layout.addView(etQty)
                layout.addView(etCom)
                layout.addView(btnsave)
                scroll.addView(layout)
                setContentView(scroll)
            }
        }
    }
}

fun Color.Companion.parseColor(string: String): Int {
    TODO("Not yet implemented")
}

