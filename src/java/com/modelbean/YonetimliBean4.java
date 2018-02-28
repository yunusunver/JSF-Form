
package com.modelbean;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name = "yb4")
@SessionScoped
public class YonetimliBean4 {
    private String[] jsfSeverler;

    public String[] getJsfSeverler() {
        return jsfSeverler;
    }

    public void setJsfSeverler(String[] jsfSeverler) {
        this.jsfSeverler = jsfSeverler;
    }
    
    private static Map<String,Object> jsfSeverlerAdiSoyadi;

    static{
        jsfSeverlerAdiSoyadi=new LinkedHashMap<String,Object>();
        jsfSeverlerAdiSoyadi.put("Alex", "1");
        jsfSeverlerAdiSoyadi.put("Deivid","2");
        jsfSeverlerAdiSoyadi.put("Lugano", "3");
        jsfSeverlerAdiSoyadi.put("Emre", "4");
        
    }
    
    public  Map<String, Object> getJsfSeverlerAdiSoyadi() {
        return jsfSeverlerAdiSoyadi;
    }

    public  void setJsfSeverlerAdiSoyadi(Map<String, Object> jsfSeverlerAdiSoyadi) {
        YonetimliBean4.jsfSeverlerAdiSoyadi = jsfSeverlerAdiSoyadi;
    }
    
    public String getJsfSeverlerSonucu(){
        return Arrays.toString(jsfSeverler);
    }
    
    
}
