package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcfx implements zzhdk {
    private final zzcft zza;

    public zzcfx(zzcft zzcftVar) {
        this.zza = zzcftVar;
    }

    public static Context zzc(zzcft zzcftVar) {
        Context zzb = zzcftVar.zzb();
        zzhds.zzb(zzb);
        return zzb;
    }

    public final Context zza() {
        return zzc(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    public final /* synthetic */ Object zzb() {
        return zzc(this.zza);
    }
}
