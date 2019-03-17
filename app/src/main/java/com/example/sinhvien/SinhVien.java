package com.example.sinhvien;

public class SinhVien {
    private String HoTen;
    private String MonHoc;
    private String QueQuan;
    private int NamSinh;

    public SinhVien(String hoTen, String monHoc, String queQuan, int namSinh) {
        HoTen = hoTen;
        MonHoc = monHoc;
        QueQuan = queQuan;
        NamSinh = namSinh;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public String getMonHoc() {
        return MonHoc;
    }

    public void setMonHoc(String monHoc) {
        MonHoc = monHoc;
    }

    public String getQueQuan() {
        return QueQuan;
    }

    public void setQueQuan(String queQuan) {
        QueQuan = queQuan;
    }

    public int getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(int namSinh) {
        NamSinh = namSinh;
    }
}
