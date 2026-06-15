package com.startapp.sdk.components;

import com.startapp.d6;
import com.startapp.f6;
import com.startapp.j2;
import com.startapp.sdk.components.a;
import java.util.concurrent.Executor;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class k implements j2<d6> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a.k f23307a;

    public k(a.k kVar) {
        this.f23307a = kVar;
    }

    @Override // com.startapp.j2
    public final d6 call() {
        return new d6(new com.startapp.sdk.adsbase.e(this.f23307a.f23270a.getSharedPreferences("StartApp-770c613f81fb5b52", 0), null), new f6(this.f23307a.f23270a), (Executor) this.f23307a.f23271b.a(), new j());
    }
}
