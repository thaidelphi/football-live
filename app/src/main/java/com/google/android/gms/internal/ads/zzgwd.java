package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgwd implements zzgxt {
    private static final zzgwd zza = new zzgwd();

    private zzgwd() {
    }

    public static zzgwd zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final zzgxs zzb(Class cls) {
        if (zzgwk.class.isAssignableFrom(cls)) {
            try {
                return (zzgxs) zzgwk.zzbh(cls.asSubclass(zzgwk.class)).zzbO();
            } catch (Exception e8) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e8);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final boolean zzc(Class cls) {
        return zzgwk.class.isAssignableFrom(cls);
    }
}
