package com.tinhngo.demomvvm.mvvm.viewmodels;


import android.content.Context;
import android.databinding.ObservableField;
import android.view.View;

import com.tinhngo.demomvvm.mvvm.BViewModel;
import com.tinhngo.demomvvm.mvvm.models.MStudent;

/**
 * Created by tinhngo on 3/14/18.
 */

public class StudentViewModel extends BViewModel {

    public String name;
    public String job;
    public ObservableField<String> age = new ObservableField<>("");

    private MStudent mStudent;

    public StudentViewModel(Context context) {
        this.context = context;

        // get Data
        this.mStudent = new MStudent("Tinh Ngo","Dev Dao", 20);

        bindingData();


    }

    private void bindingData() {
        this.name = mStudent.name;
        this.job = mStudent.job;
        this.age.set(String.valueOf(mStudent.age));;
    }

    public void addAge(View view) {
        mStudent.age += 1;
        this.age.set(String.valueOf(mStudent.age));
        this.age.notifyChange();
    }

}
