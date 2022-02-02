package com.company;

public class Main {

    public static void main(String[] args) {
    /*    Курс деген класс тузунуз
► аты, номери, мугалимдин аты жону, курс башталган кун
► Студент деген класс тузунуз
► туулган куну, аты, фамилиясы, жашы
► Геттер сеттерлерди маани беруу жана алуу учун колдонуу керек
► Студенттин жашын терс эмес сан экенин текшеруу керек
  */

  Kurs kurs = new Kurs();

  Student student = new Student();
  student.setJashy((byte) 25);
        System.out.println(student.getJashy());


    }
}
