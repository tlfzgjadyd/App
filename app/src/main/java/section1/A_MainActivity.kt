package section1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity//책에는 v7어쩌고 import 되어있는데 지금은 이걸로 바뀌었나봄
import com.example.helloandroid.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvTitle = findViewById<TextView>(R.id.tv_title)
        tvTitle.text = "Hello Kotlin!"
    }
}
