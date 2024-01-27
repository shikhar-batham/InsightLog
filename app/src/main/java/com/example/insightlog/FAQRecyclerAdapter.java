package com.example.insightlog;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FAQRecyclerAdapter extends RecyclerView.Adapter<FAQRecyclerAdapter.ViewHolder> {

    Context context;

    ArrayList<FAQModel> faqList;

    public FAQRecyclerAdapter(Context context, ArrayList<FAQModel> faqList) {
        this.context = context;
        this.faqList = faqList;
    }

    @NonNull
    @Override
    public FAQRecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.faq_layout, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FAQRecyclerAdapter.ViewHolder holder, int position) {

        holder.questionTv.setText(faqList.get(position).getQuestion());
        holder.faqAns.setText(faqList.get(position).getAnswer());

        final boolean[] closed = {true};
        holder.btnViewAns.setOnClickListener(v -> {
            if (closed[0]) {
                holder.faqAns.setVisibility(View.VISIBLE);
                holder.questionTv.setTypeface(holder.questionTv.getTypeface(), Typeface.BOLD);
                holder.btnViewAns.setImageResource(R.drawable.baseline_keyboard_arrow_down_24);
                closed[0] = false;
            } else {
                holder.faqAns.setVisibility(View.GONE);
                holder.btnViewAns.setImageResource(R.drawable.baseline_arrow_forward_ios_24);
                closed[0] = true;
            }
        });

    }

    @Override
    public int getItemCount() {
        return faqList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView questionTv, faqAns;
        ImageView btnViewAns;

        ConstraintLayout faqCl;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            questionTv = itemView.findViewById(R.id.questionTv);
            btnViewAns = itemView.findViewById(R.id.btnViewAns);
            faqAns = itemView.findViewById(R.id.faqAns);
            faqCl = itemView.findViewById(R.id.faqCl);
        }
    }
}
