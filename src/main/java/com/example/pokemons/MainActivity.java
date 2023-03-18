package com.example.pokemons;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public CardView car1,car2,car3,car4,car5,car6,car7,car8,car9,car10;

    @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                 setContentView(R.layout.activity_main);

                  Button btn1=findViewById(R.id.aaaa);
                  Button btn2=findViewById(R.id.bbbb);
                  Button btn3=findViewById(R.id.ccc);
                  Button btn4=findViewById(R.id.ddd);
                  Button btn5=findViewById(R.id.eee);
                  Button btn6=findViewById(R.id.fff);
                  Button btn7=findViewById(R.id.ggg);
                  Button btn8=findViewById(R.id.hhh);
                  Button btn9=findViewById(R.id.iii);
                  Button btn10=findViewById(R.id.jjj);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent myInt = new Intent(getApplicationContext(),MainActivity2.class);
                    startActivity(myInt);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myInt = new Intent(getApplicationContext(),MainActivity3.class);
                startActivity(myInt);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myInt = new Intent(getApplicationContext(),MainActivity4.class);
                startActivity(myInt);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myInt = new Intent(getApplicationContext(),MainActivity5.class);
                startActivity(myInt);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myInt = new Intent(getApplicationContext(),MainActivity6.class);
                startActivity(myInt);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myInt = new Intent(getApplicationContext(),MainActivity7.class);
                startActivity(myInt);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myInt = new Intent(getApplicationContext(),MainActivity8.class);
                startActivity(myInt);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myInt = new Intent(getApplicationContext(),MainActivity9.class);
                startActivity(myInt);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myInt = new Intent(getApplicationContext(),MainActivity10.class);
                startActivity(myInt);
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myInt = new Intent(getApplicationContext(),MainActivity11.class);
                startActivity(myInt);
            }
        });
        }
        /*car1=(CardView)findViewById(R.id.card1);
        car2=(CardView)findViewById(R.id.card2);
        car3=(CardView)findViewById(R.id.card3);
        car4=(CardView)findViewById(R.id.card4);
        car5=(CardView)findViewById(R.id.card5);
        car6=(CardView)findViewById(R.id.card6);
        car7=(CardView)findViewById(R.id.card7);
        car8=(CardView)findViewById(R.id.card8);
        car9=(CardView)findViewById(R.id.card9);
        car10=(CardView)findViewById(R.id.card10);

        car1.setOnClickListener(this);
        car2.setOnClickListener(this);
        car3.setOnClickListener(this);
        car4.setOnClickListener(this);
        car5.setOnClickListener(this);
        car6.setOnClickListener(this);
        car7.setOnClickListener(this);
        car8.setOnClickListener(this);
        car9.setOnClickListener(this);
        car10.setOnClickListener(this);*/




    /*public void onClick(View view){
       Intent I;

        switch(view.getId()){
            case R.id.card1 :
                I=new Intent(this,MainActivity2.class);
                startActivity(I);
                break;
            case R.id.card2 :
                I=new Intent(this,MainActivity3.class);
                startActivity(I);
                break;
            case R.id.card3 :
                I=new Intent(this,MainActivity4.class);
                startActivity(I);
                break;
            case R.id.card4 :
                I=new Intent(this,MainActivity5.class);
                startActivity(I);
                break;
            case R.id.card5 :
                I=new Intent(this,MainActivity6.class);
                startActivity(I);
                break;
            case R.id.card6 :
                I=new Intent(this,MainActivity7.class);
                startActivity(I);
                break;
            case R.id.card7 :
                I=new Intent(this,MainActivity8.class);
                startActivity(I);
                break;
            case R.id.card8 :
                I=new Intent(this,MainActivity9.class);
                startActivity(I);
                break;
            case R.id.card9 :
                I=new Intent(this,MainActivity10.class);
                startActivity(I);
                break;
            case R.id.card10 :
                I=new Intent(this,MainActivity11.class);
                startActivity(I);
                break;
        }
    }*/
}