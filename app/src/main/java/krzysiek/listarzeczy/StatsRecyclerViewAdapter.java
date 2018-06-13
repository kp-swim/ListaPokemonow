package krzysiek.listarzeczy;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import krzysiek.listarzeczy.StatsFragment.OnListFragmentInteractionListener;

import java.util.List;

public class StatsRecyclerViewAdapter extends RecyclerView.Adapter<StatsRecyclerViewAdapter.ViewHolder> {

    private final List<Stat> mValues;
    private final OnListFragmentInteractionListener mListener;

    public StatsRecyclerViewAdapter(List<Stat> items, OnListFragmentInteractionListener listener) {
        mValues = items;
        mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_stats, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.mStatView.setText(mValues.get(position).getName());
        holder.mValView.setText(mValues.get(position).getValue().toString());

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    mListener.onListFragmentInteraction(holder.mItem);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mStatView;
        public final TextView mValView;
        public Stat mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mStatView = (TextView) view.findViewById(R.id.stat);
            mValView = (TextView) view.findViewById(R.id.val);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mStatView.getText() + "'";
        }
    }
}
