
package com.modelbean;

import java.util.Arrays;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="yb5")
@SessionScoped
public class YonetimliBean5 {
    private String[] javaGuiSeverler;

    public String[] getJavaGuiSeverler() {
        return javaGuiSeverler;
    }

    public void setJavaGuiSeverler(String[] javaGuiSeverler) {
        this.javaGuiSeverler = javaGuiSeverler;
    }
    
    public static class Sayi{
        public String sayiEtiketi;
        public String sayiDegeri;

        public Sayi(String sayiEtiketi, String sayiDegeri) {
            this.sayiEtiketi = sayiEtiketi;
            this.sayiDegeri = sayiDegeri;
        }

        public String getSayiEtiketi() {
            return sayiEtiketi;
        }

        public String getSayiDegeri() {
            return sayiDegeri;
        }
        
        
    }
    
    public Sayi[] jsfGuiSeverlerAdiSoyadi;

    public Sayi[] getJsfGuiSeverlerAdiSoyadi() {
        jsfGuiSeverlerAdiSoyadi=new Sayi[6];
        jsfGuiSeverlerAdiSoyadi[0]=new Sayi("Yunus", "1");
        jsfGuiSeverlerAdiSoyadi[1]=new Sayi("Batu", "2");
        jsfGuiSeverlerAdiSoyadi[2]=new Sayi("Kubi", "3");
        jsfGuiSeverlerAdiSoyadi[3]=new Sayi("Baho", "4");
        jsfGuiSeverlerAdiSoyadi[4]=new Sayi("Kaan", "5");
        jsfGuiSeverlerAdiSoyadi[5]=new Sayi("Burak", "6");
        return jsfGuiSeverlerAdiSoyadi;
    }
    
    public String getJsfGuiSeverlerSonucu(){
        return Arrays.toString(javaGuiSeverler);
    }
}
