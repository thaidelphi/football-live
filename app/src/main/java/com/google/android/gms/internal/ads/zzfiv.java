package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.UUID;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzfiv {
    public static zzfiv zza(zzfiw zzfiwVar, zzfix zzfixVar) {
        zzfkq.zza();
        return new zzfiz(zzfiwVar, zzfixVar, UUID.randomUUID().toString());
    }

    public abstract void zzb(View view, zzfjc zzfjcVar, String str);

    public abstract void zzc();

    public abstract void zzd(View view);

    public abstract void zze();
}
