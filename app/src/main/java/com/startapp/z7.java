package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.remoteconfig.SensorsConfig;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class z7 extends o6<String> implements n6 {

    /* renamed from: j  reason: collision with root package name */
    public final t4<v1> f23675j;

    /* renamed from: k  reason: collision with root package name */
    public final j2<SensorsConfig> f23676k;

    public z7(Context context, t4 t4Var, t4 t4Var2, t4 t4Var3, com.startapp.sdk.components.s sVar) {
        super(context, t4Var, t4Var3, "cc8b2544ce91bcdf", "7099d13208ad24ae");
        this.f23675j = t4Var2;
        this.f23676k = sVar;
    }

    @Override // com.startapp.o6
    public final String a(String str) {
        return str;
    }

    @Override // com.startapp.n6
    public final void a(Object obj) {
        b(obj != null ? obj.toString() : null);
    }

    @Override // com.startapp.x1
    public final /* bridge */ /* synthetic */ Object c() {
        return "";
    }

    @Override // com.startapp.o6
    public final long d() {
        SensorsConfig call = this.f23676k.call();
        if (call != null) {
            return call.h();
        }
        return 0L;
    }

    @Override // com.startapp.o6
    public final boolean f() {
        Boolean b10 = this.f23675j.a().b();
        if (b10 != null && b10.booleanValue()) {
            SensorsConfig call = this.f23676k.call();
            return call != null && call.l();
        }
        return false;
    }

    @Override // com.startapp.o6
    public final void g() {
        Context context = this.f23531a;
        com.startapp.sdk.components.a.a(context).B.a().execute(new u2(context, this).f23366d);
    }
}
