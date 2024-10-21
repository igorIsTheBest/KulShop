package com.example.kulshop.new_shop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.example.kulshop.R;
import com.example.kulshop.data.ShopDatabase;
import com.example.kulshop.databinding.ActivityMainBinding;
import com.example.kulshop.databinding.ActivityNewBookBinding;
import com.example.kulshop.main_activity.MainActivityViewModel;

public class NewShopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        NewShopViewModel viewModel = new ViewModelProvider(this).get(NewShopViewModel.class);
        viewModel.setShopRepository(ShopDatabase.getInstance(getApplicationContext()));
        ActivityNewBookBinding binding = ActivityNewShopBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.setViewModel(viewModel);
        binding.setLifecycleOwner(this);

        viewModel.getState().observe(this,state -> {
            if(state.needFinish)
                NewShopActivity.this.finish();
        });
    }
}