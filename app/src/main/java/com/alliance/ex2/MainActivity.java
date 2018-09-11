package com.alliance.ex2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1;
    EditText e2;
    TextView t2;
    int count=3;
    Button mSubBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.uname);
        e2=findViewById(R.id.pass);
        t2=findViewById(R.id.textView2);
        mSubBtn=findViewById(R.id.sub_btn);

        setTitle("Login");

    }

    public void Submit(View view)
    {
        String uname=e1.getText().toString();
        String password=e2.getText().toString();
        if (uname.isEmpty() || password.isEmpty())
        {
            Toast.makeText(this, "Please enter your username and Password!", Toast.LENGTH_SHORT).show();
        }
        else {
            if (uname.equals("kunchok") && password.equals("friends")) {
                Intent intent=new Intent(this,Activity2.class);
                intent.putExtra("uname",uname);
                startActivity(intent);
            } else {
                if(count==0)
                {
                 mSubBtn.setEnabled(false);
                }else{
                    Toast.makeText(this, "INCORRECT username  or password", Toast.LENGTH_SHORT).show();
                }
                t2.setText(count+" left");

                count--;
            }
        }
    }
}
