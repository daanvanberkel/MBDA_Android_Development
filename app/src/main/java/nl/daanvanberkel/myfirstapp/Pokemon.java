package nl.daanvanberkel.myfirstapp;

import android.graphics.drawable.Drawable;

public class Pokemon {
    String name;
    Drawable image;

    public Pokemon() {
    }

    public Pokemon(String name, Drawable image) {
        this.name = name;
        this.image = image;
    }
}
