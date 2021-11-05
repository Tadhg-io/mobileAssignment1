package ie.wit.pintmark

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import ie.wit.pintmark.databinding.ActivityPintmarkBinding
import timber.log.Timber
import timber.log.Timber.i

class PintmarkerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPintmarkBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pintmark)

        // plant a debug tree
        Timber.plant(Timber.DebugTree())
        i("Pintmark Activity started..")

        binding = ActivityPintmarkBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnAdd.setOnClickListener() {
            val placemarkTitle = binding.placemarkTitle.text.toString()
            if (placemarkTitle.isNotEmpty()) {
                i("add Button Pressed: $placemarkTitle")
            }
            else {
                Snackbar
                    .make(it,"Please Enter a title", Snackbar.LENGTH_LONG)
                    .show()
            }
        }
    }
}