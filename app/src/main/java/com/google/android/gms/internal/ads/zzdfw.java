package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.UUID;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdfw implements zzhdk {
    private final zzhdt zza;

    public zzdfw(zzhdt zzhdtVar, zzhdt zzhdtVar2) {
        this.zza = zzhdtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    public final /* synthetic */ Object zzb() {
        VersionInfoParcel zza = ((zzcgl) this.zza).zza();
        com.google.android.gms.ads.internal.zzv.zzq();
        return new zzaxh(UUID.randomUUID().toString(), zza, IronSourceConstants.EVENTS_NATIVE, new JSONObject(), false, true);
    }
}
