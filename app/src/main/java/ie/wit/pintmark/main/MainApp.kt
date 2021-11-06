package ie.wit.pintmark.main

import android.app.Application
import ie.wit.pintmark.models.PlacemarkMemStore
import ie.wit.pintmark.models.PlacemarkModel
import timber.log.Timber
import timber.log.Timber.i

class MainApp : Application() {

    // variable to store the placemarks
    val placemarks = PlacemarkMemStore()

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
        i("Placemark started")

        // test placemarks
//        placemarks.add(PlacemarkModel("One", "About one..."))
//        placemarks.add(PlacemarkModel("Two", "About two..."))
//        placemarks.add(PlacemarkModel("Three", "About three..."))
    }
}