package com.rvs.studentsmoscow.data;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableField;

public class ScheduleEnter extends BaseObservable {

    @Bindable
    private final ObservableField<String> groupNumber = new ObservableField<>();

    public ScheduleEnter(String groupNumber) {
        this.groupNumber.set(groupNumber);
    }

}
