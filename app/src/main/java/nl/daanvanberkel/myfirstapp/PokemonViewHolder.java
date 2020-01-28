package nl.daanvanberkel.myfirstapp;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class PokemonViewHolder extends RecyclerView.ViewHolder {
    LinearLayout layout;
    TextView textView;
    ImageView imageView;

    public PokemonViewHolder(LinearLayout v) {
        super(v);
        layout = v;
        imageView = (ImageView) v.findViewById(R.id.pokemon_image);
        textView = (TextView) v.findViewById(R.id.pokemon_name);
        itemView.setTag(this);
    }
}
