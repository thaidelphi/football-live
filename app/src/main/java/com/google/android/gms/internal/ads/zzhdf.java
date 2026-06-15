package com.google.android.gms.internal.ads;

import com.ironsource.b9;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.LinkedHashMap;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class zzhdf {
    final LinkedHashMap zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhdf(int i10) {
        this.zza = zzhdh.zzb(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzhdf zza(Object obj, zzhdt zzhdtVar) {
        zzhds.zza(obj, b9.h.W);
        zzhds.zza(zzhdtVar, IronSourceConstants.EVENTS_PROVIDER);
        this.zza.put(obj, zzhdtVar);
        return this;
    }
}
