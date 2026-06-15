package com.google.android.gms.internal.ads;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzbwh implements zzgal {
    final /* synthetic */ b6.a zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbwh(zzbwi zzbwiVar, b6.a aVar) {
        this.zza = aVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final void zza(Throwable th) {
        List list;
        list = zzbwi.zzc;
        list.remove(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List list;
        Void r22 = (Void) obj;
        list = zzbwi.zzc;
        list.remove(this.zza);
    }
}
