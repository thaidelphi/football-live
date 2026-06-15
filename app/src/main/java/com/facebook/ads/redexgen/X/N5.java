package com.facebook.ads.redexgen.X;

import android.widget.LinearLayout;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.UUID;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class N5<NativeViewabilityLogger> implements InterfaceC2090n9 {
    public static byte[] A0J;
    public static String[] A0K = {"NhwOmA8H17maQr2Thm3XPPVG1xwEsLhZ", "rranxCubAcBFDRhPr2LDrxoK3htxcyeL", "LmhV8", "ZLGOK7uKxyyp5W3sNEqoBEODv8zXcPE1", "dNK0bBZMrDk2YJmjrhSzlk1RMTFmUAsD", "q33l17MPfjO0fzYSahPh7EE95Ux5x03H", "4VfBn9Mh4W5rafl7A4va0uDeREUgOp63", "NLrbv196ww605txiYhOndsfSQjY"};
    public static final String A0L;
    public C2B A00;
    public C2C A01;
    public C2067mm A02;
    public C0969Mx A03;
    public M5 A04;
    public A7 A05;
    public EnumC0662Aj A06;
    public F4 A08;
    public C1697ge A09;
    public LI A0A;
    public JK A0B;
    public JL A0C;
    public String A0E;
    public final String A0I = UUID.randomUUID().toString();
    public boolean A0F = false;
    public boolean A0G = false;
    public boolean A0H = false;
    public C0710Cv A07 = new C0710Cv();
    public Boolean A0D = false;

    public static String A08(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0J, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 106);
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A0J = new byte[]{28, 40, 38, -25, 31, 26, 28, 30, 27, 40, 40, 36, -25, 26, 29, 44, -25, 27, 26, 39, 39, 30, 43, -25, 28, 37, 34, 28, 36, 30, 29, -15, -30, -11, -15, -84, -27, -15, -22, -23, -21, -22, -36, -93, -82};
    }

    static {
        A0B();
        A0L = N5.class.getSimpleName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.N5 != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    public void A0A() {
        if (this.A00 != null && this.A0A != null && this.A03 != null && this.A03.A1F()) {
            this.A00.ACV(this, this.A0A);
        }
        if (this.A00 != null) {
            boolean z10 = this.A0F;
            if (A0K[1].charAt(21) == 'I') {
                throw new RuntimeException();
            }
            String[] strArr = A0K;
            strArr[6] = "pcQhCrMOoUvf1wSUiS8eXhj7G6bioSrh";
            strArr[4] = "JWZBC7ZhFf7k7YrTz5pa22tV9NT1Mc4w";
            if (z10 && (this.A0G || !this.A0H)) {
                C2B c2b = this.A00;
                if (A0K[3].charAt(25) != 'G') {
                    A0K[3] = "irPj8aYnTZH6GsdLYSbTyVfXBLXHQnPh";
                    c2b.ACV(this, this.A09);
                } else {
                    A0K[3] = "5PA9hoTjlgD01Tr6eTkR8jxCvDfXc2RO";
                    c2b.ACV(this, this.A09);
                }
            }
        }
        this.A04.A0F().A4E(this.A00 != null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.N5 != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    public void A0C(int i10, C06248u c06248u) {
        C2087n6 c2087n6 = new C2087n6(this);
        this.A0A = new LI(this.A04, this.A05, c2087n6, this.A03, A08(0, 31, 79), 2, this.A07);
        this.A0B = new C2086n5(this);
        this.A0C = new JL(this.A0A, c06248u.A04(), c06248u.A09(), true, new WeakReference(this.A0B), this.A04);
        this.A0C.A0W(this.A03.A0U());
        this.A0C.A0X(this.A03.A0V());
        this.A0A.setVisibility(0);
        this.A04.getResources();
        this.A0A.setLayoutParams(new LinearLayout.LayoutParams(-1, i10));
        this.A0A.AJI();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.N5 != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    private void A0F(C06248u c06248u, JSONObject jSONObject, EnumC0662Aj enumC0662Aj) {
        this.A0G = false;
        C2069mo A00 = C2069mo.A00(this.A04, jSONObject);
        this.A0E = A00.A7E();
        if (AbstractC04511z.A06(this.A04, A00, this.A05)) {
            this.A04.A0F().A4s();
            this.A00.ADc(this, C0660Ag.A00(AdErrorType.NO_FILL));
            return;
        }
        this.A08 = new N6(this, A00);
        this.A09 = new C1697ge(this.A04, new WeakReference(this.A08), c06248u.A04(), A7E());
        this.A09.A0G(c06248u.A07(), c06248u.A08());
        AnonymousClass26 impressionHelper = new C2085n4(this);
        this.A02 = new C2067mm(this.A04, this.A05, this.A09, this.A09.getViewabilityChecker(), impressionHelper, enumC0662Aj);
        this.A02.A0A(A00);
        this.A09.loadDataWithBaseURL(F7.A01(AdInternalSettings.getUrlPrefix()), A00.A04(), A08(31, 9, 19), A08(40, 5, 12), null);
        this.A0F = true;
        A0A();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0051, code lost:
        if (com.facebook.ads.redexgen.X.C06419m.A28(r10.A04) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
        if (com.facebook.ads.redexgen.X.C7J.A0A(r10.A03.A0u()) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
        if (com.facebook.ads.redexgen.X.C06419m.A28(r10.A04) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
        r0 = 0;
     */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.N5 != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0G(com.facebook.ads.redexgen.X.EnumC0662Aj r11, com.facebook.ads.redexgen.X.C06248u r12) {
        /*
            r10 = this;
            com.facebook.ads.redexgen.X.Mx r0 = r10.A03
            if (r0 == 0) goto L23
            com.facebook.ads.redexgen.X.A7 r3 = r10.A05
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.N5.A0K
            r0 = 1
            r1 = r1[r0]
            r0 = 21
            char r1 = r1.charAt(r0)
            r0 = 73
            if (r1 == r0) goto La7
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.N5.A0K
            java.lang.String r1 = "0asQ5nS3mEJJFXqECkaJp8czAINd5ojj"
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = "wkfCN0fAVUFan65EWCqz3ffd3K2ZXjjS"
            r0 = 4
            r2[r0] = r1
            if (r3 != 0) goto L24
        L23:
            return
        L24:
            int r3 = r11.A03()
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.N5.A0K
            r0 = 3
            r1 = r1[r0]
            r0 = 25
            char r1 = r1.charAt(r0)
            r0 = 71
            if (r1 == r0) goto L66
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.N5.A0K
            java.lang.String r1 = "7AAzPingpmVfFCqSXKHauNoNKo9Xv93Z"
            r0 = 5
            r2[r0] = r1
            float r1 = (float) r3
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = r1 * r0
            int r1 = (int) r1
            com.facebook.ads.redexgen.X.M5 r0 = r10.A04
            boolean r0 = com.facebook.ads.redexgen.X.C06419m.A28(r0)
            if (r0 == 0) goto L7c
        L53:
            com.facebook.ads.redexgen.X.Mx r0 = r10.A03
            org.json.JSONObject r0 = r0.A0u()
            boolean r0 = com.facebook.ads.redexgen.X.C7J.A0A(r0)
            if (r0 == 0) goto L7c
            r0 = 1
        L60:
            if (r0 != 0) goto L7e
            r10.A0C(r1, r12)
            return
        L66:
            float r1 = (float) r3
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = r1 * r0
            int r1 = (int) r1
            com.facebook.ads.redexgen.X.M5 r0 = r10.A04
            boolean r0 = com.facebook.ads.redexgen.X.C06419m.A28(r0)
            if (r0 == 0) goto L7c
            goto L53
        L7c:
            r0 = 0
            goto L60
        L7e:
            com.facebook.ads.redexgen.X.M5 r0 = r10.A04
            com.facebook.ads.redexgen.X.7t r4 = new com.facebook.ads.redexgen.X.7t
            r4.<init>(r0)
            r2 = r10
            com.facebook.ads.redexgen.X.7J r3 = new com.facebook.ads.redexgen.X.7J
            com.facebook.ads.redexgen.X.Mx r0 = r10.A03
            org.json.JSONObject r5 = r0.A0u()
            com.facebook.ads.redexgen.X.Mx r0 = r10.A03
            java.lang.String r6 = r0.A0i()
            com.facebook.ads.redexgen.X.Mx r0 = r10.A03
            java.lang.String r7 = r0.A0r()
            com.facebook.ads.redexgen.X.n8 r9 = new com.facebook.ads.redexgen.X.n8
            r9.<init>(r10, r1, r12, r2)
            r8 = 1
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r3.A0B()
            return
        La7:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.N5.A0G(com.facebook.ads.redexgen.X.Aj, com.facebook.ads.redexgen.X.8u):void");
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.N5 != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.X.AnonymousClass23
    public final String A7E() {
        return this.A0E;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.N5 != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.X.AnonymousClass23
    public final AdPlacementType A8a() {
        if (C06419m.A18(this.A04)) {
            EnumC0662Aj enumC0662Aj = this.A06;
            String[] strArr = A0K;
            if (strArr[2].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            A0K[0] = "gRyzGCsQg6apk2eHBZ3N290V4KDgGwY2";
            if (enumC0662Aj != null && this.A06 == EnumC0662Aj.A09) {
                return AdPlacementType.MEDIUM_RECTANGLE;
            }
        }
        return AdPlacementType.BANNER;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.N5 != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC2090n9
    public final void AAi(M5 m52, A7 a72, EnumC0662Aj enumC0662Aj, C2B c2b, JSONObject jSONObject, C06248u c06248u) {
        m52.A0F().A4D();
        this.A04 = m52;
        this.A05 = a72;
        this.A00 = c2b;
        this.A06 = enumC0662Aj;
        this.A0H = C06419m.A1h(this.A04.getApplicationContext());
        this.A03 = C0969Mx.A02(jSONObject, this.A04);
        if (this.A03.A1F()) {
            A0G(enumC0662Aj, c06248u);
        } else {
            A0F(c06248u, jSONObject, enumC0662Aj);
        }
        this.A01 = new C2C(this.A04, this.A0I, this, c2b);
        this.A01.A02();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.N5 != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.X.AnonymousClass23
    public final boolean AJQ() {
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.N5 != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.X.AnonymousClass23
    public final void onDestroy() {
        this.A04.A0F().A4B(this.A09 != null);
        if (this.A09 != null) {
            this.A09.destroy();
            this.A09 = null;
            this.A08 = null;
        }
        if (this.A01 != null) {
            this.A01.A03();
        }
    }
}
