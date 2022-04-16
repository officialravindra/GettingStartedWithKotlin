package `in`.premad.kotlin_basics.view

import `in`.premad.kotlin_basics.R
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.view.ViewGroup
import android.widget.*

class DynamicViews : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dynamic_views)

        val editLinearLayout = findViewById<LinearLayout>(R.id.editTextLinearLayout)
        val buttonShow = findViewById<Button>(R.id.buttonShow)

        // Create EditText
        val editText = EditText(this)
        editText.setHint("Enter something")
        editText.layoutParams = LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT)
        editText.setPadding(20, 20, 20, 20)

        // Add EditText to LinearLayout
        editLinearLayout?.addView(editText)

        buttonShow?.setOnClickListener { Toast.makeText(
                this@DynamicViews, editText.text,
                Toast.LENGTH_LONG).show() }


        // Create TextView programmatically.
        val textView = TextView(this)

        // setting height and width
        textView.layoutParams= LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT)
        // setting text
        textView.setText("GEEKSFORGEEKS")
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 40f)
        textView.setTextColor(Color.MAGENTA)
        // onClick the text a message will be displayed "HELLO GEEK"
        textView.setOnClickListener()
        {
            Toast.makeText(this@DynamicViews, "HELLO GEEK",
                    Toast.LENGTH_LONG).show()
        }

        // Add TextView to LinearLayout
        editLinearLayout ?.addView(textView)
    }
}