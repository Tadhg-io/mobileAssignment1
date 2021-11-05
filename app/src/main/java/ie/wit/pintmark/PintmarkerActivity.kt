package ie.wit.pintmark

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import timber.log.Timber
import timber.log.Timber.i

class PintmarkerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pintmark)

        // plant a debug tree
        Timber.plant(Timber.DebugTree())
        i("Pintmark Activity started..")

    }
}