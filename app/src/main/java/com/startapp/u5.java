package com.startapp;

import com.startapp.sdk.adsbase.remoteconfig.MraidMetadata;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Executor;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class u5 {

    /* renamed from: a  reason: collision with root package name */
    public final t4<Executor> f23439a;

    /* renamed from: b  reason: collision with root package name */
    public final File f23440b;

    /* renamed from: c  reason: collision with root package name */
    public final j2<MraidMetadata> f23441c;

    public u5(t4 t4Var, File file, com.startapp.sdk.components.i0 i0Var) {
        this.f23439a = t4Var;
        this.f23440b = file;
        this.f23441c = i0Var;
    }

    public static int a(u5 u5Var, String str, String str2) throws IOException {
        InputStream inputStream;
        u5Var.getClass();
        File file = new File(u5Var.f23440b, "24e22423049bbf51");
        long lastModified = file.lastModified();
        if (lastModified > 0) {
            if (Math.max(0L, str2 != null ? o9.c(str2) : 86400000L) + lastModified > System.currentTimeMillis()) {
                return 2;
            }
            if (!file.delete()) {
                return 4;
            }
        }
        u5Var.f23440b.mkdirs();
        URLConnection openConnection = new URL(str).openConnection();
        File file2 = null;
        r12 = null;
        FileOutputStream fileOutputStream = null;
        if (openConnection != null) {
            try {
                openConnection.setConnectTimeout(5);
                openConnection.setReadTimeout(5);
                inputStream = openConnection.getInputStream();
                try {
                    File createTempFile = File.createTempFile("tmp", "tmp", u5Var.f23440b);
                    FileOutputStream fileOutputStream2 = new FileOutputStream(createTempFile);
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            fileOutputStream2.write(bArr, 0, read);
                        }
                        o9.a(inputStream);
                        o9.a(fileOutputStream2);
                        if (openConnection instanceof HttpURLConnection) {
                            try {
                                ((HttpURLConnection) openConnection).disconnect();
                            } catch (Exception unused) {
                            }
                        }
                        file2 = createTempFile;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        o9.a(inputStream);
                        o9.a(fileOutputStream);
                        if (openConnection instanceof HttpURLConnection) {
                            try {
                                ((HttpURLConnection) openConnection).disconnect();
                            } catch (Exception unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStream = null;
            }
        }
        return (file2 == null || !file2.renameTo(file)) ? 5 : 3;
    }
}
