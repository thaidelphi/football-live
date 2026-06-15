package com.google.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
/* compiled from: ByteBufferWriter.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<SoftReference<byte[]>> f15413a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    private static final Class<?> f15414b;

    /* renamed from: c  reason: collision with root package name */
    private static final long f15415c;

    static {
        Class<?> e8 = e("java.io.FileOutputStream");
        f15414b = e8;
        f15415c = b(e8);
    }

    private static byte[] a() {
        SoftReference<byte[]> softReference = f15413a.get();
        if (softReference == null) {
            return null;
        }
        return softReference.get();
    }

    private static long b(Class<?> cls) {
        if (cls != null) {
            try {
                if (t0.J()) {
                    return t0.M(cls.getDeclaredField("channel"));
                }
                return -1L;
            } catch (Throwable unused) {
                return -1L;
            }
        }
        return -1L;
    }

    private static byte[] c(int i10) {
        int max = Math.max(i10, 1024);
        byte[] a10 = a();
        if (a10 == null || d(max, a10.length)) {
            a10 = new byte[max];
            if (max <= 16384) {
                f(a10);
            }
        }
        return a10;
    }

    private static boolean d(int i10, int i11) {
        return i11 < i10 && ((float) i11) < ((float) i10) * 0.5f;
    }

    private static Class<?> e(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private static void f(byte[] bArr) {
        f15413a.set(new SoftReference<>(bArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(ByteBuffer byteBuffer, OutputStream outputStream) throws IOException {
        int position = byteBuffer.position();
        try {
            if (byteBuffer.hasArray()) {
                outputStream.write(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            } else if (!h(byteBuffer, outputStream)) {
                byte[] c10 = c(byteBuffer.remaining());
                while (byteBuffer.hasRemaining()) {
                    int min = Math.min(byteBuffer.remaining(), c10.length);
                    byteBuffer.get(c10, 0, min);
                    outputStream.write(c10, 0, min);
                }
            }
        } finally {
            ByteBuffer byteBuffer2 = (ByteBuffer) byteBuffer.position(position);
        }
    }

    private static boolean h(ByteBuffer byteBuffer, OutputStream outputStream) throws IOException {
        long j10 = f15415c;
        if (j10 < 0 || !f15414b.isInstance(outputStream)) {
            return false;
        }
        WritableByteChannel writableByteChannel = null;
        try {
            writableByteChannel = (WritableByteChannel) t0.H(outputStream, j10);
        } catch (ClassCastException unused) {
        }
        if (writableByteChannel != null) {
            writableByteChannel.write(byteBuffer);
            return true;
        }
        return false;
    }
}
