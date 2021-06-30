package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.android.material.tabs.TabLayout;

public class SettingsActivity extends AppCompatActivity {
private LinearLayout layer2;
private LinearLayout layer4;
private LinearLayout layer5;
private LinearLayout layer6;
private LinearLayout layer7;
private TabLayout myTabLayout;
private Button back;
private LinearLayout layer3;
private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
       // myTabLayout=findViewById(R.id.main_app_bar);
        toolbar = findViewById(R.id.main_app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("             Settings");
        back=findViewById(R.id.back);
        back.setOnClickListener(v->{
            Intent backintent = new Intent(SettingsActivity.this, MainActivity.class);
            startActivity(backintent);
        });
            layer2=findViewById(R.id.layer2);
            layer2.setOnClickListener(v-> {
                        Intent demointent = new Intent(SettingsActivity.this, DemoActivity.class);
                        startActivity(demointent);
                    });
        layer3=findViewById(R.id.layer3);
        layer3.setOnClickListener(v-> {
                    Intent voteintent = new Intent(SettingsActivity.this, VoteActivity.class);
                    startActivity(voteintent);
                });
        layer4=findViewById(R.id.layer4);
        layer4.setOnClickListener(v-> {
            Intent serviceintent = new Intent(SettingsActivity.this, ServiceActivity.class);
            startActivity(serviceintent);
        });
        layer5=findViewById(R.id.layer5);
        layer5.setOnClickListener(v-> {
            Intent statisticintent = new Intent(SettingsActivity.this, StatisticActivity.class);
            startActivity(statisticintent);
        });
        layer6=findViewById(R.id.layer6);
        layer6.setOnClickListener(v->{
            Intent securityintent = new Intent(SettingsActivity.this,SecurityActivity.class);
            startActivity(securityintent);
        });
        layer7=findViewById(R.id.layer7);
        layer7.setOnClickListener(v->{
            Intent aboutintent=new Intent(SettingsActivity.this,AboutActivity.class);
            startActivity(aboutintent);
        });
        }
    }
