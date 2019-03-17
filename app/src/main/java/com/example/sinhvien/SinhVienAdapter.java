package com.example.sinhvien;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class SinhVienAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<SinhVien> sinhVienList;

    public SinhVienAdapter(Context context, int layout, List<SinhVien> sinhVienList) {
        this.context = context;
        this.layout = layout;
        this.sinhVienList = sinhVienList;
    }

    @Override
    public int getCount() {
        return sinhVienList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class ViewHoler{
        TextView txtHoTen, txtMonHoc, txtQueQuan, txtNamsinh;
        ImageView imgMonHoc;
    }


    @Override
    public View getView(int i, View convertView, ViewGroup parent) {

        ViewHoler holder;
        if(convertView == null){
            holder = new ViewHoler();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout, null);
            holder.txtHoTen     = (TextView) convertView.findViewById(R.id.textviewHoTenCustom);
            holder.txtMonHoc    = (TextView) convertView.findViewById(R.id.textviewMonHocCustom);
            holder.txtQueQuan   = (TextView) convertView.findViewById(R.id.textviewQueQuanCustom);
            holder.txtNamsinh   = (TextView) convertView.findViewById(R.id.textviewNamSinhCustom);
            holder.imgMonHoc    = (ImageView) convertView.findViewById(R.id.imgmonhoc);

            convertView.setTag(holder);

        }else {
            holder = (ViewHoler) convertView.getTag();
        }

        SinhVien sinhVien = sinhVienList.get(i);


        holder.txtHoTen.setText(sinhVien.getHoTen());
        holder.txtMonHoc.setText(sinhVien.getMonHoc());
        holder.txtQueQuan.setText(sinhVien.getQueQuan());
        holder.txtNamsinh.setText(""+sinhVien.getNamSinh());

        return convertView;

    }
}
