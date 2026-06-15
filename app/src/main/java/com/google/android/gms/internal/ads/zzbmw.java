package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbmw {
    private final Object zza = new Object();
    private final Object zzb = new Object();
    private zzbnf zzc;
    private zzbnf zzd;

    private static final Context zzc(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public final zzbnf zza(Context context, VersionInfoParcel versionInfoParcel, zzffq zzffqVar) {
        zzbnf zzbnfVar;
        synchronized (this.zza) {
            if (this.zzc == null) {
                this.zzc = new zzbnf(zzc(context), versionInfoParcel, (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zza), zzffqVar);
            }
            zzbnfVar = this.zzc;
        }
        return zzbnfVar;
    }

    public final zzbnf zzb(Context context, VersionInfoParcel versionInfoParcel, zzffq zzffqVar) {
        zzbnf zzbnfVar;
        synchronized (this.zzb) {
            if (this.zzd == null) {
                this.zzd = new zzbnf(zzc(context), versionInfoParcel, (String) zzbdw.zza.zze(), zzffqVar);
            }
            zzbnfVar = this.zzd;
        }
        return zzbnfVar;
    }
}
