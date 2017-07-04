package com.example.dumisile.toffeecoffee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.x;
import static android.R.id.edit;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    static CheckBox chkBlack;
    static CheckBox chkWhite;
    static CheckBox chkCappucino;
    static CheckBox chkHot;
    private Button btnOrder;
    EditText q1, q2, q3, q4,t1,t2,t3,t4;

    public static final String ANSWER="answer";
    public static final String QUANTITY="quantity";
    public static final String TOPPING1="topping";
    public static final String TOPPING2="topping";
    public static final String TOPPING3="topping";
    public static final String TOPPING4="topping";
    public static final String COFFEENAME1="topping";
    public static final String COFFEENAME2="topping";
    public static final String COFFEENAME3="topping";
    public static final String COFFEENAME4="topping";
    public static String coffeeN1;
    public static String coffeeN2;
    public static String coffeeN3;
    public static String coffeeN4;
    public static final String BLACKQ="quan";
    public static final String WHITEQ="quanT";
    public static final String CAPPUCINOQ="quanTI";
    public static final String HOTQ="quanTEE";
    public static String blackQ;
    public static String topping1="";
    static String whiteQ="";
    static String topping2="";
    static String cappucinoQ="";
    static String topping3="";
    static String hotQ="";
    static String topping4="";
    public static int answer = 0;
    private String intentanswer;
    private String intenttoppings;
    private String intentquantity;
    private final int Black =24;
    private final int White=26;
    private final int Cappucino=30;
    private final int Hot=28;
    int amount=0;
    int qauntity=0;
    String toppings="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chkBlack = (CheckBox) findViewById(R.id.chkBlack);
        chkWhite = (CheckBox) findViewById(R.id.chkWhite);
        chkCappucino = (CheckBox) findViewById(R.id.chkCappucino);
        chkHot = (CheckBox) findViewById(R.id.chkHot);
        btnOrder = (Button) findViewById(R.id.btnOrder);

        btnOrder.setOnClickListener(this);
        q1 = (EditText) findViewById(R.id.editTextBlack);
        q2 = (EditText) findViewById(R.id.editTextWhite);
        q3 = (EditText) findViewById(R.id.editTextCappucino);
        q4 = (EditText) findViewById(R.id.editTextHot);
        t1=(EditText) findViewById(R.id.topping1);
        t2=(EditText) findViewById(R.id.topping2);
        t3=(EditText) findViewById(R.id.topping3);
        t4=(EditText) findViewById(R.id.topping4);



       chkBlack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!chkBlack.isChecked()) {
                    q1.setVisibility(View.INVISIBLE);
                } else {
                    q1.setVisibility(View.VISIBLE);
                }

            }
        });
        chkWhite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!chkWhite.isChecked()) {
                    q2.setVisibility(View.INVISIBLE);
                } else {
                    q2.setVisibility(View.VISIBLE);
                }
            }
        });


        chkCappucino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!chkCappucino.isChecked()) {
                    q3.setVisibility(View.INVISIBLE);
                } else {
                    q3.setVisibility(View.VISIBLE);

                }

         chkHot.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                 if (!chkHot.isChecked()) {
                     q4.setVisibility(View.INVISIBLE);
                 } else {
                     q4.setVisibility(View.VISIBLE);
                 }

                    }
                });
            }
        });


    }
    public void order() {

        int total = 0;


       // int qauntity=0;
        if (chkBlack.isChecked()) {
            //amount=amount+Black;

            qauntity= Integer.valueOf(q1.getText().toString());
            coffeeN1=chkBlack.getText().toString();
            blackQ=String.valueOf(qauntity);
            topping1=t1.getText().toString();
            amount=Black * qauntity;
          //  Toast.makeText(MainActivity.this,"" +qauntity,Toast.LENGTH_LONG).show();
        }
        if (chkWhite.isChecked()) {

            //amount=amount+White;
            qauntity= Integer.valueOf(q2.getText().toString());
            coffeeN2=chkWhite.getText().toString();
            whiteQ=String.valueOf(qauntity);
            topping2=t2.getText().toString();
            amount += (White * qauntity);
        }
        if (chkCappucino.isChecked()) {
            //amount=amount+Cappucino;
            qauntity = Integer.valueOf(q3.getText().toString());
            coffeeN3=chkCappucino.getText().toString();
            cappucinoQ=String.valueOf(qauntity);
            topping3=t3.getText().toString();
            amount += (Cappucino * qauntity);
        }
        if (chkHot.isChecked()) {
            //amount=amount+Hot;
            qauntity= Integer.valueOf(q4.getText().toString());
            coffeeN4=chkHot.getText().toString();
            hotQ=String.valueOf(qauntity);
            topping4=t4.getText().toString();
            amount += (Hot * qauntity);
        }

           //total=amount;




        intentanswer =String.valueOf(amount);
        intentquantity=String.valueOf(qauntity);
        intenttoppings=toppings;


        Intent intent=new Intent(MainActivity.this,DisplayMenu.class);
        intent.putExtra(ANSWER,intentanswer);
        intent.putExtra(QUANTITY,intentquantity);
        intent.putExtra(TOPPING1,topping1);
        intent.putExtra(TOPPING2,topping2);
        intent.putExtra(TOPPING3,topping3);
        intent.putExtra(TOPPING4,topping4);
        intent.putExtra(COFFEENAME1,coffeeN1);
        intent.putExtra(COFFEENAME2,coffeeN2);
        intent.putExtra(COFFEENAME3,coffeeN3);
        intent.putExtra(COFFEENAME4,coffeeN4);
        intent.putExtra(BLACKQ,blackQ);
        intent.putExtra(WHITEQ,whiteQ);
        intent.putExtra(CAPPUCINOQ,cappucinoQ);
        intent.putExtra(HOTQ,hotQ);
        startActivity(intent);
        amount=0;
        qauntity=0;
        toppings="";

        }

    @Override
    public void onClick(View v) {
       if (v.getId()==R.id.btnOrder){
        order();
       }


    }
}





