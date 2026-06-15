package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.Timeline;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class RC implements InterfaceC1352az {
    public static String[] A07 = {"bvkjR0z2JuCPgN2uAbpqPjh1auWjFN2m", "jDmTxi1msFLiyIykemTdf3SyMPUAROGA", "OXoBlYAGv7iOLjHl9567wWnPGXT5zRPb", "Efu31", "aky9HEhQ7EdDCqCiIpT5H8t2NR6VgViF", "iq3qY", "qXUoBaVWj6OuQ8", "Oco5vFKqVajXf16TyX0nMhcG593FlptK"};
    public Looper A00;
    public Timeline A01;
    public RK A02;
    public final ArrayList<InterfaceC1351ay> A05 = new ArrayList<>(1);
    public final HashSet<InterfaceC1351ay> A06 = new HashSet<>(1);
    public final C1360bA A04 = new C1360bA();
    public final TJ A03 = new TJ();

    public abstract void A09();

    public abstract void A0A(InterfaceC1558eN interfaceC1558eN);

    public final RK A00() {
        return (RK) AbstractC1589es.A02(this.A02);
    }

    public final TJ A01(R5 r52) {
        return this.A03.A00(0, r52);
    }

    public final C1360bA A02(R5 r52) {
        return this.A04.A02(0, r52, 0L);
    }

    public void A03() {
    }

    public void A04() {
    }

    public final void A05(Timeline timeline) {
        this.A01 = timeline;
        Iterator<InterfaceC1351ay> it = this.A05.iterator();
        while (it.hasNext()) {
            it.next().AFA(this, timeline);
        }
    }

    public final void A06(InterfaceC1351ay interfaceC1351ay) {
        boolean z10 = !this.A06.isEmpty();
        this.A06.remove(interfaceC1351ay);
        if (z10) {
            boolean wasEnabled = this.A06.isEmpty();
            if (wasEnabled) {
                A03();
            }
        }
    }

    public final void A07(InterfaceC1351ay interfaceC1351ay) {
        AbstractC1589es.A01(this.A00);
        boolean isEmpty = this.A06.isEmpty();
        this.A06.add(interfaceC1351ay);
        if (isEmpty) {
            A04();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A08(com.facebook.ads.redexgen.X.InterfaceC1351ay r5, com.facebook.ads.redexgen.X.InterfaceC1558eN r6, com.facebook.ads.redexgen.X.RK r7) {
        /*
            r4 = this;
            android.os.Looper r3 = android.os.Looper.myLooper()
            android.os.Looper r0 = r4.A00
            if (r0 == 0) goto Lc
            android.os.Looper r0 = r4.A00
            if (r0 != r3) goto L4c
        Lc:
            r0 = 1
        Ld:
            com.facebook.ads.redexgen.X.AbstractC1589es.A07(r0)
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.RC.A07
            r0 = 7
            r1 = r1[r0]
            r0 = 29
            char r1 = r1.charAt(r0)
            r0 = 86
            if (r1 == r0) goto L4e
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.RC.A07
            java.lang.String r1 = "50KTM"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "Za3v7"
            r0 = 3
            r2[r0] = r1
            r4.A02 = r7
            com.google.android.exoplayer2.Timeline r1 = r4.A01
            java.util.ArrayList<com.facebook.ads.redexgen.X.ay> r0 = r4.A05
            r0.add(r5)
            android.os.Looper r0 = r4.A00
            if (r0 != 0) goto L43
            r4.A00 = r3
            java.util.HashSet<com.facebook.ads.redexgen.X.ay> r0 = r4.A06
            r0.add(r5)
            r4.A0A(r6)
        L42:
            return
        L43:
            if (r1 == 0) goto L42
            r4.A07(r5)
            r5.AFA(r4, r1)
            goto L42
        L4c:
            r0 = 0
            goto Ld
        L4e:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.RC.A08(com.facebook.ads.redexgen.X.ay, com.facebook.ads.redexgen.X.eN, com.facebook.ads.redexgen.X.RK):void");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1352az
    public final void A3p(Handler handler, InterfaceC1361bB interfaceC1361bB) {
        AbstractC1589es.A01(handler);
        AbstractC1589es.A01(interfaceC1361bB);
        this.A04.A04(handler, interfaceC1361bB);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1352az
    public final void AGF(InterfaceC1351ay interfaceC1351ay, InterfaceC1558eN interfaceC1558eN) {
        A08(interfaceC1351ay, interfaceC1558eN, RK.A03);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1352az
    public final void AGt(InterfaceC1351ay interfaceC1351ay) {
        this.A05.remove(interfaceC1351ay);
        if (this.A05.isEmpty()) {
            this.A00 = null;
            this.A01 = null;
            this.A02 = null;
            this.A06.clear();
            A09();
            return;
        }
        A06(interfaceC1351ay);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1352az
    public final void AHY(InterfaceC1361bB interfaceC1361bB) {
        this.A04.A0D(interfaceC1361bB);
    }
}
