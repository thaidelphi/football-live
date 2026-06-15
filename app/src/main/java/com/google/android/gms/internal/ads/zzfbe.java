package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfbe {
    public zzfbe() {
        try {
            zzgda.zza();
        } catch (GeneralSecurityException e8) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to Configure Aead. ".concat(e8.toString()));
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e8, "CryptoUtils.registerAead");
        }
    }

    public static final String zza() {
        byte[] bArr;
        try {
            zzgco zzb = zzgco.zzb(zzgci.zza(zzgla.zzb().zza("AES128_GCM")));
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                zzgby.zzb(zzb, zzgbx.zzb(byteArrayOutputStream));
                bArr = byteArrayOutputStream.toByteArray();
            } catch (IOException unused) {
                throw new GeneralSecurityException("Serialize keyset failed");
            }
        } catch (GeneralSecurityException e8) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to generate key".concat(e8.toString()));
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e8, "CryptoUtils.generateKey");
            bArr = new byte[0];
        }
        return Base64.encodeToString(bArr, 11);
    }

    public static final String zzb(byte[] bArr, byte[] bArr2, String str, zzdpz zzdpzVar) {
        zzgco zzc;
        if (str != null && (zzc = zzc(str)) != null) {
            try {
                byte[] zza = ((zzgbv) zzc.zzd(zzgdi.zza(), zzgbv.class)).zza(bArr, bArr2);
                zzdpzVar.zzb().put("ds", "1");
                return new String(zza, "UTF-8");
            } catch (UnsupportedEncodingException | UnsupportedOperationException | GeneralSecurityException e8) {
                com.google.android.gms.ads.internal.util.zze.zza("Failed to decrypt ".concat(e8.toString()));
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e8, "CryptoUtils.decrypt");
                zzdpzVar.zzb().put("dsf", e8.toString());
            }
        }
        return null;
    }

    private static final zzgco zzc(String str) {
        try {
            try {
                return zzgby.zza(zzgbw.zzb(Base64.decode(str, 11)));
            } catch (IOException unused) {
                throw new GeneralSecurityException("Parse keyset failed");
            }
        } catch (GeneralSecurityException e8) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to get keysethandle".concat(e8.toString()));
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e8, "CryptoUtils.getHandle");
            return null;
        }
    }
}
