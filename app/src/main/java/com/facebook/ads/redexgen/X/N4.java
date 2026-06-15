package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.UUID;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class N4 implements InterfaceC2090n9 {
    public static byte[] A09;
    public static String[] A0A = {"0TFgGHCmbDEnT", "P3BoNX3HbYs3p91Xznd9cH02Ego1LEzw", "OWrFl7C0gkEmqIZvATANnxtRvMpHSetZ", "XjLJU23F7IQ7TgYJbWjoa78", "8eUGin29aZrVydG4hLQZ04ng176drDiv", "tE42BGb8ExLW22Y3fw0IicKZ4ID1w2IZ", "N0c3cK9W7W98ikBdYu66t8J", "EarR2SOYmotvRVJvY11PbnGgxllwGrNq"};
    public C2B A01;
    public C2C A02;
    public C2066ml A03;
    public C2063mi A04;
    public M5 A05;
    public InterfaceC0727Dm A06;
    public C0728Dn A07;
    public final String A08 = UUID.randomUUID().toString();
    public long A00 = -1;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 16);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A09 = new byte[]{-81, -64, -11, -19, -20, -15, -3, -11, -25, -6, -19, -21, -4, -23, -10, -17, -12, -19};
    }

    static {
        A04();
    }

    private void A05(M5 m52, C2063mi c2063mi, C05987t c05987t, C2B c2b, C0728Dn c0728Dn) {
        String A7E = c2063mi.A7E();
        if (!TextUtils.isEmpty(A7E)) {
            c05987t.A0d(new AF(A7E, m52.A0A()));
        }
        AU A0F = c2063mi.A0F();
        String[] strArr = A0A;
        String clientToken = strArr[3];
        if (clientToken.length() != strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0A;
        strArr2[3] = "l0iKT0z7S0YTo68xxrsf1qJ";
        strArr2[6] = "FTb7Q8n5ne47CtPUjUxYv1n";
        if (A0F != null) {
            C05967r c05967r = new C05967r(c2063mi.A0F().getUrl(), c2063mi.A0F().getHeight(), c2063mi.A0F().getWidth(), c2063mi.A0Y(), A03(2, 16, 120));
            c05967r.A00 = new C7z(false, -1, -1);
            c05987t.A0V();
            c05987t.A0b(c05967r);
        }
        if (c2063mi.A0E() != null) {
            c05987t.A0b(new C05967r(c2063mi.A0E().getUrl(), c2063mi.A0E().getHeight(), c2063mi.A0E().getWidth(), c2063mi.A0Y(), A03(2, 16, 120)));
        }
        String A0b = c2063mi.A0b();
        if (A0b != null && !TextUtils.isEmpty(A0b)) {
            c05987t.A0a(new C05947p(A0b, c2063mi.A0Y(), A03(2, 16, 120), c2063mi.A0A()));
        }
        C2078mx c2078mx = new C2078mx(this, c0728Dn, c2b, m52);
        String A0Y = c2063mi.A0Y();
        String clientToken2 = A03(2, 16, 120);
        c05987t.A0W(c2078mx, new C05917m(A0Y, clientToken2));
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass23
    public final String A7E() {
        if (this.A04 == null) {
            return null;
        }
        return this.A04.A7E();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass23
    public final AdPlacementType A8a() {
        return AdPlacementType.MEDIUM_RECTANGLE;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2090n9
    public final void AAi(M5 m52, A7 a72, EnumC0662Aj enumC0662Aj, C2B c2b, JSONObject jSONObject, C06248u c06248u) {
        m52.A0F().A4D();
        this.A05 = m52;
        this.A01 = c2b;
        C05987t c05987t = new C05987t(m52);
        this.A00 = System.currentTimeMillis();
        C2063mi A00 = C2K.A00(m52, jSONObject, CV.A02(jSONObject, A03(0, 2, 60)));
        this.A04 = A00;
        if (!AbstractC04511z.A06(m52, A00, a72)) {
            InterfaceC0727Dm adViewListener = new C2080mz(this, m52);
            this.A06 = adViewListener;
            C0728Dn c0728Dn = new C0728Dn(m52, a72, c05987t, new WeakReference(adViewListener), c06248u.A04(), c06248u.A07(), c06248u.A08(), c06248u.A09(), A00, this.A08);
            this.A07 = c0728Dn;
            this.A03 = new C2066ml(m52, new C2079my(this, m52, c2b), c0728Dn.getViewabilityChecker(), a72, A00);
            A05(m52, A00, c05987t, c2b, c0728Dn);
            this.A02 = new C2C(m52, this.A08, this, c2b);
            this.A02.A02();
            return;
        }
        m52.A0F().A4s();
        c2b.ADc(this, C0660Ag.A00(AdErrorType.NO_FILL));
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass23
    public final boolean AJQ() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass23
    public final void onDestroy() {
        if (this.A05 != null) {
            InterfaceC2108nR A0F = this.A05.A0F();
            String[] strArr = A0A;
            if (strArr[1].charAt(24) == strArr[4].charAt(24)) {
                throw new RuntimeException();
            }
            A0A[7] = "tMGyCfr9ucO4oWdztKDfdPlDfRrhkMp8";
            A0F.A4B(this.A07 != null);
        }
        if (this.A07 != null) {
            this.A07.A0I();
            this.A07 = null;
            this.A06 = null;
        }
        C2C c2c = this.A02;
        if (A0A[0].length() == 16) {
            throw new RuntimeException();
        }
        A0A[7] = "5ZoCIskAsYlLTmabnaeKVzywNB4LbbVC";
        if (c2c != null) {
            this.A02.A03();
        }
    }
}
