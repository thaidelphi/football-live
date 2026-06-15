package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdlr implements Callable {
    private final com.google.android.gms.ads.internal.zza zza;
    private final Context zzb;
    private final zzdqf zzc;
    private final zzdzu zzd;
    private final Executor zze;
    private final zzauc zzf;
    private final VersionInfoParcel zzg;
    private final zzfhp zzh;
    private final zzeaf zzi;
    private final zzfat zzj;

    public zzdlr(Context context, Executor executor, zzauc zzaucVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzced zzcedVar, zzdzu zzdzuVar, zzfhp zzfhpVar, zzdqf zzdqfVar, zzeaf zzeafVar, zzfat zzfatVar) {
        this.zzb = context;
        this.zze = executor;
        this.zzf = zzaucVar;
        this.zzg = versionInfoParcel;
        this.zza = zzaVar;
        this.zzd = zzdzuVar;
        this.zzh = zzfhpVar;
        this.zzc = zzdqfVar;
        this.zzi = zzeafVar;
        this.zzj = zzfatVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ Context zza(zzdlr zzdlrVar) {
        return zzdlrVar.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzauc zzb(zzdlr zzdlrVar) {
        return zzdlrVar.zzf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.zza zzc(zzdlr zzdlrVar) {
        return zzdlrVar.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ VersionInfoParcel zzd(zzdlr zzdlrVar) {
        return zzdlrVar.zzg;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzdqf zze(zzdlr zzdlrVar) {
        return zzdlrVar.zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzdzu zzf(zzdlr zzdlrVar) {
        return zzdlrVar.zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzeaf zzg(zzdlr zzdlrVar) {
        return zzdlrVar.zzi;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzfat zzh(zzdlr zzdlrVar) {
        return zzdlrVar.zzj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzfhp zzi(zzdlr zzdlrVar) {
        return zzdlrVar.zzh;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ Executor zzj(zzdlr zzdlrVar) {
        return zzdlrVar.zze;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzdlu zzdluVar = new zzdlu(this);
        zzdluVar.zzk();
        return zzdluVar;
    }
}
