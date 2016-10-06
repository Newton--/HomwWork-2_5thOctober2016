package com.example.abuzafarnewton.learninput;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import static com.example.abuzafarnewton.learninput.R.styleable.View;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editText;
    private EditText editText1;
    private EditText editText2;
    private Button button2;//Deposite
    private Button button3;//Withdraw
    private Button button4;//Check Balance
    Account user;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button) findViewById(R.id.button);
        button2=(Button) findViewById(R.id.button2);
        button3=(Button) findViewById(R.id.button3);
        button4=(Button) findViewById(R.id.button4);
        textView=(TextView) findViewById(R.id.textView);
        editText=(EditText) findViewById(R.id.editText);//Account name
        editText1=(EditText) findViewById(R.id.editText1);//Account Number
        editText2=(EditText) findViewById(R.id.editText2);//Ammount to be Deposited or Withdraw


        //Getting data
        final String userName=editText.getText().toString();
        final String userAccountNumber=editText1.getText().toString();




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creating Object
                user=new Account(userName,userAccountNumber);
                textView.setText(R.string.msg_success);
                editText.getText().clear();
                editText1.getText().clear();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                double ammount= Double.parseDouble(editText2.getText().toString());
                textView.setText(user.Deposite(ammount));
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                double ammount= Double.parseDouble(editText2.getText().toString());
                textView.setText(user.Withdraw(ammount));
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v3) {
                //double ammount= Double.parseDouble(editText2.getText().toString());
                textView.setText(String.valueOf(user.getBalance()));
            }
        });

    }
}
