package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbzn implements Runnable {
    final /* synthetic */ zzbzp zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbzn(zzbzp zzbzpVar) {
        this.zza = zzbzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbzq zzbzqVar;
        boolean z10;
        zzbzq zzbzqVar2;
        zzbzq zzbzqVar3;
        zzbzp zzbzpVar = this.zza;
        zzbzqVar = zzbzpVar.zzq;
        if (zzbzqVar != null) {
            z10 = zzbzpVar.zzr;
            if (!z10) {
                zzbzqVar3 = zzbzpVar.zzq;
                zzbzqVar3.zzg();
                this.zza.zzr = true;
            }
            zzbzqVar2 = this.zza.zzq;
            zzbzqVar2.zze();
        }
    }
}
