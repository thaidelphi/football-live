package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.net.TrafficStats;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: com.facebook.ads.redexgen.X.7t  reason: invalid class name and case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C05987t {
    public static C1D A0A;
    public static List<String> A0B;
    public static byte[] A0C;
    public static String[] A0D = {"9sbbD15", "Lu4K49mlxrSXSmjNh7fbv8QTyeXNNeG", "dxmg93Ac1Ci0DpKcQcYnCSB5QhHSt8Hl", "k6rgF4fsXLHTj2vl", "7FEQyJVT", "NWpMXisSbHx8hQWP", "4pbn9SiXGJE3zFdxdKEeQNSdsbhvbmq3", "cv"};
    public static final String A0E;
    public static final Map<String, C1J> A0F;
    public static final Map<String, C06007v> A0G;
    public long A00;
    public AF A01;
    public final C05997u A03;
    public final AnonymousClass85 A04;
    public final boolean A08;
    public final boolean A09;
    public final Map<String, Bitmap> A07 = Collections.synchronizedMap(new HashMap());
    public final Handler A02 = new Handler(Looper.getMainLooper());
    public final List<Callable<Boolean>> A05 = new ArrayList();
    public final List<Callable<Boolean>> A06 = new ArrayList();

    public static String A08(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 92);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static AtomicBoolean A0D(ArrayList<Callable<Boolean>> arrayList) {
        ArrayList<Future> arrayList2 = new ArrayList(arrayList.size());
        Iterator<Callable<Boolean>> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(D8.A02().submit(it.next()));
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        try {
            for (Future future : arrayList2) {
                Boolean bool = (Boolean) future.get();
                atomicBoolean.set(atomicBoolean.get() && bool != null && bool.booleanValue());
            }
        } catch (InterruptedException | ExecutionException e8) {
            Log.e(A0E, A08(85, 42, 126), e8);
            atomicBoolean.set(false);
        }
        return atomicBoolean;
    }

    public static void A0F() {
        A0C = new byte[]{125, 46, 124, 123, 122, 124, 125, 41, 88, 8, 15, 13, 89, 90, 12, 32, 37, 32, 118, 118, 47, 46, 37, 11, 41, 43, 32, 45, 104, 59, 60, 41, 58, 60, 45, 44, 102, 100, 70, 68, 79, 78, 73, 64, 7, 68, 72, 74, 87, 75, 66, 83, 66, 63, 29, 31, 20, 21, 18, 27, 92, 26, 29, 21, 16, 25, 24, 69, 103, 101, 110, 111, 104, 97, 38, 117, 114, 103, 116, 114, 99, 98, 40, 40, 40, 103, 90, 65, 71, 82, 86, 75, 77, 76, 2, 85, 74, 75, 78, 71, 2, 71, 90, 71, 65, 87, 86, 75, 76, 69, 2, 65, 67, 65, 74, 71, 2, 70, 77, 85, 76, 78, 77, 67, 70, 81, 12, 66, 64, 66, 73, 68, 98, 78, 76, 81, 77, 68, 85, 72, 78, 79, 105, 78, 78, 74, 111, 109, 111, 100, 105, 74, 109, 101, 96, 121, 126, 105, 68, 99, 99, 103, 104, 117, 104, 110, 120, 121, 104, 101, 102, 104, 109, 119, 116, 122, Byte.MAX_VALUE, 68, 111, 114, 118, 126, 68, 118, 104, 89, 66, 69, 93};
    }

    static {
        A0F();
        A0E = C05987t.class.getSimpleName();
        A0F = Collections.synchronizedMap(new HashMap());
        A0G = Collections.synchronizedMap(new HashMap());
    }

    public C05987t(AnonymousClass85 anonymousClass85) {
        this.A04 = anonymousClass85;
        this.A03 = C05997u.A06(anonymousClass85.A02());
        this.A08 = C06419m.A2g(anonymousClass85);
        this.A09 = C06419m.A2p(anonymousClass85, J3.A03());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.ads.redexgen.X.1K] */
    public static synchronized C1D A03(C1899k0 c1899k0) {
        C1D c1d;
        synchronized (C05987t.class) {
            if (A0A == null) {
                A0A = C1E.A00(c1899k0, new Object() { // from class: com.facebook.ads.redexgen.X.1K
                    public int A00;
                    public int A01;
                    public boolean A02;
                    public boolean A03;
                    public boolean A04;

                    public final C1K A00(int i10) {
                        this.A00 = i10;
                        return this;
                    }

                    public final C1K A01(int i10) {
                        this.A01 = i10;
                        return this;
                    }

                    public final C1K A02(boolean z10) {
                        this.A02 = z10;
                        return this;
                    }

                    public final C1K A03(boolean z10) {
                        this.A03 = z10;
                        return this;
                    }

                    public final C1K A04(boolean z10) {
                        this.A04 = z10;
                        return this;
                    }

                    public final C1L A05() {
                        return new C1L(this.A00, this.A02, this.A01, this.A03, this.A04);
                    }
                }.A00(C06419m.A06(c1899k0)).A02(c1899k0.A05().AAD()).A01(-1).A03(C06419m.A0o(c1899k0)).A04(C06419m.A2o(c1899k0)).A05(), A05(c1899k0));
            }
            c1d = A0A;
        }
        return c1d;
    }

    public static C1J A04(AnonymousClass85 anonymousClass85, String str) {
        C1J c1j = A0F.get(str);
        if (C06017w.A06(anonymousClass85) && c1j != null) {
            C1J storedCacheData = new C1J(c1j);
            return storedCacheData;
        }
        C1J storedCacheData2 = new C1J(str);
        return storedCacheData2;
    }

    public static C1904k5 A05(C1899k0 c1899k0) {
        return new C1904k5(c1899k0);
    }

    public static synchronized List<String> A09(AnonymousClass85 anonymousClass85) {
        List<String> list;
        synchronized (C05987t.class) {
            if (A0B == null) {
                A0B = new ArrayList();
                A0J(A0B, anonymousClass85);
            }
            list = A0B;
        }
        return list;
    }

    public static /* synthetic */ Map A0A() {
        Map<String, C06007v> map = A0G;
        if (A0D[7].length() != 16) {
            A0D[6] = "WjQPXn0MHZbTNsTxKlY7B5aUAaJR9kiv";
            return map;
        }
        throw new RuntimeException();
    }

    public static void A0H(AnonymousClass85 anonymousClass85, String str) {
        if (C06017w.A06(anonymousClass85) && !TextUtils.isEmpty(str)) {
            C06007v c06007v = A0G.get(str);
            if (A0D[7].length() == 16) {
                throw new RuntimeException();
            }
            A0D[6] = "a10tGuQmEwUEP0sxRmqxEmZkNnUikCvX";
            if (c06007v != null) {
                c06007v.A00 = A08(185, 4, 118);
                C1899k0 A02 = anonymousClass85.A02();
                J7 A01 = J7.A01(A02);
                String A09 = J7.A09(A02, C5.A00(str));
                if (A09 == null) {
                    A09 = str;
                }
                C06017w.A04(anonymousClass85, c06007v, A01.A0J(A09));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I(AE ae) {
        if (this.A01 == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(A08(173, 12, 71), C0709Cu.A05(this.A00));
        this.A01.A04(ae, hashMap);
    }

    public static void A0J(List<String> cacheDirs, AnonymousClass85 anonymousClass85) {
        A0K(cacheDirs, C2119nd.A01(anonymousClass85));
        A0K(cacheDirs, C05997u.A07(anonymousClass85));
    }

    public static void A0K(List<String> list, File file) {
        String path;
        if (file == null || (path = file.getPath()) == null) {
            return;
        }
        String path2 = A08(0, 0, 103);
        if (path != path2) {
            Locale locale = Locale.getDefault();
            String path3 = A0D[4];
            if (path3.length() == 2) {
                throw new RuntimeException();
            }
            A0D[4] = "BAOa9xP";
            String path4 = path.toLowerCase(locale);
            list.add(path4);
        }
    }

    public final Bitmap A0M(String str) {
        return this.A07.get(str);
    }

    public final Bitmap A0N(String str, int i10, int i11) {
        if (this.A08) {
            C1J A04 = A04(this.A04, str);
            A04.A03 = A08(185, 4, 118);
            A04.A01 = i11;
            A04.A00 = i10;
            return A03(this.A04.A02()).AHk(A04, true).A00();
        }
        return this.A03.A0E(this.A04, str, i10, i11, A08(169, 4, 85));
    }

    public final File A0O(String str) {
        C1J A04 = A04(this.A04, str);
        A04.A03 = A08(185, 4, 118);
        return A03(this.A04.A02()).AHl(A04);
    }

    public final File A0P(String str) {
        if (this.A08) {
            return A0O(str);
        }
        return this.A03.A0F(str);
    }

    public final String A0Q(String str) {
        if (this.A08) {
            return A0R(str);
        }
        return this.A03.A0G(str);
    }

    public final String A0R(String str) {
        C1J A04 = A04(this.A04, str);
        A04.A03 = A08(185, 4, 118);
        String AHn = A03(this.A04.A02()).AHn(A04);
        return AHn != null ? AHn : str;
    }

    public final String A0S(String str) {
        if (this.A09) {
            A0H(this.A04, str);
            return str;
        }
        return A0R(str);
    }

    public final void A0T() {
        AbstractC0669Au.A05(A08(127, 19, 125), A08(37, 16, 123), A08(0, 8, 20));
    }

    public final void A0U() {
        AbstractC0669Au.A05(A08(146, 16, 80), A08(53, 14, 32), A08(8, 7, 50));
    }

    public final void A0V() {
        this.A07.clear();
    }

    public final void A0W(InterfaceC05907l interfaceC05907l, C05917m c05917m) {
        AbstractC0669Au.A05(A08(162, 7, 81), A08(67, 18, 90), A08(15, 8, 75));
        this.A00 = System.currentTimeMillis();
        C06017w.A02(this.A04, c05917m, C06017w.A07, A08(23, 14, 20), -1L);
        D8.A03().execute(new C1905k6(this, new ArrayList(this.A05), c05917m, interfaceC05907l, new ArrayList(this.A06)));
        this.A05.clear();
        this.A06.clear();
    }

    public final void A0X(C05947p c05947p) {
        this.A05.add(new CallableC05957q(this, c05947p));
    }

    public final void A0Y(C05947p c05947p) {
        c05947p.A05 = true;
        this.A06.add(new CallableC05957q(this, c05947p));
    }

    public final void A0Z(C05947p c05947p) {
        c05947p.A05 = true;
        if (this.A09) {
            this.A06.add(new CallableC05937o(this, c05947p));
        } else {
            this.A06.add(new CallableC05957q(this, c05947p));
        }
    }

    public final void A0a(C05947p c05947p) {
        if (this.A09) {
            this.A05.add(new CallableC05937o(this, c05947p));
        } else {
            this.A05.add(new CallableC05957q(this, c05947p));
        }
    }

    public final void A0b(final C05967r c05967r) {
        Callable<Boolean> callable = new Callable<Boolean>(c05967r) { // from class: com.facebook.ads.redexgen.X.7s
            public static byte[] A02;
            public final C05967r A00;

            static {
                A02();
            }

            public static String A01(int i10, int i11, int i12) {
                byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
                for (int i13 = 0; i13 < copyOfRange.length; i13++) {
                    copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 2);
                }
                return new String(copyOfRange);
            }

            public static void A02() {
                A02 = new byte[]{-35, -31, -43, -37, -39};
            }

            {
                this.A00 = c05967r;
            }

            private final Boolean A00() {
                AnonymousClass85 anonymousClass85;
                boolean z10;
                C05997u c05997u;
                boolean z11;
                boolean z12;
                AnonymousClass85 anonymousClass852;
                C1D A03;
                Map map;
                if (BQ.A02(this)) {
                    return null;
                }
                try {
                    TrafficStats.setThreadStatsTag(61453);
                    C1J c1j = new C1J(this.A00.A07, this.A00.A06, this.A00.A05, A01(0, 5, 114), this.A00.A01, this.A00.A02);
                    c1j.A01 = this.A00.A04;
                    c1j.A00 = this.A00.A03;
                    anonymousClass85 = C05987t.this.A04;
                    if (C06017w.A06(anonymousClass85)) {
                        map = C05987t.A0F;
                        map.put(this.A00.A07, c1j);
                    }
                    z10 = C05987t.this.A08;
                    boolean precacheResult = false;
                    if (!z10) {
                        c05997u = C05987t.this.A03;
                        if (c05997u.A0D(this.A00) != null) {
                            precacheResult = true;
                        }
                    } else {
                        anonymousClass852 = C05987t.this.A04;
                        A03 = C05987t.A03(anonymousClass852.A02());
                        precacheResult = A03.AHk(c1j, false).A01();
                    }
                    C7z c7z = this.A00.A00;
                    if (c7z != null && c7z.A02()) {
                        int A00 = c7z.A00();
                        int A01 = c7z.A01();
                        if (A00 <= 0 || A01 <= 0) {
                            z11 = C05987t.this.A08;
                            if (z11) {
                                A04(this.A00.A07, c1j);
                            } else {
                                A03(this.A00.A03, this.A00.A04);
                            }
                        } else {
                            z12 = C05987t.this.A08;
                            if (z12) {
                                c1j.A00 = A00;
                                c1j.A01 = A01;
                                A04(this.A00.A07, c1j);
                            } else {
                                A03(A00, A01);
                            }
                        }
                    }
                    return Boolean.valueOf(precacheResult);
                } catch (Throwable th) {
                    BQ.A00(th, this);
                    return null;
                }
            }

            private void A03(int i10, int i11) {
                C05997u c05997u;
                AnonymousClass85 anonymousClass85;
                Map map;
                c05997u = C05987t.this.A03;
                anonymousClass85 = C05987t.this.A04;
                Bitmap A0E2 = c05997u.A0E(anonymousClass85, this.A00.A07, i10, i11, this.A00.A01);
                if (A0E2 == null) {
                    return;
                }
                map = C05987t.this.A07;
                map.put(this.A00.A07, A0E2);
            }

            private void A04(String str, C1J c1j) {
                AnonymousClass85 anonymousClass85;
                C1D A03;
                Map map;
                anonymousClass85 = C05987t.this.A04;
                A03 = C05987t.A03(anonymousClass85.A02());
                Bitmap A00 = A03.AHk(c1j, true).A00();
                if (A00 == null) {
                    return;
                }
                map = C05987t.this.A07;
                map.put(str, A00);
            }

            @Override // java.util.concurrent.Callable
            public final /* bridge */ /* synthetic */ Boolean call() throws Exception {
                if (BQ.A02(this)) {
                    return null;
                }
                try {
                    return A00();
                } catch (Throwable th) {
                    BQ.A00(th, this);
                    return null;
                }
            }
        };
        if (!c05967r.A02) {
            this.A05.add(callable);
        } else {
            this.A06.add(callable);
        }
    }

    public final void A0c(C05967r c05967r) {
        c05967r.A02 = true;
        A0b(c05967r);
    }

    public final void A0d(AF af) {
        this.A01 = af;
    }
}
