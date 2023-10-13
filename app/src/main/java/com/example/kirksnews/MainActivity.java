package com.example.kirksnews;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

//    DBHelper dbHelper;
    TabLayout tabLayout;
    TabItem mhome,mscience,mhealth,mtech,mentertainment,msports;
    PagerAdapter pagerAdapter;
    Toolbar mtoolbar;

    String api="295a848099b048baa70bb4b548e07781";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        dbHelper=new DBHelper(this);

        mtoolbar=findViewById(R.id.topbar);
        setSupportActionBar(mtoolbar);

        mhome=findViewById(R.id.home);
        mscience=findViewById(R.id.science);
        mhealth=findViewById(R.id.health);
        mtech=findViewById(R.id.Technology);
        mentertainment=findViewById(R.id.Entertainment);
        msports=findViewById(R.id.sports);
        ViewPager viewPager=findViewById(R.id.fragmentcontainer);
        tabLayout=findViewById(R.id.include);


        pagerAdapter=new PageAdapter(getSupportFragmentManager(),6);
        viewPager.setAdapter(pagerAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if(tab.getPosition()==0||tab.getPosition()==1||tab.getPosition()==2||tab.getPosition()==3||tab.getPosition()==4||tab.getPosition()==5)
                {
                    pagerAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));















    }

//






    }


//    // Populate database with sample articles
//    populateDatabaseWithSampleArticles();
//
//    private void populateDatabaseWithSampleArticles() {
//
//        Article article1=new Article("","Content of Stone","https://th.bing.com/th/id/OIP.KR3RVPDcWhnQLRKX--rs-QHaEt?w=253&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7");
//        Article article2=new Article("Stonebwoy","Content of Stone","https://th.bing.com/th/id/OIP.KR3RVPDcWhnQLRKX--rs-QHaEt?w=253&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7");
//        Article article3=new Article("Stonebwoy","Content of Stone","https://th.bing.com/th/id/OIP.KR3RVPDcWhnQLRKX--rs-QHaEt?w=253&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7");
//        Article article4=new Article("Stonebwoy","Content of Stone","https://th.bing.com/th/id/OIP.KR3RVPDcWhnQLRKX--rs-QHaEt?w=253&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7");
//        Article article5=new Article("Stonebwoy","Content of Stone","https://th.bing.com/th/id/OIP.KR3RVPDcWhnQLRKX--rs-QHaEt?w=253&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7");
//        Article article6=new Article("Stonebwoy","Content of Stone","https://th.bing.com/th/id/OIP.KR3RVPDcWhnQLRKX--rs-QHaEt?w=253&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7");
//
//        dbHelper.addArticle(article1);
//        dbHelper.addArticle(article2);
//
//    }