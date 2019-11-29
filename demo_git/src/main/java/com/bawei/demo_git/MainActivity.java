package com.bawei.demo_git;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.bawei.fragment.Fragment_Center;
import com.bawei.fragment.Fragment_Left;
import com.bawei.fragment.Fragment_Right;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Fragment> list = new ArrayList<>();
    private RadioGroup radio_group;
    private ViewPager view_pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radio_group = findViewById(R.id.radio_group);
        view_pager = findViewById(R.id.view_pager);

        Fragment_Left fragment_left = new Fragment_Left();
        Fragment_Center fragment_center = new Fragment_Center();
        Fragment_Right fragment_right = new Fragment_Right();

        list.add(fragment_left);
        list.add(fragment_center);
        list.add(fragment_right);

        view_pager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return list.get(position);
            }

            @Override
            public int getCount() {
                return list.size();
            }
        });
        view_pager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                radio_group.check(radio_group.getChildAt(position).getId());
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        radio_group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.rb1:
                        view_pager.setCurrentItem(0);
                        break;
                    case R.id.rb2:
                        view_pager.setCurrentItem(1);
                        break;
                    case R.id.rb3:
                        view_pager.setCurrentItem(2);
                        break;
                }
            }
        });


    }
    public void jump(){
        view_pager.setCurrentItem(2);
    }
}
