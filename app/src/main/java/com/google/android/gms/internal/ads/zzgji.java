package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzgji extends ThreadLocal {
    protected static final Cipher zza() {
        boolean zzd;
        try {
            Cipher cipher = (Cipher) zzgtp.zza.zza("AES/GCM-SIV/NoPadding");
            zzd = zzgjj.zzd(cipher);
            if (zzd) {
                return cipher;
            }
            return null;
        } catch (GeneralSecurityException e8) {
            throw new IllegalStateException(e8);
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return zza();
    }
}
