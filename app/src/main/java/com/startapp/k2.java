package com.startapp;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class k2 implements d9 {

    /* renamed from: a  reason: collision with root package name */
    public final b9 f22162a;

    public k2(b9 b9Var) {
        this.f22162a = b9Var;
    }

    @Override // com.startapp.d9
    public final String a(String str) {
        GZIPOutputStream gZIPOutputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        } catch (Exception unused) {
        } catch (Throwable th) {
            th = th;
            gZIPOutputStream = null;
        }
        try {
            gZIPOutputStream.write(str.getBytes());
            int i10 = h3.f22014a;
            try {
                gZIPOutputStream.close();
            } catch (IOException unused2) {
            }
            String a10 = this.f22162a.a(p0.b(byteArrayOutputStream.toByteArray()));
            try {
                gZIPOutputStream.close();
            } catch (IOException unused3) {
            }
            return a10;
        } catch (Exception unused4) {
            gZIPOutputStream2 = gZIPOutputStream;
            int i11 = h3.f22014a;
            if (gZIPOutputStream2 != null) {
                try {
                    gZIPOutputStream2.close();
                } catch (IOException unused5) {
                }
            }
            return "";
        } catch (Throwable th2) {
            th = th2;
            int i12 = h3.f22014a;
            if (gZIPOutputStream != null) {
                try {
                    gZIPOutputStream.close();
                } catch (IOException unused6) {
                }
            }
            throw th;
        }
    }
}
