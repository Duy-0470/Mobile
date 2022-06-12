package com.example.appamnhac.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ChuDe {

    @SerializedName("IdChuDe")
    @Expose
    private String idChuDe;
    @SerializedName("TenChuDe")
    @Expose
    private String tenChuDe;
    @SerializedName("HinhChuDe")
    @Expose
    private String hinhChuDe;

    public String getIdChuDe() {
        return idChuDe;
    }

    public void setIdChuDe(String idAlbum) {
        this.idChuDe = idAlbum;
    }

    public String getTenChuDe() {
        return tenChuDe;
    }

    public void setTenChuDe(String tenAlbum) {
        this.tenChuDe = tenAlbum;
    }

    public String getHinhChuDe() {
        return hinhChuDe;
    }

    public void setHinhChuDe(String hinhAlbum) {
        this.hinhChuDe = hinhAlbum;
    }

}