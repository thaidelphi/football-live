package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzhdi implements zzhdk {
    private zzhdt zza;

    public static void zza(zzhdt zzhdtVar, zzhdt zzhdtVar2) {
        zzhdi zzhdiVar = (zzhdi) zzhdtVar;
        if (zzhdiVar.zza == null) {
            zzhdiVar.zza = zzhdtVar2;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    public final Object zzb() {
        zzhdt zzhdtVar = this.zza;
        if (zzhdtVar != null) {
            return zzhdtVar.zzb();
        }
        throw new IllegalStateException();
    }
}
