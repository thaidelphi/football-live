package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import com.facebook.ads.redexgen.X.C6K;
import java.util.Arrays;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.5q  reason: invalid class name and case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC05435q<VH extends C6K> {
    public static byte[] A02;
    public static String[] A03 = {"jUIKGw1ynNKnpAPmELSBfekQdKvvLP7N", "sNNGTv9KS6vRRQA34Mdww0wVckPktM11", "3xVPsODXVzGzX7adQrLtZXDPvj0RZqnv", "LC797JiAE7pTB", "T5D6LMII5PxeSeaFwmiiVgotr7WAYFJE", "TBv1Ih1UUm000Zp3KSd8PMLF2uMFBpSk", "SYlNiiXgaMsNCcAbu", "5Eyk2D6YZF50L"};
    public final C05445r A01 = new C05445r();
    public boolean A00 = false;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 1);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-73, -69, -123, -88, -41, -54, -58, -39, -54, -69, -50, -54, -36, -122, -118, 84, -125, -94, 118, -99, -94, -104, -118, -99, -103, -85};
    }

    public abstract int A0C();

    public abstract VH A0D(ViewGroup viewGroup, int i10);

    public abstract void A0E(VH vh, int i10);

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.5q != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.6K> */
    private final void A02(VH holder, int i10, List<Object> payloads) {
        A0E(holder, i10);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.5q != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.6K> */
    public final int A03(int i10) {
        return 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.5q != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.6K> */
    public final long A04(int i10) {
        return -1L;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.5q != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.6K> */
    public final VH A05(ViewGroup viewGroup, int i10) {
        AnonymousClass44.A01(A00(0, 13, 100));
        VH holder = A0D(viewGroup, i10);
        holder.A00 = i10;
        AnonymousClass44.A00();
        return holder;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.5q != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.6K> */
    public final void A06() {
        this.A01.A00();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.5q != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.6K> */
    public final void A07(AbstractC05455s abstractC05455s) {
        this.A01.registerObserver(abstractC05455s);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.5q != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.6K> */
    public final void A08(AbstractC05455s abstractC05455s) {
        this.A01.unregisterObserver(abstractC05455s);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.5q != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.6K> */
    public final void A09(VH vh, int i10) {
        vh.A03 = i10;
        if (A0A()) {
            long A04 = A04(i10);
            String[] strArr = A03;
            if (strArr[4].charAt(21) == strArr[2].charAt(21)) {
                throw new RuntimeException();
            }
            A03[0] = "nL6OAJIdW8sl7jDyOoO0QwKhwUxIf89k";
            vh.A05 = A04;
        }
        vh.A0U(1, 519);
        AnonymousClass44.A01(A00(13, 13, 51));
        A02(vh, i10, vh.A0L());
        vh.A0N();
        ViewGroup.LayoutParams layoutParams = vh.A0H.getLayoutParams();
        if (layoutParams instanceof AnonymousClass63) {
            ((AnonymousClass63) layoutParams).A01 = true;
        }
        AnonymousClass44.A00();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.5q != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.6K> */
    public final boolean A0A() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.5q != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.6K> */
    public final boolean A0B(VH holder) {
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.5q != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.6K> */
    public void A0F(MG mg) {
    }
}
