package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.km  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC1947km extends AnonymousClass65 {
    public static byte[] A03;
    public static String[] A04 = {"VI3k6vbyE", "wbKxmRtdnLanYPPQlq0AQ7UHjncjxjam", "7rHsxeXjhwTRluKKUSI3i7DNAgzyS", "RLsJgHk6VqLvU3GrilIJimxIkswsMvKT", "sHDfA32w1RYOD3HMFDMkWGxW2yjuY1ZH", "JEcuqbBofZsfD30FS8fTTaggCipMDK", "8NUawD4TiWbh8YzDjR1LHPIBKq0RidcG", "8EIjrQLLrDPWSel1MFlzfXR6TVhPBcGW"};
    public MG A00;
    public Scroller A01;
    public final AnonymousClass67 A02 = new C1948kn(this);

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 15);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A03 = new byte[]{-120, -75, 103, -80, -75, -70, -69, -88, -75, -86, -84, 103, -74, -83, 103, -106, -75, -115, -77, -80, -75, -82, -109, -80, -70, -69, -84, -75, -84, -71, 103, -88, -77, -71, -84, -88, -85, -64, 103, -70, -84, -69, 117};
    }

    public abstract int A0C(AnonymousClass62 anonymousClass62, int i10, int i11);

    public abstract View A0D(AnonymousClass62 anonymousClass62);

    @Deprecated
    public abstract C1971lB A0E(AnonymousClass62 anonymousClass62);

    public abstract int[] A0H(AnonymousClass62 anonymousClass62, View view);

    static {
        A09();
    }

    private final C1971lB A05(AnonymousClass62 anonymousClass62) {
        return A0E(anonymousClass62);
    }

    private void A07() {
        this.A00.A1i(this.A02);
        this.A00.setOnFlingListener(null);
    }

    private void A08() throws IllegalStateException {
        if (this.A00.getOnFlingListener() == null) {
            this.A00.A1h(this.A02);
            this.A00.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException(A06(0, 43, 56));
    }

    private boolean A0A(AnonymousClass62 anonymousClass62, int i10, int i11) {
        C1971lB A05;
        int A0C;
        if (!(anonymousClass62 instanceof C6E) || (A05 = A05(anonymousClass62)) == null || (A0C = A0C(anonymousClass62, i10, i11)) == -1) {
            return false;
        }
        A05.A0A(A0C);
        anonymousClass62.A1L(A05);
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass65
    public final boolean A0B(int i10, int i11) {
        AnonymousClass62 layoutManager = this.A00.getLayoutManager();
        if (layoutManager == null || this.A00.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.A00.getMinFlingVelocity();
        return (Math.abs(i11) > minFlingVelocity || Math.abs(i10) > minFlingVelocity) && A0A(layoutManager, i10, i11);
    }

    public final void A0F() {
        AnonymousClass62 layoutManager;
        View A0D;
        if (this.A00 == null || (layoutManager = this.A00.getLayoutManager()) == null || (A0D = A0D(layoutManager)) == null) {
            return;
        }
        int[] A0H = A0H(layoutManager, A0D);
        if (A0H[0] != 0 || A0H[1] != 0) {
            this.A00.A1e(A0H[0], A0H[1]);
        }
    }

    public final void A0G(MG mg) throws IllegalStateException {
        if (this.A00 == mg) {
            return;
        }
        MG mg2 = this.A00;
        if (A04[3].charAt(14) == 'w') {
            throw new RuntimeException();
        }
        A04[4] = "xzKGxret4GzWIxaR6oK37PWpSNYAUaFQ";
        if (mg2 != null) {
            A07();
        }
        this.A00 = mg;
        if (this.A00 != null) {
            A08();
            this.A01 = new Scroller(this.A00.getContext(), new DecelerateInterpolator());
            A0F();
        }
    }
}
