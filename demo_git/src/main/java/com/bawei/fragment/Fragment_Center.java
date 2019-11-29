package com.bawei.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.bawei.demo_git.MainActivity;
import com.bawei.demo_git.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

/**
 * <p>文件描述：<p>
 * <p>作者：冷瞳<p>
 * <p>创建时间：2019/11/29<p>
 * <p>更改时间：2019/11/29<p>
 * <p>版本号：1<p>
 */
public class Fragment_Center extends Fragment {

    private Button btn_tz;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_center, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        btn_tz = getActivity().findViewById(R.id.btn_tz);
        btn_tz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity mainActivity = (MainActivity) getActivity();
                mainActivity.jump();
            }
        });
    }


}
