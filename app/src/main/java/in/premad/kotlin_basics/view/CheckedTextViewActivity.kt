package `in`.premad.kotlin_basics.view

import `in`.premad.kotlin_basics.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckedTextView
import android.widget.Toast

class CheckedTextViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checked_text_view)

        val CTView = findViewById<CheckedTextView>(R.id.ctv)
        if (CTView != null) {
            CTView.isChecked = false
            CTView.setCheckMarkDrawable(
                android.R.drawable.checkbox_off_background)

            CTView.setOnClickListener {
                CTView.isChecked = !CTView.isChecked
                CTView.setCheckMarkDrawable(
                    if (CTView.isChecked)
                        android.R.drawable.checkbox_on_background
                    else
                        android.R.drawable.checkbox_off_background)

                val msg = getString(R.string.msg_shown)+ " " +
                        getString(if (CTView.isChecked)
                            R.string.checked else R.string.unchecked)
                Toast.makeText(this@CheckedTextViewActivity, msg,
                    Toast.LENGTH_SHORT).show()
            }
        }
    }
}