package com.example.instaui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class notificcations extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notificcations);

        ListView notiffist=findViewById(R.id.notiffist);
        ArrayList<String> noti =new ArrayList<>();
        noti.add("Suresh send You friend Request");
        noti.add("Swati liked Your comment ");
        noti.add("girish Commented on your post");
        noti.add("anand Mentioned you in a post");
        noti.add("girish liked your post");
        noti.add("manish send you friend request");
        noti.add("kiran liked your post");
        noti.add("adadrsh accepted your friend request");
        noti.add("nisha send you freind request");
        noti.add("jarna liked your post");
        noti.add("ayesha liked your post");
        noti.add("ayesha commented on your post");
        noti.add("arpita liked your post");
        noti.add("varun liked your post");
        noti.add("aarti liked your post");
        noti.add("harish liked your post");
        noti.add("pratik liked your post");
        noti.add("rohan send you friend request");
        noti.add("aatish commented on your post");
        noti.add("karan mentioned youn in a post");
        noti.add("vikas liked your post ");


        ArrayAdapter<String> adopt=new ArrayAdapter <String>(this, android.R.layout.simple_list_item_1,noti);
        notiffist.setAdapter(adopt);


    }
   public void back(View v)
    {
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);

    }
}