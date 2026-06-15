package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzaot;
import com.google.android.gms.internal.ads.zzaoy;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzbi implements zzaot {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f11437a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zzbk f11438b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbi(zzbo zzboVar, String str, zzbk zzbkVar) {
        this.f11437a = str;
        this.f11438b = zzbkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaot
    public final void zza(zzaoy zzaoyVar) {
        int i10 = zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to load URL: " + this.f11437a + "\n" + zzaoyVar.toString());
        this.f11438b.zza((Object) null);
    }
}
