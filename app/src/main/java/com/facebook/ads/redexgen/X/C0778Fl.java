package com.facebook.ads.redexgen.X;

import android.content.res.Resources;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Fl  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C0778Fl extends LinearLayout {
    public static byte[] A04;
    public static String[] A05 = {"5HLU", "cJmhtdIbv5Y5xdwCDl3dT8HPvklAUmwI", "4stzzs6gVfUC8wPYX", "7o6tBFGKBnQKcZsvXBJ4ayd9LnRtCNJ", "BSijPHOaulEPVGa4U1fKlqwI", "TamflSlcNH2rcKEIo3f72qWopMk8DENN", "Hhh3HDuTgivrAf4KqreTZK2", "SugScFu"};
    public static final float A06;
    public static final int A07;
    public static final int A08;
    public final TextView A00;
    public final TextView A01;
    public final TextView A02;
    public final boolean A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 106);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{31, 26, 26, 27, 10, 31, 23, 18, 13};
    }

    static {
        A01();
        A06 = Resources.getSystem().getDisplayMetrics().density;
        A08 = (int) (A06 * 6.0f);
        A07 = (int) (A06 * 8.0f);
    }

    public C0778Fl(C1900k1 c1900k1, C04542c c04542c, boolean z10, int i10, int i11, int i12) {
        super(c1900k1);
        setOrientation(1);
        this.A02 = new TextView(c1900k1);
        D3.A0W(this.A02, true, i10);
        this.A02.setEllipsize(TextUtils.TruncateAt.END);
        this.A02.setLineSpacing(A08, 1.0f);
        this.A01 = new TextView(c1900k1);
        this.A00 = new TextView(c1900k1);
        D3.A0W(this.A00, false, i11);
        this.A00.setEllipsize(TextUtils.TruncateAt.END);
        this.A00.setLineSpacing(A08, 1.0f);
        this.A03 = C06419m.A16(c1900k1);
        int i13 = this.A03 ? -2 : -1;
        addView(this.A02, new LinearLayout.LayoutParams(i13, -2));
        addView(this.A01, new LinearLayout.LayoutParams(i13, -2));
        this.A01.setVisibility(8);
        A03(c04542c, z10);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i13, -2);
        layoutParams.setMargins(0, i12, 0, 0);
        addView(this.A00, layoutParams);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0778Fl(com.facebook.ads.redexgen.X.C1900k1 r8, com.facebook.ads.redexgen.X.C04542c r9, boolean r10, boolean r11, boolean r12) {
        /*
            r7 = this;
            if (r11 == 0) goto L19
            r4 = 18
        L4:
            if (r11 == 0) goto L16
            r5 = 14
        L8:
            int r6 = com.facebook.ads.redexgen.X.C0778Fl.A07
            if (r12 == 0) goto Le
            int r6 = r6 / 2
        Le:
            r0 = r7
            r3 = r10
            r2 = r9
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L16:
            r5 = 16
            goto L8
        L19:
            r4 = 22
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0778Fl.<init>(com.facebook.ads.redexgen.X.k1, com.facebook.ads.redexgen.X.2c, boolean, boolean, boolean):void");
    }

    public final void A02() {
        this.A02.setTypeface(this.A02.getTypeface(), 1);
    }

    public final void A03(C04542c c04542c, boolean z10) {
        this.A02.setTextColor(c04542c.A07(z10));
        this.A01.setTextColor(c04542c.A05(z10));
        this.A00.setTextColor(c04542c.A06(z10));
    }

    public final void A04(String str, String str2, String str3, boolean z10, boolean z11) {
        boolean z12 = !TextUtils.isEmpty(str);
        boolean z13 = !TextUtils.isEmpty(str2);
        TextView textView = this.A02;
        if (!z12) {
            str = str2;
        }
        textView.setText(str);
        if (str3 != null) {
            this.A01.setText(str3);
        }
        TextView textView2 = this.A00;
        if (!z12) {
            str2 = A00(0, 0, 51);
        }
        textView2.setText(str2);
        int i10 = 3;
        String[] strArr = A05;
        if (strArr[6].length() != strArr[4].length()) {
            String[] strArr2 = A05;
            strArr2[3] = "nuTyQWYrKUsKt4wC014k9cpf4UiNlrc";
            strArr2[0] = "l7Wy";
            if (!z12 || !z13) {
                TextView textView3 = this.A02;
                if (A05[1].charAt(4) != 'F') {
                    String[] strArr3 = A05;
                    strArr3[3] = "qWmgL2iM9nfMb7yMq7CVR7HS6Guvx6S";
                    strArr3[0] = "mFhP";
                    if (z10) {
                        i10 = 2;
                    } else if (z11) {
                        i10 = 4;
                    }
                    textView3.setMaxLines(i10);
                    return;
                }
            } else {
                this.A02.setMaxLines(z10 ? 1 : 2);
                this.A00.setMaxLines(z10 ? 1 : z11 ? 3 : 2);
                return;
            }
        }
        throw new RuntimeException();
    }

    public TextView getDescriptionTextView() {
        return this.A00;
    }

    public TextView getTitleTextView() {
        return this.A02;
    }

    public void setAlignment(int i10) {
        if (this.A03) {
            setGravity(i10);
        }
        this.A02.setGravity(i10);
        this.A00.setGravity(i10);
    }

    public void setCTAClickListener(View$OnClickListenerC1689gW view$OnClickListenerC1689gW) {
        View$OnClickListenerC0782Fp A03 = AbstractC0783Fq.A03(view$OnClickListenerC1689gW, A00(0, 9, 20));
        this.A02.setOnClickListener(A03);
        this.A00.setOnClickListener(A03);
        this.A01.setOnClickListener(A03);
    }

    public void setDescriptionTextSize(int i10) {
        this.A00.setTextSize(i10);
    }

    public void setDescriptionVisibility(int i10) {
        this.A00.setVisibility(i10);
    }

    public void setTitleTextSize(int i10) {
        this.A02.setTextSize(i10);
    }
}
