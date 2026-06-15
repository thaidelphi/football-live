package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzgtk implements zzgtn {
    private final zzgtx zza;

    @Override // com.google.android.gms.internal.ads.zzgtn
    public final Object zza(String str) throws GeneralSecurityException {
        for (Provider provider : zzgtp.zzb("GmsCore_OpenSSL", "AndroidOpenSSL")) {
            try {
                return this.zza.zza(str, provider);
            } catch (Exception unused) {
            }
        }
        return this.zza.zza(str, null);
    }
}
