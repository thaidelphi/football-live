package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class FT extends RelativeLayout {
    public static String[] A06 = {"5SHdRwFrRc5I045mD2ED8hkR", "u607MEARHNz8UhlPP1yTj4t381pEaF91", "vukf6ONNN7udfcALTJGLQQCjk2MRvNqz", "", "LcpvFkzcfh74Tt7JU5VGWxCVkX9ufVQR", "0vcUNZ0oTZNrvLONhpGozykOOsxw8rlk", "", "YDZhxKGTPmLilHONF7GF9MvjPIJLKPZP"};
    public final int A00;
    public final LinearLayout A01;
    public final C2056mb A02;
    public final C1900k1 A03;
    public final A7 A04;
    public final DR A05;

    public FT(C1900k1 c1900k1, C2056mb c2056mb, A7 a72, DR dr, int i10, int i11) {
        super(c1900k1);
        this.A03 = c1900k1;
        this.A02 = c2056mb;
        this.A04 = a72;
        this.A05 = dr;
        this.A00 = i10;
        this.A01 = new LinearLayout(c1900k1);
        A00();
        addView(this.A01, new FrameLayout.LayoutParams(-1, -1));
        setLayoutOrientation(i11);
    }

    private void A00() {
        int i10 = 0;
        while (true) {
            int A1W = this.A02.A1W();
            String[] strArr = A06;
            String str = strArr[2];
            String str2 = strArr[4];
            int charAt = str.charAt(18);
            int i11 = str2.charAt(18);
            if (charAt == i11) {
                throw new RuntimeException();
            }
            A06[7] = "iNncIzrUEB4NW29LDzlz6YUCQOx5Utak";
            if (i10 < A1W) {
                C1693ga c1693ga = new C1693ga(this.A03, this.A02.A1Z(i10), this.A04, this.A05);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                layoutParams.weight = 1.0f;
                int i12 = C1693ga.A0C;
                int i13 = C1693ga.A0C;
                int i14 = C1693ga.A0C;
                int i15 = C1693ga.A0C;
                layoutParams.setMargins(i12, i13, i14, i15);
                c1693ga.setLayoutParams(layoutParams);
                this.A01.addView(c1693ga);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setLayoutOrientation(configuration.orientation);
    }

    private void setLayoutOrientation(int i10) {
        if (i10 != 1) {
            this.A01.setOrientation(0);
            this.A01.setPadding(0, this.A00, 0, (int) (this.A00 * 0.25d));
            return;
        }
        this.A01.setOrientation(1);
        this.A01.setPadding(0, (int) (this.A00 * 1.5d), 0, this.A00);
    }
}
