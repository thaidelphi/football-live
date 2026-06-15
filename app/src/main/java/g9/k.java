package g9;

import h9.p;
/* compiled from: Context.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final /* synthetic */ class k {
    public static final <T> e<T> a(e<? extends T> eVar, int i10, f9.a aVar) {
        int i11;
        f9.a aVar2;
        boolean z10 = true;
        if (i10 >= 0 || i10 == -2 || i10 == -1) {
            if (i10 == -1 && aVar != f9.a.SUSPEND) {
                z10 = false;
            }
            if (z10) {
                if (i10 == -1) {
                    aVar2 = f9.a.DROP_OLDEST;
                    i11 = 0;
                } else {
                    i11 = i10;
                    aVar2 = aVar;
                }
                return eVar instanceof h9.p ? p.a.a((h9.p) eVar, null, i11, aVar2, 1, null) : new h9.h(eVar, null, i11, aVar2, 2, null);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i10).toString());
    }

    public static /* synthetic */ e b(e eVar, int i10, f9.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -2;
        }
        if ((i11 & 2) != 0) {
            aVar = f9.a.SUSPEND;
        }
        return g.c(eVar, i10, aVar);
    }
}
