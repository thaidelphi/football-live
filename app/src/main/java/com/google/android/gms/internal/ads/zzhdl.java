package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzhdl implements zzhdk, zzhde {
    private static final zzhdl zza = new zzhdl(null);
    private final Object zzb;

    private zzhdl(Object obj) {
        this.zzb = obj;
    }

    public static zzhdk zza(Object obj) {
        zzhds.zza(obj, "instance cannot be null");
        return new zzhdl(obj);
    }

    public static zzhdk zzc(Object obj) {
        return obj == null ? zza : new zzhdl(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    public final Object zzb() {
        return this.zzb;
    }
}
