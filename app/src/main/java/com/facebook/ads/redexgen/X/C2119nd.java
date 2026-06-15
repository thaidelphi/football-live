package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Semaphore;
/* renamed from: com.facebook.ads.redexgen.X.nd  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C2119nd implements C1D {
    public static byte[] A09;
    public static String[] A0A = {"jhQijRHeS2b3DC", "TrxlLGPRt74PJqIyPQ202SRMEezA", "IB0ZY9fOXgD7jLe6Y4PRk3dCNjPCK6", "H6fabJXG57DAkPtsQTSNUghzavXSaH69", "ufMT47zQTczJDi2Vdc2LdI1YLyWR3nOe", "Lk9ILhYpp3cxsVDBevZ7UGW4HuH86l", "wl", "vesbJwqYWy5viKlOFyHJIQca6g"};
    public static final String A0B;
    public final int A00;
    public final int A01;
    public final C1L A02;
    public final C1Y A04;
    public final AnonymousClass85 A05;
    public final boolean A08;
    public final Map<String, File> A06 = Collections.synchronizedMap(new HashMap());
    public final Map<String, Semaphore> A07 = new HashMap();
    public final C1N A03 = new C1N();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 23 out of bounds for length 23
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0126: INVOKE  
      (r10v1 ?? I:com.facebook.ads.redexgen.X.1Y)
      (r11 I:java.lang.String)
      (r12 I:int)
      (r13 I:java.lang.String)
      (r14 I:java.lang.Long)
      (r15 I:java.lang.Long)
      (r16 I:com.facebook.ads.redexgen.X.1J)
     type: INTERFACE call: com.facebook.ads.redexgen.X.1Y.AGc(java.lang.String, int, java.lang.String, java.lang.Long, java.lang.Long, com.facebook.ads.redexgen.X.1J):void, block:B:43:0x011a */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0141: INVOKE  
      (r10v0 ?? I:com.facebook.ads.redexgen.X.1Y)
      (r11 I:java.lang.String)
      (r12 I:int)
      (r13 I:java.lang.String)
      (r14 I:java.lang.Long)
      (r15 I:java.lang.Long)
      (r16 I:com.facebook.ads.redexgen.X.1J)
     type: INTERFACE call: com.facebook.ads.redexgen.X.1Y.AGc(java.lang.String, int, java.lang.String, java.lang.Long, java.lang.Long, com.facebook.ads.redexgen.X.1J):void, block:B:49:0x0135 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0124: MOVE  (r16 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:43:0x011a */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x013f: MOVE  (r16 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:49:0x0135 */
    private File A02(C1J c1j, String str, String str2, int i10, C1M c1m) {
        C1J c1j2;
        String AGc;
        C1J c1j3;
        String AGc2;
        String A03 = A03(222, 22, 17);
        try {
            String str3 = str;
            long currentTimeMillis = System.currentTimeMillis();
            File file = new File(A01(this.A05), str2);
            C2113nW c2113nW = new C2113nW(file, new NP(C06419m.A0Q(this.A05)));
            if (c2113nW.A09()) {
                if (this.A08) {
                    String str4 = A03(49, 22, 36) + c2113nW.A00.getName();
                }
                this.A06.put(str3, file);
                c2113nW.A06();
                this.A04.AGd(str3, true, c1j);
                return file;
            }
            if (this.A08) {
                String str5 = A03(71, 26, 76) + c2113nW.A00.getName();
            }
            if (c1m.A04()) {
                this.A04.AGd(str3, false, c1j);
                for (int i11 = 0; i11 < this.A00; i11++) {
                    try {
                        AnonymousClass85 anonymousClass85 = this.A05;
                        if (A0A[3].charAt(31) != '9') {
                            throw new RuntimeException();
                        }
                        String[] strArr = A0A;
                        strArr[2] = "QJ6lhIf3SMnJsUHWjUzyv1yZJIRdgp";
                        strArr[5] = "f1TQksdEGnGezGtACwRIsNgGsb1lS2";
                        str3 = str3;
                        try {
                            A05(anonymousClass85, c2113nW, str3, i10, i11, currentTimeMillis);
                            break;
                        } catch (C1U e8) {
                            e = e8;
                            if (i11 == this.A00 - 1) {
                                A06(c2113nW);
                                if (e instanceof C2114nX) {
                                    throw ((C2114nX) e);
                                }
                                if (e instanceof C2109nS) {
                                    throw ((C2109nS) e);
                                }
                            }
                        }
                    } catch (C1U e10) {
                        e = e10;
                    }
                }
                int A032 = c2113nW.A03();
                c2113nW.A06();
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                c1m.A00().A53(file, this.A04);
                this.A06.put(str3, file);
                this.A04.AGc(str3, IronSourceConstants.IS_CALLBACK_AD_DISPLAYED, null, Long.valueOf(A032), Long.valueOf(currentTimeMillis2), c1j);
                return file;
            }
            return null;
        } catch (C2109nS e11) {
            this.A04.AGc(AGc2, IronSourceConstants.IS_CALLBACK_AD_CLOSED, e11.toString(), null, null, c1j3);
            if (this.A08) {
                Log.e(A0B, A03, e11);
                return null;
            }
            return null;
        } catch (C2114nX e12) {
            this.A04.AGc(AGc, 2119, e12.toString(), null, null, c1j2);
            if (this.A08) {
                Log.e(A0B, A03, e12);
                return null;
            }
            return null;
        }
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 50);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A09 = new byte[]{-95, -23, -30, -12, -95, -29, -26, -26, -17, -95, -22, -17, -11, -26, -13, -13, -10, -15, -11, -26, -27, -81, Byte.MIN_VALUE, 116, -70, -67, -64, -71, 116, -73, -64, -71, -75, -62, -71, -72, -114, 116, -52, -66, -33, 18, 18, 3, 11, 14, 18, -40, -66, -103, -73, -71, -66, -65, -60, -67, 118, -68, -65, -62, -69, 118, -71, -59, -61, -58, -62, -69, -54, -69, 118, -63, -33, -31, -26, -25, -20, -27, -98, -28, -25, -22, -29, -98, -20, -19, -14, -98, -31, -19, -21, -18, -22, -29, -14, -29, -98, -87, -57, -55, -50, -49, -44, -51, -122, -43, -52, -122, -121, -91, -78, 107, -72, 100, -89, -80, -77, -73, -87, 100, -89, -91, -89, -84, -87, 100, -86, -83, -80, -87, 114, -61, -31, -18, -89, -12, -96, -14, -27, -31, -28, -96, -31, -13, -13, -27, -12, -13, -82, -63, -33, -20, -91, -14, -98, -16, -29, -33, -30, -98, -22, -29, -20, -27, -14, -26, -98, -19, -28, -98, -124, -91, -84, -91, -76, -87, -82, -89, 96, -93, -95, -93, -88, -91, 96, -90, -87, -84, -91, 96, -95, -90, -76, -91, -78, 96, -91, -72, -93, -91, -91, -92, -87, -82, -89, 96, -78, -91, -76, -78, -71, 96, -95, -76, -76, -91, -83, -80, -76, -77, 122, 96, -120, -75, -75, -78, -75, 99, -90, -92, -90, -85, -84, -79, -86, 99, -73, -85, -88, 99, -87, -84, -81, -88, -89, -44, -44, -47, -44, -126, -59, -50, -57, -61, -48, -53, -48, -55, -126, -56, -53, -50, -57, -23, 22, 22, 19, 22, -60, 7, 16, 19, 23, 13, 18, 11, -60, 23, 19, 25, 22, 7, 9, -39, -2, -13, -1, -3, 0, -4, -11, 4, -11, -80, 2, -11, 3, 0, -1, -2, 3, -11, -66, 2, 32, 39, 23, 28, 21, -50, 34, 29, -50, 32, 19, 15, 18, -50, -31, -28, -18, -9, -83, -26, -23, -20, -27, -83, -29, -31, -29, -24, -27, -50, -32, -32, -46, -31, -89, -100, -100, -100, -77, -74, -71, -78, -121, 124, 124, 124, -82, -69, -79, -65, -68, -74, -79, -84, -82, -64, -64, -78, -63, 124};
    }

    static {
        A04();
        A0B = C2119nd.class.getSimpleName();
    }

    public C2119nd(AnonymousClass85 anonymousClass85, C1L c1l, C1Y c1y) {
        this.A05 = anonymousClass85;
        this.A08 = c1l.A02();
        this.A00 = c1l.A00();
        this.A04 = c1y;
        this.A01 = c1l.A01();
        this.A02 = c1l;
    }

    public static C2116na A00(Context context, String str) throws C1U {
        try {
            InputStream open = context.getAssets().open(str);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = open.read(bArr, 0, bArr.length);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    return new C2116na(byteArrayOutputStream.toByteArray());
                }
            }
        } catch (IOException e8) {
            throw new C1U(A03(131, 18, 78), e8);
        }
    }

    public static File A01(Context context) {
        return new File(context.getCacheDir(), A03(318, 15, 78));
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x00ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0144 A[Catch: 1U -> 0x015f, all -> 0x01c6, TRY_LEAVE, TryCatch #15 {1U -> 0x015f, all -> 0x01c6, blocks: (B:12:0x007c, B:40:0x00f8, B:42:0x0100, B:50:0x0144, B:56:0x0157, B:48:0x013e), top: B:109:0x007c }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0148 A[Catch: 1U -> 0x009a, all -> 0x01fa, TRY_ENTER, TryCatch #10 {1U -> 0x009a, all -> 0x01fa, blocks: (B:9:0x0051, B:17:0x008b, B:54:0x0151, B:59:0x0162, B:51:0x0148, B:53:0x014e, B:45:0x0130, B:46:0x0137), top: B:118:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0157 A[Catch: 1U -> 0x015f, all -> 0x01c6, TRY_ENTER, TRY_LEAVE, TryCatch #15 {1U -> 0x015f, all -> 0x01c6, blocks: (B:12:0x007c, B:40:0x00f8, B:42:0x0100, B:50:0x0144, B:56:0x0157, B:48:0x013e), top: B:109:0x007c }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0190  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A05(android.content.Context r24, com.facebook.ads.redexgen.X.C2113nW r25, java.lang.String r26, int r27, int r28, long r29) throws com.facebook.ads.redexgen.X.C1U {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C2119nd.A05(android.content.Context, com.facebook.ads.redexgen.X.nW, java.lang.String, int, int, long):void");
    }

    private void A06(C2113nW c2113nW) {
        try {
            File A04 = c2113nW.A04();
            if (A04.exists()) {
                c2113nW.A06();
                boolean delete = A04.delete();
                if (this.A08) {
                    Log.i(A0B, A03(170, 52, 14) + delete);
                }
            }
        } catch (Exception e8) {
            if (A0A[0].length() != 14) {
                throw new RuntimeException();
            }
            A0A[3] = "fJTJjiotuyJvZrF72L8221tI8VUznJb9";
            if (this.A08) {
                Log.e(A0B, A03(108, 23, 18), e8);
            }
        }
    }

    private boolean A07(C2113nW c2113nW) {
        try {
            c2113nW.A05();
            if (A0A[4].charAt(27) != 'R') {
                throw new RuntimeException();
            }
            String[] strArr = A0A;
            strArr[7] = "zmS4hUlvHkaHxqc9Vg18exvolw";
            strArr[6] = "qC";
            return true;
        } catch (C2109nS e8) {
            if (this.A08) {
                Log.e(A0B, A03(244, 19, 48), e8);
                return false;
            }
            return false;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1M != com.facebook.ads.cache.config.CacheRequestConfig<T> */
    public final <T> C1F<T> A08(C1J c1j, C1M<T> c1m) {
        Semaphore semaphore;
        if (c1m.A03()) {
            File file = this.A06.get(c1j.A09);
            if (file != null) {
                this.A04.AGd(c1j.A09, true, c1j);
                return c1m.A00().A3n(file, this.A04);
            }
            this.A04.AGd(c1j.A09, false, c1j);
            return new C1F<>(false, null);
        }
        String str = c1j.A09;
        String str2 = c1j.A04;
        StringBuilder sb = new StringBuilder();
        String baseUrl = this.A03.A03(str);
        String extension = sb.append(baseUrl).append(str2).toString();
        synchronized (this.A07) {
            semaphore = this.A07.get(extension);
            if (semaphore == null) {
                semaphore = new Semaphore(1);
                this.A07.put(extension, semaphore);
            }
            try {
            } catch (Throwable th) {
                semaphore.release();
                synchronized (this.A07) {
                    this.A07.remove(extension);
                    throw th;
                }
            }
        }
        try {
            semaphore.acquire();
            File A02 = A02(c1j, str, extension, this.A01, c1m);
            if (A02 != null) {
                C1F<T> A3n = c1m.A00().A3n(A02, this.A04);
                semaphore.release();
                synchronized (this.A07) {
                    this.A07.remove(extension);
                }
                return A3n;
            }
            C1F<T> c1f = new C1F<>(false, null);
            semaphore.release();
            synchronized (this.A07) {
                this.A07.remove(extension);
            }
            return c1f;
        } catch (InterruptedException unused) {
            if (this.A08) {
                StringBuilder sb2 = new StringBuilder();
                String baseUrl2 = A03(97, 11, 52);
                StringBuilder append = sb2.append(baseUrl2).append(str);
                String baseUrl3 = A03(0, 22, 79);
                append.append(baseUrl3).toString();
            }
            C1F<T> c1f2 = new C1F<>(false, null);
            semaphore.release();
            synchronized (this.A07) {
                this.A07.remove(extension);
                return c1f2;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C1D
    public final C1F<Bitmap> AHk(C1J c1j, boolean z10) {
        return A08(c1j, new C1M(new C2122ng(c1j.A01, c1j.A00, this.A02.A04(), this.A02.A03(), z10)));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1M != com.facebook.ads.cache.config.CacheRequestConfig<java.io.File> */
    @Override // com.facebook.ads.redexgen.X.C1D
    public final File AHl(C1J c1j) {
        C1M c1m = new C1M(new C2121nf());
        c1m.A01(true);
        c1m.A02(false);
        return (File) A08(c1j, c1m).A00();
    }

    @Override // com.facebook.ads.redexgen.X.C1D
    public final String AHm(C1J c1j) {
        return (String) A08(c1j, new C1M(new C2120ne())).A00();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1M != com.facebook.ads.cache.config.CacheRequestConfig<java.lang.String> */
    @Override // com.facebook.ads.redexgen.X.C1D
    public final String AHn(C1J c1j) {
        C1M c1m = new C1M(new C2120ne());
        c1m.A01(true);
        c1m.A02(false);
        return (String) A08(c1j, c1m).A00();
    }
}
