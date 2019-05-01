package com.rvs.studentsmoscow.data;

/*
 * Класс, является типом расписания или как этя фигня называлась. Создай свой тип данных.
 * */

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;

public class ScheduleShow extends BaseObservable {

    @Bindable
    private final ObservableField<String> nameOfItem = new ObservableField<> ();
    @Bindable
    private final ObservableField<String> namePerson = new ObservableField<>();
    @Bindable
    private final ObservableInt timeStart = new ObservableInt();
    @Bindable
    private final ObservableInt timeEnd = new ObservableInt();
    @Bindable
    private final ObservableField<String> hall = new ObservableField<> ();

    public ScheduleShow(String nameOfItem, String namePerson, int timeStart, int timeEnd, String hall) {
        this.nameOfItem.set(nameOfItem);
        this.namePerson.set(namePerson);
        this.timeStart.set(timeStart);
        this.timeEnd.set(timeEnd);
        this.hall.set(hall);
    }
}
