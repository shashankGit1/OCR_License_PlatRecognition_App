package com.rcpl.ocr;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class addfromscancopy extends AppCompatActivity implements View.OnClickListener
{
    EditText License,Model,Color;
    myDbAdapter helper;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_from_scan);
        License=(EditText)findViewById(R.id.License);
        Model=(EditText)findViewById(R.id.Model);
        Color=(EditText)findViewById(R.id.Color);
        Bundle b=getIntent().getExtras();
        License.setText(b.getCharSequence("lic"));
    }

    @Override
    public void onClick(View view)
    {


    }
}

