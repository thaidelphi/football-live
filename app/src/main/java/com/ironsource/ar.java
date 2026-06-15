package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class ar extends s7 {
    private static ar R;
    private String P;
    private final ai Q = mm.S().k();

    private ar() {
        this.H = "outcome";
        this.G = 3;
        this.I = IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
        this.P = "";
    }

    public static synchronized ar i() {
        ar arVar;
        synchronized (ar.class) {
            if (R == null) {
                ar arVar2 = new ar();
                R = arVar2;
                arVar2.e();
            }
            arVar = R;
        }
        return arVar;
    }

    @Override // com.ironsource.s7
    protected int c(zb zbVar) {
        return this.Q.a(IronSource.AD_UNIT.REWARDED_VIDEO);
    }

    @Override // com.ironsource.s7
    protected void d() {
        this.J.add(1000);
        this.J.add(1001);
        this.J.add(1002);
        this.J.add(1003);
        this.J.add(1200);
        this.J.add(Integer.valueOf((int) IronSourceConstants.RV_INSTANCE_SHOW_CHANCE));
        this.J.add(1210);
        this.J.add(1211);
        this.J.add(Integer.valueOf((int) IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON));
        this.J.add(1213);
        this.J.add(Integer.valueOf((int) IronSourceConstants.RV_MEDIATION_LOAD_ERROR));
    }

    @Override // com.ironsource.s7
    protected boolean d(zb zbVar) {
        int c10 = zbVar.c();
        return c10 == 14 || c10 == 514 || c10 == 515 || c10 == 516 || c10 == 1003 || c10 == 1005 || c10 == 1203 || c10 == 1010 || c10 == 1301 || c10 == 1302;
    }

    @Override // com.ironsource.s7
    protected String e(int i10) {
        return (i10 == 15 || (i10 >= 300 && i10 < 400)) ? this.P : "";
    }

    @Override // com.ironsource.s7
    protected void f(zb zbVar) {
        if (zbVar.c() == 15 || (zbVar.c() >= 300 && zbVar.c() < 400)) {
            this.P = zbVar.b().optString("placement");
        }
    }

    @Override // com.ironsource.s7
    protected boolean j(zb zbVar) {
        return false;
    }
}
