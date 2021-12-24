package com.example.tugas.model;

import java.io.Serializable;

public class DataAlgoritma implements Serializable {
    String nameAlgoritma,  baca_lebih_lanjut,  description, logo;
    public DataAlgoritma(String nameAlgoritma,  String baca_lebih_lanjut, String description, String logo) {
        this.nameAlgoritma = nameAlgoritma;
        this.baca_lebih_lanjut = baca_lebih_lanjut;
        this.description = description;
        this.logo = logo;
    }

    public String getNameAlgoritma() {
        return nameAlgoritma;
    }

    public void setNameAlgoritma(String nameAlgoritma) {
        this.nameAlgoritma = nameAlgoritma;
    }

    public String getBaca_lebih_lanjut() {
        return baca_lebih_lanjut;
    }

    public void setBaca_lebih_lanjut(String baca_lebih_lanjut) {
        this.baca_lebih_lanjut = baca_lebih_lanjut;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}
