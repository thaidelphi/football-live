package com.facebook.ads.redexgen.X;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/* renamed from: com.facebook.ads.redexgen.X.eK  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1555eK {
    public static String[] A07 = {"Y7TYPOYmr1DaLggC61u0AWsw8UU", "8E9a5Zo5EHFD", "iVAs1UBWiLkTRufCFmTh0VjI7SGFV9BP", "igPGnTQU3C4zsfvvaPuDNhRaHhU8zgSN", "vZXsYA3P1GVhSSGeJfLSyhvwv4Q2ZkUN", "ICq2NkQkBoZ7Wl3GxPgedNAM8nhfhTiP", "Jx4heSIt1kvuhAPUNrubhYPKNykrJXxV", "uJOMJfddake6"};
    public static final Comparator<C1554eJ> A08 = new Comparator() { // from class: com.facebook.ads.redexgen.X.eG
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C1555eK.A00((C1554eJ) obj, (C1554eJ) obj2);
        }
    };
    public static final Comparator<C1554eJ> A09 = new Comparator() { // from class: com.facebook.ads.redexgen.X.eH
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int compare;
            compare = Float.compare(((C1554eJ) obj).A00, ((C1554eJ) obj2).A00);
            return compare;
        }
    };
    public int A01;
    public int A02;
    public int A03;
    public final int A04;
    public final C1554eJ[] A06 = new C1554eJ[5];
    public final ArrayList<C1554eJ> A05 = new ArrayList<>();
    public int A00 = -1;

    public C1555eK(int i10) {
        this.A04 = i10;
    }

    public static /* synthetic */ int A00(C1554eJ c1554eJ, C1554eJ c1554eJ2) {
        return c1554eJ.A01 - c1554eJ2.A01;
    }

    private void A02() {
        if (this.A00 != 1) {
            Collections.sort(this.A05, A08);
            this.A00 = 1;
        }
    }

    private void A03() {
        if (this.A00 != 0) {
            Collections.sort(this.A05, A09);
            this.A00 = 0;
        }
    }

    private final void A04(int i10, float f10) {
        C1554eJ newSample;
        A02();
        if (this.A02 > 0) {
            C1554eJ[] c1554eJArr = this.A06;
            int i11 = this.A02 - 1;
            this.A02 = i11;
            String[] strArr = A07;
            if (strArr[4].charAt(31) != strArr[3].charAt(31)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[2] = "yaPdXC8dVHotIsjL12yNG27Y2xE7mUfP";
            strArr2[5] = "yZ2zjjDBfhF2mhhyHoK97zI6gGNOUceP";
            newSample = c1554eJArr[i11];
        } else {
            newSample = new C1554eJ();
        }
        int i12 = this.A01;
        this.A01 = i12 + 1;
        newSample.A01 = i12;
        newSample.A02 = i10;
        newSample.A00 = f10;
        this.A05.add(newSample);
        this.A03 += i10;
        while (this.A03 > this.A04) {
            int excessWeight = this.A03 - this.A04;
            C1554eJ c1554eJ = this.A05.get(0);
            if (c1554eJ.A02 <= excessWeight) {
                this.A03 -= c1554eJ.A02;
                this.A05.remove(0);
                int i13 = this.A02;
                if (A07[6].charAt(20) != 104) {
                    throw new RuntimeException();
                }
                A07[1] = "uEmR";
                if (i13 < 5) {
                    C1554eJ[] c1554eJArr2 = this.A06;
                    int excessWeight2 = this.A02;
                    this.A02 = excessWeight2 + 1;
                    c1554eJArr2[excessWeight2] = c1554eJ;
                }
            } else {
                c1554eJ.A02 -= excessWeight;
                this.A03 -= excessWeight;
            }
        }
    }

    public final float A05(float f10) {
        A03();
        float f11 = this.A03 * f10;
        int i10 = 0;
        for (int i11 = 0; i11 < this.A05.size(); i11++) {
            C1554eJ c1554eJ = this.A05.get(i11);
            i10 += c1554eJ.A02;
            float desiredWeight = i10;
            if (desiredWeight >= f11) {
                float desiredWeight2 = c1554eJ.A00;
                return desiredWeight2;
            }
        }
        if (this.A05.isEmpty()) {
            return Float.NaN;
        }
        float desiredWeight3 = this.A05.get(this.A05.size() - 1).A00;
        return desiredWeight3;
    }

    public final void A06() {
        this.A05.clear();
        this.A00 = -1;
        this.A01 = 0;
        this.A03 = 0;
    }

    @MetaExoPlayerCustomization("D20155618 Samples OutOfBounds Error Check Fix")
    public final void A07(int i10, float f10) {
        C1554eJ oldestSample;
        if (C0962Mq.A03(EnumC0959Mn.A18)) {
            A04(i10, f10);
            return;
        }
        A02();
        if (this.A02 > 0) {
            C1554eJ[] c1554eJArr = this.A06;
            int i11 = this.A02 - 1;
            this.A02 = i11;
            oldestSample = c1554eJArr[i11];
        } else {
            oldestSample = new C1554eJ();
        }
        int i12 = this.A01;
        this.A01 = i12 + 1;
        oldestSample.A01 = i12;
        oldestSample.A02 = i10;
        oldestSample.A00 = f10;
        this.A05.add(oldestSample);
        this.A03 += i10;
        while (this.A03 > this.A04 && !this.A05.isEmpty()) {
            int excessWeight = this.A03 - this.A04;
            C1554eJ c1554eJ = this.A05.get(0);
            if (c1554eJ.A02 <= excessWeight) {
                this.A03 -= c1554eJ.A02;
                this.A05.remove(0);
                if (this.A02 < 5) {
                    C1554eJ[] c1554eJArr2 = this.A06;
                    int excessWeight2 = this.A02;
                    this.A02 = excessWeight2 + 1;
                    c1554eJArr2[excessWeight2] = c1554eJ;
                }
            } else {
                c1554eJ.A02 -= excessWeight;
                this.A03 -= excessWeight;
            }
        }
    }
}
