package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import android.os.Build;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: com.facebook.ads.redexgen.X.98  reason: invalid class name */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class AnonymousClass98 {
    public static String A00;
    public static CM A01;
    public static byte[] A02;
    public static String[] A03 = {"voSC7", "XZAhka0CvCOYv4I2O5x3YaAw3CbuYBFN", "p9gqIJ2nr", "98tXqko6jTMLdbqfVFP5nvRcnbiOcAti", "T2H4NPeAA8j3XC4jkS0zz8rIAu9TBODq", "PgqQ", "DWYdqAxgZwpx5TFll0r56voildH8EXHj", "oGCSEutn0BLuvxJJ07JBH6t"};
    public static final Map<String, Integer> A04;
    public static final AtomicInteger A05;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A03;
            if (strArr[3].charAt(19) != strArr[6].charAt(19)) {
                throw new RuntimeException();
            }
            A03[1] = "U3LMWoXZ5NcjJWeamIlVlKUbevsxyVyN";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 91);
            i13++;
        }
    }

    public static void A05() {
        A02 = new byte[]{115, 6, 1, 23};
    }

    static {
        A05();
        A00 = null;
        A05 = new AtomicInteger(0);
        A04 = new HashMap();
    }

    public static synchronized CM A00(AnonymousClass85 anonymousClass85) {
        CM cm;
        synchronized (AnonymousClass98.class) {
            if (A01 == null) {
                A01 = CN.A00(anonymousClass85);
            }
            cm = A01;
        }
        return cm;
    }

    public static Integer A01(String str) {
        synchronized (A04) {
            Integer num = A04.get(str);
            if (num == null) {
                return 0;
            }
            return num;
        }
    }

    public static void A06(AnonymousClass85 anonymousClass85, String str, Map<String, String> params) {
        String str2;
        if (A0A(anonymousClass85)) {
            str2 = C0678Bj.A03(str);
        } else {
            str2 = A00;
        }
        if (str2 != null) {
            String fingerprint = A02(1, 3, 28);
            params.put(fingerprint, str2);
        }
    }

    public static void A07(final AnonymousClass85 anonymousClass85, boolean z10) {
        if (!A05.compareAndSet(0, 1)) {
            return;
        }
        A00(anonymousClass85);
        try {
            final SharedPreferences A002 = BJ.A00(anonymousClass85);
            final C06158l c06158l = new C06158l(anonymousClass85);
            final String str = Build.FINGERPRINT + A02(0, 1, 19) + c06158l.A06();
            A00 = A002.getString(str, null);
            FutureTask futureTask = new FutureTask(new Callable<Boolean>() { // from class: com.facebook.ads.redexgen.X.97
                public static byte[] A04;
                public static String[] A05 = {"dMyKB8n8mY8sFmfmCsf5VwvZBLoVpPiR", "TBvdqjLuIRaxglwGY5TjNnUOxCNoUnNv", "FK0GmuaP9q8EyodOlfs4PJ6Rrg0VVoxV", "1UM", "Fv6ZlsmxNYwaZ6XY1w8nvtw6Sd1Ai0k0", "lERcqI9wEyu6Ta8yIDBCfbsl7aq4DQ3Q", "fq", "Qdyh6wSbko6o8Mj4qT2RTqVvwzMlz"};

                public static String A01(int i10, int i11, int i12) {
                    byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
                    for (int i13 = 0; i13 < copyOfRange.length; i13++) {
                        copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 46);
                    }
                    return new String(copyOfRange);
                }

                public static void A02() {
                    A04 = new byte[]{37, 105, 103, 122, 105, 121, 61, 49, 51, 112, 63, 48, 58, 44, 49, 55, 58, 112, 40, 59, 48, 58, 55, 48, 57, 48, 32, 50, 35, 58, 62, 46, 49, 58, 62, 99, 97, 106, 97, 118, 109, 103};
                }

                static {
                    A02();
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
                    if (r1.equals(r0) != false) goto L19;
                 */
                @Override // java.util.concurrent.Callable
                /* renamed from: A00 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Boolean call() throws java.lang.Exception {
                    /*
                        Method dump skipped, instructions count: 246
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AnonymousClass97.call():java.lang.Boolean");
                }
            });
            Executors.newSingleThreadExecutor().submit(futureTask);
            if (z10) {
                futureTask.get();
            }
        } catch (Exception unused) {
            A05.set(0);
        }
    }

    public static void A08(AnonymousClass85 anonymousClass85, boolean z10, String str) {
        if (A0A(anonymousClass85)) {
            A09(anonymousClass85, z10, str);
        } else {
            A07(anonymousClass85, z10);
        }
    }

    public static void A09(AnonymousClass85 anonymousClass85, boolean z10, final String str) {
        if (str == null) {
            str = anonymousClass85.getPackageName();
        }
        if (A0B(str)) {
            return;
        }
        A00(anonymousClass85);
        final C0678Bj c0678Bj = new C0678Bj(anonymousClass85, str);
        try {
            c0678Bj.A06();
            FutureTask futureTask = new FutureTask(new Callable<Boolean>() { // from class: com.facebook.ads.redexgen.X.96
                /* JADX INFO: Access modifiers changed from: private */
                @Override // java.util.concurrent.Callable
                /* renamed from: A00 */
                public final Boolean call() throws Exception {
                    Map map;
                    Map map2;
                    C0678Bj.this.A05();
                    map = AnonymousClass98.A04;
                    synchronized (map) {
                        map2 = AnonymousClass98.A04;
                        map2.put(str, 2);
                    }
                    return true;
                }
            });
            Executors.newSingleThreadExecutor().submit(futureTask);
            if (z10) {
                futureTask.get();
            }
        } catch (Exception unused) {
            synchronized (A04) {
                A04.put(str, 0);
            }
        }
    }

    public static boolean A0A(AnonymousClass85 anonymousClass85) {
        if (!ProcessUtils.isRemoteRenderingProcess()) {
            boolean A2j = C06419m.A2j(anonymousClass85);
            if (A03[4].charAt(29) == 'E') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[5] = "Hubg";
            strArr[0] = "jm3dJ";
            if (!A2j) {
                return false;
            }
        }
        return true;
    }

    public static boolean A0B(String str) {
        synchronized (A04) {
            int status = A01(str).intValue();
            if (status != 0) {
                return true;
            }
            A04.put(str, 1);
            return false;
        }
    }
}
