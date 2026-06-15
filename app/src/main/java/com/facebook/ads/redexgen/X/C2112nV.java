package com.facebook.ads.redexgen.X;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.nV  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C2112nV implements C1X {
    public static String A07;
    public static byte[] A08;
    public static String[] A09 = {"76RHNajjOom", "Mjpn3pRzDJalybdRDXibpwNEIm", "yniKdbkjQS3x88FVx9CeVftqblxxQhpu", "Bjsdcl6Zd1aHs", "xxeVE5WeJXBB6h2Smwfm1cLqVC", "jWBIYbGBA8wTLtSAwtOQxldoJ8", "SNbZ6FPeFicMqudBak9DrYkQXr", "PSBHzZzFGATU6u0TdgIgliGoBbccT2bp"};
    public int A00;
    public InputStream A01;
    public HttpURLConnection A02;
    public final String A03;
    public volatile int A04;
    public volatile int A05;
    public volatile String A06;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 4);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A08 = new byte[]{43, 98, 120, 43, 98, 101, Byte.MAX_VALUE, 110, 121, 121, 126, 123, Byte.MAX_VALUE, 110, 111, 33, 117, 110, 33, 102, 49, 47, 50, 46, 102, 41, 32, 32, 53, 35, 50, 102, 108, 96, 35, 47, 46, 52, 37, 46, 52, 109, 44, 37, 46, 39, 52, 40, 122, 96, 5, 20, 14, 77, 65, 64, 64, 75, 77, 90, 71, 65, 64, 14, 71, 93, 14, 79, 76, 93, 75, 64, 90, 15, 20, 56, 57, 35, 50, 57, 35, 119, 62, 57, 49, 56, 119, 49, 56, 37, 119, 55, 24, 47, 47, 50, 47, 125, 57, 52, 46, 62, 50, 51, 51, 56, 62, 41, 52, 51, 58, 125, 21, 41, 41, 45, 8, 47, 49, 30, 50, 51, 51, 56, 62, 41, 52, 50, 51, 21, 34, 34, 63, 34, 112, 54, 53, 36, 51, 56, 57, 62, 55, 112, 57, 62, 54, 63, 112, 54, 34, 63, 61, 112, 27, 44, 44, 49, 44, 126, 49, 46, 59, 48, 55, 48, 57, 126, 61, 49, 48, 48, 59, 61, 42, 55, 49, 48, 126, 56, 49, 44, 126, 35, 20, 20, 9, 20, 70, 20, 3, 7, 2, 15, 8, 1, 70, 2, 7, 18, 7, 70, 0, 20, 9, 11, 70, 92, 96, 96, 100, 65, 102, 120, 71, 123, 97, 102, 119, 113, 111, 97, 102, 120, 41, 51, 101, 70, 74, 72, 93, 64, 70, 71, 0, 63, 42, 33, 111, 44, 32, 33, 33, 42, 44, 59, 38, 32, 33, 111, 85, 102, 105, 96, 98, 109, 90, 94, 91, 31, 92, 80, 81, 75, 90, 81, 75, 31, 86, 81, 89, 80, 31, 89, 77, 80, 82, 31, 106, 93, 89, 92, 81, 86, 95, 24, 75, 87, 77, 74, 91, 93, 24, 33, 26, 26, 85, 24, 20, 27, 12, 85, 7, 16, 17, 28, 7, 16, 22, 1, 6, 79, 85, 92, 6, 28, 81, 85, 81, 89, 6, 28, 30, 5, 8, 25, 15, 65, 99};
    }

    static {
        A04();
        A07 = C2112nV.class.getSimpleName();
    }

    public C2112nV(String str) {
        this(str, C1V.A01(str));
    }

    public C2112nV(String str, int i10) {
        this(str);
        this.A00 = i10;
    }

    public C2112nV(String str, String str2) {
        this.A05 = RecyclerView.UNDEFINED_DURATION;
        this.A00 = -1;
        this.A03 = (String) C1W.A00(str);
        this.A06 = str2;
    }

    private int A00(HttpURLConnection httpURLConnection, int i10, int i11) throws IOException {
        int contentLength = httpURLConnection.getContentLength();
        return i11 == 200 ? contentLength : i11 == 206 ? contentLength + i10 : this.A05;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c9, code lost:
        if (r6 != 302) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00cd, code lost:
        if (r6 != 303) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00eb, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f9, code lost:
        if (r6 != 302) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0106 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.net.HttpURLConnection A02(int r9, int r10) throws java.io.IOException, com.facebook.ads.redexgen.X.C2114nX {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C2112nV.A02(int, int):java.net.HttpURLConnection");
    }

    private void A03() throws C2114nX {
        String str = A01(255, 23, 59) + this.A03;
        HttpURLConnection httpURLConnection = null;
        InputStream inputStream = null;
        try {
            try {
                httpURLConnection = A02(0, UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS);
                this.A05 = httpURLConnection.getContentLength();
                this.A06 = httpURLConnection.getContentType();
                inputStream = httpURLConnection.getInputStream();
                Log.i(A07, A01(74, 18, 83) + this.A03 + A01(313, 9, 56) + this.A06 + A01(32, 18, 68) + this.A05);
                C1V.A05(inputStream);
                if (httpURLConnection == null) {
                    return;
                }
            } catch (IOException e8) {
                Log.e(A07, A01(129, 25, 84) + this.A03, e8);
                C1V.A05(inputStream);
                if (httpURLConnection == null) {
                    return;
                }
            }
            httpURLConnection.disconnect();
        } catch (Throwable th) {
            C1V.A05(inputStream);
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }

    private final void A05(int i10, int i11) throws C2114nX {
        try {
            this.A02 = A02(i10, i11);
            this.A06 = this.A02.getContentType();
            this.A01 = new BufferedInputStream(this.A02.getInputStream(), 8192);
            this.A05 = A00(this.A02, i10, this.A02.getResponseCode());
        } catch (IOException e8) {
            throw new C2114nX(A01(154, 29, 90) + this.A03 + A01(19, 13, 66) + i10, e8);
        }
    }

    public final int A06() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.C1X
    public final void AFr(int i10) throws C2114nX {
        A05(i10, this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.C1X
    public final void close() throws C2114nX {
        if (this.A02 != null) {
            try {
                this.A02.disconnect();
            } catch (NullPointerException e8) {
                throw new C2114nX(A01(92, 37, 89), e8);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C1X
    public final synchronized int length() throws C2114nX {
        if (this.A05 == Integer.MIN_VALUE) {
            A03();
        }
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.C1X
    public final int read(byte[] bArr) throws C2114nX {
        InputStream inputStream = this.A01;
        String A01 = A01(183, 24, 98);
        if (inputStream != null) {
            try {
                return this.A01.read(bArr, 0, bArr.length);
            } catch (InterruptedIOException e8) {
                throw new NO(A01(278, 15, 60) + this.A03 + A01(0, 15, 15), e8);
            } catch (IOException e10) {
                throw new C2114nX(A01 + this.A03, e10);
            }
        }
        throw new C2114nX(A01 + this.A03 + A01(51, 23, 42));
    }

    public final String toString() {
        return A01(207, 19, 16) + this.A03 + A01(328, 1, 26);
    }
}
