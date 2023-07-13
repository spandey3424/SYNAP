package com.disability.synap;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Main3Activity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ImageView uploaddoc,starttst,card,sch,findj,trans;
    ImageView Img,Img1;
    Button cmp,cht;
    /*DatabaseReference databaseprofile;
    FirebaseAuth firebaseAuth;
    FirebaseDatabase firebaseDatabase;*/
    TextView emailheader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        uploaddoc=(ImageView) findViewById(R.id.uploaddoc);
        starttst=(ImageView) findViewById(R.id.starttest);
        card=(ImageView) findViewById(R.id.discard);
        sch=(ImageView) findViewById(R.id.schemesapply);
        findj=(ImageView) findViewById(R.id.findjob);
        trans=(ImageView) findViewById(R.id.transport);
        Img = (ImageView) findViewById(R.id.img1) ;
        cht = (Button) findViewById(R.id.messag);
        cmp = (Button) findViewById(R.id.complain);
        emailheader = (TextView) findViewById(R.id.em);



        /*nameheader = (TextView) findViewById(R.id.nm);


        firebaseAuth=FirebaseAuth.getInstance();


        firebaseAuth=FirebaseAuth.getInstance();
        firebaseDatabase=FirebaseDatabase.getInstance();
        databaseprofile=firebaseDatabase.getReference("Profile");

        databaseprofile.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                for (DataSnapshot ds:dataSnapshot.getChildren()) {

                    retrieveprofile rs = ds.getValue(retrieveprofile.class);

                    nameheader.setText(rs.getFirstna() + "");

                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });*/

        cht.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(Main3Activity.this,Chat.class);
                startActivity(i2);
            }
        });

        cmp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main3Activity.this,Complain.class);
                startActivity(i);
            }
        });

        Img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main3Activity.this,CMO.class);
                startActivity(intent);
            }
        });

        Img1 = (ImageView) findViewById(R.id.img2);

        Img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Main3Activity.this,School.class);
                startActivity(intent);

            }
        });

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


    }


    public void uploaddocument(View view) {

        uploaddoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main3Activity.this, Upload.class);
                startActivity(intent);
            }
        });
    }

    public void setStarttst(View view) {

        starttst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main3Activity.this, Start.class);
                startActivity(intent);
            }
        });
    }

    public void setCard(View view) {

        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main3Activity.this, DisCard.class);
                startActivity(intent);
            }
        });
    }

    public void setSch(View view) {

        sch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main3Activity.this, Schemes.class);
                startActivity(intent);
            }
        });
    }

    public void setFindj(View view) {

        findj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main3Activity.this, Jobs.class);
                startActivity(intent);
            }
        });
    }

    public void setTrans(View view) {

        trans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:108"));
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main3, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.start) {
            // Handle the camera action
            startActivity(new Intent(this, Start.class));
        }
        else if (id == R.id.schemes) {
            startActivity(new Intent(this, Schemes.class));

        }
        else if (id == R.id.records) {
            startActivity(new Intent(this, Records.class));

        }
        else if (id == R.id.track) {
            startActivity(new Intent(this, Track.class));

        }
        else if (id == R.id.profile) {
            startActivity(new Intent(this, DisplayProf.class));

        } else if (id == R.id.out) {
            startActivity(new Intent(this, MainActivity.class));

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
