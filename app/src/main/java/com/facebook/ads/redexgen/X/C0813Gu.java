package com.facebook.ads.redexgen.X;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Gu  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C0813Gu extends InputStream {
    public static byte[] A04;
    public MessageDigest A00;
    public final C1899k0 A01;
    public final InterfaceC0812Gt A02;
    public final FileInputStream A03;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 43);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-52, -61, -76, -23, -8, -15};
    }

    public C0813Gu(C1899k0 c1899k0, FileInputStream fileInputStream, InterfaceC0812Gt interfaceC0812Gt) {
        this.A03 = fileInputStream;
        this.A02 = interfaceC0812Gt;
        this.A01 = c1899k0;
        try {
            this.A00 = MessageDigest.getInstance(A00(0, 3, 84));
        } catch (NoSuchAlgorithmException unused) {
            this.A00 = null;
        }
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        return this.A03.available();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] b10 = new byte[1];
        return read(b10);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int read = this.A03.read(bArr, i10, i11);
        if (this.A00 != null) {
            try {
                if (read > 0) {
                    this.A00.update(bArr, i10, read);
                } else if (read == -1) {
                    this.A02.A9i(CS.A05(this.A00.digest()));
                    this.A00 = null;
                }
            } catch (Exception e8) {
                this.A00 = null;
                this.A01.A08().ABM(A00(3, 3, 90), AbstractC06048a.A13, new C06058b(e8));
            }
        }
        return read;
    }

    @Override // java.io.InputStream
    public final long skip(long j10) throws IOException {
        int actuallyRead = (int) j10;
        byte[] bArr = new byte[1024];
        long j11 = 0;
        while (actuallyRead > 0) {
            int bytesToRead = read(bArr, 0, Math.min(actuallyRead, 1024));
            if (bytesToRead <= 0) {
                break;
            }
            actuallyRead -= bytesToRead;
            j11 += bytesToRead;
        }
        return j11;
    }
}
