package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcqo implements zzgal {
    final /* synthetic */ zzcqp zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcqo(zzcqp zzcqpVar) {
        this.zza = zzcqpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final void zza(Throwable th) {
        zzczm zzczmVar;
        zzczmVar = this.zza.zzf;
        zzczmVar.zzl(false);
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final /* bridge */ /* synthetic */ void zzb(@NullableDecl Object obj) {
        zzczm zzczmVar;
        Void r22 = (Void) obj;
        zzczmVar = this.zza.zzf;
        zzczmVar.zzl(true);
    }
}
