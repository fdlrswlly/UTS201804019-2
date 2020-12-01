package com.fadhlyaulia.uts201804019_2
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
class ListSekolahAdapter(private val listSekolah: ArrayList<Sekolah>): RecyclerView.Adapter<ListSekolahAdapter.ListViewHolder>() {
    inner class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var tvnama: TextView = itemView.findViewById(R.id.txt_nama)
        var tvtahun: TextView = itemView.findViewById(R.id.txt_tahun)
        var ivlogo: ImageView = itemView.findViewById(R.id.civ_kota)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_kota,parent,false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listSekolah.size
    }

    override fun onBindViewHolder(holder: ListSekolahAdapter.ListViewHolder, position: Int) {
        val sekolah = listSekolah[position]

        Glide.with(holder.itemView.context)
            .load(sekolah.logo)
            .apply(RequestOptions().override(60, 60))
            .into(holder.ivlogo)
        holder.tvnama.text = sekolah.nama
        holder.tvtahun.text = sekolah.tahun
    }
}