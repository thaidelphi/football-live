package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzgxn implements zzgyp {
    private static final zzgxt zza = new zzgxl();
    private final zzgxt zzb;

    public zzgxn() {
        zzgxt zzgxtVar = zza;
        int i10 = zzgyf.zza;
        zzgxm zzgxmVar = new zzgxm(zzgwd.zza(), zzgxtVar);
        byte[] bArr = zzgwx.zzb;
        this.zzb = zzgxmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyp
    public final zzgyo zza(Class cls) {
        int i10 = zzgyq.zza;
        if (!zzgwk.class.isAssignableFrom(cls)) {
            int i11 = zzgyf.zza;
        }
        zzgxs zzb = this.zzb.zzb(cls);
        if (!zzb.zzb()) {
            int i12 = zzgyf.zza;
            return zzgxy.zzm(cls, zzb, zzgyc.zza(), zzgxj.zza(), zzgyq.zzm(), zzb.zzc() + (-1) != 1 ? zzgvx.zza() : null, zzgxr.zza());
        }
        int i13 = zzgyf.zza;
        return zzgxz.zzc(zzgyq.zzm(), zzgvx.zza(), zzb.zza());
    }
}
