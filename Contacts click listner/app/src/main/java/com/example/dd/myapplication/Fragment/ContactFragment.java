package com.example.dd.myapplication.Fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dd.myapplication.Contact;
import com.example.dd.myapplication.R;
import com.example.dd.myapplication.Adapter.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;


public class ContactFragment extends Fragment {

    View v;
    private RecyclerView recyclerView;
    private List<Contact> contacts;


    public ContactFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        v=inflater.inflate(R.layout.fragment_contact, container, false);
        recyclerView=v.findViewById(R.id.recyclerviews);
        RecyclerViewAdapter recyclerViewAdapter=new RecyclerViewAdapter(getContext(),contacts);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(recyclerViewAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        contacts=new ArrayList<>();
        contacts.add(new Contact("prasanth","9843181153",R.drawable.b));
        contacts.add(new Contact("dhinesh","8940897431",R.drawable.f));
        contacts.add(new Contact("jobein","7896541230",R.drawable.d));
        contacts.add(new Contact("Raj","2589631470",R.drawable.h));
        contacts.add(new Contact("praveen","7896320145",R.drawable.j));
        contacts.add(new Contact("suresh","9876543210",R.drawable.h));
        contacts.add(new Contact("karthi","9874126530",R.drawable.b));
        contacts.add(new Contact("ramesh","9874563210",R.drawable.e));
        contacts.add(new Contact("kannan","3214569870",R.drawable.h));
        contacts.add(new Contact("arunkumar","8940123654",R.drawable.f));
        contacts.add(new Contact("arunraja","9843181153",R.drawable.b));
        contacts.add(new Contact("sakthi","8489407431",R.drawable.f));
        contacts.add(new Contact("velraj","8940123654",R.drawable.e));
        contacts.add(new Contact("kumar","9843181153",R.drawable.b));
        contacts.add(new Contact("ravi","8940123654",R.drawable.f));
        contacts.add(new Contact("moorthy","9843181153",R.drawable.d));
        contacts.add(new Contact("vignesh","8940123654",R.drawable.b));
        contacts.add(new Contact("padmasri","9843181153",R.drawable.i));
        contacts.add(new Contact("sriram","8940894713",R.drawable.j));
        contacts.add(new Contact("logesh","9843181153",R.drawable.k));
        contacts.add(new Contact("sathish","8940123654",R.drawable.h));
        contacts.add(new Contact("pranov","9764310258",R.drawable.b));
        contacts.add(new Contact("rajini","7896541230",R.drawable.k));
        contacts.add(new Contact("kamal","9843181153",R.drawable.h));
        contacts.add(new Contact("vijay","8940123654",R.drawable.b));
        contacts.add(new Contact("surya","9843181153",R.drawable.d));
    }
}
