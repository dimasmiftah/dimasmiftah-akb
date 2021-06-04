package me.dimasmiftah.dimasmiftah.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import me.dimasmiftah.dimasmiftah.Model.GalleryModel;
import me.dimasmiftah.dimasmiftah.R;

import java.util.ArrayList;

/*
    Tanggal pengerjaan: Kamis, 2 Juni 2021
    NIM: 10118087
    Nama: Dimas Miftahul Huda
    Kelas: IF-2
*/

public class GalleryAdapter extends RecyclerView.Adapter<GalleryAdapter.myviewholder> {

    ArrayList<GalleryModel> galleryModel;

    public GalleryAdapter(ArrayList<GalleryModel> galleryModel) {
        this.galleryModel = galleryModel;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_gallery, parent, false);
        return new GalleryAdapter.myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        holder.ivGallery.setImageResource(galleryModel.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return galleryModel.size();
    }

    class myviewholder extends RecyclerView.ViewHolder {
        ImageView ivGallery;

        public myviewholder(@NonNull View itemView) {
            super(itemView);
            ivGallery = itemView.findViewById(R.id.iv_gallery);
        }
    }
}
