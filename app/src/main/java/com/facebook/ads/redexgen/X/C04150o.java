package com.facebook.ads.redexgen.X;

import android.net.Uri;
import com.facebook.ads.AdError;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.0o  reason: invalid class name and case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C04150o extends AbstractC05325e {
    public static byte[] A04;
    public static String[] A05 = {"zq8MhPDvEFWi6bbSuU04Ys6u7K6w1V28", "kKM54d1p9EzrYvf0sjzdnQmELqHD8xkg", "20heykQgb97NKPnaJTAAZkudKcyqi4W4", "a8qwO2VROPEtdQoyrgn7esU6CnMuvqlK", "5O1WH", "DrQxGCTXw4yPZeikI8NlQTNhiELd0lEV", "6JQ5RW6FmfxdvDpkV4jJlFxXb5y8PD2X", "q4so9pf3WZg0WNeSwryZWYZ4LAo0CIow"};
    public long A00;
    public Uri A01;
    public RandomAccessFile A02;
    public boolean A03;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 60);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{124, 115, 118, Byte.MAX_VALUE, 73, 104, 121, 72, Byte.MAX_VALUE, 123, 126, 85, 106, Byte.MAX_VALUE, 116, 125, 114, 119, 126, 72, 105, 120, 73, 126, 122, Byte.MAX_VALUE, 73, 90, 93, 110, 38, 33, 58, 115, 59, 50, 32, 115, 34, 38, 54, 33, 42, 115, 50, 61, 55, 124, 60, 33, 115, 53, 33, 50, 52, 62, 54, 61, 39, Byte.MAX_VALUE, 115, 36, 59, 58, 48, 59, 115, 50, 33, 54, 115, 61, 60, 39, 115, 32, 38, 35, 35, 60, 33, 39, 54, 55, 125, 115, 23, 58, 55, 115, 42, 60, 38, 115, 48, 50, 63, 63, 115, 6, 33, 58, 125, 35, 50, 33, 32, 54, 123, 122, 115, 60, 61, 115, 50, 115, 32, 39, 33, 58, 61, 52, 115, 48, 60, 61, 39, 50, 58, 61, 58, 61, 52, 115, 116, 108, 116, 115, 60, 33, 115, 116, 112, 116, 108, 115, 6, 32, 54, 115, 6, 33, 58, 125, 53, 33, 60, 62, 21, 58, 63, 54, 123, 61, 54, 36, 115, 21, 58, 63, 54, 123, 35, 50, 39, 59, 122, 122, 115, 39, 60, 115, 50, 37, 60, 58, 55, 115, 39, 59, 58, 32, 125, 115, 35, 50, 39, 59, 110, 118, 32, Byte.MAX_VALUE, 34, 38, 54, 33, 42, 110, 118, 32, Byte.MAX_VALUE, 53, 33, 50, 52, 62, 54, 61, 39, 110, 118, 32};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.Q7
    @MetaExoPlayerCustomization("FB tracing added in D4783963 for calls to TraceUtil.beginSection and TraceUtil.endSection")
    public final long AFq(C1519dj c1519dj) throws C1036Po {
        AbstractC1663g5.A02(A01(0, 15, 38));
        Uri uri = c1519dj.A06;
        this.A01 = uri;
        A0G(c1519dj);
        this.A02 = A00(uri);
        try {
            try {
                this.A02.seek(c1519dj.A04);
                this.A00 = c1519dj.A03 == -1 ? this.A02.length() - c1519dj.A04 : c1519dj.A03;
                AbstractC1663g5.A00();
                if (this.A00 >= 0) {
                    this.A03 = true;
                    A0H(c1519dj);
                    return this.A00;
                }
                throw new C1036Po(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
            } catch (IOException e8) {
                throw new C1036Po(e8, 2000);
            }
        } catch (Throwable th) {
            AbstractC1663g5.A00();
            throw th;
        }
    }

    static {
        A02();
    }

    public C04150o() {
        super(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006d, code lost:
        if (r3 != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.io.RandomAccessFile A00(android.net.Uri r6) throws com.facebook.ads.redexgen.X.C1036Po {
        /*
            r5 = 2006(0x7d6, float:2.811E-42)
            java.lang.String r0 = r6.getPath()     // Catch: java.lang.RuntimeException -> L1b java.lang.SecurityException -> L24 java.io.FileNotFoundException -> L2b
            java.lang.Object r3 = com.facebook.ads.redexgen.X.AbstractC1589es.A01(r0)     // Catch: java.lang.RuntimeException -> L1b java.lang.SecurityException -> L24 java.io.FileNotFoundException -> L2b
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.RuntimeException -> L1b java.lang.SecurityException -> L24 java.io.FileNotFoundException -> L2b
            r2 = 29
            r1 = 1
            r0 = 32
            java.lang.String r0 = A01(r2, r1, r0)     // Catch: java.lang.RuntimeException -> L1b java.lang.SecurityException -> L24 java.io.FileNotFoundException -> L2b
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch: java.lang.RuntimeException -> L1b java.lang.SecurityException -> L24 java.io.FileNotFoundException -> L2b
            r1.<init>(r3, r0)     // Catch: java.lang.RuntimeException -> L1b java.lang.SecurityException -> L24 java.io.FileNotFoundException -> L2b
            return r1
        L1b:
            r2 = move-exception
            r1 = 2000(0x7d0, float:2.803E-42)
            com.facebook.ads.redexgen.X.Po r0 = new com.facebook.ads.redexgen.X.Po
            r0.<init>(r2, r1)
            throw r0
        L24:
            r1 = move-exception
            com.facebook.ads.redexgen.X.Po r0 = new com.facebook.ads.redexgen.X.Po
            r0.<init>(r1, r5)
            throw r0
        L2b:
            r4 = move-exception
            java.lang.String r0 = r6.getQuery()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L75
            java.lang.String r0 = r6.getFragment()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L75
            int r1 = com.facebook.ads.redexgen.X.AbstractC1672gE.A02
            r0 = 21
            if (r1 < r0) goto L63
            java.lang.Throwable r0 = r4.getCause()
            boolean r3 = com.facebook.ads.redexgen.X.C1525dq.A01(r0)
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C04150o.A05
            r0 = 2
            r1 = r1[r0]
            r0 = 28
            char r1 = r1.charAt(r0)
            r0 = 105(0x69, float:1.47E-43)
            if (r1 == r0) goto L66
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L63:
            r5 = 2005(0x7d5, float:2.81E-42)
            goto L6f
        L66:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C04150o.A05
            java.lang.String r1 = "RDfor"
            r0 = 4
            r2[r0] = r1
            if (r3 == 0) goto L63
        L6f:
            com.facebook.ads.redexgen.X.Po r0 = new com.facebook.ads.redexgen.X.Po
            r0.<init>(r4, r5)
            throw r0
        L75:
            java.lang.String r5 = r6.getPath()
            java.lang.String r2 = r6.getQuery()
            java.lang.String r1 = r6.getFragment()
            r0 = 3
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r0 = 0
            r3[r0] = r5
            r0 = 1
            r3[r0] = r2
            r0 = 2
            r3[r0] = r1
            r2 = 30
            r1 = 192(0xc0, float:2.69E-43)
            r0 = 111(0x6f, float:1.56E-43)
            java.lang.String r0 = A01(r2, r1, r0)
            java.lang.String r2 = java.lang.String.format(r0, r3)
            r1 = 1004(0x3ec, float:1.407E-42)
            com.facebook.ads.redexgen.X.Po r0 = new com.facebook.ads.redexgen.X.Po
            r0.<init>(r2, r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C04150o.A00(android.net.Uri):java.io.RandomAccessFile");
    }

    @Override // com.facebook.ads.redexgen.X.Q7
    public final Uri A9F() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.Q7
    public final void close() throws C1036Po {
        this.A01 = null;
        try {
            try {
                if (this.A02 != null) {
                    this.A02.close();
                }
                this.A02 = null;
                if (this.A03) {
                    this.A03 = false;
                    if (A05[1].charAt(20) == 'A') {
                        throw new RuntimeException();
                    }
                    A05[7] = "uz9XzfKcDIZebiI3wjwG5MELJoWkELq0";
                    A0E();
                }
            } catch (IOException e8) {
                throw new C1036Po(e8, 2000);
            }
        } catch (Throwable th) {
            this.A02 = null;
            if (this.A03) {
                this.A03 = false;
                A0E();
            }
            throw th;
        }
    }

    @Override // com.facebook.ads.redexgen.X.O9
    @MetaExoPlayerCustomization("FB tracing added in D4783963 for calls to TraceUtil.beginSection and TraceUtil.endSection")
    public final int read(byte[] bArr, int i10, int i11) throws C1036Po {
        if (i11 == 0) {
            return 0;
        }
        try {
            if (this.A00 == 0) {
                return -1;
            }
            try {
                AbstractC1663g5.A02(A01(15, 14, 39));
                int read = ((RandomAccessFile) AbstractC1672gE.A0f(this.A02)).read(bArr, i10, (int) Math.min(this.A00, i11));
                if (read > 0) {
                    this.A00 -= read;
                    A0F(read);
                }
                return read;
            } catch (IOException e8) {
                throw new C1036Po(e8, 2000);
            }
        } finally {
            AbstractC1663g5.A00();
        }
    }
}
