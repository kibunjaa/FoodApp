package com.example.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private Button button;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

       button = findViewById(R.id.button);
        button.setonclicklistner(new view.onclickListener(){
            @override
            public void onclick(view v){
                openActivity2();

            }
        });
    }
    public void openAcivity2 () {
        Intent intent = new

    }() {

    }
}