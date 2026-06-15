package com.facebook.ads.redexgen.X;

import android.media.MediaCodec;
import android.os.SystemClock;
import android.util.Log;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class Z5 {
    public static byte[] A03;
    public boolean A00 = false;
    public final ConcurrentLinkedQueue<Z3> A01 = new ConcurrentLinkedQueue<>();
    public final /* synthetic */ Z6 A02;

    static {
        A05();
    }

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 32);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{94, 99, 120, 126, 107, 111, 114, 116, 117, 59, 108, 115, 126, 117, 59, 111, 105, 98, 114, 117, 124, 59, 111, 116, 59, 114, 117, 104, 111, 122, 117, 111, 114, 122, 111, 126, 59, 62, 104, 33, 59, 62, 104, 77, 101, 100, 105, 97, 67, 111, 100, 101, 99, 80, 111, 111, 108, 79, 112, 116, 105, 109, 105, 122, 101, 100, 90, 77, 77, 80, 77, 18, 72, 87, 86, 83, 90, 18, 77, 90, 83, 90, 94, 76, 90, 18, 92, 80, 91, 90, 92, 18, 89, 77, 80, 82, 18, 76, 90, 75, 18, 89, 86, 81, 94, 83, 83, 70, 5, 31, 26, 76, 117, 98, 98, Byte.MAX_VALUE, 98, 61, 103, 120, 121, 124, 117, 61, 98, 117, 124, 117, 113, 99, 117, 61, 115, Byte.MAX_VALUE, 116, 117, 115, 61, 118, 98, Byte.MAX_VALUE, 125, 61, 99, 117, 100, 42, 48, 53, 99, 20, 9, 30, 1, 29, 16, 8, 20, 3, 67, 95, 16, 7, 64, 95, 2, 3, 18, 95, 53, 16, 7, 64, 21, 60, 20, 21, 24, 16, 50, 30, 21, 20, 18, 48, 21, 16, 1, 5, 20, 3};
    }

    public Z5(Z6 z62) {
        this.A02 = z62;
    }

    public InterfaceC1268Yz A02(boolean z10, C0954Mg c0954Mg, EnumC0949Mb enumC0949Mb, String str) throws MY {
        boolean A0I;
        AbstractC0950Mc A01;
        AbstractC0950Mc A012;
        boolean A0G;
        Set<InterfaceC1268Yz> set;
        AbstractC0950Mc A013;
        A0I = this.A02.A0I(z10, c0954Mg);
        if (A0I) {
            A0G = Z6.A0G(str, c0954Mg);
            if (A0G) {
                synchronized (this.A02.A04) {
                    set = this.A02.A04.get(str);
                }
                if (set != null) {
                    synchronized (set) {
                        if (!set.isEmpty()) {
                            Z6 z62 = this.A02;
                            z62.A00--;
                            Iterator<InterfaceC1268Yz> it = set.iterator();
                            InterfaceC1268Yz ret = it.next();
                            it.remove();
                            A013 = this.A02.A01();
                            A013.A08(z10, str, enumC0949Mb, ret.hashCode());
                            return ret;
                        }
                    }
                }
            }
        }
        try {
            A01 = this.A02.A01();
            MZ A032 = A01.A03(z10, str, enumC0949Mb);
            InterfaceC1268Yz A033 = A03(z10, str);
            A012 = this.A02.A01();
            A012.A04(A032, A033.hashCode());
            return A033;
        } catch (Exception e8) {
            throw new MY(str, e8);
        }
    }

    public InterfaceC1268Yz A03(boolean z10, String str) throws Exception {
        boolean A0E;
        String A04 = A04(IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, 41, 81);
        if (z10) {
            A0E = Z6.A0E(str);
            if (A0E) {
                try {
                    return (InterfaceC1268Yz) Class.forName(A04).getConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception e8) {
                    Log.w(A04(43, 23, 32), String.format(A04(0, 43, 59), A04, e8.getMessage()));
                }
            }
        }
        return new RQ(MediaCodec.createByCodecName(str));
    }

    /* renamed from: A06 */
    public void A0B(EnumC0949Mb enumC0949Mb) {
        String A04;
        String format;
        Z6 z62;
        Set<InterfaceC1268Yz> set;
        Iterator<Z3> it = this.A01.iterator();
        while (it.hasNext()) {
            Z3 next = it.next();
            try {
                try {
                    if (!next.A05) {
                        A07(next.A00, enumC0949Mb, Boolean.valueOf(next.A04), next.A01);
                    } else {
                        try {
                            try {
                                this.A02.A05 = SystemClock.elapsedRealtime();
                                next.A01.reset();
                                z62 = this.A02;
                            } catch (Throwable th) {
                                this.A02.A05 = -1L;
                                throw th;
                            }
                        } catch (IllegalStateException unused) {
                            A09(next.A02, next.A01);
                            z62 = this.A02;
                        }
                        z62.A05 = -1L;
                        if (next.A03) {
                            synchronized (this.A02.A04) {
                                set = this.A02.A04.get(next.A02);
                            }
                            if (set != null) {
                                synchronized (set) {
                                    set.add(next.A01);
                                    this.A02.A00++;
                                }
                            }
                        }
                    }
                } catch (Exception e8) {
                    Log.w(A04(43, 23, 32), String.format(A04(112, 38, 48), e8.getMessage()));
                    try {
                        synchronized (this.A01) {
                            this.A01.remove(next);
                        }
                    } catch (Exception e10) {
                        A04 = A04(43, 23, 32);
                        format = String.format(A04(66, 46, 31), e10.getMessage());
                        Log.w(A04, format);
                    }
                }
                try {
                    synchronized (this.A01) {
                        this.A01.remove(next);
                    }
                } catch (Exception e11) {
                    A04 = A04(43, 23, 32);
                    format = String.format(A04(66, 46, 31), e11.getMessage());
                    Log.w(A04, format);
                }
            } catch (Throwable th2) {
                try {
                } catch (Exception e12) {
                    Log.w(A04(43, 23, 32), String.format(A04(66, 46, 31), e12.getMessage()));
                }
                synchronized (this.A01) {
                    this.A01.remove(next);
                    throw th2;
                }
            }
        }
    }

    private void A07(C0954Mg c0954Mg, EnumC0949Mb enumC0949Mb, Boolean bool, InterfaceC1268Yz interfaceC1268Yz) {
        AbstractC0950Mc A01;
        AbstractC0950Mc A012;
        try {
            if (!c0954Mg.A0Q || (!bool.booleanValue() && !c0954Mg.A0P)) {
                interfaceC1268Yz.stop();
            }
        } finally {
            A01 = this.A02.A01();
            A01.A06(enumC0949Mb, interfaceC1268Yz.hashCode());
            interfaceC1268Yz.AGj();
            A012 = this.A02.A01();
            A012.A05(enumC0949Mb, interfaceC1268Yz.hashCode());
        }
    }

    private void A09(String str, InterfaceC1268Yz interfaceC1268Yz) {
        Set<InterfaceC1268Yz> set;
        synchronized (this.A02.A04) {
            set = this.A02.A04.get(str);
        }
        if (set != null) {
            synchronized (set) {
                if (set.remove(interfaceC1268Yz)) {
                    Z6 z62 = this.A02;
                    z62.A00--;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:202:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A0A(boolean r24, com.facebook.ads.redexgen.X.C0954Mg r25, final com.facebook.ads.redexgen.X.EnumC0949Mb r26, java.lang.String r27, com.facebook.ads.redexgen.X.InterfaceC1268Yz r28) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.Z5.A0A(boolean, com.facebook.ads.redexgen.X.Mg, com.facebook.ads.redexgen.X.Mb, java.lang.String, com.facebook.ads.redexgen.X.Yz):void");
    }
}
