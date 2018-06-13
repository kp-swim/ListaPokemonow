package krzysiek.listarzeczy;

import android.graphics.Canvas;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.list);
        recyclerView.setHasFixedSize(true);
        ItemFragment.OnListFragmentInteractionListener listener = new ItemFragment.OnListFragmentInteractionListener() {
            @Override
            public void onListFragmentInteraction(Pokemon item) {
                //Toast.makeText(getApplicationContext(), item.getName(), Toast.LENGTH_SHORT).show();
                DetailsActivity.start(MainActivity.this,item);
            }
        };
        recyclerView.setAdapter(new ItemRecyclerViewAdapter(Pokemon.pokemons,listener));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());



        ItemTouchHelper.SimpleCallback itemTouchHelperCallback = new ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.RIGHT) {
            @Override
            public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
                return false;
            }

            @Override
            public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
                // Row is swiped from recycler view
                // remove it from adapter
                Integer position = viewHolder.getAdapterPosition();
                System.out.println("");
               // Toast.makeText(MainActivity.this.getBaseContext(), position.toString(), Toast.LENGTH_SHORT).show();
                ((ItemRecyclerViewAdapter)recyclerView.getAdapter()).removeItem(position);
            }

            @Override
            public void onChildDraw(Canvas c, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive) {
                // view the background view
            }
        };

        // attaching the touch helper to recycler view
        new ItemTouchHelper(itemTouchHelperCallback).attachToRecyclerView(recyclerView);
    }

}
