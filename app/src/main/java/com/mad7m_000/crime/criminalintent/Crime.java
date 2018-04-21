package com.mad7m_000.crime.criminalintent;

import java.util.UUID;

public class Crime {
    private UUID mId;
    private String mTitle;

    public Crime() {
        // Генерирование уникального идентификатора
        mId = UUID.randomUUID();
    }

    public String getmTitle() {
        return mTitle;
    }

    public UUID getmId() {

        return mId;
    }
}
