package com.example.hw_1_m3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
    private EditText mName;
    private EditText mFam;
    private EditText mAge;
    private Button mGo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }

    private void findViews(){
        mName=(EditText)findViewById(R.id.name);
        mFam=(EditText)findViewById(R.id.surname);
        mAge=(EditText)findViewById(R.id.age);
        mGo=(Button)findViewById(R.id.button_send);
    }

    public void Send(View view) {
        switch (view.getId()) {
            case R.id.button_send:
                navigateToSecond(String.valueOf(mName.getText().toString().isEmpty()));
                navigateToSecond(String.valueOf(mFam.getText().toString().isEmpty()));
                navigateToSecond(String.valueOf(mAge.getText().toString().isEmpty()));
                navigateToSecond(String.valueOf(mGo.getText().toString().isEmpty()));
                break;
            default: break;
        }
    }

    private void navigateToSecond(String name){
        Intent intent=new Intent(MainActivity.this,SecondActivity.class);
        intent.putExtra("name", mName.getText().toString());
        intent.putExtra("fam", mFam.getText().toString());
        intent.putExtra("age", mAge.getText().toString());
        startActivity(intent);
    }
}