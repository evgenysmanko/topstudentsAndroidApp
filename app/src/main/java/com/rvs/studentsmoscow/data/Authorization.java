package com.rvs.studentsmoscow.data;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.ObservableField;

public class Authorization extends BaseObservable {

    @Bindable
    private final ObservableField<String> login = new ObservableField<>();
    @Bindable
    private final ObservableField<String> password = new ObservableField<> ();

    public Authorization (String login, String password) {
        this.login.set(login);
        this.password.set(password);
    }
}
