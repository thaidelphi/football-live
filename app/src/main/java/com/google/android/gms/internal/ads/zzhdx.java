package com.google.android.gms.internal.ads;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzhdx {
    private final List zza;
    private final List zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzhdx(int i10, int i11, zzhdw zzhdwVar) {
        this.zza = zzhdh.zzc(i10);
        this.zzb = zzhdh.zzc(i11);
    }

    public final zzhdx zza(zzhdt zzhdtVar) {
        this.zzb.add(zzhdtVar);
        return this;
    }

    public final zzhdx zzb(zzhdt zzhdtVar) {
        this.zza.add(zzhdtVar);
        return this;
    }

    public final zzhdy zzc() {
        return new zzhdy(this.zza, this.zzb, null);
    }
}
