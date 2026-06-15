package com.appnext.core.result;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class d {
    private static d eT;
    private c eN;

    private d() {
    }

    public static synchronized d aC() {
        d dVar;
        synchronized (d.class) {
            if (eT == null) {
                eT = new d();
            }
            dVar = eT;
        }
        return dVar;
    }

    public final void a(c cVar) {
        this.eN = cVar;
    }

    public final c aD() {
        return this.eN;
    }
}
