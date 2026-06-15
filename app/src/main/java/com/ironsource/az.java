package com.ironsource;

import com.ironsource.sdk.utils.IronSourceStorageUtils;
import i8.o;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final /* synthetic */ class az<T> {
    public static boolean a(hb hbVar) {
        return hbVar.j().exists();
    }

    public static void b(hb hbVar) {
        hbVar.k().a(hbVar);
        if (hbVar.j().exists()) {
            IronSourceStorageUtils.deleteFile(hbVar.j());
        }
        try {
            hbVar.k().a(hbVar.j(), hbVar.c().value(), 5, 5);
        } catch (Exception e8) {
            o9.d().a(e8);
            t8.l<i8.o<? extends T>, i8.w> i10 = hbVar.i();
            o.a aVar = i8.o.f26626b;
            i10.invoke(i8.o.a(i8.o.b(i8.p.a(e8))));
        }
    }
}
