package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdqe {
    final /* synthetic */ zzdqf zza;
    private final Map zzb = new ConcurrentHashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdqe(zzdqf zzdqfVar) {
        this.zza = zzdqfVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzdqe zza(zzdqe zzdqeVar) {
        zzdqeVar.zzb.putAll(zzdqf.zzc(zzdqeVar.zza));
        return zzdqeVar;
    }

    public final zzdqe zzb(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.zzb.put(str, str2);
        }
        return this;
    }

    public final zzdqe zzc(zzezu zzezuVar) {
        zzb("aai", zzezuVar.zzw);
        zzb("request_id", zzezuVar.zzan);
        zzb("ad_format", zzezu.zza(zzezuVar.zzb));
        return this;
    }

    public final zzdqe zzd(zzezx zzezxVar) {
        zzb("gqi", zzezxVar.zzb);
        return this;
    }

    public final String zze() {
        return zzdqf.zzb(this.zza).zzb(this.zzb);
    }

    public final void zzi() {
        zzdqf.zzd(this.zza).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdqd
            @Override // java.lang.Runnable
            public final void run() {
                zzdqf.zzb(r0.zza).zze(zzdqe.this.zzb);
            }
        });
    }

    public final void zzj() {
        zzdqf.zzd(this.zza).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdqb
            @Override // java.lang.Runnable
            public final void run() {
                zzdqf.zzb(r0.zza).zzg(zzdqe.this.zzb);
            }
        });
    }

    public final void zzk() {
        zzdqf.zzd(this.zza).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdqc
            @Override // java.lang.Runnable
            public final void run() {
                zzdqf.zzb(r0.zza).zzf(zzdqe.this.zzb);
            }
        });
    }
}
