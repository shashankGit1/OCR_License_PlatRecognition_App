package com.rcpl.ocr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class add extends AppCompatActivity implements View.OnClickListener
{
    EditText License,Model,Color;
    Button blacklist,whitelist;
    RadioGroup radioGroup;
    String lic,mod,col;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add);
        License=(EditText)findViewById(R.id.License);
        Model=(EditText)findViewById(R.id.Model);
        Color=(EditText)findViewById(R.id.Color);
        Bundle b=getIntent().getExtras();


    }

    @Override
    public void onClick(View view)
    {
        switch(view.getId())
        {
            case (R.id.viewblacklist):
                break;
        }
    }
}
