package `in`.premad.kotlin_basics.view

import `in`.premad.kotlin_basics.R
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.Toast

class AutoCompleteTextViewActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auto_complete_text_view)



        
        val autotextView
                = findViewById<AutoCompleteTextView>(R.id.autoTextView)
        // Get the array of languages
        val languages
                = resources.getStringArray(R.array.Languages)
        // Create adapter and add in AutoCompleteTextView
        val adapter
                = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, languages)
        autotextView.setAdapter(adapter)

        val button
                = findViewById<Button>(R.id.btn)
         if (button != null)
        {
            button ?.setOnClickListener(View.OnClickListener {
                val enteredText = getString(R.string.submitted_lang) + " " + autotextView.getText()
                Toast.makeText(this@AutoCompleteTextViewActivity, enteredText, Toast.LENGTH_SHORT).show()
            })
        }
    }
}