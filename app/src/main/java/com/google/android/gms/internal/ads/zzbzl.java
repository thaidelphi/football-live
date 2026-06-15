package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzbzl implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzbzp zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbzl(zzbzp zzbzpVar, int i10, int i11) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = zzbzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbzq zzbzqVar;
        zzbzq zzbzqVar2;
        zzbzp zzbzpVar = this.zzc;
        zzbzqVar = zzbzpVar.zzq;
        if (zzbzqVar != null) {
            int i10 = this.zza;
            int i11 = this.zzb;
            zzbzqVar2 = zzbzpVar.zzq;
            zzbzqVar2.zzj(i10, i11);
        }
    }
}
