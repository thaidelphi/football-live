package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzbzm implements Runnable {
    final /* synthetic */ zzbzp zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbzm(zzbzp zzbzpVar) {
        this.zza = zzbzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbzq zzbzqVar;
        zzbzq zzbzqVar2;
        zzbzq zzbzqVar3;
        zzbzp zzbzpVar = this.zza;
        zzbzqVar = zzbzpVar.zzq;
        if (zzbzqVar != null) {
            zzbzqVar2 = zzbzpVar.zzq;
            zzbzqVar2.zzd();
            zzbzqVar3 = this.zza.zzq;
            zzbzqVar3.zzi();
        }
    }
}
