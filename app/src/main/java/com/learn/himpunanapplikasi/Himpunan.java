package com.learn.himpunanapplikasi;

public class Himpunan {
    private String namaHimpunan;
    private String singkatanHimpunan;
    private String deskripsi;
    private int photo;
    private String linkInstagram;

    public String getNamaHimpunan() {
        return namaHimpunan;
    }

    public void setNamaHimpunan(String namaHimpunan) {
        this.namaHimpunan = namaHimpunan;
    }

    public String getSingkatanHimpunan() {
        return singkatanHimpunan;
    }

    public void setSingkatanHimpunan(String singkatanHimpunan) {
        this.singkatanHimpunan = singkatanHimpunan;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getLinkWebsite(){
        return this.linkInstagram;
    }

    public void setLinkInstagram(String linkInstagram){
        this.linkInstagram = linkInstagram;
    }
}
