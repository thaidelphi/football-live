package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzenf implements zzhdk {
    public static zzenf zza() {
        return zzene.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    public final /* synthetic */ Object zzb() {
        Object arrayList = new ArrayList();
        zzbbd zzbbdVar = zzbbm.zzlG;
        if (!((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbdVar)).isEmpty()) {
            arrayList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbdVar)).split(","));
        }
        zzhds.zzb(arrayList);
        return arrayList;
    }
}
