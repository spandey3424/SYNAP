package com.disability.synap;

import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.internal.Storage;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.OnProgressListener;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.StorageTask;
import com.google.firebase.storage.UploadTask;

public class Upload extends AppCompatActivity {

    private Button adhar;
    private static final int PICK_IMAGE_REQEUST=1;
    private  Button upload,view;
    private Uri imageuri;

    private StorageReference mStorageReference;
    DatabaseReference mDatabaseRef;
    private StorageTask mUploadTask;

    private FirebaseAuth firebaseAuth;




    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uploaddoc);

        adhar=(Button) findViewById(R.id.adhaar);
        upload=(Button) findViewById(R.id.uploadbutton1);

        view=(Button) findViewById(R.id.viewbutton);

        firebaseAuth=FirebaseAuth.getInstance();

        FirebaseUser user=firebaseAuth.getCurrentUser();
        String userrr=user.getUid();
        mStorageReference=FirebaseStorage.getInstance().getReference("Documents").child(userrr);
        mDatabaseRef=FirebaseDatabase.getInstance().getReference("Profile").child("Photos");



        adhar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showimagechooser();

            }


        });
        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(mUploadTask!=null && mUploadTask.isInProgress()){
                    Toast.makeText(Upload.this, "Upload in Progress", Toast.LENGTH_SHORT).show();
                }
                adharupload();

            }
        });

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showimageactivity();
            }
        });

    }

    private void showimageactivity() {
        Intent intent=new Intent(this,ImagesActivity.class);
        startActivity(intent);
    }


    private void showimagechooser() {
        Intent intent=new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent,PICK_IMAGE_REQEUST);

    }




    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==PICK_IMAGE_REQEUST && resultCode==RESULT_OK && data!=null && data.getData()!=null){
            imageuri=data.getData();

        }
    }
    private  String getFileExtension(Uri uri){
        ContentResolver CR=getContentResolver();
        MimeTypeMap mime=MimeTypeMap.getSingleton();
        return mime.getExtensionFromMimeType(CR.getType(uri));
    }
    private void adharupload() {

        if(imageuri!=null){

            final StorageReference fileReference;
            fileReference     =mStorageReference.child("Documents"+"AdharCard"+System.currentTimeMillis()+"."+getFileExtension(imageuri));
            mUploadTask=fileReference.putFile(imageuri)
                    .addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                            Toast.makeText(Upload.this, "Upload SUCCESSFUL", Toast.LENGTH_SHORT).show();
                            uploadadharcard up=new uploadadharcard(taskSnapshot.getStorage().getDownloadUrl().toString());
                            String Uploadid=mDatabaseRef.push().getKey();
                            mDatabaseRef.child(Uploadid).setValue(up);



                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {

                        }
                    })
                    .addOnProgressListener(new OnProgressListener<UploadTask.TaskSnapshot>() {
                        @Override
                        public void onProgress(UploadTask.TaskSnapshot taskSnapshot) {

                        }
                    });

        }else{

        }
    }


}

