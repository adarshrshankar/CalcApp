package com.fisat.newcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class add extends AppCompatActivity {

    EditText edt1,edt2;
    Button b1,b2;

    TextView t1;

    String getNum1,getNum2,result;
    int num1,num2,ans;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add);


        edt1=(EditText)findViewById(R.id.inp1);
        edt2=(EditText)findViewById(R.id.inp2);
        b1=(Button)findViewById(R.id.add);
        b2=(Button)findViewById(R.id.gohome);

        t1=(TextView)findViewById(R.id.Res);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(ob);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getNum1=edt1.getText().toString();
                getNum2=edt2.getText().toString();

                num1=Integer.parseInt(getNum1);
                num2=Integer.parseInt(getNum2);
                ans=num1+num2;

                result=String.valueOf(ans);
                t1.setText(result);

            }
        });

    }
}