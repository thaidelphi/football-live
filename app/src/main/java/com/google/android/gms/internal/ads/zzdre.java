package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.ironsource.b9;
import com.ironsource.nu;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdre implements AppEventListener, zzcxc, com.google.android.gms.ads.internal.client.zza, zzcuf, zzcuz, zzcva, zzcvt, zzcui, zzfeu {
    private final List zza;
    private final zzdqs zzb;
    private long zzc;

    public zzdre(zzdqs zzdqsVar, zzcfq zzcfqVar) {
        this.zzb = zzdqsVar;
        this.zza = Collections.singletonList(zzcfqVar);
    }

    private final void zzg(Class cls, String str, Object... objArr) {
        this.zzb.zza(this.zza, "Event-".concat(cls.getSimpleName()), str, objArr);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzg(com.google.android.gms.ads.internal.client.zza.class, nu.f19443f, new Object[0]);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) {
        zzg(AppEventListener.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcuf
    public final void zza() {
        zzg(zzcuf.class, nu.f19444g, new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcuf
    public final void zzb() {
        zzg(zzcuf.class, nu.f19448k, new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcuf
    public final void zzc() {
        zzg(zzcuf.class, nu.f19440c, new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzfeu
    public final void zzd(zzfen zzfenVar, String str) {
        zzg(zzfem.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfeu
    public final void zzdA(zzfen zzfenVar, String str) {
        zzg(zzfem.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfeu
    public final void zzdB(zzfen zzfenVar, String str, Throwable th) {
        zzg(zzfem.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.zzfeu
    public final void zzdC(zzfen zzfenVar, String str) {
        zzg(zzfem.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    public final void zzdh(Context context) {
        zzg(zzcva.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    public final void zzdj(Context context) {
        zzg(zzcva.class, b9.h.f16677t0, context);
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    public final void zzdk(Context context) {
        zzg(zzcva.class, b9.h.f16679u0, context);
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final void zzdl(zzbud zzbudVar) {
        this.zzc = com.google.android.gms.ads.internal.zzv.zzC().b();
        zzg(zzcxc.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final void zzdm(zzfag zzfagVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcuf
    public final void zzdq(zzbup zzbupVar, String str, String str2) {
        zzg(zzcuf.class, "onRewarded", zzbupVar, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcui
    public final void zzdz(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzg(zzcui.class, "onAdFailedToLoad", Integer.valueOf(zzeVar.zza), zzeVar.zzb, zzeVar.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzcuf
    public final void zze() {
        zzg(zzcuf.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcuf
    public final void zzf() {
        zzg(zzcuf.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcuz
    public final void zzr() {
        zzg(zzcuz.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzs() {
        long b10 = com.google.android.gms.ads.internal.zzv.zzC().b() - this.zzc;
        com.google.android.gms.ads.internal.util.zze.zza("Ad Request Latency : " + b10);
        zzg(zzcvt.class, nu.f19447j, new Object[0]);
    }
}
