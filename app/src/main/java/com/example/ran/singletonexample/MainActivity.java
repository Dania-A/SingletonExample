package com.example.ran.singletonexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView nameTextView = (TextView) findViewById(R.id.name_text_view);
        TextView salaryTextView = (TextView) findViewById(R.id.salary_text_view);


        Manager companyManager = Manager.getInstance("Mohammed", 5000);

        nameTextView.setText(companyManager.getName());
        salaryTextView.setText(String.valueOf(companyManager.getSalary()));


        //trying to make another object (it won't work):

        Manager companyManager2 = Manager.getInstance("Ali", 6000);

        nameTextView.setText(companyManager2.getName());
        salaryTextView.setText(String.valueOf(companyManager2.getSalary()));

        //Uncomment this and observe the effect
        //inally what if we need to change the info in the singleton object? Just use the setters we have
        /*companyManager.setName("Hassan");
        companyManager.setSalary(4000);

        nameTextView.setText(companyManager.getName());
        salaryTextView.setText(String.valueOf(companyManager.getSalary()));*/


    }
}
