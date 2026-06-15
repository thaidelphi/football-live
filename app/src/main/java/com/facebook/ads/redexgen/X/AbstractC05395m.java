package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.5m  reason: invalid class name and case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC05395m {
    public static byte[] A03;
    public int A00;
    public final Rect A01;
    public final AnonymousClass62 A02;

    static {
        A04();
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 126);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A03 = new byte[]{-6, -1, 7, -14, -3, -6, -11, -79, 0, 3, -6, -10, -1, 5, -14, 5, -6, 0, -1};
    }

    public abstract int A06();

    public abstract int A07();

    public abstract int A08();

    public abstract int A09();

    public abstract int A0A();

    public abstract int A0B();

    public abstract int A0C(View view);

    public abstract int A0D(View view);

    public abstract int A0E(View view);

    public abstract int A0F(View view);

    public abstract int A0G(View view);

    public abstract int A0H(View view);

    public abstract void A0J(int i10);

    public AbstractC05395m(AnonymousClass62 anonymousClass62) {
        this.A00 = RecyclerView.UNDEFINED_DURATION;
        this.A01 = new Rect();
        this.A02 = anonymousClass62;
    }

    public /* synthetic */ AbstractC05395m(AnonymousClass62 anonymousClass62, C1970lA c1970lA) {
        this(anonymousClass62);
    }

    public static C1970lA A00(AnonymousClass62 anonymousClass62) {
        return new C1970lA(anonymousClass62);
    }

    public static C1969l9 A01(AnonymousClass62 anonymousClass62) {
        return new C1969l9(anonymousClass62);
    }

    public static AbstractC05395m A02(AnonymousClass62 anonymousClass62, int i10) {
        switch (i10) {
            case 0:
                return A00(anonymousClass62);
            case 1:
                return A01(anonymousClass62);
            default:
                throw new IllegalArgumentException(A03(0, 19, 19));
        }
    }

    public final int A05() {
        if (Integer.MIN_VALUE == this.A00) {
            return 0;
        }
        return A0B() - this.A00;
    }

    public final void A0I() {
        this.A00 = A0B();
    }
}
