package com.facebook.ads.redexgen.X;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.j3;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.net.ssl.HttpsURLConnection;
/* renamed from: com.facebook.ads.redexgen.X.ae  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1331ae implements JR {
    public static byte[] A07;
    public static String[] A08 = {"QhNFYJC9gEUd0JRpeTZcIYaCPwaofmcY", "H7lFuH2c6lRKE1KzrEc8woYXA3m4qwgD", "VasthUCsKtAfJQ49O69n9k2VDB8sk6Ry", "CLNAbcda3kskZ9l1P61KK9o7E81JDy0P", "FTSbac7VR6oRDuoXxASKkUBG2ay4Jl1O", "oDWQMCtwqliv6oQHoqRk4BTd2HTxQUcC", "maa7C87UpzAlS2qduOc8uqrscl2NkhxH", ""};
    public static final String A09;
    public C8Z A00;
    public Executor A01;
    public boolean A02;
    public JW A03;
    public final InterfaceC0872Jb A04 = new C1337ak();
    public final InterfaceC0877Jg A05;
    public final InterfaceC0878Jh A06;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private final JQ A01(AbstractC0874Jd abstractC0874Jd) throws C0875Je {
        String A072 = A07(220, 7, 86);
        HttpURLConnection httpURLConnection = null;
        JQ jq = null;
        boolean z10 = false;
        try {
            try {
                this.A02 = false;
                HttpURLConnection A082 = A08(abstractC0874Jd.A05(), C7.A04() ? A09() : null);
                A0H(A082, abstractC0874Jd);
                A0G(A082, abstractC0874Jd);
                if (this.A06.AAO()) {
                    this.A06.ABI(A082, abstractC0874Jd.A06());
                }
                A082.connect();
                this.A02 = true;
                Set<String> A01 = this.A03.A01();
                Set<String> A02 = this.A03.A02();
                boolean z11 = (A01 == null || A01.isEmpty()) ? false : true;
                if (A02 != null && !A02.isEmpty()) {
                    z10 = true;
                }
                if ((A082 instanceof HttpsURLConnection) && (z11 || z10)) {
                    try {
                        AbstractC0879Ji.A03((HttpsURLConnection) A082, A01, A02);
                    } catch (CertificateException e8) {
                        this.A00.ABM(A072, AbstractC06048a.A1z, new C06058b(e8));
                    } catch (Exception e10) {
                        this.A00.ABM(A072, AbstractC06048a.A1y, new C06058b(e10));
                    }
                }
                if (A082.getDoOutput() && abstractC0874Jd.A06() != null) {
                    A00(A082, abstractC0874Jd.A06());
                }
                C1332af A06 = A082.getDoInput() ? A06(A082) : new C1332af(A082, null);
                if (this.A06.AAO()) {
                    this.A06.ABJ(A06);
                }
                if (A082 != null) {
                    A082.disconnect();
                }
                return A06;
            } catch (Throwable th) {
                if (this.A06.AAO()) {
                    this.A06.ABJ(null);
                }
                if (0 != 0) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Exception e11) {
            try {
                C1332af A05 = A05(null);
                if (A08[7].length() != 19) {
                    A08[5] = "6Q02gTcavt1J3D6llCgnQfsLExV7BLlB";
                    if (A05 == null || A05.A92() <= 0) {
                        throw new C0875Je(e11, A05);
                    }
                    if (this.A06.AAO()) {
                        this.A06.ABJ(A05);
                    }
                    if (0 != 0) {
                        httpURLConnection.disconnect();
                    }
                    return A05;
                }
                throw new RuntimeException();
            } catch (Exception unused) {
                Log.e(getClass().getSimpleName(), A07(117, 13, 98), e11);
                if (0 == 0 || jq.A92() <= 0) {
                    throw new C0875Je(e11, null);
                }
                if (this.A06.AAO()) {
                    this.A06.ABJ(null);
                }
                if (0 != 0) {
                    httpURLConnection.disconnect();
                }
                return null;
            }
        }
    }

    public static String A07(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 17);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{59, 57, 102, 107, 14, 102, 100, 77, 64, 9, 77, 79, 30, 93, 75, 76, 82, 30, 42, 99, 121, 42, 100, 101, 126, 42, 107, 42, 124, 107, 102, 99, 110, 42, 95, 88, 70, 80, 31, 22, 80, 75, 120, 116, 23, 0, 116, 105, 116, 55, 59, 73, 79, 59, 38, 59, 38, 42, 126, 120, 115, 99, 100, 109, 42, 94, 4, 34, 43, 38, 55, 52, 34, 35, 71, 51, 46, 42, 34, 71, 90, 71, 71, 101, 116, 116, 105, 110, 103, 32, 116, 104, 101, 32, 104, 116, 116, 112, 32, 114, 101, 115, 112, 111, 110, 115, 101, 32, 116, 105, 109, 101, 100, 32, 111, 117, 116, 61, 22, 7, 4, 28, 1, 24, 83, 22, 1, 1, 28, 1, 23, 22, 4, 111, 122, 22, 7, 7, 27, 30, 20, 22, 3, 30, 24, 25, 88, 15, 90, 0, 0, 0, 90, 17, 24, 5, 26, 90, 2, 5, 27, 18, 25, 20, 24, 19, 18, 19, 76, 20, 31, 22, 5, 4, 18, 3, 74, 34, 35, 49, 90, 79, 89, 79, 72, 86, 26, 23, 81, 26, 23, 83, 120, 100, 100, 96, 62, 96, 98, Byte.MAX_VALUE, 104, 105, 88, Byte.MAX_VALUE, 99, 100, 27, 7, 7, 3, 93, 3, 1, 28, 11, 10, 35, 28, 1, 7, 41, 34, 51, 48, 40, 53, 44};
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0121, code lost:
        if (r9 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0127, code lost:
        if (r9.A6s() != null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0129, code lost:
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0149, code lost:
        r3 = r9.A6s().length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0157, code lost:
        if (r9 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x015a, code lost:
        r7 = r29.A00;
        r10 = java.lang.System.currentTimeMillis() - r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0163, code lost:
        if (r30.A04 != null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0165, code lost:
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0167, code lost:
        r7.ABD(r0, r10, 0, r2, 0, new java.util.concurrent.TimeoutException(A07(82, 35, 17)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0182, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0183, code lost:
        r2 = r30.A04.length;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.ads.redexgen.X.JQ A0J(com.facebook.ads.redexgen.X.AbstractC0874Jd r30) throws com.facebook.ads.redexgen.X.C0875Je {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1331ae.A0J(com.facebook.ads.redexgen.X.Jd):com.facebook.ads.redexgen.X.JQ");
    }

    static {
        A0A();
        A09 = JR.class.getSimpleName();
    }

    public C1331ae(JW jw, C8Z c8z, Executor executor) {
        A0B();
        this.A03 = jw;
        this.A06 = new C1329ac(jw.A04());
        this.A05 = new HY(this, this.A06);
        this.A01 = executor;
        this.A00 = c8z;
    }

    private final int A00(HttpURLConnection httpURLConnection, byte[] bArr) throws Exception {
        OutputStream outputStream = null;
        try {
            outputStream = this.A05.AFv(httpURLConnection);
            if (outputStream != null) {
                this.A05.AKD(outputStream, bArr);
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Exception unused) {
                }
            }
            return responseCode;
        } catch (Throwable th) {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    private final JQ A02(AbstractC0874Jd abstractC0874Jd) {
        if (this.A03.A04()) {
            A0C(abstractC0874Jd);
        }
        JQ jq = null;
        try {
            jq = A01(abstractC0874Jd);
            return jq;
        } catch (C0875Je hre) {
            this.A05.AD7(hre);
            return jq;
        } catch (Exception e8) {
            this.A05.AD7(new C0875Je(e8, jq));
            return jq;
        }
    }

    private final JQ A03(String str, C0876Jf c0876Jf, JZ jz) {
        return A02(new C1334ah(str, c0876Jf, jz));
    }

    private final JQ A04(String str, String str2, byte[] bArr, JZ jz) {
        return A02(new C1333ag(str, null, str2, bArr, jz));
    }

    private final C1332af A05(HttpURLConnection httpURLConnection) throws Exception {
        InputStream inputStream = null;
        byte[] responseBody = null;
        try {
            inputStream = httpURLConnection.getErrorStream();
            if (inputStream != null) {
                responseBody = this.A05.AGb(inputStream);
            }
            C1332af c1332af = new C1332af(httpURLConnection, responseBody);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused) {
                }
            }
            return c1332af;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    private final C1332af A06(HttpURLConnection httpURLConnection) throws Exception {
        InputStream inputStream = null;
        byte[] responseBody = null;
        try {
            inputStream = this.A05.AFu(httpURLConnection);
            if (inputStream != null) {
                responseBody = this.A05.AGb(inputStream);
            }
            C1332af c1332af = new C1332af(httpURLConnection, responseBody);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused) {
                }
            }
            return c1332af;
        } catch (Throwable th) {
            String[] strArr = A08;
            if (strArr[3].charAt(2) != strArr[0].charAt(2)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[3] = "UXNjV4lzV2ywD4tdDbD0LjxSkhTqZWDx";
            strArr2[0] = "ckNMQEffDKJwLTwRJSWHE7UL6GsW6bMO";
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    private final HttpURLConnection A08(String str, Proxy proxy) throws IOException {
        try {
            new URL(str);
            TrafficStats.setThreadStatsTag(61453);
            return this.A05.AFt(str, proxy);
        } catch (MalformedURLException e8) {
            throw new IllegalArgumentException(str + A07(18, 19, 27), e8);
        }
    }

    public static Proxy A09() {
        Proxy proxy = Proxy.NO_PROXY;
        String property = System.getProperty(A07(192, 14, 1));
        String proxyAddress = System.getProperty(A07(j3.c.b.f17916g, 14, 98));
        int port = -1;
        if (proxyAddress != null) {
            try {
                port = Integer.parseInt(proxyAddress);
            } catch (NumberFormatException unused) {
                return proxy;
            }
        }
        if (!TextUtils.isEmpty(property) && port > 0 && port <= 65535) {
            return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(property, port));
        }
        return proxy;
    }

    public static synchronized void A0B() {
        synchronized (C1331ae.class) {
            if (CookieHandler.getDefault() == null) {
                CookieHandler.setDefault(new CookieManager());
            }
        }
    }

    private void A0C(AbstractC0874Jd abstractC0874Jd) {
        StringBuilder sb = new StringBuilder(A07(182, 10, 43));
        boolean equals = abstractC0874Jd.A03().equals(EnumC0873Jc.A06);
        String A072 = A07(41, 1, 120);
        if (equals) {
            byte[] A06 = abstractC0874Jd.A06();
            if (A08[1].charAt(0) == 'l') {
                throw new RuntimeException();
            }
            A08[4] = "MgpsgMtpOSh21D9UNcI3ZUtvoefc4JIC";
            if (A06 != null) {
                sb.append(A07(7, 5, 124));
                sb.append(new String(abstractC0874Jd.A06(), Charset.forName(A07(130, 5, 83))));
                sb.append(A072);
            }
        }
        for (Map.Entry<String, String> entry : abstractC0874Jd.A02().A06().entrySet()) {
            sb.append(A07(2, 5, 87));
            sb.append(entry.getKey());
            sb.append(A07(66, 1, 47));
            sb.append(entry.getValue());
            sb.append(A072);
        }
        sb.append(A07(0, 2, 10));
        sb.append(abstractC0874Jd.A05());
        sb.append(A072);
        String sb2 = sb.toString();
        A0E(sb2, 1, (sb2.length() / 4000) + 1);
    }

    private void A0D(AbstractC0874Jd abstractC0874Jd, JS js) {
        this.A04.A6o(this, js, this.A01).A04(abstractC0874Jd);
        if (this.A03.A04()) {
            A0C(abstractC0874Jd);
        }
    }

    private void A0E(String str, int i10, int i11) {
        String str2 = A09 + A07(12, 6, 47) + i10 + A07(65, 1, 96) + i11;
        if (str.length() > 4000) {
            str.substring(0, 4000);
            A0E(str.substring(4000), i10 + 1, i11);
        }
    }

    private void A0F(String str, String str2, byte[] bArr, JS js, JZ jz) {
        C1333ag req = new C1333ag(str, null, str2, bArr, jz);
        A0D(req, js);
    }

    private void A0G(HttpURLConnection httpURLConnection, AbstractC0874Jd abstractC0874Jd) {
        Map<String, String> A06 = abstractC0874Jd.A02().A06();
        JP A05 = abstractC0874Jd.A02().A05();
        for (String str : A06.keySet()) {
            httpURLConnection.setRequestProperty(str, A06.get(str));
        }
        if (A05 != null) {
            Map<String, String> A6W = A05.A6W(this.A03.A03());
            for (String str2 : A6W.keySet()) {
                httpURLConnection.setRequestProperty(str2, A6W.get(str2));
            }
        }
    }

    private final void A0H(HttpURLConnection httpURLConnection, AbstractC0874Jd abstractC0874Jd) throws IOException {
        JZ A02 = abstractC0874Jd.A02();
        httpURLConnection.setConnectTimeout(A02.A00());
        httpURLConnection.setReadTimeout(A02.A02());
        this.A05.AGE(httpURLConnection, abstractC0874Jd.A03(), abstractC0874Jd.A04());
    }

    private final boolean A0I(Throwable th, long j10, AbstractC0874Jd abstractC0874Jd) {
        JZ A02 = abstractC0874Jd.A02();
        long currentTimeMillis = (System.currentTimeMillis() - j10) + 10;
        if (this.A06.AAO()) {
            String str = A07(67, 15, 118) + currentTimeMillis + A07(42, 7, 69) + A02.A00() + A07(49, 7, 10) + A02.A02();
        }
        if (this.A02) {
            int i10 = (currentTimeMillis > A02.A02() ? 1 : (currentTimeMillis == A02.A02() ? 0 : -1));
            if (A08[4].charAt(1) != 'Y') {
                A08[7] = "tgQXMymp9cIZW";
                return i10 >= 0;
            }
            throw new RuntimeException();
        }
        long elapsedTime = A02.A00();
        return currentTimeMillis >= elapsedTime;
    }

    public final JW A0K() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.JR
    @Deprecated
    public final JQ AG4(String str, Map<String, String> parameters) {
        return A03(str, new C0876Jf(parameters), this.A03.A00());
    }

    @Override // com.facebook.ads.redexgen.X.JR
    @Deprecated
    public final JQ AG5(String str, byte[] bArr) {
        return A04(str, A07(135, 47, 102), bArr, this.A03.A00());
    }

    @Override // com.facebook.ads.redexgen.X.JR
    public final void AG6(String str, byte[] bArr, JS js) {
        A0F(str, A07(135, 47, 102), bArr, js, this.A03.A00());
    }
}
