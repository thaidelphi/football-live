package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.protobuf.CodedOutputStream;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* renamed from: com.facebook.ads.redexgen.X.0p  reason: invalid class name and case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C04160p extends AbstractC05325e implements C5A {
    public static byte[] A0G;
    public static String[] A0H = {"AHTh3LA", "dz9dBpIjsUhtDgGieeCPe537sIDjFabE", "w2cOblChiabhIBK2wmaThN4UxbXYE62t", "xoeUGL4eue58TuIto061cWyCqVAw3O1z", "gq8eFqwTQJvrhbPMke", "RYAI5nESuWZ2rhTI63kEoTOBdt3hOueO", "RDHxxAAMbCEIS74NmBfQosd5J71Yw", "p9GjEcAytNVfsoqugLJlSuHeg4U"};
    @MetaExoPlayerCustomization
    public static final Pattern A0I;
    @MetaExoPlayerCustomization("Meta Specific, added in D30556310")
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public C1519dj A04;
    public InterfaceC1791iE<String> A05;
    public InputStream A06;
    public HttpURLConnection A07;
    public boolean A08;
    public final int A09;
    public final int A0A;
    public final C1529du A0B;
    public final C1529du A0C;
    public final String A0D;
    public final boolean A0E;
    public final boolean A0F;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0G, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 18);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @MetaExoPlayerCustomization("Meta Specific, added in D4001689 for 'Handling loopback Address'")
    private HttpURLConnection A05(URL url, int i10, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map<String, String> map) throws IOException {
        HttpURLConnection A04;
        String A02;
        if (InetAddress.getByName(url.getHost()).isLoopbackAddress()) {
            Proxy proxy = Proxy.NO_PROXY;
            if (A0H[4].length() == 18) {
                A0H[7] = "05ili6syMLXE64p9WlTtyQYQXmn";
                A04 = A06(url, proxy);
            }
            throw new RuntimeException();
        }
        A04 = A04(url);
        A04.setConnectTimeout(this.A09);
        A04.setReadTimeout(this.A0A);
        HashMap hashMap = new HashMap();
        if (this.A0B != null) {
            hashMap.putAll(this.A0B.A00());
        }
        hashMap.putAll(this.A0C.A00());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            A04.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String A03 = AbstractC1530dv.A03(j10, j11);
        if (A03 != null) {
            A04.setRequestProperty(A02(172, 5, 112), A03);
        }
        if (this.A0D != null) {
            if (A0H[0].length() != 7) {
                A0H[6] = "nUFvo5Fq7cIKliBrHLEx9u4WbPaUq";
                A04.setRequestProperty(A02(317, 0, 22), this.A0D);
            } else {
                A0H[5] = "SIgd87NqbA3VQEmghn03KStHVMo9tfsp";
                A04.setRequestProperty(A02(317, 10, 29), this.A0D);
            }
        }
        if (!z10) {
            A02 = A02(503, 8, 96);
        } else if (A0H[5].charAt(11) != 'P') {
            A0H[2] = "Uigxz3QATBDf8AixCgPxzMGxP4fMNuyH";
            A02 = A02(490, 4, 64);
        } else {
            A02 = A02(490, 4, 64);
        }
        A04.setRequestProperty(A02(5, 15, 103), A02);
        A04.setInstanceFollowRedirects(z11);
        A04.setDoOutput(bArr != null);
        A04.setRequestMethod(C1519dj.A01(i10));
        if (bArr != null) {
            int length = bArr.length;
            if (A0H[7].length() == 27) {
                A0H[6] = "vuHDFK0PP89aN4hQ5ZKf3JaHZS7DL";
                A04.setFixedLengthStreamingMode(length);
                A04.connect();
                OutputStream outputStream = A04.getOutputStream();
                outputStream.write(bArr);
                outputStream.close();
            }
            throw new RuntimeException();
        }
        A04.connect();
        return A04;
    }

    public static void A09() {
        A0G = new byte[]{104, 60, 39, 104, 77, 52, 22, 22, 16, 5, 1, 88, 48, 27, 22, 26, 17, 28, 27, 18, 55, 27, 26, 0, 17, 26, 0, 89, 49, 26, 23, 27, 16, 29, 26, 19, 49, 29, 28, 6, 23, 28, 6, 95, 62, 23, 28, 21, 6, 26, 8, 36, 37, 63, 46, 37, 63, 102, 25, 42, 37, 44, 46, 97, 64, 67, 68, 80, 73, 81, 109, 81, 81, 85, 97, 68, 81, 68, 118, 74, 80, 87, 70, 64, 61, 16, 10, 24, 21, 21, 22, 14, 28, 29, 89, 26, 11, 22, 10, 10, 84, 9, 11, 22, 13, 22, 26, 22, 21, 89, 11, 28, 29, 16, 11, 28, 26, 13, 89, 81, 123, 92, 81, 93, 92, 65, 91, 65, 70, 87, 92, 70, 18, 90, 87, 83, 86, 87, 64, 65, 18, 105, 106, 73, 69, 71, 82, 79, 73, 72, 108, 87, 78, 78, 2, 78, 77, 65, 67, 86, 75, 77, 76, 2, 80, 71, 70, 75, 80, 71, 65, 86, 48, 3, 12, 5, 7, 56, 3, 3, 76, 1, 13, 2, 21, 76, 30, 9, 8, 5, 30, 9, 15, 24, 31, 86, 76, 0, 59, 48, 45, 37, 48, 54, 33, 48, 49, 117, 22, 58, 59, 33, 48, 59, 33, 120, 25, 48, 59, 50, 33, 61, 117, 14, 7, 60, 55, 42, 34, 55, 49, 38, 55, 54, 114, 17, 61, 60, 38, 55, 60, 38, Byte.MAX_VALUE, 0, 51, 60, 53, 55, 114, 9, 15, 52, 63, 34, 42, 63, 57, 46, 63, 62, 122, 63, 40, 40, 53, 40, 122, 45, 50, 51, 54, 63, 122, 62, 51, 41, 57, 53, 52, 52, 63, 57, 46, 51, 52, 61, Byte.MAX_VALUE, 68, 89, 95, 90, 90, 69, 88, 94, 79, 78, 10, 90, 88, 69, 94, 69, 73, 69, 70, 10, 88, 79, 78, 67, 88, 79, 73, 94, 16, 10, 90, 124, 106, 125, 34, 78, 104, 106, 97, 123, 1, 48, 77, 54, 71, 123, 96, 109, 124, 106, 57, 49, 69, 125, 50, 48, 52, 49, 69, 125, 50, 48, 54, 49, 69, 125, 50, 48, 61, 40, 36, 38, 101, 42, 37, 47, 57, 36, 34, 47, 101, 36, 32, 35, 63, 63, 59, 101, 34, 37, 63, 46, 57, 37, 42, 39, 101, 35, 63, 63, 59, 101, 3, 63, 63, 59, 31, 57, 42, 37, 56, 59, 36, 57, 63, 111, 8, 35, 62, 37, 32, 46, 47, 2, 37, 59, 62, 63, 24, 63, 57, 46, 42, 38, 117, 121, 123, 56, 119, 120, 114, 100, 121, Byte.MAX_VALUE, 114, 56, 121, 125, 126, 98, 98, 102, 56, Byte.MAX_VALUE, 120, 98, 115, 100, 120, 119, 122, 56, 126, 98, 98, 102, 56, 94, 98, 98, 102, 66, 100, 119, 120, 101, 102, 121, 100, 98, 50, 80, Byte.MAX_VALUE, 110, 115, 114, 90, 115, 120, 113, 98, 126, 95, 120, 102, 99, 98, 69, 98, 100, 115, 119, 123, 53, 40, 59, 34, 97, 125, 125, 121, 118, 106, 106, 110, 109, 27, 22, 23, 28, 6, 27, 6, 11, 53, 46, 37, 56, 48, 37, 35, 52, 37, 36, 5, 46, 36, 15, 38, 9, 46, 48, 53, 52};
    }

    static {
        A09();
        A0I = Pattern.compile(A02(331, 25, 11));
    }

    @Deprecated
    public C04160p() {
        this(null, 8000, 8000);
    }

    @Deprecated
    public C04160p(String str, int i10, int i11) {
        this(str, i10, i11, false, null);
    }

    @Deprecated
    public C04160p(String str, int i10, int i11, boolean z10, C1529du c1529du) {
        this(str, i10, i11, z10, c1529du, null, false);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.iE != com.google.common.base.Predicate<java.lang.String> */
    public C04160p(String str, int i10, int i11, boolean z10, C1529du c1529du, InterfaceC1791iE<String> interfaceC1791iE, boolean z11) {
        super(true);
        this.A00 = -1;
        this.A0D = str;
        this.A09 = i10;
        this.A0A = i11;
        this.A0E = z10;
        this.A0B = c1529du;
        this.A05 = interfaceC1791iE;
        this.A0C = new C1529du();
        this.A0F = z11;
    }

    private int A00(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.A03;
        if (A0H[2].charAt(26) != 'c') {
            String[] strArr = A0H;
            strArr[3] = "J6yI0Ooy9noLCilbQHXUkK5VbFrVOQMs";
            strArr[1] = "E23cNHplIFmbNtbK16bNfBaSwk52GYz5";
            if (j10 != -1) {
                long bytesRemaining = this.A03 - this.A02;
                if (bytesRemaining == 0) {
                    return -1;
                }
                i11 = (int) Math.min(i11, bytesRemaining);
            }
            int read = ((InputStream) AbstractC1672gE.A0f(this.A06)).read(bArr, i10, i11);
            if (read == -1) {
                return -1;
            }
            this.A02 += read;
            A0F(read);
            return read;
        }
        throw new RuntimeException();
    }

    @MetaExoPlayerCustomization
    public static long A01(HttpURLConnection httpURLConnection) {
        long j10 = -1;
        String headerField = httpURLConnection.getHeaderField(A02(36, 14, 96));
        boolean isEmpty = TextUtils.isEmpty(headerField);
        String A02 = A02(327, 1, 78);
        String A022 = A02(63, 21, 55);
        if (!isEmpty) {
            try {
                j10 = Long.parseLong(headerField);
            } catch (NumberFormatException unused) {
                AbstractC1633fb.A05(A022, A02(197, 27, 71) + headerField + A02);
            }
        }
        String headerField2 = httpURLConnection.getHeaderField(A02(50, 13, 89));
        if (!TextUtils.isEmpty(headerField2)) {
            Matcher matcher = A0I.matcher(headerField2);
            if (matcher.find()) {
                try {
                    long parseLong = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                    if (j10 < 0) {
                        return parseLong;
                    }
                    if (j10 != parseLong) {
                        AbstractC1633fb.A07(A022, A02(120, 22, 32) + headerField + A02(328, 3, 127) + headerField2 + A02);
                        j10 = Math.max(j10, parseLong);
                        return j10;
                    }
                    return j10;
                } catch (NumberFormatException unused2) {
                    AbstractC1633fb.A05(A022, A02(224, 26, 64) + headerField2 + A02);
                    return j10;
                }
            }
            return j10;
        }
        return j10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b2, code lost:
        return r14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.net.HttpURLConnection A03(com.facebook.ads.redexgen.X.C1519dj r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C04160p.A03(com.facebook.ads.redexgen.X.dj):java.net.HttpURLConnection");
    }

    private final HttpURLConnection A04(URL url) throws IOException {
        return (HttpURLConnection) url.openConnection();
    }

    @MetaExoPlayerCustomization
    private final HttpURLConnection A06(URL url, Proxy proxy) throws IOException {
        return (HttpURLConnection) url.openConnection(proxy);
    }

    private URL A07(URL url, String str, C1519dj c1519dj) throws C1033Pl {
        if (str == null) {
            throw new C1033Pl(A02(IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, 22, 48), c1519dj, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!A02(498, 5, 12).equals(protocol) && !A02(494, 4, 27).equals(protocol)) {
                throw new C1033Pl(A02(286, 31, 56) + protocol, c1519dj, 2001, 1);
            }
            if (!this.A0E && !protocol.equals(url.getProtocol())) {
                throw new C1033Pl(A02(84, 36, 107) + url.getProtocol() + A02(0, 4, 90) + protocol + A02(4, 1, 118), c1519dj, 2001, 1);
            }
            return url2;
        } catch (MalformedURLException e8) {
            throw new C1033Pl(e8, c1519dj, 2001, 1);
        }
    }

    private void A08() {
        if (this.A07 != null) {
            try {
                this.A07.disconnect();
            } catch (Exception e8) {
                AbstractC1633fb.A08(A02(63, 21, 55), A02(IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, 36, 72), e8);
            }
            if (A0H[7].length() != 27) {
                throw new RuntimeException();
            }
            A0H[6] = "GyUr1AByEotWO4zvLC3vzlc3xeB6u";
            this.A07 = null;
        }
    }

    private void A0A(long j10, C1519dj c1519dj) throws IOException {
        if (j10 == 0) {
            return;
        }
        byte[] bArr = new byte[CodedOutputStream.DEFAULT_BUFFER_SIZE];
        while (j10 > 0) {
            int read = ((InputStream) AbstractC1672gE.A0f(this.A06)).read(bArr, 0, (int) Math.min(j10, bArr.length));
            if (!Thread.currentThread().isInterrupted()) {
                if (read != -1) {
                    j10 -= read;
                    A0F(read);
                } else {
                    throw new C1033Pl(c1519dj, AdError.REMOTE_ADS_SERVICE_ERROR, 1);
                }
            } else {
                throw new C1033Pl(new InterruptedIOException(), c1519dj, 2000, 1);
            }
        }
    }

    public static void A0B(HttpURLConnection httpURLConnection, long j10) {
        if (httpURLConnection == null || AbstractC1672gE.A02 < 19 || AbstractC1672gE.A02 > 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j10 == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (A0H[6].length() != 29) {
                throw new RuntimeException();
            } else {
                A0H[7] = "VEux1xEU6LE0nndVxLVDdVqeGR8";
                if (j10 <= 2048) {
                    return;
                }
            }
            String name = inputStream.getClass().getName();
            if (A02(356, 65, 89).equals(name) || A02(421, 69, 4).equals(name)) {
                Method declaredMethod = ((Class) AbstractC1589es.A01(inputStream.getClass().getSuperclass())).getDeclaredMethod(A02(511, 20, 82), new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, new Object[0]);
            }
        } catch (Exception unused) {
        }
    }

    public static boolean A0C(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField(A02(20, 16, 102));
        String contentEncoding = A02(490, 4, 64);
        return contentEncoding.equalsIgnoreCase(headerField);
    }

    public final void A0I(String str, String str2) {
        AbstractC1589es.A01(str);
        AbstractC1589es.A01(str2);
        this.A0C.A01(str, str2);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05325e, com.facebook.ads.redexgen.X.Q7
    public final Map<String, List<String>> A8j() {
        if (this.A07 == null) {
            return AbstractC2005lm.A04();
        }
        return new C5J(this.A07.getHeaderFields());
    }

    @Override // com.facebook.ads.redexgen.X.Q7
    public final Uri A9F() {
        if (this.A07 == null) {
            return null;
        }
        return Uri.parse(this.A07.getURL().toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x011a, code lost:
        if (r11 == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x011c, code lost:
        r0 = (A01(r7) > (-1) ? 1 : (A01(r7) == (-1) ? 0 : -1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0126, code lost:
        if (r18.A03 == (-1)) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0128, code lost:
        r17.A03 = r18.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x012f, code lost:
        r8 = com.facebook.ads.redexgen.X.AbstractC1530dv.A01(r7.getHeaderField(A02(36, 14, 96)), r7.getHeaderField(r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0147, code lost:
        if (r8 == (-1)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0149, code lost:
        r2 = r8 - r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x014b, code lost:
        r17.A03 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x015a, code lost:
        if (r11 == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x015d, code lost:
        r17.A03 = r18.A03;
     */
    @Override // com.facebook.ads.redexgen.X.Q7
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("customizations: (1) loop commented 'Append headers from data spec' (D6487388,D6506073) (2) ischunkedTransfer (D15078204)")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long AFq(final com.facebook.ads.redexgen.X.C1519dj r18) throws com.facebook.ads.redexgen.X.C1033Pl {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C04160p.AFq(com.facebook.ads.redexgen.X.dj):long");
    }

    @Override // com.facebook.ads.redexgen.X.Q7
    public final void close() throws C1033Pl {
        try {
            InputStream inputStream = this.A06;
            if (inputStream != null) {
                A0B(this.A07, this.A03 != -1 ? this.A03 - this.A02 : -1L);
                try {
                    inputStream.close();
                } catch (IOException e8) {
                    throw new C1033Pl(e8, (C1519dj) AbstractC1672gE.A0f(this.A04), 2000, 3);
                }
            }
            this.A06 = null;
            A08();
            if (this.A08) {
                this.A08 = false;
                A0E();
            }
        } catch (Throwable th) {
            this.A06 = null;
            A08();
            if (this.A08) {
                this.A08 = false;
                if (A0H[2].charAt(26) == 'c') {
                    throw new RuntimeException();
                }
                A0H[2] = "KbhwiyEXQ1AE1rdlVyrO0sE4Wca7u4tn";
                A0E();
            }
            throw th;
        }
    }

    @Override // com.facebook.ads.redexgen.X.O9
    public final int read(byte[] bArr, int i10, int i11) throws C1033Pl {
        try {
            return A00(bArr, i10, i11);
        } catch (IOException e8) {
            throw C1033Pl.A03(e8, (C1519dj) AbstractC1672gE.A0f(this.A04), 2);
        }
    }
}
