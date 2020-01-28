package nl.daanvanberkel.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();

        Pokemon[] pokemons = {
                new Pokemon("Bulbasaus", ResourcesCompat.getDrawable(res, R.drawable.bulbasaur, null)),
                new Pokemon("Dragonite", ResourcesCompat.getDrawable(res, R.drawable.dragonite, null)),
                new Pokemon("Pikachu", ResourcesCompat.getDrawable(res, R.drawable.pikachu, null))
        };

        final PokemonAdapter adapter = new PokemonAdapter(pokemons);

        adapter.setOnItemClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) v.getTag();

                Pokemon pokemon = adapter.getItem(viewHolder.getAdapterPosition());
                Toast.makeText(MainActivity.this, pokemon.name, Toast.LENGTH_SHORT).show();
            }
        });

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    public void sendMessage(View view) {
        EditText editText = findViewById(R.id.editText);
        String message = editText.getText().toString();

        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, message);
        sendIntent.setType("text/plain");

        startActivity(sendIntent);
    }
}
