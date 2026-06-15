package com.ironsource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class bt implements lm<vs, v> {
    @Override // com.ironsource.lm
    public v a(vs input) {
        ig igVar;
        String g10;
        String i10;
        String h10;
        kotlin.jvm.internal.n.f(input, "input");
        ct b10 = input.b();
        o0 a10 = input.a();
        String str = (a10 == null || (h10 = a10.h()) == null) ? "0" : h10;
        o0 a11 = input.a();
        String str2 = (a11 == null || (i10 = a11.i()) == null) ? "0" : i10;
        o0 a12 = input.a();
        String str3 = (a12 == null || (g10 = a12.g()) == null) ? "0" : g10;
        o0 a13 = input.a();
        if (a13 == null || (igVar = a13.e()) == null) {
            igVar = ig.UnknownProvider;
        }
        ig igVar2 = igVar;
        o0 a14 = input.a();
        return new v(b10, str, str2, str3, igVar2, (a14 == null || (r9 = a14.c()) == null) ? "0" : "0");
    }
}
