package com.disability.synap;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    private EditText  Loginpassword,Loginname;
    private Button log,reg,hlp;
    private FirebaseAuth firebaseAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Loginname=(EditText) findViewById(R.id.loginname);
        Loginpassword=(EditText) findViewById(R.id.loginpassword);
        log=(Button) findViewById(R.id.log);
        reg=(Button) findViewById(R.id.Reg);
        hlp =(Button) findViewById(R.id.help);



        hlp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast_help = new Toast(getApplicationContext());
                toast_help.setGravity(Gravity.CENTER, 0, 0);
                toast_help.setDuration(Toast.LENGTH_LONG);
                LayoutInflater inflater = getLayoutInflater();
                View appear = inflater.inflate(R.layout.toast_help, (ViewGroup) findViewById(R.id.linear));
                toast_help.setView(appear);
                toast_help.show();

            }
        });

        firebaseAuth=FirebaseAuth.getInstance();




        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCategory();
            }

            private void openCategory() {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);

            }
        });
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                openCategory();
            }
            public  void openCategory(){
                validate(Loginname.getText().toString(), Loginpassword.getText().toString());
            }

        });
    }
    private void validate(String loginusername, String loginuserpassword){
        firebaseAuth.signInWithEmailAndPassword(loginusername, loginuserpassword).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Intent intent = new Intent(MainActivity.this,Main3Activity.class);
                    startActivity(intent);
                    finish();


                }else{
                    Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();

                }

            }
        });
    }
}