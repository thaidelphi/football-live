package com.ironsource;

import i8.o;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class k5 implements l5 {

    /* renamed from: a  reason: collision with root package name */
    private final String f18033a;

    /* renamed from: b  reason: collision with root package name */
    private final yp f18034b;

    public k5(String encryptedAuctionResponse, yp providerName) {
        kotlin.jvm.internal.n.f(encryptedAuctionResponse, "encryptedAuctionResponse");
        kotlin.jvm.internal.n.f(providerName, "providerName");
        this.f18033a = encryptedAuctionResponse;
        this.f18034b = providerName;
    }

    @Override // com.ironsource.l5
    public Object a() {
        Object b10;
        String c10 = mb.b().c();
        kotlin.jvm.internal.n.e(c10, "getInstance().mediationKey");
        uk ukVar = new uk(new ga(this.f18033a, c10));
        try {
            o.a aVar = i8.o.f26626b;
            b10 = i8.o.b(ukVar.a());
        } catch (Throwable th) {
            o.a aVar2 = i8.o.f26626b;
            b10 = i8.o.b(i8.p.a(th));
        }
        Throwable d10 = i8.o.d(b10);
        if (d10 == null) {
            return i5.f17789h.a((JSONObject) b10, this.f18034b.value());
        }
        o9.d().a(d10);
        if (d10 instanceof IllegalArgumentException) {
            o.a aVar3 = i8.o.f26626b;
            return i8.o.b(i8.p.a(new qg(wb.f21282a.d())));
        }
        o.a aVar4 = i8.o.f26626b;
        return i8.o.b(i8.p.a(new qg(wb.f21282a.h())));
    }
}
