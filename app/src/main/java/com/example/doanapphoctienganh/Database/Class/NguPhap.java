package com.example.doanapphoctienganh.Database.Class;

public class NguPhap {
    int stt;

    int idBaiHoc;
    String tenNguPhap;
    String congThuc;
    String viDu;


    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public int getIdBaiHoc() {
        return idBaiHoc;
    }

    public void setIdBaiHoc(int idBaiHoc) {
        this.idBaiHoc = idBaiHoc;
    }

    public String getTenNguPhap() {
        return tenNguPhap;
    }

    public void setTenNguPhap(String tenNguPhap) {
        this.tenNguPhap = tenNguPhap;
    }

    public String getCongThuc() {
        return congThuc;
    }

    public void setCongThuc(String congThuc) {
        this.congThuc = congThuc;
    }

    public String getViDu() {
        return viDu;
    }

    public void setViDu(String viDu) {
        this.viDu = viDu;
    }

    public NguPhap() {
    }

    public NguPhap(int stt, int idBaiHoc, String tenNguPhap, String congThuc, String viDu) {
        this.stt = stt;
        this.idBaiHoc = idBaiHoc;
        this.tenNguPhap = tenNguPhap;
        this.congThuc = congThuc;
        this.viDu = viDu;
    }
}
