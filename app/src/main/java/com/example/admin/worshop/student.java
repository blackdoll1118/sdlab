package com.example.admin.worshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import java.util.List;
import android.view.View;
import android.widget.Button;

public class student extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        button=findViewById(R.id.button);
        String collegeName=getIntent().getStringExtra("college");
        if (collegeName != null){
            button.setText(collegeName);
        }
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//               // String textMessage="TKM college";
//                Intent sendIntent = new Intent();
//                sendIntent.setAction(Intent.ACTION_SEND);
//                sendIntent.putExtra(Intent.EXTRA_TEXT, textMessage);
//                sendIntent.setType("text/plain");
//
//// Verify that the intent will resolve to an activity
//                if (sendIntent.resolveActivity(getPackageManager()) != null) {
//                    startActivity(sendIntent);
//                }
         dbOps();
          }
        };
        button.setOnClickListener(listener);


        }
        private void dbOps()
        {
            DatabaseHandler db = new DatabaseHandler(this);

            // Inserting Contacts
            Log.d("Insert: ", "Inserting ..");
            db.addContact(new Contact("Ravi", "9100000000"));
            db.addContact(new Contact("Srinivas", "9199999999"));
            db.addContact(new Contact("Tommy", "9522222222"));
            db.addContact(new Contact("Karthik", "9533333333"));

            // Reading all contacts
            Log.d("Reading: ", "Reading all contacts..");
            List<Contact> contacts = db.getAllContacts();

            for (Contact cn : contacts) {
                String log = "Id: " + cn.getID() + " ,Name: " + cn.getName() + " ,Phone: " +
                        cn.getPhoneNumber();
                // Writing Contacts to log
                Log.d("Name: ", log);
            }
        }
}





