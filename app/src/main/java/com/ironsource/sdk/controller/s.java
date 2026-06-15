package com.ironsource.sdk.controller;

import com.ironsource.jm;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.o9;
import java.security.MessageDigest;
import java.util.UUID;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class s {

    /* renamed from: b  reason: collision with root package name */
    private static final String f20463b = "MD5";

    /* renamed from: a  reason: collision with root package name */
    private String f20464a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(String str) {
        this.f20464a = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a() {
        return UUID.randomUUID().toString();
    }

    private String a(String str) {
        try {
            return jm.a(str);
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
            return b(str);
        }
    }

    private String a(byte[] bArr) throws Exception {
        StringBuilder sb = new StringBuilder();
        for (byte b10 : bArr) {
            String hexString = Integer.toHexString(b10 & 255);
            if (hexString.length() < 2) {
                hexString = "0" + hexString;
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    private String b(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(f20463b);
            messageDigest.update(str.getBytes());
            return a(messageDigest.digest());
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(String str, String str2, String str3) {
        try {
            return str3.equalsIgnoreCase(a(str + str2 + this.f20464a));
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String b() {
        return this.f20464a;
    }
}
