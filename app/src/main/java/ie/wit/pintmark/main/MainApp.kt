package ie.wit.pintmark.main

import android.app.Application
import ie.wit.pintmark.models.PlacemarkMemStore
import ie.wit.pintmark.models.PlacemarkJSONStore
import ie.wit.pintmark.models.PlacemarkStore
import timber.log.Timber
import timber.log.Timber.i

class MainApp : Application() {

    // variable to store the placemarks
    lateinit var placemarks: PlacemarkStore

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
        placemarks = PlacemarkJSONStore(applicationContext)
        i("Placemark started")

        // test placemarks
//        placemarks.add(PlacemarkModel("One", "About one..."))
//        placemarks.add(PlacemarkModel("Two", "About two..."))
//        placemarks.add(PlacemarkModel("Three", "About three..."))
    }
}