package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzczw {
    private final Set zza = new HashSet();
    private final Set zzb = new HashSet();
    private final Set zzc = new HashSet();
    private final Set zzd = new HashSet();
    private final Set zze = new HashSet();
    private final Set zzf = new HashSet();
    private final Set zzg = new HashSet();
    private final Set zzh = new HashSet();
    private final Set zzi = new HashSet();
    private final Set zzj = new HashSet();
    private final Set zzk = new HashSet();
    private final Set zzl = new HashSet();
    private final Set zzm = new HashSet();
    private final Set zzn = new HashSet();
    private zzexi zzo;

    public final zzczw zza(com.google.android.gms.ads.internal.client.zza zzaVar, Executor executor) {
        this.zzc.add(new zzdbw(zzaVar, executor));
        return this;
    }

    public final zzczw zzb(zzcui zzcuiVar, Executor executor) {
        this.zzi.add(new zzdbw(zzcuiVar, executor));
        return this;
    }

    public final zzczw zzc(zzcuv zzcuvVar, Executor executor) {
        this.zzl.add(new zzdbw(zzcuvVar, executor));
        return this;
    }

    public final zzczw zzd(zzcuz zzcuzVar, Executor executor) {
        this.zzf.add(new zzdbw(zzcuzVar, executor));
        return this;
    }

    public final zzczw zze(zzcuf zzcufVar, Executor executor) {
        this.zze.add(new zzdbw(zzcufVar, executor));
        return this;
    }

    public final zzczw zzf(zzcvt zzcvtVar, Executor executor) {
        this.zzh.add(new zzdbw(zzcvtVar, executor));
        return this;
    }

    public final zzczw zzg(zzcwe zzcweVar, Executor executor) {
        this.zzg.add(new zzdbw(zzcweVar, executor));
        return this;
    }

    public final zzczw zzh(com.google.android.gms.ads.internal.overlay.zzr zzrVar, Executor executor) {
        this.zzn.add(new zzdbw(zzrVar, executor));
        return this;
    }

    public final zzczw zzi(zzcwq zzcwqVar, Executor executor) {
        this.zzm.add(new zzdbw(zzcwqVar, executor));
        return this;
    }

    public final zzczw zzj(zzcxc zzcxcVar, Executor executor) {
        this.zzb.add(new zzdbw(zzcxcVar, executor));
        return this;
    }

    public final zzczw zzk(AppEventListener appEventListener, Executor executor) {
        this.zzk.add(new zzdbw(appEventListener, executor));
        return this;
    }

    public final zzczw zzl(zzdce zzdceVar, Executor executor) {
        this.zzd.add(new zzdbw(zzdceVar, executor));
        return this;
    }

    public final zzczw zzm(zzexi zzexiVar) {
        this.zzo = zzexiVar;
        return this;
    }

    public final zzczy zzn() {
        return new zzczy(this, null);
    }
}
