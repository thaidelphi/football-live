package com.startapp;

import com.startapp.simple.bloomfilter.algo.OpenBitSet;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class b8 {

    /* renamed from: a  reason: collision with root package name */
    public final q8 f21799a = new q8();

    public final String a(OpenBitSet openBitSet) {
        ByteArrayOutputStream byteArrayOutputStream;
        int a10 = openBitSet.a();
        int b10 = openBitSet.b();
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Exception e8) {
                e = e8;
            }
        } catch (Throwable th) {
            th = th;
            byteArrayOutputStream = byteArrayOutputStream2;
        }
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            for (int i10 = 0; i10 < b10; i10++) {
                long[] a11 = openBitSet.a(i10);
                int i11 = 0;
                while (true) {
                    if (i11 < 4096) {
                        int i12 = a10 - 1;
                        if (a10 <= 0) {
                            a10 = i12;
                            break;
                        }
                        dataOutputStream.writeLong(a11[i11]);
                        i11++;
                        a10 = i12;
                    }
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException unused) {
            }
            q8 q8Var = this.f21799a;
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            q8Var.getClass();
            char[] cArr = new char[byteArray.length * 2];
            for (int i13 = 0; i13 < byteArray.length; i13++) {
                int i14 = i13 * 2;
                char[] cArr2 = q8.f22420a;
                byte b11 = byteArray[i13];
                cArr[i14] = cArr2[(b11 & 240) >>> 4];
                cArr[i14 + 1] = cArr2[b11 & 15];
            }
            return new String(cArr);
        } catch (Exception e10) {
            e = e10;
            byteArrayOutputStream2 = byteArrayOutputStream;
            throw new RuntimeException("problem serializing bitSet", e);
        } catch (Throwable th2) {
            th = th2;
            if (byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }
}
