package me.aviloo.empty.Utils.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import me.aviloo.empty.R;
import me.aviloo.empty.models.Employer;

public class EmployerAdapter extends RecyclerView.Adapter<EmployerAdapter.PersonViewHolder> {

    private List<Employer> personList;

    public EmployerAdapter(List<Employer> personList) {
        this.personList = personList;
    }

    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_emoloyer, parent, false);
        return new PersonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder holder, int position) {
        Employer person = personList.get(position);
        holder.textName.setText(person.getName());
        holder.textAge.setText("Адрес: " + person.getAddress());
        holder.textPhone.setText(person.getPhone());
    }

    @Override
    public int getItemCount() {
        return personList.size();
    }

    static class PersonViewHolder extends RecyclerView.ViewHolder {
        TextView textName;
        TextView textAge;
        TextView textPhone;

        public PersonViewHolder(@NonNull View itemView) {
            super(itemView);
            textName = itemView.findViewById(R.id.item_employer_name);
            textAge = itemView.findViewById(R.id.item_employer_address);
            textPhone = itemView.findViewById(R.id.item_employer_phone);
        }
    }
}
