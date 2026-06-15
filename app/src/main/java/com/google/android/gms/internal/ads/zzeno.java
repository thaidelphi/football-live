package com.google.android.gms.internal.ads;

import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzeno implements zzhdk {
    private final zzhdt zza;
    private final zzhdt zzb;
    private final zzhdt zzc;

    public zzeno(zzhdt zzhdtVar, zzhdt zzhdtVar2, zzhdt zzhdtVar3) {
        this.zza = zzhdtVar;
        this.zzb = zzhdtVar2;
        this.zzc = zzhdtVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzerw zzb = ((zzejs) this.zza).zzb();
        zzerw zzerwVar = (zzemo) this.zzb.zzb();
        if (true == ((List) this.zzc.zzb()).contains(CommonGetHeaderBiddingToken.HB_TOKEN_VERSION)) {
            zzb = zzerwVar;
        }
        zzhds.zzb(zzb);
        return zzb;
    }
}
