package com.company;

public class Kurs {    /*    Курс деген класс тузунуз
► аты, номери, мугалимдин аты жону, курс башталган кун
► Студент деген класс тузунуз
► туулган куну, аты, фамилиясы, жашы
► Геттер сеттерлерди маани беруу жана алуу учун колдонуу керек
► Студенттин жашын терс эмес сан экенин текшеруу керек
  */
 private String  aty;
 private int nomeri;
 private String atyJonu;
 private int kursBashtalganKun;

    public String getAty() {
        return aty;
    }

    public void setAty(String aty) {
        this.aty = aty;
    }

    public int getNomeri() {
        return nomeri;
    }

    public void setNomeri(int nomeri) {
        this.nomeri = nomeri;
    }

    public String getAtyJonu() {
        return atyJonu;
    }

    public void setAtyJonu(String atyJonu) {
        this.atyJonu = atyJonu;
    }

    public int getKursBashtalganKun() {
        return kursBashtalganKun;
    }

    public void setKursBashtalganKun(int kursBashtalganKun) {
        this.kursBashtalganKun = kursBashtalganKun;
    }
}
