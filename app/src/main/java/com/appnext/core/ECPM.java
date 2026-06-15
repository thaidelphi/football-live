package com.appnext.core;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class ECPM {
    private String banner;
    private float ecpm;
    private float ppr;

    public ECPM(float f10, float f11, String str) {
        this.ecpm = f10;
        this.ppr = f11;
        this.banner = str;
    }

    public String getBanner() {
        return this.banner;
    }

    public float getEcpm() {
        return this.ecpm;
    }

    public float getPpr() {
        return this.ppr;
    }
}
