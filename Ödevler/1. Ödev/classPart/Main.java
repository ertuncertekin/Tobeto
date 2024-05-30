package org.example;

public class Main {
    public static void main(String[] args) {
        CustomManager customerManager=new CustomManager();
        CustomManager customerManager2=new CustomManager();
        customerManager=customerManager2;
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();
        System.out.println("////////////////////");
        int sayi1=10;
        int sayi2=20;
        sayi2=sayi1;
        sayi1=30;
        System.out.println(sayi2);
        System.out.println("/////////////////////");
        int[] sayilar1=new int[]{1,2,3};
        int[] sayilar2=new int[]{4,5,6};
        sayilar2=sayilar1;
        sayilar1[0]=10;
        System.out.println(sayilar2[0]);
        System.out.println("/////////////////////");
        DortIslem dortIslem=new DortIslem();
        System.out.println(dortIslem.Topla(2,6));
        System.out.println(dortIslem.Bol(8,4));
        System.out.println(dortIslem.Carp(6,2));
        System.out.println(dortIslem.Cikar(15,8));
    }
}