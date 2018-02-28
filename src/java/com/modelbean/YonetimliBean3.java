
package com.modelbean;

import java.util.Arrays;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "yb3")
@SessionScoped
public class YonetimliBean3 {
    private String[] iphoneSeverler;

    
    
    public String[] getIphoneSeverler() {
        return iphoneSeverler;
    }

    public void setIphoneSeverler(String[] iphoneSeverler) {
        this.iphoneSeverler = iphoneSeverler;
    }
    
    public String[] getIphoneSeverlerAdiSoyadi(){
        iphoneSeverler=new String[6];
        iphoneSeverler[0]="Yunus";
        iphoneSeverler[1]="Batuhan";
        iphoneSeverler[2]="Kubilay";
        iphoneSeverler[3]="Bahadır";
        iphoneSeverler[4]="Kaan";
        iphoneSeverler[5]="Burak";
        return iphoneSeverler;
    }
    
    public String getIphoneSeverlerSonucu(){
        return Arrays.toString(iphoneSeverler);
    }
}
