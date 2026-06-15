package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzflq;
import com.google.android.gms.internal.ads.zzfmr;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzj implements zzfmr {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzk f11530a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzj(zzk zzkVar) {
        this.f11530a = zzkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfmr
    public final void zza(int i10, long j10) {
        zzflq zzflqVar;
        zzflqVar = this.f11530a.f11538h;
        zzflqVar.zzd(i10, System.currentTimeMillis() - j10);
    }

    @Override // com.google.android.gms.internal.ads.zzfmr
    public final void zzb(int i10, long j10, String str) {
        zzflq zzflqVar;
        zzflqVar = this.f11530a.f11538h;
        zzflqVar.zze(i10, System.currentTimeMillis() - j10, str);
    }
}
