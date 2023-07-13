package com.disability.synap;


import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class Main2Activity extends AppCompatActivity {

    private Button s;
    private   EditText pass,name,email,phone;
    private Button reg;
    private FirebaseAuth fireBaseAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setUIViews();
        fireBaseAuth=FirebaseAuth.getInstance();

        pass=(EditText) findViewById(R.id.password);
        s= (Button) findViewById(R.id.show);
        s.setOnClickListener(new showOrHidePassword());


        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(validate()){
                    //upload to database
                    String useremail=email.getText().toString().trim();
                    String userpassword=pass.getText().toString().trim();

                    fireBaseAuth.createUserWithEmailAndPassword(useremail, userpassword).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                Toast.makeText(Main2Activity.this, "", Toast.LENGTH_SHORT).show();
                                Toast.makeText(Main2Activity.this, "Wait for OTP", Toast.LENGTH_SHORT).show();
                                String numbers = phone.getText().toString().trim();
                                String phoneNumber = "+91" + numbers;
                                Intent intent = new Intent(Main2Activity.this, otpverify.class);
                                intent.putExtra("phonenumber", phoneNumber);
                                startActivity(intent);

                            }
                            else{
                                Toast.makeText(Main2Activity.this, "Registration Failed", Toast.LENGTH_SHORT).show();

                            }
                        }
                    });


                }

            }
        });


    }

    private class showOrHidePassword implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            if (s.getText().toString() == "SHOW") {
                pass.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                s.setText("HIDE");

            } else {

                pass.setTransformationMethod(PasswordTransformationMethod.getInstance());
                s.setText("SHOW");
            }
        }
    }
    private void setUIViews(){
        name=(EditText) findViewById(R.id.nam);
        email=(EditText) findViewById(R.id.email);
        phone=(EditText) findViewById(R.id.phone);
        reg=(Button) findViewById(R.id.newreg);
    }
    private Boolean validate(){
        Boolean result=false;
        String username=name.getText().toString();
        String passwords=pass.getText().toString();
        String phonenumber=phone.getText().toString();
        String emailid=email.getText().toString();

        if(username.isEmpty() && passwords.isEmpty() || emailid.isEmpty() || phonenumber.isEmpty()){
            Toast.makeText(this, "Please enter all details", Toast.LENGTH_SHORT).show();
        }else{
            result=true;

        }
        return result;

    }
}