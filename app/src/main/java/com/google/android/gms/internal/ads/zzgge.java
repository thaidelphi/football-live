package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgge {
    public static final zzgge zza = new zzgge("ASSUME_AES_GCM");
    public static final zzgge zzb = new zzgge("ASSUME_XCHACHA20POLY1305");
    public static final zzgge zzc = new zzgge("ASSUME_CHACHA20POLY1305");
    public static final zzgge zzd = new zzgge("ASSUME_AES_CTR_HMAC");
    public static final zzgge zze = new zzgge("ASSUME_AES_EAX");
    public static final zzgge zzf = new zzgge("ASSUME_AES_GCM_SIV");
    private final String zzg;

    private zzgge(String str) {
        this.zzg = str;
    }

    public final String toString() {
        return this.zzg;
    }
}
