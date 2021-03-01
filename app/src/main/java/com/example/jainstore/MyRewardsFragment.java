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
public class MyRewardsFragment extends Fragment {

    public MyRewardsFragment() {
        // Required empty public constructor
    }

    private RecyclerView rewardsRecyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_rewards, container, false);

        rewardsRecyclerView = view.findViewById(R.id.my_rewards_recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        rewardsRecyclerView.setLayoutManager(layoutManager);

        List<RewardModel> rewardModelList = new ArrayList<>();
        rewardModelList.add(new RewardModel("Cashback", "Till 2nd, June 2018", "GET 20% CASHBACK on any product above Rs.200/- and below Rs.3000/-"));
        rewardModelList.add(new RewardModel("Discount", "Till 2nd, June 2018", "GET 20% DISCOUNT on any product above Rs.200/- and below Rs.3000/-"));
        rewardModelList.add(new RewardModel("Buy 1 get 1 free", "Till 2nd, June 2018", "GET BUY 1 GET 1 FREE on any product above Rs.200/- and below Rs.3000/-"));
        rewardModelList.add(new RewardModel("Cashback", "Till 2nd, June 2018", "GET 20% CASHBACK on any product above Rs.200/- and below Rs.3000/-"));
        rewardModelList.add(new RewardModel("Discount", "Till 2nd, June 2018", "GET 20% DISCOUNT on any product above Rs.200/- and below Rs.3000/-"));
        rewardModelList.add(new RewardModel("Buy 1 get 1 free", "Till 2nd, June 2018", "GET BUY 1 GET 1 FREE on any product above Rs.200/- and below Rs.3000/-"));
        rewardModelList.add(new RewardModel("Cashback", "Till 2nd, June 2018", "GET 20% CASHBACK on any product above Rs.200/- and below Rs.3000/-"));
        rewardModelList.add(new RewardModel("Discount", "Till 2nd, June 2018", "GET 20% DISCOUNT on any product above Rs.200/- and below Rs.3000/-"));
        rewardModelList.add(new RewardModel("Buy 1 get 1 free", "Till 2nd, June 2018", "GET BUY 1 GET 1 FREE on any product above Rs.200/- and below Rs.3000/-"));

        MyRewardsAdapter myRewardsAdapter = new MyRewardsAdapter(rewardModelList);
        rewardsRecyclerView.setAdapter(myRewardsAdapter);
        myRewardsAdapter.notifyDataSetChanged();

        return view;
    }
}