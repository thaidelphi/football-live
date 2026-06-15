package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcsx implements zzhdk {
    private final zzhdt zza;
    private final zzhdt zzb;
    private final zzhdt zzc;

    public zzcsx(zzhdt zzhdtVar, zzhdt zzhdtVar2, zzhdt zzhdtVar3) {
        this.zza = zzhdtVar;
        this.zzb = zzhdtVar2;
        this.zzc = zzhdtVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.zza.zzb();
        final VersionInfoParcel zza = ((zzcgl) this.zzb).zza();
        final zzfap zza2 = ((zzctw) this.zzc).zza();
        return new zzfsk() { // from class: com.google.android.gms.internal.ads.zzcsw
            @Override // com.google.android.gms.internal.ads.zzfsk
            public final Object apply(Object obj) {
                zzezu zzezuVar = (zzezu) obj;
                com.google.android.gms.ads.internal.util.zzau zzauVar = new com.google.android.gms.ads.internal.util.zzau(context);
                zzauVar.zzp(zzezuVar.zzB);
                zzauVar.zzq(zzezuVar.zzC.toString());
                zzauVar.zzo(zza.afmaVersion);
                zzauVar.zzn(zza2.zzf);
                return zzauVar;
            }
        };
    }
}
