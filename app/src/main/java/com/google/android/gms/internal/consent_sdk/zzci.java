package com.google.android.gms.internal.consent_sdk;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzci {
    private static String zza;

    public static synchronized String zza(Context context) {
        String str;
        synchronized (zzci.class) {
            if (zza == null) {
                ContentResolver contentResolver = context.getContentResolver();
                zza = zzb(((contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id")) == null || zzcq.zza(true)) ? "emulator" : "emulator");
            }
            str = zza;
        }
        return str;
    }

    private static String zzb(String str) {
        for (int i10 = 0; i10 < 3; i10++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(str.getBytes());
                return String.format("%032X", new BigInteger(1, messageDigest.digest()));
            } catch (ArithmeticException unused) {
                return "";
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        return "";
    }
}
