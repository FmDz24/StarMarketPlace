package com.example.starmarketplace.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.starmarketplace.R;
import com.example.starmarketplace.model.Category;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder> {

    TextView categoryTitle;

    Context context;
    List<Category> categories;

    public CategoryAdapter(Context context, List<Category> categories) {
        this.context = context;
        this.categories = categories;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View categoryItems = LayoutInflater.from(context).inflate(R.layout.categoty_item, viewGroup, false);
        return new CategoryViewHolder(categoryItems);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {

        holder.categoryTitle.setText(categories.get(position).getTitle());

    }

    @Override
    public int getItemCount() {
        return categories.size();
    }

    public static final class CategoryViewHolder extends RecyclerView.ViewHolder {

        TextView categoryTitle;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);


            categoryTitle = itemView.findViewById(R.id.category_title);
        }
    }

}


