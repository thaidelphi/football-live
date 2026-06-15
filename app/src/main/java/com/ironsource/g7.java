package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.o2;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
class g7 extends q2 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public g7(o2 o2Var, fm fmVar) {
        super(o2Var, fmVar);
    }

    private boolean n() {
        return b().b() > 0;
    }

    private boolean p() {
        return b().d() >= 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l() {
        if (o()) {
            IronLog.INTERNAL.verbose();
            i();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m() {
        if (o()) {
            IronLog.INTERNAL.verbose();
            i();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean o() {
        return b().a() == o2.a.MANUAL_WITH_LOAD_ON_SHOW;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q() {
        if (o() && d()) {
            IronLog.INTERNAL.verbose();
            a(b().c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r() {
        if (!n()) {
            IronLog.INTERNAL.verbose("banner reload interval is disabled");
        } else if (o() && p()) {
            IronLog.INTERNAL.verbose();
            a(b().d());
        }
    }
}
