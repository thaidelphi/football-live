package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzaon implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzaop zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaon(zzaop zzaopVar, String str, long j10) {
        this.zza = str;
        this.zzb = j10;
        this.zzc = zzaopVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzapa zzapaVar;
        zzapa zzapaVar2;
        zzapaVar = this.zzc.zza;
        zzapaVar.zza(this.zza, this.zzb);
        zzaop zzaopVar = this.zzc;
        zzapaVar2 = zzaopVar.zza;
        zzapaVar2.zzb(zzaopVar.toString());
    }
}
