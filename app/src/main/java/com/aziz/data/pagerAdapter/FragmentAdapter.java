package com.aziz.data.pagerAdapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.aziz.ui.fragment.history.HistoryFragment;
import com.aziz.ui.fragment.main.MainFragment;

import java.util.List;

public class FragmentAdapter extends FragmentStatePagerAdapter {

    private List<Fragment> list;


    public FragmentAdapter(@NonNull FragmentManager fm, List<Fragment> list) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.list = list;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }
}
