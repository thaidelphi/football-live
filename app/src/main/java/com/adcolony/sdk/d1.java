package com.adcolony.sdk;

import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class d1 {
    private static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b10 : bArr) {
            int i10 = (b10 >>> 4) & 15;
            int i11 = 0;
            while (true) {
                sb.append((char) ((i10 < 0 || i10 > 9) ? (i10 - 10) + 97 : i10 + 48));
                i10 = b10 & 15;
                int i12 = i11 + 1;
                if (i11 >= 1) {
                    break;
                }
                i11 = i12;
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest messageDigest = MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
        messageDigest.update(str.getBytes("iso-8859-1"), 0, str.length());
        return a(messageDigest.digest());
    }
}
