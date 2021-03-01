package com.example.jainstore;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyWishlistFragment extends Fragment {

    public MyWishlistFragment() {
        // Required empty public constructor
    }

    private RecyclerView wishlistRecyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_wishlist, container, false);

        wishlistRecyclerView = view.findViewById(R.id.my_wishlist_recyclerview);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        wishlistRecyclerView.setLayoutManager(linearLayoutManager);

        List<WishlistModel> wishlistModelList = new ArrayList<>();
        wishlistModelList.add(new WishlistModel(R.mipmap.product_image, "Pixel 2", 1, "4.5", 145, "Rs.49999/-", "Rs.59999/-", "Cash on delivery"));
        wishlistModelList.add(new WishlistModel(R.mipmap.product_image, "Pixel 2", 0, "4.5", 145, "Rs.49999/-", "Rs.59999/-", "Cash on delivery"));
        wishlistModelList.add(new WishlistModel(R.mipmap.product_image, "Pixel 2", 2, "4.5", 145, "Rs.49999/-", "Rs.59999/-", "Cash on delivery"));
        wishlistModelList.add(new WishlistModel(R.mipmap.product_image, "Pixel 2", 1, "4.5", 145, "Rs.49999/-", "Rs.59999/-", "Cash on delivery"));
        wishlistModelList.add(new WishlistModel(R.mipmap.product_image, "Pixel 2", 4, "4.5", 145, "Rs.49999/-", "Rs.59999/-", "Cash on delivery"));

        WishlistAdapter wishlistAdapter = new WishlistAdapter(wishlistModelList);
        wishlistRecyclerView.setAdapter(wishlistAdapter);
        wishlistAdapter.notifyDataSetChanged();

        return view;
    }
}