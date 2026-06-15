package com.startapp;

import android.util.Base64;
import com.ironsource.b9;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f21737a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f21738b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f21739c;

    /* renamed from: d  reason: collision with root package name */
    public static final String f21740d;

    /* renamed from: e  reason: collision with root package name */
    public static final String f21741e;

    /* renamed from: f  reason: collision with root package name */
    public static final String f21742f;

    /* renamed from: g  reason: collision with root package name */
    public static final byte[] f21743g;

    static {
        int i10 = y.f23556a;
        "startapp.".concat(a.class.getSimpleName());
        f21737a = new byte[]{10, 30, 84, 95, 101, 20, 0, 14, 15, 80, 36, 84, 64, 82, 84, 64, 80, 80, 65, 78, 84, 73, 70, 82, 65, 85, 68, 75, 69, 89, 1, 2, 3, 8, 15, 42, 10, 51, 44, 32};
        f21738b = "ts";
        f21739c = "tsh";
        f21740d = "afh";
        f21741e = "MD5";
        f21742f = "UTF-8";
        f21743g = new byte[]{12, 31, 86, 96, 103, 10, 28, 15, 17, 28, 36, 84, 64, 82, 84, 64, 80, 80, 69, 78, 67, 82, 89, 80, 84, 73, 79, 78, 75, 69, 89, 4, 32, 18, 16, 18, 11, 53, 45, 34};
    }

    public static String a() {
        int hashCode = f21737a.hashCode();
        long currentTimeMillis = System.currentTimeMillis();
        if (hashCode > 0) {
            int i10 = (int) ((((currentTimeMillis * 25214903917L) + 11) & 281474976710655L) >>> 17);
            if (((-hashCode) & hashCode) != hashCode) {
                int i11 = i10 % hashCode;
            }
        }
        return new Long(System.currentTimeMillis()).toString();
    }

    public static String b(String str) {
        return Base64.encodeToString(a(str.getBytes()), 2);
    }

    public static String c(String str) {
        String str2 = "";
        if (str != null) {
            try {
                str2 = URLDecoder.decode(str, f21742f);
            } catch (UnsupportedEncodingException unused) {
            }
        }
        String a10 = a();
        return b9.i.f16694c + f21738b + b9.i.f16692b + a10 + b9.i.f16694c + f21740d + b9.i.f16692b + a(str2 + a10);
    }

    public static String a(String str) {
        byte[] bytes = str.getBytes();
        byte[] bArr = f21737a;
        int length = bytes.length < bArr.length ? bytes.length : bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            byte b10 = bytes[i10];
            byte b11 = bArr[i10];
        }
        byte[] bytes2 = str.getBytes();
        byte b12 = f21737a[5];
        int min = Math.min(bytes2.length, (int) b12);
        byte[] bArr2 = new byte[min];
        for (int i11 = 0; i11 < bytes2.length; i11++) {
            int i12 = i11 % b12;
            bArr2[i12] = (byte) (bArr2[i12] ^ bytes2[i11]);
        }
        byte[] bArr3 = f21737a;
        byte[] bytes3 = new String(bArr3).substring(bArr3[0], bArr3[1]).getBytes();
        byte[] bArr4 = new byte[min];
        for (int i13 = 0; i13 < min; i13++) {
            bArr4[i13] = (byte) (bArr2[i13] ^ bytes3[i13 % bytes3.length]);
        }
        try {
            return URLEncoder.encode(Base64.encodeToString(MessageDigest.getInstance(f21741e).digest(bArr4), 3), f21742f);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static byte[] a(byte[] bArr) {
        byte[] bArr2 = f21743g;
        int hashCode = bArr2.hashCode();
        long hashCode2 = bArr.hashCode();
        if (hashCode > hashCode2) {
            int i10 = (int) ((((hashCode2 * 29509871405L) + 11) & 16777215) >>> 17);
            if (hashCode >= 1000) {
                int i11 = i10 % hashCode;
            }
        }
        byte[] bytes = new String(bArr2).substring(bArr2[5], bArr2[33]).getBytes();
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i12 = 0; i12 < bArr.length; i12++) {
            bArr3[i12] = (byte) (bArr[i12] ^ bytes[i12 % bytes.length]);
        }
        byte[] bytes2 = new String(bArr2).substring(bArr2[35], bArr2[1]).getBytes();
        byte[] bArr4 = new byte[length];
        for (int i13 = 0; i13 < length; i13++) {
            bArr4[i13] = (byte) (bArr3[i13] ^ bytes2[i13 % bytes2.length]);
        }
        return bArr4;
    }
}
