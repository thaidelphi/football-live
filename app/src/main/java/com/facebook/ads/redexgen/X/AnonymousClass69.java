package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import java.util.ArrayList;
/* renamed from: com.facebook.ads.redexgen.X.69  reason: invalid class name */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class AnonymousClass69 {
    public SparseArray<AnonymousClass68> A00 = new SparseArray<>();
    public int A01 = 0;

    private final long A00(long j10, long j11) {
        if (j10 == 0) {
            return j11;
        }
        return ((j10 / 4) * 3) + (j11 / 4);
    }

    private AnonymousClass68 A01(int i10) {
        AnonymousClass68 anonymousClass68 = this.A00.get(i10);
        if (anonymousClass68 == null) {
            AnonymousClass68 anonymousClass682 = new AnonymousClass68();
            this.A00.put(i10, anonymousClass682);
            return anonymousClass682;
        }
        return anonymousClass68;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A02() {
        /*
            r2 = this;
            r1 = 0
        L1:
            android.util.SparseArray<com.facebook.ads.redexgen.X.68> r0 = r2.A00
            int r0 = r0.size()
            if (r1 >= r0) goto L19
            android.util.SparseArray<com.facebook.ads.redexgen.X.68> r0 = r2.A00
            java.lang.Object r0 = r0.valueAt(r1)
            com.facebook.ads.redexgen.X.68 r0 = (com.facebook.ads.redexgen.X.AnonymousClass68) r0
            java.util.ArrayList<com.facebook.ads.redexgen.X.6K> r0 = r0.A03
            r0.clear()
            int r1 = r1 + 1
            goto L1
        L19:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AnonymousClass69.A02():void");
    }

    public final C6K A03(int i10) {
        AnonymousClass68 anonymousClass68 = this.A00.get(i10);
        if (anonymousClass68 != null && !anonymousClass68.A03.isEmpty()) {
            ArrayList<C6K> arrayList = anonymousClass68.A03;
            return arrayList.remove(arrayList.size() - 1);
        }
        return null;
    }

    public final void A04() {
        this.A01--;
    }

    public final void A05(int i10, long j10) {
        AnonymousClass68 A01 = A01(i10);
        A01.A01 = A00(A01.A01, j10);
    }

    public final void A06(int i10, long j10) {
        AnonymousClass68 A01 = A01(i10);
        A01.A02 = A00(A01.A02, j10);
    }

    public final void A07(AbstractC05435q abstractC05435q) {
        this.A01++;
    }

    public final void A08(AbstractC05435q abstractC05435q, AbstractC05435q abstractC05435q2, boolean z10) {
        if (abstractC05435q != null) {
            A04();
        }
        if (!z10 && this.A01 == 0) {
            A02();
        }
        if (abstractC05435q2 != null) {
            A07(abstractC05435q2);
        }
    }

    public final void A09(C6K c6k) {
        int A0H = c6k.A0H();
        ArrayList<C6K> arrayList = A01(A0H).A03;
        int i10 = this.A00.get(A0H).A00;
        int viewType = arrayList.size();
        if (i10 <= viewType) {
            return;
        }
        c6k.A0Q();
        arrayList.add(c6k);
    }

    public final boolean A0A(int i10, long j10, long j11) {
        long j12 = A01(i10).A01;
        return j12 == 0 || j10 + j12 < j11;
    }

    public final boolean A0B(int i10, long j10, long j11) {
        long j12 = A01(i10).A02;
        return j12 == 0 || j10 + j12 < j11;
    }
}
