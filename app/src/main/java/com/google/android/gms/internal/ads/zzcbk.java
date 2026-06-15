package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzcbk extends zzapy {
    static final zzcbk zzb = new zzcbk();

    zzcbk() {
    }

    @Override // com.google.android.gms.internal.ads.zzapy
    public final zzaqc zza(String str, byte[] bArr, String str2) {
        if ("moov".equals(str)) {
            return new zzaqe();
        }
        if ("mvhd".equals(str)) {
            return new zzaqf();
        }
        return new zzaqg(str);
    }
}
