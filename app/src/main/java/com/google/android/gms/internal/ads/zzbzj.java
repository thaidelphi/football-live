package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbzj implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzbzp zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbzj(zzbzp zzbzpVar, String str, String str2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzbzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbzq zzbzqVar;
        zzbzq zzbzqVar2;
        zzbzp zzbzpVar = this.zzc;
        zzbzqVar = zzbzpVar.zzq;
        if (zzbzqVar != null) {
            String str = this.zza;
            String str2 = this.zzb;
            zzbzqVar2 = zzbzpVar.zzq;
            zzbzqVar2.zzb(str, str2);
        }
    }
}
