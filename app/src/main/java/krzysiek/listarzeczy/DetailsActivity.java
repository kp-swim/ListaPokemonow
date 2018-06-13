package krzysiek.listarzeczy;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class DetailsActivity extends FragmentActivity implements StatsFragment.OnListFragmentInteractionListener, ImageFragment.OnFragmentInteractionListener, ItemFragment.OnListFragmentInteractionListener{
    private static final String POKEMON_KEY = "POKEMON_ID";

    public TextView mNameView;
    public TextView mTypeView;
    public ImageView mImageView;

    private Bundle bundle;

    public static void start(Context context, Pokemon pokemon) {
        Intent starter = new Intent(context, DetailsActivity.class);
        int pokemonId = Pokemon.pokemons.indexOf(pokemon);
        starter.putExtra(POKEMON_KEY,pokemonId );
        context.startActivity(starter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        int pokemonId = getIntent().getIntExtra(POKEMON_KEY, -1);
        Pokemon pokemon = Pokemon.pokemons.get(pokemonId);

        mNameView = findViewById(R.id.name);
        mTypeView = findViewById(R.id.type);
        mImageView = findViewById(R.id.image);

        mNameView.setText(pokemon.getName());
        mTypeView.setText(pokemon.getType().toString());
        mImageView.setImageResource(pokemon.getImageId());

        bundle = new Bundle();
        bundle.putInt(POKEMON_KEY, pokemonId);

        ViewPager pager = (ViewPager) findViewById(R.id.pager);
        pager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));

    }

    @Override
    public void onListFragmentInteraction(Stat item) {

    }

    @Override
    public void onListFragmentInteraction(Pokemon item) {

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }


    private class MyPagerAdapter extends FragmentPagerAdapter {

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int pos) {
            Fragment fragment;
            switch(pos) {
                case 0:
                    fragment = StatsFragment.newInstance(3);
                    break;
                case 1:
                    fragment = ImageFragment.newInstance();
                    break;
                default:
                    fragment = StatsFragment.newInstance(3);
                    break;
            }
            fragment.setArguments(bundle);
            return fragment;
        }

        @Override
        public int getCount() {
            return 2;
        }
    }
}
