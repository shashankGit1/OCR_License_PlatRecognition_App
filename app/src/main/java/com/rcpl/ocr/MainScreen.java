package com.rcpl.ocr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainScreen extends AppCompatActivity implements View.OnClickListener
{
    Button scan,viewblacklist,viewwhitelist,addmanually;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        scan=(Button)findViewById(R.id.scan);
        viewblacklist=(Button)findViewById(R.id.viewblacklist);
        viewwhitelist=(Button)findViewById(R.id.viewwhitelist);
        addmanually=(Button)findViewById(R.id.addmanually);
        scan.setOnClickListener(this);
        viewblacklist.setOnClickListener(this);
        viewwhitelist.setOnClickListener(this);
        addmanually.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.scan:
                Intent intent=new Intent(this,MainActivity.class);
                startActivity(intent);
                break;
            case R.id.viewblacklist:
                Intent intent1=new Intent(this,viewblacklist.class);
                break;
            case R.id.viewwhitelist:
                Intent intent2=new Intent(this,viewwhitelist.class);
                break;
            case R.id.addmanually:
                Intent intent3=new Intent(this,add.class);
            default:
                break;
        }
    }
}
