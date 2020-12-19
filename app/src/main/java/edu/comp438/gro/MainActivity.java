package edu.comp438.gro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import edu.comp438.gro.model.Pizza;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //test comment
        setContentView(R.layout.activity_main);

        RecyclerView recycler = (RecyclerView)findViewById(R.id.pizza_recycler);

        String[] captions = new String[Pizza.pizzas.length];
        int[] ids = new int[Pizza.pizzas.length];

        for(int i = 0; i<captions.length;i++){
            captions[i] = Pizza.pizzas[i].getName();
            ids[i] = Pizza.pizzas[i].getImageID();
        }
        recycler.setLayoutManager(new LinearLayoutManager(this));
        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(captions, ids);
        recycler.setAdapter(adapter);
    }
}