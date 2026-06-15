package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzdj;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzav extends zzdj {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f11413a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zzay f11414b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzav(zzay zzayVar, Context context) {
        this.f11413a = context;
        this.f11414b = zzayVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zze(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (zzeVar == null) {
            return;
        }
        this.f11414b.a(this.f11413a, zzeVar.zzb, true, true);
    }
}
