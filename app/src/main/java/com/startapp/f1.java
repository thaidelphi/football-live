package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.remoteconfig.BluetoothConfig;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class f1 extends o6<String> implements n6 {

    /* renamed from: j  reason: collision with root package name */
    public final t4<com.startapp.sdk.adsbase.e> f21924j;

    /* renamed from: k  reason: collision with root package name */
    public final t4<v1> f21925k;

    /* renamed from: l  reason: collision with root package name */
    public final j2<BluetoothConfig> f21926l;

    public f1(Context context, t4 t4Var, t4 t4Var2, t4 t4Var3, t4 t4Var4, com.startapp.sdk.components.q qVar) {
        super(context, t4Var2, t4Var4, "26787005dc4a1477", "c8ef3e50475fc527");
        this.f21924j = t4Var;
        this.f21925k = t4Var3;
        this.f21926l = qVar;
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
        BluetoothConfig call = this.f21926l.call();
        if (call != null) {
            return call.b();
        }
        return 0L;
    }

    @Override // com.startapp.o6
    public final boolean f() {
        Boolean b10 = this.f21925k.a().b();
        if (b10 != null && b10.booleanValue()) {
            BluetoothConfig call = this.f21926l.call();
            return call != null && call.d();
        }
        return false;
    }

    @Override // com.startapp.o6
    public final void g() {
        if (y.a(this.f23531a, "android.permission.BLUETOOTH")) {
            Context context = this.f23531a;
            com.startapp.sdk.components.a.a(context).B.a().execute(new o2(context, this.f21924j, this).f23366d);
        }
    }
}
