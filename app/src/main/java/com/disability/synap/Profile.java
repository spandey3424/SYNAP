package com.disability.synap;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Profile extends AppCompatActivity {

    ImageView profileimg;
    Button cam,up;
    Spinner spinner, spinner2;
    ArrayAdapter<CharSequence> adapter;
    ArrayAdapter<CharSequence> adapter2;
    EditText firstname,middlename,lastname;
    EditText emails,phones,addres,martial,occupations,qualify;
    DatabaseReference databaseprofile;
    private FirebaseAuth firebaseAuth;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profilemanager);

        profileimg = (ImageView) findViewById(R.id.dp);
        cam = (Button) findViewById(R.id.cam);
        spinner = (Spinner) findViewById(R.id.statespinner);

        up = (Button) findViewById(R.id.updatebutton);


        firstname =(EditText) findViewById(R.id.firstname);
        middlename=(EditText) findViewById(R.id.middlename) ;
        lastname=(EditText) findViewById(R.id.lastname);
        emails=(EditText) findViewById(R.id.email);
        phones=(EditText) findViewById(R.id.phone);
        addres =(EditText) findViewById(R.id.address);
        martial=(EditText) findViewById(R.id.marital);
        occupations=(EditText) findViewById(R.id.Occupation);
        qualify=(EditText) findViewById(R.id.qualifaction);



        databaseprofile= FirebaseDatabase.getInstance().getReference("Profile");

        adapter = ArrayAdapter.createFromResource(this, R.array.state_names, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Profile.this,"Profile Updated",Toast.LENGTH_LONG).show();



                addprofile();

            }
        });


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        spinner2 = (Spinner) findViewById(R.id.bloodspinner);
        adapter2 = ArrayAdapter.createFromResource(this, R.array.blood_grp, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }
    private void addprofile(){
        String firstnam=firstname.getText().toString().trim();
        String middlenam=middlename.getText().toString().trim();
        String lastnam=lastname.getText().toString().trim();

        String emailss=emails.getText().toString().trim();
        String adres=addres.getText().toString().trim();
        String phne=phones.getText().toString().trim();

        String ocupatn=occupations.getText().toString().trim();
        String qualfication=qualify.getText().toString().trim();
        String marriage=martial.getText().toString().trim();

        firebaseAuth=FirebaseAuth.getInstance();

        FirebaseUser user=firebaseAuth.getCurrentUser();
        String userrr=user.getUid();
        if(user!=null) {

            if (!TextUtils.isEmpty(firstnam)) {
                Addprofile addprofiles = new Addprofile(firstnam, middlenam, lastnam, emailss, adres, phne, ocupatn, qualfication, marriage);

                databaseprofile.child(userrr).setValue(addprofiles);
                Toast.makeText(this, "Profile added", Toast.LENGTH_SHORT);


            }
        }


    }

}


