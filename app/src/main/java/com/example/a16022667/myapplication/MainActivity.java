package com.example.a16022667.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private double valueOne = Double.NaN;
    private double valueTwo = Double.NaN;

    Button btndivide;
    Button btntimes;
    Button btnplus;
    Button btnminus;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn0;
    Button btnopenbracket;
    Button btnclosebracket;
    Button btnclear;
    Button btncalculate;
    Button btndecimal;
    Button btnhistory;
    ListView lvhistory;
    EditText etcalsen;
    Float num1;
    Float num2;
    String result;
    String operate;
    boolean mAddition , mSubtract ,mMultiplication ,mDivision ;
    boolean reset;

    ArrayList<String> alHistory = new ArrayList<String>();






    private static final char ADDITION = '+';
    private static final char SUBTRACTION = '-';
    private static final char MULTIPLICATION = '*';
    private static final char DIVISION = '/';

    private char CURRENT_ACTION;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnhistory = (Button)findViewById(R.id.buttontoHistory);
        lvhistory = (ListView)findViewById(R.id.listViewHistory);
        btndivide = (Button)findViewById(R.id.buttondivision);
        btntimes = (Button)findViewById(R.id.buttonmultiply);
        btnplus = (Button)findViewById(R.id.buttonadd);
        btnminus = (Button)findViewById(R.id.buttonminus);
        btn0 = (Button)findViewById(R.id.button0);
        btn1 = (Button)findViewById(R.id.button1);
        btn2 = (Button)findViewById(R.id.button2);
        btn3 = (Button)findViewById(R.id.button3);
        btn4 = (Button)findViewById(R.id.button4);
        btn5 = (Button)findViewById(R.id.button5);
        btn6 = (Button)findViewById(R.id.button6);
        btn7 = (Button)findViewById(R.id.button7);
        btn8 = (Button)findViewById(R.id.button8);
        btn9 = (Button)findViewById(R.id.button9);
        btnopenbracket = (Button)findViewById(R.id.buttonOpenBracket);
        btnclosebracket =(Button)findViewById(R.id.buttonCloseBracket);
        btnclear = (Button)findViewById(R.id.buttonClear);
        btncalculate = (Button)findViewById(R.id.buttoncalculate);
        btndecimal = (Button)findViewById(R.id.buttondecimal);
        final ArrayAdapter<String> aaHistory = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, alHistory);
        etcalsen = (EditText)findViewById(R.id.editTextcalculateSentence);

        lvhistory.setAdapter(aaHistory);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(reset == true) {
                    etcalsen.setText("0");
                    reset = false;
                }else{
                    etcalsen.setText(etcalsen.getText() + "0");
                }
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(reset == true) {
                    etcalsen.setText("1");
                    reset = false;
                }else{
                    etcalsen.setText(etcalsen.getText() + "1");
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(reset == true) {
                    etcalsen.setText("2");
                    reset = false;
                }else{
                    etcalsen.setText(etcalsen.getText() + "2");
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(reset == true) {
                    etcalsen.setText("3");
                    reset = false;
                }else{
                    etcalsen.setText(etcalsen.getText() + "3");
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(reset == true) {
                    etcalsen.setText("4");
                    reset = false;
                }else{
                    etcalsen.setText(etcalsen.getText() + "4");
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(reset == true) {
                    etcalsen.setText("5");
                    reset = false;
                }else{
                    etcalsen.setText(etcalsen.getText() + "5");
                }
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(reset == true) {
                    etcalsen.setText("6");
                    reset = false;
                }else{
                    etcalsen.setText(etcalsen.getText() + "6");
                }
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(reset == true) {
                    etcalsen.setText("7");
                    reset = false;
                }else{
                    etcalsen.setText(etcalsen.getText() + "7");
                }
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(reset == true) {
                    etcalsen.setText("8");
                    reset = false;
                }else{
                    etcalsen.setText(etcalsen.getText() + "8");
                }
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(reset == true) {
                    etcalsen.setText("9");
                    reset = false;
                }else{
                    etcalsen.setText(etcalsen.getText() + "9");
                }
            }
        });
        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (etcalsen == null){
                    etcalsen.setText("");
                }else {
                    num1 = Float.parseFloat(etcalsen.getText() + "");
                    mAddition = true;
                    etcalsen.setText(null);
                }
                operate = "+";
            }
        });
        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (etcalsen == null){
                    etcalsen.setText("");
                }else {
                    num1 = Float.parseFloat(etcalsen.getText() + "");
                    mSubtract = true;
                    etcalsen.setText(null);
                }
                operate = "-";
            }
        });
        btntimes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (etcalsen == null){
                    etcalsen.setText("");
                }else {
                    num1 = Float.parseFloat(etcalsen.getText() + "");
                    mMultiplication = true;
                    etcalsen.setText(null);
                }
                operate = "x";
            }
        });
        btndivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (etcalsen == null){
                    etcalsen.setText("");
                }else {
                    num1 = Float.parseFloat(etcalsen.getText() + "");
                    mDivision = true;
                    etcalsen.setText(null);
                }
                operate = "/";
            }
        });
        btnopenbracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etcalsen.setText(etcalsen.getText() + "(");
            }

        });
        btnclosebracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etcalsen.setText(etcalsen.getText() + ")");
            }

        });
        btndecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etcalsen.setText(etcalsen.getText()+".");
            }
        });

        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etcalsen.setText("");
            }

        });
        btncalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num2 = Float.parseFloat(etcalsen.getText() + "");

                if (mAddition == true){

                    etcalsen.setText(num1 + num2 + "");
                    mAddition=false;
                }


                if (mSubtract == true){
                    etcalsen.setText(num1 - num2 + "");
                    mSubtract=false;
                }

                if (mMultiplication == true){
                    etcalsen.setText(num1 * num2 + "");
                    mMultiplication=false;
                }

                if (mDivision == true){
                    etcalsen.setText(num1 / num2 + "");
                    mDivision=false;
                }
                reset = true;
                result = etcalsen.getText().toString();
                String number1 = String.valueOf(num1);
                String number2 = String.valueOf(num2);
                String resultCollector = result;


                String strResults = number1 + operate + number2 + " = " + result;
                alHistory.add(strResults);
                lvhistory.setAdapter(aaHistory);
                aaHistory.notifyDataSetChanged();

            }
        });



        btnhistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent i = new Intent(getBaseContext(),History.class);
                Intent i = new Intent(getBaseContext(),History.class);
                i.putExtra("History", alHistory);
                startActivity(i);
            }
        });


      /*  lvhistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),History.class
                );
                startActivity(i);
            }


        });

*/
        Log.i("MainActivity", "");


}
}
