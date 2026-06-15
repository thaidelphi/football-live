package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@ShowFirstParty
@KeepForSdk
@Deprecated
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class IOUtils {
    private IOUtils() {
    }

    @KeepForSdk
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    @Deprecated
    public static long b(InputStream inputStream, OutputStream outputStream) throws IOException {
        return c(inputStream, outputStream, false, 1024);
    }

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    @Deprecated
    public static long c(InputStream inputStream, OutputStream outputStream, boolean z10, int i10) throws IOException {
        byte[] bArr = new byte[i10];
        long j10 = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, i10);
                if (read == -1) {
                    break;
                }
                j10 += read;
                outputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                if (z10) {
                    a(inputStream);
                    a(outputStream);
                }
                throw th;
            }
        }
        if (z10) {
            a(inputStream);
            a(outputStream);
        }
        return j10;
    }

    @KeepForSdk
    @Deprecated
    public static byte[] d(InputStream inputStream, boolean z10) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        c(inputStream, byteArrayOutputStream, z10, 1024);
        return byteArrayOutputStream.toByteArray();
    }
}
