package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import android.util.Log;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.dynamicloading.FlashPreferences;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.ironsource.j3;
import java.lang.Thread;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: com.facebook.ads.redexgen.X.8z  reason: invalid class name and case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C06288z {
    public static boolean A00;
    public static boolean A01;
    public static byte[] A02;
    public static String[] A03 = {"i0FOsf0o9fpBvAlaEaGgnCYFRbNnwBKJ", "ZsBa2nEfyhltTo", "ZG6g5nWnUhxh", "6zjosiDwJWE47kuMvKAUCDrCWUeR8P3q", "Gh89HIHHDqfPtiuASbXLVil627eRz", "Lsbp3nhJR34oAmuvtJAouWbaxC4Ny9OM", "s0Y", "C"};
    public static final AtomicBoolean A04;
    public static final AtomicBoolean A05;
    public static final AtomicBoolean A06;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 33);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{-91, -39, -93, -87, -85, -84, -39, -41, -54, -58, -59, -7, -24, -19, -23, -14, -25, -23, -46, -23, -8, -5, -13, -10, -17, -88, -103, -96, 117, -66, -61, -66, -55, -66, -74, -63, -66, -49, -74, -55, -66, -60, -61, 117, -56, -55, -74, -57, -55, -70, -71, -84, -67, -60, 121, -48, -70, -52, 121, -70, -59, -53, -66, -70, -67, -46, 121, -62, -57, -62, -51, -62, -70, -59, -62, -45, -66, -67, 122, 121, -84, -60, -62, -55, -55, -62, -57, -64, -121, -90, -68, -62, 109, -79, -68, -69, 116, -63, 109, -80, -82, -71, -71, 109, -114, -62, -79, -74, -78, -69, -80, -78, -101, -78, -63, -60, -68, -65, -72, -114, -79, -64, 123, -74, -69, -74, -63, -74, -82, -71, -74, -57, -78, 117, 118, 123, 109, -96, -68, -70, -78, 109, -77, -62, -69, -80, -63, -74, -68, -69, -82, -71, -74, -63, -58, 109, -70, -82, -58, 109, -69, -68, -63, 109, -60, -68, -65, -72, 109, -67, -65, -68, -67, -78, -65, -71, -58, 123, -120, -105, -112, -58, -52, -63, -45, -56, 0, 6, -5, 13, 2, -7, -3, 9, 8, 0, 3, 1, -42, -44, -35, -44, -31, -40, -46, -3, 2, -3, 8, -3, -11, 0, -3, 14, -7, -51, -46, -51, -40, -51, -59, -48, -51, -34, -55, -116, -115, -124, -46, -45, -40, -124, -57, -59, -48, -48, -55, -56, -110, 1, -10, 8, 9, -12, 7, -6, 8, 10, 1, 9};
    }

    static {
        A03();
        A06 = new AtomicBoolean();
        A04 = new AtomicBoolean();
        A05 = new AtomicBoolean();
    }

    public static C1884jl A00() {
        return new C1884jl();
    }

    public static C1883jk A01(C1899k0 c1899k0) {
        return new C1883jk(c1899k0);
    }

    public static void A04(AudienceNetworkAds.InitListener initListener, AudienceNetworkAds.InitResult initResult) {
        ExecutorC0712Cx.A01.execute(new C1885jm(initListener, initResult));
    }

    public static void A06(C1899k0 c1899k0) {
        if (AbstractC06439o.A0P(c1899k0) && !A05.getAndSet(true)) {
            try {
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = new C8Q(Thread.getDefaultUncaughtExceptionHandler(), c1899k0, new C1881ji());
                Thread.setDefaultUncaughtExceptionHandler(defaultUncaughtExceptionHandler);
            } catch (Exception e8) {
                c1899k0.A08().AAu(A02(198, 7, 78), AbstractC06048a.A1X, new C06058b(e8));
            }
        }
    }

    public static void A07(C1899k0 c1899k0) {
        A0H(c1899k0, null, null, 3);
    }

    public static void A08(C1899k0 c1899k0) {
        A0H(c1899k0, null, null, 3);
    }

    public static void A09(C1899k0 c1899k0) {
        if (C06419m.A2F(c1899k0)) {
            A0F(c1899k0, 0);
        }
        if (C06419m.A2O(c1899k0)) {
            A0B(c1899k0);
        }
    }

    public static void A0A(C1899k0 c1899k0) {
        if (C06419m.A2G(c1899k0)) {
            String[] strArr = A03;
            if (strArr[1].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[1] = "XjvPwbQrSqkAxC";
            strArr2[6] = "skO";
            A0G(c1899k0, null, 3);
        }
    }

    public static void A0B(C1899k0 c1899k0) {
        D8.A06.execute(new C1886jn(c1899k0));
    }

    public static void A0C(C1899k0 c1899k0) {
        C3P.A02(c1899k0);
        C8U.A0C(c1899k0, new C1880jh(c1899k0), new C1890jr(), BuildConfigApi.isDebug());
        c1899k0.A0A();
        A0D(c1899k0);
    }

    public static void A0D(C1899k0 c1899k0) {
        if (ProcessUtils.isRemoteRenderingProcess()) {
            return;
        }
        SharedPreferences sharedPreferences = FlashPreferences.getSharedPreferences(c1899k0);
        String string = sharedPreferences.getString(A02(186, 12, 121), null);
        String string2 = sharedPreferences.getString(A02(239, 11, 116), null);
        if (string != null && string2 != null) {
            C8Z A08 = c1899k0.A08();
            C06058b c06058b = new C06058b(string2);
            String flashConfig = A02(181, 5, 63);
            A08.ABM(flashConfig, 3701, c06058b);
        }
    }

    public static void A0F(C1899k0 c1899k0, int i10) {
        AnonymousClass84.A01(c1899k0);
        if (A04.getAndSet(true)) {
            return;
        }
        if (AdInternalSettings.isDebugBuild() || AdInternalSettings.isDebuggerOn()) {
            AbstractC0669Au.A02();
        }
        A06(c1899k0);
        AbstractC0672Bb.A00(C06419m.A0p(c1899k0), BuildConfigApi.isDebug(), A00(), A01(c1899k0));
        C05837e.A03(C06419m.A04(c1899k0));
        if (!ProcessUtils.isRemoteRenderingProcess()) {
            C0880Jj.A09(new C1882jj(c1899k0));
        }
        if (i10 == 3) {
            Log.e(A02(8, 17, 99), A02(89, 89, 44));
            c1899k0.A08().ABM(A02(178, 3, 6), AbstractC06048a.A0R, new C06058b(A02(215, 24, 67)));
        }
        ActivityUtils.A04(c1899k0, AudienceNetworkActivity.class);
        D8.A05(c1899k0);
        AI.A05(c1899k0);
        C2A.A01(c1899k0);
        if (C06419m.A15(c1899k0)) {
            C6X.A00(c1899k0);
        }
        if (C06419m.A1s(c1899k0)) {
            C1872jZ.A02().A8q(c1899k0);
        }
    }

    public static void A0G(C1899k0 c1899k0, AudienceNetworkAds.InitListener initListener, int i10) {
        AnonymousClass84.A01(c1899k0);
        boolean z10 = false;
        synchronized (C06288z.class) {
            boolean execute = A00;
            if (!execute) {
                if (i10 != 1 && i10 != 2) {
                    if (i10 == 3) {
                        boolean execute2 = A01;
                        if (!execute2) {
                            A01 = true;
                            z10 = true;
                        }
                    }
                }
                A00 = true;
                z10 = true;
            }
        }
        if (z10) {
            A0F(c1899k0, i10);
            D8.A08.execute(new C1887jo(c1899k0, initListener));
        } else if (i10 != 1) {
        } else {
            String A022 = A02(51, 38, 56);
            if (initListener != null) {
                A04(initListener, new C06278y(true, A022));
            } else {
                Log.w(A02(8, 17, 99), A022);
            }
        }
    }

    public static void A0H(C1899k0 c1899k0, MultithreadedBundleWrapper multithreadedBundleWrapper, AudienceNetworkAds.InitListener initListener, int i10) {
        AbstractC0669Au.A05(A02(j3.c.b.f17915f, 10, 115), A02(25, 26, 52), A02(0, 8, 82));
        C0880Jj.A06();
        A0G(c1899k0, initListener, i10);
    }

    public static synchronized boolean A0I() {
        boolean z10;
        synchronized (C06288z.class) {
            z10 = A00;
        }
        return z10;
    }
}
