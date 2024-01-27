package com.example.insightlog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.insightlog.R;
import com.example.insightlog.FAQRecyclerAdapter;
import com.example.insightlog.FAQModel;

import java.util.ArrayList;

public class FAQActivity extends AppCompatActivity {

    ArrayList<FAQModel> faqList = new ArrayList<>();

    FAQRecyclerAdapter faqRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faqactivity);

        RecyclerView recyclerFAQ = findViewById(R.id.recyclerFAQ);
        recyclerFAQ.setLayoutManager(new LinearLayoutManager(this));

        faqList.add(new FAQModel("Is all the providers on your platform all trustworthy?", "orem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book"));
        faqList.add(new FAQModel("Is all the providers on your platform all trustworthy?", "orem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book"));
        faqList.add(new FAQModel("Is all the providers on your platform all trustworthy?", "orem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book"));
        faqList.add(new FAQModel("Is all the providers on your platform all trustworthy?", "orem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book"));
        faqList.add(new FAQModel("Is all the providers on your platform all trustworthy?", "orem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book"));
        faqList.add(new FAQModel("Is all the providers on your platform all trustworthy?", "orem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book"));
        faqList.add(new FAQModel("Is all the providers on your platform all trustworthy?", "orem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book"));


        faqList.add(new FAQModel("Is all the providers on your platform all trustworthy?", "This is answer"));

        faqRecyclerAdapter = new FAQRecyclerAdapter(this, faqList);
        recyclerFAQ.setAdapter(faqRecyclerAdapter);
    }
}