package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcfy implements zzhdk {
    private final zzcft zza;

    public zzcfy(zzcft zzcftVar) {
        this.zza = zzcftVar;
    }

    public static WeakReference zzc(zzcft zzcftVar) {
        WeakReference zzg = zzcftVar.zzg();
        zzhds.zzb(zzg);
        return zzg;
    }

    public final WeakReference zza() {
        return zzc(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    public final /* synthetic */ Object zzb() {
        return zzc(this.zza);
    }
}
