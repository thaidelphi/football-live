package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.google.android.exoplayer2.offline.DownloadRequest;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.concurrent.Executors;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class J7 {
    public static J7 A06;
    public static InterfaceC1098Sb A07;
    public static C1299a5 A08;
    public static InterfaceC1562eR A09;
    public static File A0A;
    public static byte[] A0B;
    public static String[] A0C = {"4y", "AwMrvrZaA3qCUMe4DaWf", "nMell2jjCxhf1iVkS1T4", "JoDZxKxhXC6KTCYPanywHJvOgx3oSz2Q", "c4TvbpAtmy9oRzm3BRhbekxSipSfphPN", "JNxty2uNXQJQugnl9tUmEGg4l4lnFcO6", "Bo5IZ2fGdsUyi7NqIQl4cfXztCU0TldF", "nOSbM9ZPEjvtyh7HAXbSWFPDuf7zpKmZ"};
    public boolean A00;
    public final C1899k0 A03;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final SparseArray<J5> A02 = new SparseArray<>();
    public final Runnable A05 = new J4(this);
    public final InterfaceC1298a4 A04 = new C1341ao(this);

    public static String A08(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 5);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A0B = new byte[]{11, 6, 11, 73, 82, 95, 78, 88, 116, 79, 68, 92, 69, 71, 68, 74, 79, 78, 79, 17, 55, 58, 55, 103, 114, 101, 116, 114, 121, 99, 118, 112, 114, 55, 115, 120, 96, 121, 123, 120, 118, 115, 114, 115, 45, 123, 118, 123, 40, 47, 58, 47, 62, 97, 35, 65, 122, 119, 102, 112, 57, 35, 33, 99, 120, 117, 100, 114, 33, 4, 4, 4, 4, 9, 91, 76, 88, 92, 76, 90, 93, 96, 77, 19, 25, 50, 42, 51, 49, 50, 60, 57, 56, 57, 115, 125, 14, 41, 60, 41, 56, 103, 125, 62, 9, 9, 20, 9, 85, 91, 40, 15, 26, 15, 30, 65, 91, 110, 91, 73, 81, 126, 123, 113, 104, 50, 123, 112, 104, 113, 115, 112, 126, 123, 108, 37, 32, 55, 84, 86, 84, 95, 82};
    }

    static {
        A0D();
    }

    public J7(C1899k0 c1899k0, C1299a5 c1299a5) {
        this.A03 = c1899k0;
        if (c1299a5 != null) {
            A08 = c1299a5;
            c1299a5.A0F(this.A04);
        }
        A03().A0E();
    }

    public static synchronized J7 A01(C1899k0 c1899k0) {
        J7 j72;
        synchronized (J7.class) {
            if (A06 == null) {
                A06 = new J7(c1899k0, null);
            }
            j72 = A06;
        }
        return j72;
    }

    public static synchronized InterfaceC1098Sb A02(Context context) {
        InterfaceC1098Sb interfaceC1098Sb;
        synchronized (J7.class) {
            if (A07 == null) {
                A07 = new X5(context);
            }
            interfaceC1098Sb = A07;
        }
        return interfaceC1098Sb;
    }

    private synchronized C1299a5 A03() {
        A0E();
        return A08;
    }

    private C5K A04() {
        return new C5K().A01(A08(135, 3, 65)).A00(null);
    }

    public static synchronized InterfaceC1562eR A05(Context context) {
        InterfaceC1562eR interfaceC1562eR;
        synchronized (J7.class) {
            if (A09 == null) {
                A09 = new PM(new File(A07(context), A08(121, 14, 26)), new C05074d(C06419m.A0S(context)));
            }
            interfaceC1562eR = A09;
        }
        return interfaceC1562eR;
    }

    public static PX A06(C1041Pt c1041Pt, InterfaceC1562eR interfaceC1562eR) {
        return new PX().A06(interfaceC1562eR).A05(c1041Pt).A04(new C1035Pn()).A03(2);
    }

    public static synchronized File A07(Context context) {
        File file;
        synchronized (J7.class) {
            if (A0A == null) {
                A0A = context.getCacheDir();
                if (A0A == null) {
                    A0A = context.getFilesDir();
                }
            }
            file = A0A;
        }
        return file;
    }

    public static String A09(C1899k0 c1899k0, Uri uri) {
        try {
            if (!C06419m.A1p(c1899k0)) {
                return null;
            }
            return new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), null, uri.getFragment()).toString();
        } catch (URISyntaxException e8) {
            c1899k0.A08().AAu(A08(138, 5, 50), AbstractC06048a.A0u, new C06058b(e8));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A() {
        for (C1278Zk c1278Zk : A03().A0D()) {
            int requestId = c1278Zk.A07.A02.hashCode();
            J5 j52 = this.A02.get(requestId);
            boolean z10 = c1278Zk.A02 == 2 && c1278Zk.A01() > 0;
            String str = A08(69, 15, 44) + requestId + A08(20, 25, 18) + c1278Zk.A00() + A08(0, 20, 46) + c1278Zk.A01() + A08(45, 9, 94) + c1278Zk.A02;
            if (j52 != null) {
                int state = c1278Zk.A02;
                if (state != 3 && !z10 && c1278Zk.A00() < 100.0f) {
                    long A01 = c1278Zk.A01();
                    String[] strArr = A0C;
                    if (strArr[7].charAt(29) == strArr[4].charAt(29)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A0C;
                    strArr2[3] = "Dot6Q3Penl8IgXRyTYIqC6CBr4bXo7x7";
                    strArr2[6] = "9ocSvY8ybipVJ0ZgVUYrz9Eev0RZQ1px";
                    if (A01 <= j52.A00) {
                        if (state == 4 || state == 1) {
                            String str2 = A08(103, 14, 126) + state;
                            j52.A01.AD6(new Throwable(String.valueOf(c1278Zk.A01)));
                            this.A02.remove(requestId);
                        }
                    }
                }
                String str3 = A08(84, 19, 88) + state + A08(54, 8, 6) + c1278Zk.A01();
                j52.A01.ACy(j52.A02);
                this.A02.remove(requestId);
            }
            String str4 = A08(117, 4, 63) + requestId + A08(62, 7, 4) + c1278Zk.A01();
        }
    }

    private void A0B() {
        if (!this.A00) {
            this.A00 = true;
            this.A01.post(this.A05);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C() {
        this.A01.removeCallbacks(this.A05);
        this.A00 = false;
    }

    private synchronized void A0E() {
        if (A08 == null) {
            A08 = new C1299a5(this.A03, A02(this.A03), A05(this.A03), A0H(this.A03), Executors.newFixedThreadPool(6));
            A08.A0F(this.A04);
        }
    }

    public final InterfaceC1509dZ A0H(Context context) {
        return A06(new C1041Pt(context, (InterfaceC1558eN) null, A04()), A05(context));
    }

    public final void A0I(Uri uri, J6 j62, long j10) {
        String cacheKey = A09(this.A03, uri);
        if (cacheKey == null) {
            cacheKey = uri.toString();
        }
        boolean A0J = A0J(cacheKey);
        DownloadRequest A05 = new C1302a8(uri.toString(), uri).A00(cacheKey).A05();
        A03().A0G(A05);
        this.A02.put(A05.A02.hashCode(), new J5(j62, j10, A0J, null));
        A0B();
    }

    public final boolean A0J(String str) {
        return A05(this.A03).A72(str, 0L, 1L) > 0;
    }
}
