package com.example.dumisile.toffeecoffee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Display2 extends AppCompatActivity {
    private TextView txtShow;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display2);

        txtShow= (TextView) findViewById(R.id.txtShow);

        txtShow.setText("THANK YOU FOR CHOOSING US..."+"\n"+
                "YOUR ORDER WILL BE READY IN 2 MINUTES."+"\n"+
                "\n"+
                "\n"+
                "CALL AGAIN...!!!");

    }


}
