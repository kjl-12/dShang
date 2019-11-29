package com.bawei.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bawei.demo_git.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/**
 * <p>文件描述：<p>
 * <p>作者：冷瞳<p>
 * <p>创建时间：2019/11/29<p>
 * <p>更改时间：2019/11/29<p>
 * <p>版本号：1<p>
 */
public class Fragment_Right extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_right, container, false);
        return view;
    }
}
