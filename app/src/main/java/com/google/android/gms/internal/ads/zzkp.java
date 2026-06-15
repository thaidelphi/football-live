package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzkp implements zzkg {
    public final zztt zza;
    public int zzd;
    public boolean zze;
    public final List zzc = new ArrayList();
    public final Object zzb = new Object();

    public zzkp(zzua zzuaVar, boolean z10) {
        this.zza = new zztt(zzuaVar, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final zzbn zza() {
        return this.zza.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final Object zzb() {
        return this.zzb;
    }

    public final void zzc(int i10) {
        this.zzd = i10;
        this.zze = false;
        this.zzc.clear();
    }
}
