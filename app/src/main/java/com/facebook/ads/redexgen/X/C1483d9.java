package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
/* renamed from: com.facebook.ads.redexgen.X.d9  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1483d9 extends C6K implements DY {
    public static String[] A08 = {"biNTtjxa0xULALtZEUOcP", "rMVpYr4hwZgX", "y0rebd1hOaNR", "snwXdVXwO66aPvNuuMD2", "jxkMgVVp1g5", "Dcah1JX", "lglxOXHbCZFpcLf1TWQPAMUDis4zLCZx", "n80A5ryznQOlcAJIvKv7FeLq2ck19EHB"};
    public C04592h A00;
    public JK A01;
    public JL A02;
    public JL A03;
    public final int A04;
    public final SparseBooleanArray A05;
    public final C1900k1 A06;
    public final LU A07;

    public C1483d9(LU lu, SparseBooleanArray sparseBooleanArray, JL jl, int i10, C1900k1 c1900k1, C04592h c04592h) {
        super(lu);
        this.A06 = c1900k1;
        this.A07 = lu;
        this.A05 = sparseBooleanArray;
        this.A02 = jl;
        this.A04 = i10;
        this.A00 = c04592h;
    }

    private void A0A(A7 a72, C0710Cv c0710Cv, String str, C0821Hc c0821Hc) {
        if (this.A05.get(c0821Hc.A02())) {
            return;
        }
        if (this.A03 != null) {
            this.A03.A0V();
            String[] strArr = A08;
            if (strArr[1].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[3] = "sEemyGdXpNnP2WRBMWcD";
            strArr2[0] = "kawPFcVLuq3VyedHvbBIc";
            this.A03 = null;
        }
        this.A01 = new C1486dC(this, str, c0821Hc, a72, c0821Hc.A04(), c0710Cv);
        this.A03 = new JL(this.A07, 10, new WeakReference(this.A01), this.A06);
        this.A03.A0Y(false);
        this.A03.A0W(100);
        this.A03.A0X(100);
        this.A07.setOnAssetsLoadedListener(new C1485dB(this, c0821Hc));
    }

    public final void A0j(C0821Hc c0821Hc, A7 a72, C05987t c05987t, C0710Cv c0710Cv, String str, int i10, int i11, int i12) {
        int A02 = c0821Hc.A02();
        this.A07.setTag(-1593835536, Integer.valueOf(A02));
        this.A07.setupNativeCtaExtension(c0821Hc);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i10, -2);
        int rightMargin = A02 == 0 ? i12 : i11;
        if (A02 < this.A04 - 1) {
            i12 = i11;
        }
        String[] strArr = A08;
        if (strArr[1].length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[1] = "ng4t5bAKqCWK";
        strArr2[2] = "n9xBZs9SEWUc";
        marginLayoutParams.setMargins(rightMargin, 0, i12, 0);
        String A082 = c0821Hc.A03().A0F().A08();
        String A09 = c0821Hc.A03().A0F().A09();
        this.A07.setIsVideo(!TextUtils.isEmpty(A09));
        if (this.A07.A1F()) {
            this.A07.setVideoPlaceholderUrl(A082);
            this.A07.setVideoUrl(c05987t.A0S(A09));
        } else {
            this.A07.setImageUrl(A082);
        }
        this.A07.setLayoutParams(marginLayoutParams);
        this.A07.setCTAInfo(c0821Hc.A03().A0H(), c0821Hc.A04());
        this.A07.A1G(c0821Hc.A04());
        A0A(a72, c0710Cv, str, c0821Hc);
    }

    public final void A0k(JL jl) {
        this.A02 = jl;
    }

    @Override // com.facebook.ads.redexgen.X.DY
    public final void AIL() {
        this.A07.A1A();
    }
}
