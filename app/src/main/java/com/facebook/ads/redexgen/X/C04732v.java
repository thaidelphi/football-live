package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.facebook.ads.redexgen.X.2v  reason: invalid class name and case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C04732v {
    public static byte[] A05;
    public static String[] A06 = {"SwW", "nKJOmWTx3LjNZvOp7YbBROgXIyGkfXUh", "cNvS8LZQYgXEdOP85dYAvAy4C3J", "ICxq6EmLG0dgZi7UJ5PBV2wBsvrmCfpb", "tKedy3gZYTLe", "bmz0vq", "hvIAQTYE0cdtFIL2", "tj9oqRvQS19ndgZTuA"};
    public C05987t A00;
    public FF A01 = FF.A05;
    public ArrayList<C0810Gr> A02 = new ArrayList<>();
    public final C2S A03;
    public final InterfaceC04722u A04;

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 97);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A05 = new byte[]{-35, 23, 35, 28, 27, -66, -29, -23, -38, -25, -29, -42, -31, -107, -70, -25, -25, -28, -25, -107, -89, -91, -91, -85, -107, -20, -34, -23, -35, -28, -22, -23, -107, -42, -107, -21, -42, -31, -34, -39, -107, -74, -39, -66, -29, -37, -28, -93, 21, 24, 19, 24, 21, 40, 21, 19, 22, 41, 34, 24, 32, 25, -29, -14, -21, -36, -31, -38, -30, -25, -40, -23, -38, -21, -38, -26, -20, 18, 23, 16, 24, 29, 20, 19, -16, 19, -13, 16, 35, 16, -15, 36, 29, 19, 27, 20, 63, 68, 74, 59, 72, 73, 74, 63, 74, 63, 55, 66};
    }

    static {
        A06();
    }

    public C04732v(C1900k1 c1900k1, AnonymousClass38 anonymousClass38, InterfaceC04722u interfaceC04722u, String str) {
        JSONObject dataObject = anonymousClass38.A03();
        this.A03 = A01(c1900k1, anonymousClass38, str, dataObject);
        this.A04 = interfaceC04722u;
    }

    private AdError A00(C1900k1 c1900k1, AbstractC2058md abstractC2058md) {
        if (abstractC2058md == null || abstractC2058md.A1i().isEmpty()) {
            c1900k1.A08().AAu(A04(62, 3, 33), AbstractC06048a.A0Z, new C06058b(A04(5, 43, 20)));
            return AdError.internalError(2006);
        }
        return null;
    }

    public static C2S A01(C1900k1 c1900k1, AnonymousClass38 anonymousClass38, String str, JSONObject jSONObject) {
        C2S c2s = null;
        if (jSONObject.has(A04(65, 12, 24))) {
            try {
                c2s = C2056mb.A03(jSONObject, c1900k1, true);
                c2s.A13(true);
                c2s.A10(A04(96, 12, 117));
            } catch (JSONException unused) {
            }
        }
        if (c2s == null) {
            c2s = C0968Mw.A02(jSONObject, c1900k1);
        }
        c2s.A0z(str);
        C06248u A01 = anonymousClass38.A01();
        if (A01 != null) {
            c2s.A0v(A01.A06());
        }
        return c2s;
    }

    private C05987t A03(C1900k1 c1900k1) {
        return this.A00 != null ? this.A00 : new C05987t(c1900k1);
    }

    private void A08(C1900k1 c1900k1, C0968Mw c0968Mw) {
        C04672p playableData = c0968Mw.A1b().A0F().A07();
        A0B(playableData != null ? playableData.A0B() : FF.A05);
        C2047mS c2047mS = new C2047mS(this);
        C05987t c05987t = new C05987t(c1900k1);
        boolean z10 = C06419m.A28(c1900k1) && C7J.A0A(c0968Mw.A0u());
        if (z10) {
            C7J unifiedAssetsLoader = new C7J(c05987t, c0968Mw.A0u(), c0968Mw.A0i(), c0968Mw.A0r(), z10, new C2046mR(this));
            c05987t.A0d(new AF(c0968Mw.A1g(), c1900k1.A0A()));
            unifiedAssetsLoader.A0B();
            return;
        }
        AnonymousClass35.A02(c1900k1, c0968Mw, true, c2047mS);
    }

    private void A09(C1900k1 c1900k1, EnumSet<CacheFlag> enumSet, AbstractC2058md abstractC2058md, int i10, InterfaceC04722u interfaceC04722u) {
        boolean A1F = abstractC2058md.A1F();
        C05987t A03 = A03(c1900k1);
        A03.A0d(new AF(abstractC2058md.A1g(), c1900k1.A0A()));
        boolean z10 = C06419m.A28(c1900k1) && C7J.A0A(abstractC2058md.A0u());
        if (z10) {
            new C7J(A03, abstractC2058md.A0u(), abstractC2058md.A0i(), abstractC2058md.A0r(), z10, new C2050mV(this, c1900k1, A1F, abstractC2058md, interfaceC04722u)).A0B();
            return;
        }
        String A04 = A04(96, 12, 117);
        if (A1F) {
            C05947p c05947p = new C05947p(abstractC2058md.A0f(), abstractC2058md.A0r(), A04);
            c05947p.A04 = true;
            c05947p.A03 = A04(0, 5, 78);
            A03.A0X(c05947p);
        }
        A03.A0c(new C05967r(abstractC2058md.A1e().A01(), C0820Hb.A04, C0820Hb.A04, abstractC2058md.A0r(), A04(96, 12, 117)));
        boolean contains = enumSet.contains(CacheFlag.VIDEO);
        int i11 = 0;
        boolean A2q = C06419m.A2q(c1900k1, J3.A03());
        for (C2T adInfo : abstractC2058md.A1i()) {
            C05967r c05967r = new C05967r(adInfo.A0F().A08(), AnonymousClass31.A00(adInfo.A0F()), AnonymousClass31.A01(adInfo.A0F()), abstractC2058md.A0r(), A04(96, 12, 117));
            if (i11 == 0) {
                A03.A0b(c05967r);
            } else {
                A03.A0c(c05967r);
            }
            for (String str : adInfo.A0I().A02()) {
                A03.A0c(new C05967r(str, -1, -1, abstractC2058md.A0r(), A04(96, 12, 117)));
            }
            if (contains && !TextUtils.isEmpty(adInfo.A0F().A09())) {
                C05947p c05947p2 = new C05947p(adInfo.A0F().A09(), abstractC2058md.A0r(), A04(96, 12, 117), adInfo.A0F().A06());
                c05947p2.A04 = false;
                if (i11 == 0) {
                    if (A1F && !A2q) {
                        A03.A0X(c05947p2);
                    } else {
                        A03.A0a(c05947p2);
                    }
                } else if (A1F && !A2q) {
                    A03.A0Y(c05947p2);
                } else {
                    A03.A0Z(c05947p2);
                }
            }
            i11++;
        }
        A03.A0W(new C2048mT(this, c1900k1, A1F, abstractC2058md, interfaceC04722u), new C05917m(abstractC2058md.A0r(), A04, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A(C1900k1 c1900k1, EnumSet<CacheFlag> enumSet, C2056mb c2056mb, AbstractC2058md abstractC2058md, int i10, InterfaceC04722u interfaceC04722u) {
        A09(c1900k1, enumSet, abstractC2058md, i10, new C2052mX(this, c1900k1, abstractC2058md, c2056mb, i10, interfaceC04722u, enumSet));
    }

    private void A0B(FF ff) {
        this.A01 = ff;
    }

    private boolean A0C(C1900k1 c1900k1, AbstractC2058md abstractC2058md) {
        AdError A00 = A00(c1900k1, abstractC2058md);
        if (A00 != null) {
            this.A04.AC8(A00);
            return true;
        }
        return false;
    }

    public final C2S A0D() {
        return this.A03;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
        return com.facebook.ads.redexgen.X.BG.A0D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0071, code lost:
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0076, code lost:
        return com.facebook.ads.redexgen.X.BG.A0B;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.ads.redexgen.X.BG A0E() {
        /*
            r5 = this;
            com.facebook.ads.redexgen.X.2S r0 = r5.A03
            boolean r0 = r0.A1B()
            if (r0 == 0) goto Lb
            com.facebook.ads.redexgen.X.BG r0 = com.facebook.ads.redexgen.X.BG.A04
            return r0
        Lb:
            com.facebook.ads.redexgen.X.2S r4 = r5.A03
            com.facebook.ads.redexgen.X.md r4 = (com.facebook.ads.redexgen.X.AbstractC2058md) r4
            boolean r0 = r4.A1F()
            if (r0 == 0) goto L18
            com.facebook.ads.redexgen.X.BG r0 = com.facebook.ads.redexgen.X.BG.A06
            return r0
        L18:
            java.util.List r0 = r4.A1i()
            int r1 = r0.size()
            r0 = 1
            if (r1 <= r0) goto L26
            com.facebook.ads.redexgen.X.BG r0 = com.facebook.ads.redexgen.X.BG.A0A
            return r0
        L26:
            com.facebook.ads.redexgen.X.2T r0 = r4.A1b()
            com.facebook.ads.redexgen.X.2W r0 = r0.A0F()
            com.facebook.ads.redexgen.X.2p r3 = r0.A07()
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C04732v.A06
            r0 = 4
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 14
            if (r1 == r0) goto L77
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C04732v.A06
            java.lang.String r1 = "HO5lN2vl3hawZ3xdOTbB4PXxItmZOFKM"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "QabHGQsenJFHZf5mHftqzVXi6FXcwsQx"
            r0 = 3
            r2[r0] = r1
            if (r3 == 0) goto L50
            com.facebook.ads.redexgen.X.BG r0 = com.facebook.ads.redexgen.X.BG.A0C
            return r0
        L50:
            boolean r3 = r5.A0L(r4)
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C04732v.A06
            r0 = 0
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 2
            if (r1 == r0) goto L71
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C04732v.A06
            java.lang.String r1 = "iV2CDA2M2IfUZLXvhnmiNr1pV0Sur2CQ"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "GDT4frbvCKvkZrCQcOaJTMqN9T6RIdn0"
            r0 = 3
            r2[r0] = r1
            if (r3 == 0) goto L74
        L6e:
            com.facebook.ads.redexgen.X.BG r0 = com.facebook.ads.redexgen.X.BG.A0D
            return r0
        L71:
            if (r3 == 0) goto L74
            goto L6e
        L74:
            com.facebook.ads.redexgen.X.BG r0 = com.facebook.ads.redexgen.X.BG.A0B
            return r0
        L77:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C04732v.A0E():com.facebook.ads.redexgen.X.BG");
    }

    public final FF A0F() {
        return this.A01;
    }

    public final String A0G() {
        if (this.A03.A1B()) {
            return ((C2056mb) this.A03).A1c();
        }
        return ((AbstractC2058md) this.A03).A1g();
    }

    public final void A0H() {
        this.A04.AJc();
    }

    public final void A0I(Intent intent, RewardData rewardData, String str) {
        this.A03.A0x(rewardData);
        this.A03.A11(str);
        if (A0D().A1B()) {
            intent.putExtra(A04(77, 19, 78), this.A03);
        }
        intent.putExtra(A04(48, 14, 83), this.A03);
    }

    public final void A0J(C1900k1 c1900k1, EnumSet<CacheFlag> enumSet) {
        if (A0E() == BG.A04) {
            C2056mb c2056mb = (C2056mb) this.A03;
            AbstractC2058md A1Y = c2056mb.A1Y();
            if (A0C(c1900k1, A1Y) || A1Y == null) {
                return;
            }
            this.A04.AGg();
            A0A(c1900k1, enumSet, c2056mb, A1Y, 0, this.A04);
            return;
        }
        AbstractC2058md abstractC2058md = (AbstractC2058md) this.A03;
        if (A06[5].length() == 0) {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[1] = "h3j4XQE4N9RDZ4AU6tvjsFYKX3e30HKG";
        strArr[3] = "lDhcJ7lgFtqhZjTb781X3zaoWDc2BWUc";
        if (A0C(c1900k1, abstractC2058md)) {
            return;
        }
        this.A04.AGg();
        if (A0E() == BG.A0C) {
            C0968Mw c0968Mw = (C0968Mw) this.A03;
            String[] strArr2 = A06;
            if (strArr2[2].length() != strArr2[6].length()) {
                A06[7] = "0uVLF1bkkTEn2WeYm46QMmOd1A6";
                A08(c1900k1, c0968Mw);
                return;
            }
            A08(c1900k1, c0968Mw);
            return;
        }
        A09(c1900k1, enumSet, (C0968Mw) this.A03, -1, this.A04);
    }

    public final boolean A0K() {
        return this.A03.A17();
    }

    public final boolean A0L(AbstractC2058md abstractC2058md) {
        return !TextUtils.isEmpty(abstractC2058md.A1b().A0F().A09());
    }
}
