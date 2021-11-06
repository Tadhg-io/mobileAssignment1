package ie.wit.pintmark.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ie.wit.pintmark.R
import ie.wit.pintmark.main.MainApp

class PlacemarkListActivity : AppCompatActivity() {

    lateinit var app: MainApp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_placemark_list)
        app = application as MainApp
    }
}