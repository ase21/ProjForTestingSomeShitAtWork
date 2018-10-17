package ase.ProjTestingSomeShitAtWork;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

class ProbeAdapter extends RecyclerView.Adapter<ProbeAdapter.ProbeAdapterHolder> {

    private List<BeerObject> inputDataset;
    ProbeAdapter(List<BeerObject> beerObjects) {
        this.inputDataset = beerObjects;
    }

    @NonNull
    @Override
    public ProbeAdapterHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_probe, parent, false);
        return new ProbeAdapterHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ProbeAdapterHolder holder, int position) {
        holder.fieldAbout.setText(inputDataset.get(position).getAbout());
        holder.fieldAlcohol.setText(inputDataset.get(position).getAlcohol());
        holder.fieldMaker.setText(inputDataset.get(position).getMaker());
        holder.fieldName.setText(inputDataset.get(position).getName());
        holder.fieldType.setText(inputDataset.get(position).getType());
    }
    //получаем количество элементов
    @Override
    public int getItemCount() {
        return inputDataset.size();
    }

    //класс холдет в котором по идее устанавливается значение элементов
    class ProbeAdapterHolder extends RecyclerView.ViewHolder{
        TextView fieldAbout;
        TextView fieldAlcohol;
        TextView fieldMaker;
        TextView fieldName;
        TextView fieldType;

        ProbeAdapterHolder(View view) {
            super(view);
//            fieldAbout = view.findViewById(R.id.field_about);
//            fieldAlcohol = view.findViewById(R.id.field_alcohol);
//            fieldMaker = view.findViewById(R.id.field_maker);
//            fieldName = view.findViewById(R.id.field_name);
//            fieldType = view.findViewById(R.id.field_type);
        }
    }
}
