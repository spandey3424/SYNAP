package com.disability.synap;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.List;

public class DisplayProf extends AppCompatActivity {

    Button b;
    TextView firstname,middlename,lastname,emailsss,address,phone,occupation,qualification,marriage;
    DatabaseReference databaseprofile;
    FirebaseAuth firebaseAuth;
    FirebaseDatabase firebaseDatabase;



    @Override
    protected void   onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_displayprofile);
        firebaseAuth=FirebaseAuth.getInstance();



        firebaseDatabase=FirebaseDatabase.getInstance();

        FirebaseUser user=firebaseAuth.getCurrentUser();

        String userrr=user.getUid();


        databaseprofile=firebaseDatabase.getReference("Profile").getRef(

        );
        //      Query query=databaseprofile.child("Profile").child(firstname);

        firstname=(TextView)  findViewById(R.id.firstnam);
        middlename=(TextView) findViewById(R.id.middlenem);
        lastname=(TextView) findViewById(R.id.lastname);
        emailsss=(TextView) findViewById(R.id.email);
        address=(TextView) findViewById(R.id.address);
        phone=(TextView) findViewById(R.id.phone);
        marriage=(TextView) findViewById(R.id.marital);
        occupation=(TextView) findViewById(R.id.Occupation);
        qualification=(TextView) findViewById(R.id.qualifaction);



        b = (Button) findViewById(R.id.updatebutton2);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DisplayProf.this, Profile.class);
                startActivity(intent);
                finish();
            }
        });




//databaseprofile.child("Profile").child(user.getUid())

        databaseprofile.addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot   dataSnapshot) {

                for(DataSnapshot ds:dataSnapshot.getChildren()) {
                    //    retrieveprofile rs = dataSnapshot.getValue(retrieveprofile.class);
                    retrieveprofile rs = ds.getValue(retrieveprofile.class);
                    firstname.setText(rs.getFirstna() + "");


                    middlename.setText(rs.getMiddlenam() + "");

                    lastname.setText(rs.getLastnam() + "");

                    emailsss.setText(rs.getEmailss() + "");

                    address.setText(rs.getAdres());

                    phone.setText(rs.getPhne());

                    occupation.setText(rs.getOcupatn());

                    marriage.setText(rs.getMarriage());

                    qualification.setText(rs.getQualfication());




                }
                //    for(DataSnapshot dr:dataSnapshot.getChildren()){
                //    retrieveprofile rr=dr.getValue(retrieveprofile.class);
                //   middlename.setText(rr.getMiddlenam());
                //   }

                //     retrieveprofile rs2 = dataSnapshot.getValue(retrieveprofile.class);
                //      middlename.setText(rs2.getMiddlenam());


            }


            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


    }


}