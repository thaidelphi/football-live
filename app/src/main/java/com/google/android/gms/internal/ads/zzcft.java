package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.ref.WeakReference;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcft {
    private final VersionInfoParcel zza;
    private final Context zzb;
    private final long zzc;
    private final WeakReference zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcft(zzcfr zzcfrVar, zzcfs zzcfsVar) {
        VersionInfoParcel versionInfoParcel;
        Context context;
        WeakReference weakReference;
        long j10;
        versionInfoParcel = zzcfrVar.zza;
        this.zza = versionInfoParcel;
        context = zzcfrVar.zzb;
        this.zzb = context;
        weakReference = zzcfrVar.zzd;
        this.zzd = weakReference;
        j10 = zzcfrVar.zzc;
        this.zzc = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long zza() {
        return this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Context zzb() {
        return this.zzb;
    }

    public final com.google.android.gms.ads.internal.zzk zzc() {
        return new com.google.android.gms.ads.internal.zzk(this.zzb, this.zza);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzbeg zzd() {
        return new zzbeg(this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final VersionInfoParcel zze() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzf() {
        return com.google.android.gms.ads.internal.zzv.zzq().zzc(this.zzb, this.zza.afmaVersion);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final WeakReference zzg() {
        return this.zzd;
    }
}
