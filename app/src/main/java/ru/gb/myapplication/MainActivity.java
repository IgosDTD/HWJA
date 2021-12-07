package ru.gb.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
/*    private Button myButton;
    private TextView myTextView;*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_activity);
        setContentView(R.layout.activity_main);

/*        myButton = findViewById(R.id.my_button);
        myTextView = findViewById(R.id.my_text_view);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTextView.setBackground(Drawable.createFromPath("#00FF00"));

            }
        });*/
    }
}