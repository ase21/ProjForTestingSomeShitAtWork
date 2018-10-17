package ase.ProjTestingSomeShitAtWork;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class BeerListAdapter extends BaseAdapter {

    List<BeerObject> beerObjectList;
    Context context;
    LayoutInflater inflater;

    public BeerListAdapter(List<BeerObject> beerObjectList, Context context) {
        this.beerObjectList = beerObjectList;
        this.context = context;
        inflater = LayoutInflater.from(context);
    }
    //количество
    @Override
    public int getCount() {
        return beerObjectList.size();
    }
    //позиция
    @Override
    public Object getItem(int i) {
        return beerObjectList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;

        if (view == null) {
            view = inflater.inflate(R.layout.item_probe, viewGroup, false);
            viewHolder = new ViewHolder();

            viewHolder.avatarImageView = view.findViewById(R.id.avatar);
            viewHolder.textView = view.findViewById(R.id.textView);
            viewHolder.textView2 = view.findViewById(R.id.textView2);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }


        Picasso.get().load(beerObjectList.get(i).getScreen()).into(viewHolder.avatarImageView);
        viewHolder.textView.setText(beerObjectList.get(i).getName());
        viewHolder.textView2.setText(beerObjectList.get(i).getAbout());

        return view;
    }

    static class ViewHolder{
        ImageView avatarImageView;
        TextView textView;
        TextView textView2;
    }
}
