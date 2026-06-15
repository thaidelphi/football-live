package com.facebook.ads.redexgen.X;

import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.1T  reason: invalid class name */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class C1T extends MG implements View.OnTouchListener {
    public static byte[] A07;
    public static String[] A08 = {"ySOBxSJ7y2GELC2cR9WRTK6hAhZYocJS", "8dRmuXbfMCidMDGiSpjEcbCkPgx3mm8G", "li61zS9WhZTBvI47lvKtLPcqAcNkij1S", "lH5BfkXLxOyhi", "q0Ccq4Fbg7VKO8sxkIKNcZgKtjQ1fZ14", "ep7ggC7RKpg7Ol5cXUmXF8JhcfOkgUip", "fpgtpMAGWAVh3a0xLZP1kWTjCGk3An57", "s5"};
    public int A00;
    public C1972lC A01;
    public HZ A02;
    public boolean A03;
    public boolean A04;
    public int A05;
    public final int A06;

    public static String A09(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 110);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{-4, 23, 10, 25, -5, 14, 12, 34, 12, 21, 14, 27, -1, 18, 14, 32, -55, 24, 23, 21, 34, -55, 28, 30, 25, 25, 24, 27, 29, 28, -55, -11, 18, 23, 14, 10, 27, -11, 10, 34, 24, 30, 29, -10, 10, 23, 10, 16, 14, 27};
    }

    static {
        A0A();
    }

    public C1T(C1900k1 c1900k1) {
        super(c1900k1);
        this.A05 = 0;
        this.A00 = 0;
        this.A03 = true;
        this.A04 = false;
        this.A06 = A05();
        setOnTouchListener(this);
    }

    public C1T(C1900k1 c1900k1, AttributeSet attributeSet) {
        super(c1900k1, attributeSet);
        this.A05 = 0;
        this.A00 = 0;
        this.A03 = true;
        this.A04 = false;
        this.A06 = A05();
        setOnTouchListener(this);
    }

    public C1T(C1900k1 c1900k1, AttributeSet attributeSet, int i10) {
        super(c1900k1, attributeSet, i10);
        this.A05 = 0;
        this.A00 = 0;
        this.A03 = true;
        this.A04 = false;
        this.A06 = A05();
        setOnTouchListener(this);
    }

    private int A05() {
        return ((int) getContext().getResources().getDisplayMetrics().density) * 10;
    }

    private int A06(int i10) {
        int delta = this.A00 - i10;
        int A8e = this.A02.A8e(delta);
        int scrollX = this.A06;
        if (delta > scrollX) {
            int scrollX2 = this.A05;
            return A08(scrollX2, A8e);
        }
        int scrollX3 = this.A06;
        if (delta < (-scrollX3)) {
            int i11 = this.A05;
            if (A08[6].charAt(24) != 67) {
                throw new RuntimeException();
            }
            A08[7] = "Vh4";
            int scrollX4 = A07(i11, A8e);
            return scrollX4;
        }
        int scrollX5 = this.A05;
        return scrollX5;
    }

    private int A07(int i10, int i11) {
        return Math.max(i10 - i11, 0);
    }

    private int A08(int i10, int i11) {
        return Math.min(i10 + i11, getItemCount() - 1);
    }

    public void A20(int i10, boolean z10) {
        if (getAdapter() == null) {
            return;
        }
        this.A05 = i10;
        if (z10) {
            A1Y(i10);
        } else {
            A1X(i10);
        }
    }

    public int getCurrentPosition() {
        return this.A05;
    }

    private int getItemCount() {
        if (getAdapter() == null) {
            return 0;
        }
        return getAdapter().A0C();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int rawX = (int) motionEvent.getRawX();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1 && actionMasked != 6 && actionMasked != 3) {
            int action = A08[7].length();
            if (action == 18) {
                throw new RuntimeException();
            }
            A08[4] = "tIjSEqZVzrzr7cEE0p57iZetopRejSVd";
            if (actionMasked != 4) {
                if (actionMasked == 0 || actionMasked == 5 || (this.A03 && actionMasked == 2)) {
                    this.A00 = rawX;
                    if (this.A03) {
                        this.A03 = false;
                    }
                    this.A04 = true;
                }
                return false;
            }
        }
        if (this.A04) {
            int rawX2 = A06(rawX);
            A20(rawX2, true);
        }
        this.A03 = true;
        this.A04 = false;
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.MG
    public void setLayoutManager(AnonymousClass62 anonymousClass62) {
        if (anonymousClass62 instanceof C1972lC) {
            super.setLayoutManager(anonymousClass62);
            this.A01 = (C1972lC) anonymousClass62;
            return;
        }
        throw new IllegalArgumentException(A09(0, 50, 59));
    }

    public void setSnapDelegate(HZ hz) {
        this.A02 = hz;
    }
}
