package com.facebook.ads.redexgen.X;

import android.content.Context;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.jZ  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1872jZ implements AnonymousClass87 {
    public static C1872jZ A07;
    public static byte[] A08;
    public InterfaceC04351j A00;
    public InterfaceC06027x A01;
    public AnonymousClass86 A02;
    public C8M A03;
    public AnonymousClass94 A04;
    public AJ A05;
    public InterfaceC1308aF A06;

    static {
        A07();
    }

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 118);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A08 = new byte[]{13, 15, 59, 61, 12, 18, 62, 60, 13, 31, 45, 45, 35, 41, 40, -38, 30, 27, 46, 27, -38, 35, 40, 35, 46, 35, 27, 38, 35, 52, 31, 30, 28, 15, 26, 25, 28, 30, -3, 15, 29, 29, 19, 25, 24, -18, 11, 30, 11, -13, 24, 19, 30, 19, 11, 22, 19, 36, 15, 14};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A0C(C1899k0 c1899k0) {
        if (this.A06 != null) {
            return;
        }
        this.A03 = A01(c1899k0);
        this.A06 = A05(c1899k0, this.A03, A03(c1899k0));
        A09(c1899k0, A00(c1899k0, this.A06));
        A0A(c1899k0, this.A06);
        A0B(c1899k0, this.A06);
        if (this.A06 != null) {
            this.A06.A6T();
        }
    }

    public static C7N A00(C1899k0 c1899k0, InterfaceC1308aF interfaceC1308aF) {
        if (!C06419m.A1k(c1899k0) || interfaceC1308aF == null) {
            return null;
        }
        return C7O.A00().A00(interfaceC1308aF);
    }

    public static C8M A01(C1899k0 c1899k0) {
        return C8N.A00().A00(c1899k0, new C1879jg());
    }

    public static synchronized C1872jZ A02() {
        C1872jZ c1872jZ;
        synchronized (C1872jZ.class) {
            if (A07 == null) {
                A07 = new C1872jZ();
            }
            c1872jZ = A07;
        }
        return c1872jZ;
    }

    public static JR A03(C1899k0 c1899k0) {
        if (!C06419m.A1g(c1899k0)) {
            return null;
        }
        return C0880Jj.A01(c1899k0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AnonymousClass87
    /* renamed from: A04 */
    public final synchronized InterfaceC1308aF A95() {
        return this.A06;
    }

    public static InterfaceC1308aF A05(C1899k0 c1899k0, C8M c8m, JR jr) {
        if (!C06419m.A2c(c1899k0) || jr == null || ProcessUtils.isRemoteRenderingProcess()) {
            return null;
        }
        return K6.A00().A00(c1899k0, c8m, jr, BE.A04(c1899k0), new C1873ja(new B6(c1899k0, A06(0, 0, 9), null, EnumC0664Al.A08, 0, new C0668Aq(), AbstractC0700Cl.A01(C06419m.A0M(c1899k0)), null, null, new C2023m4()), c1899k0), K4.A00().A00());
    }

    public static void A08() {
        AbstractC0669Au.A05(A06(32, 28, 52), A06(8, 24, 68), A06(0, 8, 99));
    }

    public static void A09(C1899k0 c1899k0, C7N c7n) {
        if (!C06419m.A1k(c1899k0) || c7n == null) {
            return;
        }
        C7L.A00().A00(c7n, c1899k0);
    }

    public static void A0A(C1899k0 c1899k0, InterfaceC1308aF interfaceC1308aF) {
        if (!C06419m.A0l(c1899k0) || interfaceC1308aF == null) {
            return;
        }
        new C05877i(c1899k0, interfaceC1308aF, new C05887j(), DynamicLoaderImpl.getBidderTokenProviderApi().A00());
    }

    public static void A0B(C1899k0 c1899k0, InterfaceC1308aF interfaceC1308aF) {
        if (interfaceC1308aF == null) {
            return;
        }
        AbstractC06459q.A00(c1899k0, interfaceC1308aF);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass87
    public final A7 A6d(C1899k0 c1899k0) {
        return C1840j3.A01(c1899k0);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass87
    public final synchronized AnonymousClass86 A6u(AnonymousClass85 anonymousClass85) {
        if (this.A02 == null) {
            this.A02 = new C1874jb(this);
        }
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass87
    public final synchronized InterfaceC06027x A76() {
        if (this.A01 == null) {
            this.A01 = new C1901k2();
        }
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass87
    public final synchronized C8M A7b(AnonymousClass85 anonymousClass85) {
        if (this.A03 == null) {
            this.A03 = A01(anonymousClass85.A02());
        }
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass87
    public final synchronized C8Z A7d(AnonymousClass85 anonymousClass85) {
        return new C1888jp(anonymousClass85);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass87
    public final synchronized AnonymousClass88 A7n(AnonymousClass85 anonymousClass85) {
        return new M3(this, anonymousClass85);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass87
    public final synchronized InterfaceC04351j A82(AnonymousClass85 anonymousClass85) {
        if (C06419m.A12(anonymousClass85)) {
            if (this.A00 == null) {
                this.A00 = AbstractC04361k.A00().A00(new C1877je(anonymousClass85));
            }
            return this.A00;
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass87
    public final synchronized C8A A8o(AnonymousClass85 anonymousClass85) {
        return new C1875jc(anonymousClass85);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass87
    public final C1899k0 A8p(Context context) {
        C1899k0 sdkContext = AnonymousClass84.A00();
        if (sdkContext == null) {
            C1899k0 sdkContext2 = new C1899k0(context, this);
            AnonymousClass84.A01(sdkContext2);
            return sdkContext2;
        }
        return sdkContext;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass87
    public final synchronized AJ A8q(C1899k0 c1899k0) {
        if (this.A05 == null) {
            this.A05 = new C1848jB(c1899k0);
        }
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass87
    public final synchronized AnonymousClass94 A8w() {
        if (this.A04 == null) {
            this.A04 = new AnonymousClass94();
            A08();
        }
        return this.A04;
    }
}
