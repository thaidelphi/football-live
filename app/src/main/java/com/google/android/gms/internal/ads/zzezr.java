package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzezr extends zzbur {
    private final zzezh zza;
    private final zzeyx zzb;
    private final zzfah zzc;
    private zzdmj zzd;
    private boolean zze = false;

    public zzezr(zzezh zzezhVar, zzeyx zzeyxVar, zzfah zzfahVar) {
        this.zza = zzezhVar;
        this.zzb = zzeyxVar;
        this.zzc = zzfahVar;
    }

    private final synchronized boolean zzy() {
        boolean z10;
        zzdmj zzdmjVar = this.zzd;
        if (zzdmjVar != null) {
            z10 = zzdmjVar.zze() ? false : true;
        }
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final Bundle zzb() {
        Preconditions.f("getAdMetadata can only be called from the UI thread.");
        zzdmj zzdmjVar = this.zzd;
        return zzdmjVar != null ? zzdmjVar.zza() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final synchronized com.google.android.gms.ads.internal.client.zzdx zzc() throws RemoteException {
        zzdmj zzdmjVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgD)).booleanValue() && (zzdmjVar = this.zzd) != null) {
            return zzdmjVar.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final synchronized String zzd() throws RemoteException {
        zzdmj zzdmjVar = this.zzd;
        if (zzdmjVar == null || zzdmjVar.zzl() == null) {
            return null;
        }
        return zzdmjVar.zzl().zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final void zze() throws RemoteException {
        zzf(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final synchronized void zzf(IObjectWrapper iObjectWrapper) {
        Preconditions.f("destroy must be called on the main UI thread.");
        Context context = null;
        this.zzb.zzg(null);
        if (this.zzd != null) {
            if (iObjectWrapper != null) {
                context = (Context) ObjectWrapper.t0(iObjectWrapper);
            }
            this.zzd.zzm().zza(context);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(com.google.android.gms.internal.ads.zzbbm.zzfu)).booleanValue() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (java.util.regex.Pattern.matches(r1, r0) != false) goto L9;
     */
    @Override // com.google.android.gms.internal.ads.zzbus
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void zzg(com.google.android.gms.internal.ads.zzbuw r5) throws android.os.RemoteException {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.f(r0)     // Catch: java.lang.Throwable -> L62
            java.lang.String r0 = r5.zzb     // Catch: java.lang.Throwable -> L62
            com.google.android.gms.internal.ads.zzbbd r1 = com.google.android.gms.internal.ads.zzbbm.zzfs     // Catch: java.lang.Throwable -> L62
            com.google.android.gms.internal.ads.zzbbk r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> L62
            java.lang.Object r1 = r2.zzb(r1)     // Catch: java.lang.Throwable -> L62
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L62
            if (r1 == 0) goto L2a
            if (r0 != 0) goto L19
            goto L2a
        L19:
            boolean r0 = java.util.regex.Pattern.matches(r1, r0)     // Catch: java.lang.RuntimeException -> L20 java.lang.Throwable -> L62
            if (r0 == 0) goto L2a
            goto L42
        L20:
            r0 = move-exception
            java.lang.String r1 = "NonagonUtil.isPatternMatched"
            com.google.android.gms.internal.ads.zzbyf r2 = com.google.android.gms.ads.internal.zzv.zzp()     // Catch: java.lang.Throwable -> L62
            r2.zzw(r0, r1)     // Catch: java.lang.Throwable -> L62
        L2a:
            boolean r0 = r4.zzy()     // Catch: java.lang.Throwable -> L62
            if (r0 == 0) goto L44
            com.google.android.gms.internal.ads.zzbbd r0 = com.google.android.gms.internal.ads.zzbbm.zzfu     // Catch: java.lang.Throwable -> L62
            com.google.android.gms.internal.ads.zzbbk r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> L62
            java.lang.Object r0 = r1.zzb(r0)     // Catch: java.lang.Throwable -> L62
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L62
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L62
            if (r0 != 0) goto L44
        L42:
            monitor-exit(r4)
            return
        L44:
            com.google.android.gms.internal.ads.zzeyz r0 = new com.google.android.gms.internal.ads.zzeyz     // Catch: java.lang.Throwable -> L62
            r1 = 0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L62
            r4.zzd = r1     // Catch: java.lang.Throwable -> L62
            com.google.android.gms.internal.ads.zzezh r1 = r4.zza     // Catch: java.lang.Throwable -> L62
            r2 = 1
            r1.zzj(r2)     // Catch: java.lang.Throwable -> L62
            com.google.android.gms.internal.ads.zzezh r1 = r4.zza     // Catch: java.lang.Throwable -> L62
            com.google.android.gms.ads.internal.client.zzm r2 = r5.zza     // Catch: java.lang.Throwable -> L62
            java.lang.String r5 = r5.zzb     // Catch: java.lang.Throwable -> L62
            com.google.android.gms.internal.ads.zzezp r3 = new com.google.android.gms.internal.ads.zzezp     // Catch: java.lang.Throwable -> L62
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L62
            r1.zzb(r2, r5, r0, r3)     // Catch: java.lang.Throwable -> L62
            monitor-exit(r4)
            return
        L62:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzezr.zzg(com.google.android.gms.internal.ads.zzbuw):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final void zzh() {
        zzi(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) {
        Preconditions.f("pause must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzm().zzb(iObjectWrapper == null ? null : (Context) ObjectWrapper.t0(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final void zzj() {
        zzk(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final synchronized void zzk(IObjectWrapper iObjectWrapper) {
        Preconditions.f("resume must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzm().zzc(iObjectWrapper == null ? null : (Context) ObjectWrapper.t0(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final void zzl(com.google.android.gms.ads.internal.client.zzcb zzcbVar) {
        Preconditions.f("setAdMetadataListener can only be called from the UI thread.");
        if (zzcbVar == null) {
            this.zzb.zzg(null);
        } else {
            this.zzb.zzg(new zzezq(this, zzcbVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final synchronized void zzm(String str) throws RemoteException {
        Preconditions.f("#008 Must be called on the main UI thread.: setCustomData");
        this.zzc.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final synchronized void zzn(boolean z10) {
        Preconditions.f("setImmersiveMode must be called on the main UI thread.");
        this.zze = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final void zzo(zzbuv zzbuvVar) throws RemoteException {
        Preconditions.f("setRewardedVideoAdListener can only be called from the UI thread.");
        this.zzb.zzm(zzbuvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final synchronized void zzp(String str) throws RemoteException {
        Preconditions.f("setUserId must be called on the main UI thread.");
        this.zzc.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final synchronized void zzq() throws RemoteException {
        zzr(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final synchronized void zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        Preconditions.f("showAd must be called on the main UI thread.");
        if (this.zzd != null) {
            Activity activity = null;
            if (iObjectWrapper != null) {
                Object t02 = ObjectWrapper.t0(iObjectWrapper);
                if (t02 instanceof Activity) {
                    activity = (Activity) t02;
                }
            }
            this.zzd.zzh(this.zze, activity);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final boolean zzs() throws RemoteException {
        Preconditions.f("isLoaded must be called on the main UI thread.");
        return zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final boolean zzt() {
        zzdmj zzdmjVar = this.zzd;
        return zzdmjVar != null && zzdmjVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final void zzu(zzbuq zzbuqVar) {
        Preconditions.f("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.zzb.zzn(zzbuqVar);
    }
}
