package com.google.android.gms.internal.ads;

import android.text.TextUtils;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
@Deprecated
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbbs {
    public static final void zza(zzbbr zzbbrVar, zzbbp zzbbpVar) {
        if (zzbbpVar.zza() != null) {
            if (!TextUtils.isEmpty(zzbbpVar.zzb())) {
                zzbbrVar.zzd(zzbbpVar.zza(), zzbbpVar.zzb(), zzbbpVar.zzc(), zzbbpVar.zzd());
                return;
            }
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
    }
}
