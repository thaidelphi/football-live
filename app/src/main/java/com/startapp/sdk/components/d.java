package com.startapp.sdk.components;

import com.startapp.j2;
import com.startapp.sdk.components.a;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class d implements j2<com.startapp.sdk.adsbase.e> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a.c f23303a;

    public d(a.c cVar) {
        this.f23303a = cVar;
    }

    @Override // com.startapp.j2
    public final com.startapp.sdk.adsbase.e call() {
        return new com.startapp.sdk.adsbase.e(this.f23303a.f23256a.getSharedPreferences("StartApp-c5f5846c2a728b2a", 0), null);
    }
}
