package com.example.covidvaccine.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.covidvaccine.R;
import com.example.covidvaccine.model.VaccineModel;

import java.util.List;

public class VaccinationInfoAdapter extends RecyclerView.Adapter<VaccinationInfoAdapter.viewHolder> {

    private LayoutInflater layoutInflater;
    private List<VaccineModel> list_vaccine_center;

    public VaccinationInfoAdapter(Context mcontext, List<VaccineModel> list_vaccine_center) {
        this.layoutInflater = layoutInflater.from(mcontext);
        this.list_vaccine_center = list_vaccine_center;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.vaccination_info_item, parent, false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
    holder.vaccinationCenter.setText(list_vaccine_center.get(position).getVaccineCenter());
        holder.vaccinationCenter.setText(list_vaccine_center.get(position).getVaccineCenter());
        holder.vaccinationCenterAddr.setText(list_vaccine_center.get(position).getVaccineTimings() + " - "+
                list_vaccine_center.get(position).getVaccineCenterTime());
        holder.vaccinationName.setText(list_vaccine_center.get(position).getVaccineName());
        holder.vaccinationAvailable.setText(list_vaccine_center.get(position).getVaccineAvailable());
        holder.vaccinationCharges.setText(list_vaccine_center.get(position).getVaccineCharges());
        holder.vaccinationAge.setText(list_vaccine_center.get(position).getVaccineAge());
    }

    @Override
    public int getItemCount() {
        return list_vaccine_center.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{

        TextView vaccinationCenter;
        TextView vaccinationCenterAddr;
        TextView vaccinationTiming;
        TextView vaccinationName;
        TextView vaccinationCharges;
        TextView vaccinationAge;
        TextView vaccinationAvailable;
        public viewHolder(@NonNull View itemView) {
            super(itemView);

            vaccinationAge = itemView.findViewById(R.id.vaccinationAge);
            vaccinationAvailable = itemView.findViewById(R.id.isAvailable);
            vaccinationCharges = itemView.findViewById(R.id.vaccineFees);
            vaccinationName = itemView.findViewById(R.id.vaccinName);
            vaccinationTiming = itemView.findViewById(R.id.vaccineTimings);
            vaccinationCenter = itemView.findViewById(R.id.vaccineCenter);
            vaccinationCenterAddr = itemView.findViewById(R.id.vaccineLocation);

        }
    }
}
