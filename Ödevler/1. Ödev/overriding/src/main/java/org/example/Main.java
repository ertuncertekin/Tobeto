package org.example;

public class Main {
    public static void main(String[] args) {
    OgretmenKrediManager ogretmenKrediManager=new OgretmenKrediManager();
        System.out.println(ogretmenKrediManager.hesapla(2000));
        System.out.println("///////////////");
        BaseKrediManager[] krediManagers=new BaseKrediManager[]{
                new OgretmenKrediManager(),
                new TarımKrediManager(),
                new OgrenciKrediManager()};
        for(BaseKrediManager krediManager:krediManagers){
            System.out.println(krediManager.hesapla(3000));;
        }
    }
}