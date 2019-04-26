package com.rvs.studentsmoscow.data;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.ObservableField;

public class ScheduleEnter extends BaseObservable {

    @Bindable
    private final ObservableField<String> groupNumber = new ObservableField<>();

    public ScheduleEnter(String groupNumber) {
        this.groupNumber.set(groupNumber);
    }

}
