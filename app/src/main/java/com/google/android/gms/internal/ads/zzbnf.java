package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbnf {
    static final com.google.android.gms.ads.internal.util.zzbd zza = new zzbnd();
    static final com.google.android.gms.ads.internal.util.zzbd zzb = new zzbne();
    private final zzbmr zzc;

    public zzbnf(Context context, VersionInfoParcel versionInfoParcel, String str, zzffq zzffqVar) {
        this.zzc = new zzbmr(context, versionInfoParcel, str, zza, zzb, zzffqVar);
    }

    public final zzbmv zza(String str, zzbmy zzbmyVar, zzbmx zzbmxVar) {
        return new zzbnj(this.zzc, str, zzbmyVar, zzbmxVar);
    }

    public final zzbno zzb() {
        return new zzbno(this.zzc);
    }
}
