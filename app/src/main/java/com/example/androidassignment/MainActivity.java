package com.example.androidassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.androidassignment.viewmodel.AlphabetViewModel;
import com.example.androidassignment.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private AlphabetViewModel alphabetViewModel;
    private AlphabetViewModel numberVieModel;
    private ArrayList<AlphabetViewModel> alphabetViewModelArrayList;
    private ArrayList<AlphabetViewModel> numberViewModelArrayList;
    private MainAdapter adapter;
    private MainAdapter numadapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        alphabetViewModel = new AlphabetViewModel();
        alphabetViewModelArrayList = alphabetViewModel.getAlphabtesList();
        numberVieModel = new AlphabetViewModel();
        numberViewModelArrayList = numberVieModel.getNumberList();

        adapter = new MainAdapter(this,alphabetViewModelArrayList);
        binding.lvAlphabets.setAdapter(adapter);

        numadapter = new MainAdapter(this,numberViewModelArrayList);
        binding.lvNumbers.setAdapter(numadapter);

    }
}