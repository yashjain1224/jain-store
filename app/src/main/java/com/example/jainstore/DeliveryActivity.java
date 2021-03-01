package com.example.jainstore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class DeliveryActivity extends AppCompatActivity {

    private RecyclerView deliverRecyclerView;
    private Button changeORaddNewAddressBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setTitle("Delivery");

        deliverRecyclerView = findViewById(R.id.cart_items_recyclerview);
        changeORaddNewAddressBtn = findViewById(R.id.change_or_add_address_btn);


        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        deliverRecyclerView.setLayoutManager(layoutManager);

        List<CartItemModel> cartItemModelList = new ArrayList<>();
        cartItemModelList.add(new CartItemModel(0, R.mipmap.product_image, "Pixel 2", 2, "Rs. 49999/-", "Rs. 59999/-", 1, 0, 0));
        cartItemModelList.add(new CartItemModel(0, R.mipmap.product_image, "Pixel 2", 2, "Rs. 49999/-", "Rs. 59999/-", 1, 1, 0));
        cartItemModelList.add(new CartItemModel(0, R.mipmap.product_image, "Pixel 2", 2, "Rs. 49999/-", "Rs. 59999/-", 1, 2, 0));
        cartItemModelList.add(new CartItemModel(1, "Price (3 items)", "Rs. 169999/-", "Free", "Rs. 169999/-", "Rs. 5999/-"));

        CartAdapter cartAdapter = new CartAdapter(cartItemModelList);
        deliverRecyclerView.setAdapter(cartAdapter);
        cartAdapter.notifyDataSetChanged();

        changeORaddNewAddressBtn.setVisibility(View.VISIBLE);
    }

    public boolean onOptionsItemSelected(MenuItem item){

        int id = item.getItemId();
        if (id == android.R.id.home){
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}