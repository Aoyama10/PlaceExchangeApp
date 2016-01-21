package jp.ac.kit.placeexchangeapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;
import android.text.SpannableStringBuilder;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.Toast;

public class AuthenticationLogin extends AppCompatActivity implements OnClickListener{

    private Button button_segue;
    private int result;
    EditText edit = new EditText(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentication_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        button_segue=(Button)findViewById(R.id.button);
        button_segue.setOnClickListener(this);

    }

    @Override
    public void onClick(View v)
    {
        if(v==button_segue) {
            EditText id = (EditText) findViewById(R.id.ID);
            SpannableStringBuilder sbid = (SpannableStringBuilder) edit.getText();
            String inputID = sbid.toString();

            EditText pass = (EditText) findViewById(R.id.password);
            SpannableStringBuilder sbpass = (SpannableStringBuilder) edit.getText();
            String inputPAss = sbpass.toString();

            if(result == 1)
            {
                Intent maps = new Intent(getApplicationContext(), MapsActivity.class);
                startActivityForResult(maps, 0);
                Toast success = Toast.makeText(AuthenticationLogin.this,
                        "Authentication completion", Toast.LENGTH_LONG);
            }
            else if (result == 0)
            {
                //Intent login = new Intent(getApplicationContext(), LoginActivity.class);
                //startActivityForResult(login, 0);
                Toast rewrite = Toast.makeText(AuthenticationLogin.this,
                        "Try Again", Toast.LENGTH_LONG);
            }

            onConnect();
        }

    }
}
