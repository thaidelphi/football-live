package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzapw {
    public static zzaos zza(Context context, zzapd zzapdVar) {
        zzape zzapeVar;
        if (zzapdVar == null) {
            zzapeVar = new zzape(new zzapq(null, null));
        } else {
            zzapeVar = new zzape(zzapdVar);
        }
        zzaos zzaosVar = new zzaos(new zzapl(new zzapv(context.getApplicationContext()), 5242880), zzapeVar, 4);
        zzaosVar.zzd();
        return zzaosVar;
    }
}
