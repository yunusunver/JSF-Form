
package com.modelbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name="yb1")
@SessionScoped
public class YonetimliBean1 {
    private boolean yazilimiSeviyormu;

    public boolean isYazilimiSeviyormu() {
        return yazilimiSeviyormu;
    }

    public void setYazilimiSeviyormu(boolean yazilimiSeviyormu) {
        this.yazilimiSeviyormu = yazilimiSeviyormu;
    }
}
