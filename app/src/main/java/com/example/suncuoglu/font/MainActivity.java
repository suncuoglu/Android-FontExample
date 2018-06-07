package com.example.suncuoglu.font;

import android.graphics.Typeface;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView edt,edt2,edt3,edt4;
    Button btn,btn2,btn3,btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt = (TextView)findViewById(R.id.textView);
        edt2 = (TextView)findViewById(R.id.textView2);
        edt3 = (TextView)findViewById(R.id.textView3);
        edt4 = (TextView)findViewById(R.id.textView4);
        btn = (Button)findViewById(R.id.button);
        btn2 = (Button)findViewById(R.id.button2);
        btn3 = (Button)findViewById(R.id.button3);
        btn4 = (Button)findViewById(R.id.button4);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=edt.getText().toString();
                edt2.setText(a);
                Typeface typeface = ResourcesCompat.getFont(getApplication(), R.font.pacifico);
                edt2.setTypeface(typeface);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=edt.getText().toString();
                edt3.setText(a);
                Typeface typeface = ResourcesCompat.getFont(getApplication(), R.font.font_bold);
                edt3.setTypeface(typeface);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=edt.getText().toString();
                edt4.setText(a);
                Typeface typeface = ResourcesCompat.getFont(getApplication(), R.font.seasrn);
                edt4.setTypeface(typeface);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String clear=" ";
               edt2.setText(clear);
               edt3.setText(clear);
               edt4.setText(clear);
            }
        });






    }
}
