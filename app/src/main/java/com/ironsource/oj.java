package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.s7;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class oj extends s7 {
    private static oj R;
    private String P;
    private final ai Q = mm.S().k();

    private oj() {
        this.H = "ironbeast";
        this.G = 2;
        this.I = IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
        this.P = "";
    }

    public static synchronized oj i() {
        oj ojVar;
        synchronized (oj.class) {
            if (R == null) {
                oj ojVar2 = new oj();
                R = ojVar2;
                ojVar2.e();
            }
            ojVar = R;
        }
        return ojVar;
    }

    @Override // com.ironsource.s7
    protected int c(zb zbVar) {
        ai aiVar;
        IronSource.AD_UNIT ad_unit;
        int f10 = f(zbVar.c());
        if (f10 == s7.e.BANNER.a()) {
            aiVar = this.Q;
            ad_unit = IronSource.AD_UNIT.BANNER;
        } else if (f10 == s7.e.NATIVE_AD.a()) {
            aiVar = this.Q;
            ad_unit = IronSource.AD_UNIT.NATIVE_AD;
        } else {
            aiVar = this.Q;
            ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
        }
        return aiVar.a(ad_unit);
    }

    @Override // com.ironsource.s7
    protected void d() {
        this.J.add(2001);
        this.J.add(2002);
        this.J.add(2003);
        this.J.add(2004);
        this.J.add(2200);
        this.J.add(2213);
        this.J.add(2211);
        this.J.add(2212);
        this.J.add(3001);
        this.J.add(Integer.valueOf((int) IronSourceConstants.BN_CALLBACK_LOAD_ERROR));
        this.J.add(Integer.valueOf((int) IronSourceConstants.BN_RELOAD));
        this.J.add(Integer.valueOf((int) IronSourceConstants.BN_CALLBACK_RELOAD_ERROR));
        this.J.add(Integer.valueOf((int) IronSourceConstants.BN_CALLBACK_RELOAD_SUCCESS));
        this.J.add(3002);
        this.J.add(Integer.valueOf((int) IronSourceConstants.BN_INSTANCE_RELOAD));
        this.J.add(3005);
        this.J.add(3300);
        this.J.add(Integer.valueOf((int) IronSourceConstants.BN_INSTANCE_RELOAD_SUCCESS));
        this.J.add(Integer.valueOf((int) IronSourceConstants.BN_INSTANCE_RELOAD_ERROR));
        this.J.add(Integer.valueOf((int) IronSourceConstants.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS));
        this.J.add(Integer.valueOf((int) IronSourceConstants.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS));
        this.J.add(3009);
        this.J.add(Integer.valueOf((int) IronSourceConstants.NT_LOAD));
        this.J.add(Integer.valueOf((int) IronSourceConstants.NT_CALLBACK_LOAD_ERROR));
        this.J.add(Integer.valueOf((int) IronSourceConstants.NT_INSTANCE_LOAD));
        this.J.add(Integer.valueOf((int) IronSourceConstants.NT_INSTANCE_LOAD_SUCCESS));
        this.J.add(Integer.valueOf((int) IronSourceConstants.NT_INSTANCE_LOAD_ERROR));
        this.J.add(Integer.valueOf((int) IronSourceConstants.NT_INSTANCE_SHOW));
    }

    @Override // com.ironsource.s7
    protected boolean d(zb zbVar) {
        int c10 = zbVar.c();
        return c10 == 2004 || c10 == 2005 || c10 == 2204 || c10 == 2301 || c10 == 2300 || c10 == 3009 || c10 == 3502 || c10 == 3501 || c10 == 4005 || c10 == 4009 || c10 == 4502 || c10 == 4501;
    }

    @Override // com.ironsource.s7
    protected String e(int i10) {
        return this.P;
    }

    @Override // com.ironsource.s7
    protected void f(zb zbVar) {
        this.P = zbVar.b().optString("placement");
    }

    @Override // com.ironsource.s7
    protected boolean j(zb zbVar) {
        return false;
    }
}
