package nl.daanvanberkel.myfirstapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PokemonAdapter extends RecyclerView.Adapter<PokemonViewHolder> {

    private Pokemon[] dataset;
    private View.OnClickListener onItemClickListener;

    public PokemonAdapter(Pokemon[] dataset) {
        this.dataset = dataset;
    }

    @NonNull
    @Override
    public PokemonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(parent.getContext()).inflate(R.layout.pokemon_item, parent, false);

        PokemonViewHolder viewHolder = new PokemonViewHolder(linearLayout);
        viewHolder.itemView.setOnClickListener(onItemClickListener);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PokemonViewHolder holder, int position) {
        ImageView imageView = (ImageView) holder.layout.getChildAt(0);
        imageView.setImageDrawable(dataset[position].image);

        TextView textView = (TextView) holder.layout.getChildAt(1);
        textView.setText(dataset[position].name);
    }

    @Override
    public int getItemCount() {
        return dataset.length;
    }

    public Pokemon getItem(int position) {
        return dataset[position];
    }

    public void setOnItemClickListener(View.OnClickListener clickListener) {
        onItemClickListener = clickListener;
    }
}
