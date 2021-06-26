package com.example.demo;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private LinearLayout sublayer2;
    private LinearLayout sublayer3;

    private Toolbar toolbar;
    private LinearLayout sublayer5;
    private LinearLayout layer2;
    private LinearLayout layer3;

    private LinearLayout sublayer6;
    private LinearLayout sublayer8;
    private LinearLayout sublayer9;
    private ViewPager myViewPager;
    private TabLayout myTabLayout;
    private TabsAccessorAdapter myTabsAccessorAdapter;
    NavigationView nav;
    ActionBarDrawerToggle toggle;
    DrawerLayout drawerLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


   // myViewPager=findViewById(R.id.main_view_pager);
    //myTabLayout=findViewById(R.id.main_app_bar);


        toolbar = findViewById(R.id.maintoolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("THALES      Mode:Run     Supervisor");
/*
        toolbar=findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("hi");
        nav=(NavigationView)findViewById(R.id.navmenu);
        //drawerLayout= (DrawerLayout) findViewById(R.id.drawer);

        ActionBarDrawerToggle toogle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(toogle);
        toogle.syncState();
        nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull  MenuItem menuItem) {
                switch(menuItem.getItemId())
                {
                    case R.id.nav_message:
                        Toast.makeText(getApplicationContext(),"Home ",Toast.LENGTH_LONG).show();
                        break;
                }
                return false;
            }
        });

 */


        sublayer2 = findViewById(R.id.sublayer2);
        sublayer2.setOnClickListener(v -> {
            Intent assignintent = new Intent(MainActivity.this, AssignActivity.class);
            startActivity(assignintent);
        });
        sublayer3 = findViewById(R.id.sublayer3);
        sublayer3.setOnClickListener(v -> {
            Intent registerintent = new Intent(MainActivity.this, RegisterActivity.class);
            startActivity(registerintent);
        });
        sublayer5 = findViewById(R.id.sublayer5);
        sublayer5.setOnClickListener(v -> {
            Intent prepareintent = new Intent(MainActivity.this, PrepareActivity.class);
            startActivity(prepareintent);
        });

        sublayer6 = findViewById(R.id.sublayer6);
        sublayer6.setOnClickListener(v -> {
            Intent startintent = new Intent(MainActivity.this, StartActivity.class);
            startActivity(startintent);
        });
        sublayer8 = findViewById(R.id.sublayer8);
        sublayer8.setOnClickListener(v -> {
            Intent controlintent = new Intent(MainActivity.this, ControlActivity.class);
            startActivity(controlintent);
        });
        sublayer9 = findViewById(R.id.sublayer9);
        sublayer9.setOnClickListener(v -> {
            Intent reportintent = new Intent(MainActivity.this, ReportActivity.class);
            startActivity(reportintent);
        });
   // if(currentuser!=null)
    //{
/*
        myTabsAccessorAdapter=new TabsAccessorAdapter(getSupportFragmentManager());
        myTabsAccessorAdapter.addFragment(new DemoFragment(),"Demo");
        myTabsAccessorAdapter.addFragment(new VoteFragment(),"Vote");
        myTabsAccessorAdapter.addFragment(new ServicesFragment(),"Services");
        myViewPager.setAdapter(myTabsAccessorAdapter);
        myTabLayout.setupWithViewPager(myViewPager);
        Objects.requireNonNull(myTabLayout.getTabAt(0)).setIcon(R.drawable.ic_search);
        Objects.requireNonNull(myTabLayout.getTabAt(1)).setIcon(R.drawable.ic_search);
        Objects.requireNonNull(myTabLayout.getTabAt(2)).setIcon(R.drawable.ic_search);
*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.settings) {
            Toast.makeText(getApplicationContext(), "you clicked on settings",
                    Toast.LENGTH_SHORT).show();
            //settings=findViewById(R.id.settings);
                Intent settingintent = new Intent(MainActivity.this,SettingsActivity.class);
                startActivity(settingintent);
        } else if (id == R.id.Dashboard) {
            Toast.makeText(getApplicationContext(), "you clicked on dashboard",
                    Toast.LENGTH_SHORT).show();
        } else if (id == R.id.History) {
            Toast.makeText(getApplicationContext(), "you clicked on History",
                    Toast.LENGTH_SHORT).show();
        }
        return true;
    }



}
