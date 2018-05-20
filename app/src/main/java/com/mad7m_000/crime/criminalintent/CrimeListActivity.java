package com.mad7m_000.crime.criminalintent;

import android.support.v4.app.Fragment;

public class CrimeListActivity extends SingleFragmentActivity {

    private String crimeId;

    public String getCrimeId() {
        return crimeId;
    }

    public void setCrimeId(String crimeId) {
        this.crimeId = crimeId;
    }

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
