package com.example.dumisile.toffeecoffee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.name;
import static android.R.attr.order;
import static android.R.attr.x;
import static android.R.color.black;
import static android.os.Build.VERSION_CODES.M;
import static android.os.Build.VERSION_CODES.N;
import static com.example.dumisile.toffeecoffee.MainActivity.answer;
import static com.example.dumisile.toffeecoffee.MainActivity.chkCappucino;
import static com.example.dumisile.toffeecoffee.MainActivity.coffeeN4;

public class DisplayMenu extends AppCompatActivity {

    MainActivity x = new MainActivity();
    TextView display, amountDue,txtShow;
    private Button btnConfirm, btnChange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_menu);

        display = (TextView) findViewById(R.id.txtDisplay);
        txtShow=(TextView) findViewById(R.id.txtShow);
        amountDue = (TextView) findViewById(R.id.txtAmount);
       // btnConfirm = (Button) findViewById(R.id.btnConfirm);
        btnChange = (Button) findViewById(R.id.btnChange);


        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent change =new Intent(DisplayMenu.this,MainActivity.class);
                startActivity(change);
            }
        });

        final Intent intent = getIntent();
        String answer = intent.getStringExtra(MainActivity.ANSWER);
        String blackQ = intent.getStringExtra(MainActivity.BLACKQ);
        String whiteQ = intent.getStringExtra(MainActivity.WHITEQ);
        String cappucinoQ = intent.getStringExtra(MainActivity.CAPPUCINOQ);
        String hotQ = intent.getStringExtra(MainActivity.HOTQ);
        String top1 = intent.getStringExtra(MainActivity.TOPPING1);
        String top2 = intent.getStringExtra(MainActivity.TOPPING2);
        String top3 = intent.getStringExtra(MainActivity.TOPPING3);
        String top4 = intent.getStringExtra(MainActivity.TOPPING4);
        String name1 = intent.getStringExtra(MainActivity.COFFEENAME1);
        String name2 = intent.getStringExtra(MainActivity.COFFEENAME2);
        String name3 = intent.getStringExtra(MainActivity.COFFEENAME3);
        String name4 = intent.getStringExtra(MainActivity.COFFEENAME4);

        if (x.chkBlack.isChecked()) {
            display.setText(x.blackQ + " " + x.coffeeN1 + " cup/s with " + x.topping1);
            amountDue.setText("" + "R" + answer + ".00");
        }

        if (x.chkWhite.isChecked()) {
            display.setText(x.whiteQ + " " + x.coffeeN2 + " cup/s with " + x.topping2);
            amountDue.setText("" + "R" + answer + ".00");
        }

        if (x.chkBlack.isChecked() && x.chkWhite.isChecked()) {
            display.setText(x.blackQ + " " + x.coffeeN1 + " cup/s with " + x.topping1 + "\n" +
                    x.whiteQ + " " + x.coffeeN2 + " cup/s with " + x.topping2);
            amountDue.setText("" + "R" + answer + ".00");
        }
        if (x.chkCappucino.isChecked()) {
            display.setText(x.cappucinoQ + " " + x.coffeeN3 + " cup/s with " + x.topping3);
            amountDue.setText("" + "R" + answer + ".00");
        }

        if (x.chkHot.isChecked()) {
            display.setText(x.hotQ + " " + x.coffeeN4 + " cup/s with " + x.topping4 + "\n" +
                    x.hotQ + " " + x.coffeeN4 + " cup/s with " + x.topping4);
            amountDue.setText("" + "R" + answer + ".00");
        }
        if (x.chkCappucino.isChecked() && x.chkHot.isChecked()) {
            display.setText(x.cappucinoQ + " " + x.coffeeN3 + " cup/s with " + x.topping3 + "\n" +
                    x.hotQ + " " + x.coffeeN4 + " cup/s with " + x.topping4);
            amountDue.setText("" + "R" + answer + ".00");
        }
        if (x.chkBlack.isChecked() && x.chkCappucino.isChecked()) {
            display.setText(x.blackQ + " " + x.coffeeN1 + " cup/s with " + x.topping1 + "\n" +
                    x.cappucinoQ + " " + x.coffeeN3 + " cup/s with " + x.topping3);
            amountDue.setText("" + "R" + answer + ".00");
        }
        if (x.chkBlack.isChecked() && x.chkHot.isChecked()) {
            display.setText(x.blackQ + " " + x.coffeeN1 + " cup/s with " + x.topping1 + "\n" +
                    x.hotQ + " " + x.coffeeN4 + " cup/s with " + x.topping4);
            amountDue.setText("" + "R" + answer + ".00");
        }
        if (x.chkCappucino.isChecked() && x.chkWhite.isChecked()) {
            display.setText(x.cappucinoQ + " " + x.coffeeN3 + " cup/s with " + x.topping3 + "\n" +
                    x.whiteQ + " " + x.coffeeN2 + " cup/s with " + x.topping2);
            amountDue.setText("" + "R" + answer + ".00");
        }
        if (x.chkWhite.isChecked() && x.chkHot.isChecked()) {
            display.setText(x.whiteQ + " " + x.coffeeN2 + " cup/s with " + x.topping2 + "\n" +
                    x.hotQ + " " + x.coffeeN4 + " cup/s with " + x.topping4);
            amountDue.setText("" + "R" + answer + ".00");
        }
        if (x.chkBlack.isChecked() && x.chkWhite.isChecked() && chkCappucino.isChecked() && x.chkHot.isChecked()) {
            display.setText(x.blackQ + " " + x.coffeeN1 + " cup/s with " + x.topping1 + "\n" +
                    x.whiteQ + " " + x.coffeeN2 + " cup/s with " + x.topping2 + "\n" +
                    x.cappucinoQ + "" + x.coffeeN3 + "cup/s with" + x.topping3 + "\n" +
                    x.hotQ + "" + coffeeN4 + "cup/s with" + x.topping4);
            amountDue.setText("" + "R" + answer + ".00");
        }


    }
    public void confirm(View view){


        Intent intent2=new Intent(DisplayMenu.this, Display2.class);
        startActivity(intent2);

    }


}
