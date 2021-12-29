package com.adersh.customtoasttutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView customToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customToast=findViewById(R.id.textView);

        customToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Creating the LayoutInflater instance
                LayoutInflater layoutInflater=getLayoutInflater();

                //Getting the View object as defined in the customtoast.xml file

                View customtoastView = layoutInflater.inflate(R.layout.cutom_toast_layout,findViewById(R.id.customToastLayout));

                Toast toast=new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
                toast.setView(customtoastView);
                toast.show();

            }
        });
    }
}