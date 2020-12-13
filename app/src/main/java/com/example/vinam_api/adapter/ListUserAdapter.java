package com.example.vinam_api.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.vinam_api.R;
import com.example.vinam_api.entities.User;

import java.util.ArrayList;

public class ListUserAdapter extends BaseAdapter {
    private ArrayList<User> users;

    public ListUserAdapter(ArrayList<User> users) {
        this.users = users;
    }

    @Override
    public int getCount() {
        return users.size();
    }

    @Override
    public Object getItem(int i) {
        return users.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View viewUser;
        if (view == null) {
            viewUser = View.inflate(viewGroup.getContext(), R.layout.activity_c_r_u_d, null);
        } else viewUser = view;
        viewUser = View.inflate(viewGroup.getContext(), R.layout.item_user, null);
        TextView tvName = viewUser.findViewById(R.id.tvName);
        TextView tvUsername = viewUser.findViewById(R.id.tvUsername);
        TextView tvId = viewUser.findViewById(R.id.tvId);
        tvName.setText("Name: " + users.get(i).getName());
        tvUsername.setText("UserN: " + users.get(i).getUsername());
        tvId.setText("Id: " + users.get(i).getId());

        return viewUser;
    }


}
