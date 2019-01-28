package com.example.dd.myapplication;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.dd.myapplication.Adapter.ViewPagerAdapter;
import com.example.dd.myapplication.Fragment.CallFragment;
import com.example.dd.myapplication.Fragment.ContactFragment;
import com.example.dd.myapplication.Fragment.FavFragment;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter viewPagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout=findViewById(R.id.tablayouts);
        viewPager=findViewById(R.id.viewpagers);
        viewPagerAdapter=new ViewPagerAdapter(getSupportFragmentManager());

        //Add fragments here

        viewPagerAdapter.AddFragment(new CallFragment(),"call");
        viewPagerAdapter.AddFragment(new ContactFragment(),"contact");
        viewPagerAdapter.AddFragment(new FavFragment(),"favorite");
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_call_black_24dp);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_contacts_black_24dp);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_favorite_black_24dp);


        ActionBar actionBar=getSupportActionBar();
        actionBar.setElevation(0);
    }
}
