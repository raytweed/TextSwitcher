package application.android.example.com.textswitcher;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;

public class MainActivity extends AppCompatActivity {
TextSwitcher swi;
Button btn1,btn2;
private int position=0;

String[] para={"I'm learning Android","I'm learning Artificial Intelligence","I'm learning python","I'm android developer"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        swi=findViewById(R.id.siw);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        swi.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                TextView textView=new TextView(getApplicationContext());
                textView.setTextSize(60);
                return textView;
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                position+=1;
                swi.setCurrentText(para[position]);

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                position-=1;
                swi.setCurrentText(para[position]);

            }
        });
        }

}
