package com.teamtreehouse.pomodoro.model;

public enum AttemptKind {

    // Pass in the amount of time for each specific enum
    FOCUS(25 * 60, "Focus time"),
    BREAK(5 * 60, "Break time");

    private int mTotalSeconds;
    private String mDisplayName;

    AttemptKind(int totalSeconds, String displayName) {
        mTotalSeconds = totalSeconds;
        mDisplayName = displayName;
    }

    public int getTotalSeconds() {
        return mTotalSeconds;
    }

    public String getDisplayName() {
        return mDisplayName;
    }

}
