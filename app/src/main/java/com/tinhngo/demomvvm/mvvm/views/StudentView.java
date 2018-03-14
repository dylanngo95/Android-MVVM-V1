package com.tinhngo.demomvvm.mvvm.views;

import android.databinding.DataBindingUtil;

import com.tinhngo.demomvvm.R;
import com.tinhngo.demomvvm.databinding.StudentViewBinding;
import com.tinhngo.demomvvm.mvvm.BView;
import com.tinhngo.demomvvm.mvvm.viewmodels.StudentViewModel;

/**
 * Created by tinhngo on 3/14/18.
 */

public class StudentView extends BView {

    private StudentViewModel viewModel;

    @Override
    protected void initDataBinding() {
        StudentViewBinding studentViewBinding = DataBindingUtil.setContentView(this, R.layout.student_view);
        viewModel = new StudentViewModel(this);
        studentViewBinding.setViewModel(viewModel);
    }
}
