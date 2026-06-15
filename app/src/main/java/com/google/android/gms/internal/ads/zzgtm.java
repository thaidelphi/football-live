package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzgtm implements zzgtn {
    private final zzgtx zza;

    @Override // com.google.android.gms.internal.ads.zzgtn
    public final Object zza(String str) throws GeneralSecurityException {
        Exception exc = null;
        for (Provider provider : zzgtp.zzb("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt")) {
            try {
                return this.zza.zza(str, provider);
            } catch (Exception e8) {
                if (exc == null) {
                    exc = e8;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
