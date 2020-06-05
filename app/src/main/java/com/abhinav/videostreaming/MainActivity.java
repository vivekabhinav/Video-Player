package com.abhinav.videostreaming;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    RecyclerView Mrecyclerview;
    FirebaseDatabase database;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Mrecyclerview = findViewById(R.id.video_recycler_view);
        Mrecyclerview.setHasFixedSize(true);
        Mrecyclerview.setLayoutManager(new LinearLayoutManager(this));
        database = FirebaseDatabase.getInstance();
        reference = database.getReference("video");
    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseRecyclerAdapter<member, ViewHolder>firebaseRecyclerAdapter =
            new FirebaseRecyclerAdapter<member, ViewHolder>(
                    member.class,
                    R.layout.row,
                    ViewHolder.class,
                    reference
            ) {
                @Override
                protected void onBindViewHolder(@NonNull ViewHolder holder, int position, @NonNull member model) {

                }

                @NonNull
                @Override
                public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                    return null;
                }
            }
            }
    }


    {


                    };




    }
}