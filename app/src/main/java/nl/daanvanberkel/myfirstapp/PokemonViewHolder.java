package nl.daanvanberkel.myfirstapp;

import android.widget.LinearLayout;

import androidx.recyclerview.widget.RecyclerView;

public class PokemonViewHolder extends RecyclerView.ViewHolder {
    LinearLayout layout;

    public PokemonViewHolder(LinearLayout v) {
        super(v);
        layout = v;
        itemView.setTag(this);
    }
}
