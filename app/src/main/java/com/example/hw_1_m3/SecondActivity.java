package com.example.hw_1_m3;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends Activity {
    private TextView mName;
    private TextView mSurname;
    private TextView mAge;
    private Button mBack;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        findViews();
        GetIntentGetText();
    }

    private  void findViews() {
        mName=(TextView)findViewById(R.id.nameOutput);
        mSurname=(TextView)findViewById(R.id.surnameOutput);
        mAge=(TextView)findViewById(R.id.ageOutput);
        mBack=(Button)findViewById(R.id.button_back);
    }

    @SuppressLint("SetTextI18n")
    private void GetIntentGetText(){
        String Name = getIntent().getStringExtra("name");
        String Fam = getIntent().getStringExtra("fam");
        String Age = getIntent().getStringExtra("age");

        mName.setText(mName.getText().toString()+ "" + Name);
        mSurname.setText(mSurname.getText().toString()+ "" + Fam);
        mAge.setText(mAge.getText().toString()+ "" + Age);
    }

    public void Back(View view) {
        Intent intent=new Intent(SecondActivity.this,MainActivity.class);
        startActivity(intent);
    }
}