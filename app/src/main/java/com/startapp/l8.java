package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.remoteconfig.StaleDcConfig;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class l8 extends x1<k8> {

    /* renamed from: e  reason: collision with root package name */
    public final com.startapp.sdk.adsbase.e f22257e;

    /* renamed from: f  reason: collision with root package name */
    public final j2<StaleDcConfig> f22258f;

    public l8(Context context, com.startapp.sdk.adsbase.e eVar, com.startapp.sdk.components.m mVar) {
        super(context, 86400000L);
        this.f22257e = eVar;
        this.f22258f = mVar;
    }

    @Override // com.startapp.x1
    public final k8 a(boolean z10) {
        k8 k8Var = new k8();
        String string = z10 ? null : this.f22257e.getString("a83b59c2138cbf65", null);
        if (string == null) {
            Context context = this.f23531a;
            context.getPackageName();
            string = o9.b(context);
            this.f22257e.edit().putString("a83b59c2138cbf65", string).apply();
        }
        k8Var.f22177a = string;
        return k8Var;
    }

    @Override // com.startapp.x1
    public final k8 c() {
        return new k8();
    }
}
