package com.learn.programming.offline;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ajax= (Button) findViewById(R.id.bn1);
        ajax.setOnClickListener(this);
        Button asp= (Button) findViewById(R.id.bn2);
        asp.setOnClickListener(this);
        Button angular= (Button) findViewById(R.id.bn3);
        angular.setOnClickListener(this);
        Button bootstrap= (Button) findViewById(R.id.bn4);
        bootstrap.setOnClickListener(this);
        Button django= (Button) findViewById(R.id.bn5);
        django.setOnClickListener(this);
        Button css= (Button) findViewById(R.id.bn6);
        css.setOnClickListener(this);
        Button firebase= (Button) findViewById(R.id.bn7);
        firebase.setOnClickListener(this);
        Button html= (Button) findViewById(R.id.bn8);
        html.setOnClickListener(this);
        Button javascript= (Button) findViewById(R.id.bn9);
        javascript.setOnClickListener(this);
        Button joomla= (Button) findViewById(R.id.bn10);
        joomla.setOnClickListener(this);
        Button jquery= (Button) findViewById(R.id.bn11);
        jquery.setOnClickListener(this);
        Button php= (Button) findViewById(R.id.bn12);
        php.setOnClickListener(this);
        Button vue= (Button) findViewById(R.id.bn13);
        vue.setOnClickListener(this);
        Button wordpress= (Button) findViewById(R.id.bn14);
        wordpress.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.bn1:
               Intent ajaxx=new Intent(MainActivity.this,Ajax.class);
               startActivity(ajaxx);
               break;
            case R.id.bn2:
                Intent asp=new Intent(MainActivity.this,Asp.class);
                startActivity(asp);
                break;
            case R.id.bn3:
                Intent angular=new Intent(MainActivity.this,Angular.class);
                startActivity(angular);
                break;
            case R.id.bn4:
                Intent bootstrap=new Intent(MainActivity.this,Bootstrap.class);
                startActivity(bootstrap);
                break;
            case R.id.bn5:
                Intent django=new Intent(MainActivity.this,Django.class);
                startActivity(django);
                break;
            case R.id.bn6:
                Intent css=new Intent(MainActivity.this,Css.class);
                startActivity(css);
                break;
            case R.id.bn7:
                Intent firebase=new Intent(MainActivity.this,Firebase.class);
                startActivity(firebase);
                break;
            case R.id.bn8:
                Intent html=new Intent(MainActivity.this,Html.class);
                startActivity(html);
                break;
            case R.id.bn9:
                Intent javascript=new Intent(MainActivity.this,Javascript.class);
                startActivity(javascript);
                break;
            case R.id.bn10:
                Intent joomla=new Intent(MainActivity.this,Joomla.class);
                startActivity(joomla);
                break;
            case R.id.bn11:
                Intent jquery=new Intent(MainActivity.this,Jquery.class);
                startActivity(jquery);
                break;
            case R.id.bn12:
                Intent php=new Intent(MainActivity.this,Php.class);
                startActivity(php);
                break;
            case R.id.bn13:
                Intent vue=new Intent(MainActivity.this,Vue.class);
                startActivity(vue);
                break;
            case R.id.bn14:
                Intent wordpress=new Intent(MainActivity.this,Wordpress.class);
                startActivity(wordpress);
                break;

        }

    }
}
