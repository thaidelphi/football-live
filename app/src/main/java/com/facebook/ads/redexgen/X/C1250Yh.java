package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
/* renamed from: com.facebook.ads.redexgen.X.Yh  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1250Yh implements InterfaceC0973Nb {
    public int A00;
    public long A01;
    public long A02;
    public Object A03;
    public Object A04;
    public boolean A05;
    public C1284Zq A06 = C1284Zq.A08;
    public static String[] A07 = {"G9WL4rn12iP6MyxvnFNwDtQWsimlKdOL", "5vvu1vG4BQil762AXDshcOSHPA4me7wW", "", "IsJF7Y1nrSs0jxoBG0t78uVULAdJVy1C", "We8vwXt7TZnfCQYZLmN8kIA2X", "CW", "iQjNWKLgBFbyGY8ZXGBvi2tWoFAZOZnz", "rgBv8h0AMw5V2xLZmvANYUoNfbGvDgEj"};
    public static final String A0D = AbstractC1672gE.A0h(0);
    public static final String A0A = AbstractC1672gE.A0h(1);
    public static final String A0C = AbstractC1672gE.A0h(2);
    public static final String A0B = AbstractC1672gE.A0h(3);
    public static final String A09 = AbstractC1672gE.A0h(4);
    public static final InterfaceC0972Na<C1250Yh> A08 = new InterfaceC0972Na() { // from class: com.facebook.ads.redexgen.X.Yi
        @Override // com.facebook.ads.redexgen.X.InterfaceC0972Na
        public final InterfaceC0973Nb A6V(Bundle bundle) {
            C1250Yh A01;
            A01 = C1250Yh.A01(bundle);
            return A01;
        }
    };

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C1250Yh A01(Bundle bundle) {
        int i10 = bundle.getInt(A0D, 0);
        long j10 = bundle.getLong(A0A, -9223372036854775807L);
        long j11 = bundle.getLong(A0C, 0L);
        boolean z10 = bundle.getBoolean(A0B, false);
        Bundle bundle2 = bundle.getBundle(A09);
        C1284Zq A6V = bundle2 != null ? C1284Zq.A09.A6V(bundle2) : C1284Zq.A08;
        C1250Yh c1250Yh = new C1250Yh();
        c1250Yh.A0G(null, null, i10, j10, j11, A6V, z10);
        return c1250Yh;
    }

    public final int A03() {
        return this.A06.A00;
    }

    public final int A04(int i10) {
        return this.A06.A07(i10).A00;
    }

    public final int A05(int i10) {
        return this.A06.A07(i10).A04();
    }

    public final int A06(int i10, int i11) {
        return this.A06.A07(i10).A05(i11);
    }

    public final int A07(long j10) {
        return this.A06.A05(j10, this.A01);
    }

    public final int A08(long j10) {
        return this.A06.A06(j10, this.A01);
    }

    public final long A09() {
        return this.A06.A02;
    }

    public final long A0A() {
        return this.A01;
    }

    public final long A0B() {
        return AbstractC1672gE.A0P(this.A02);
    }

    public final long A0C() {
        return this.A02;
    }

    public final long A0D(int i10) {
        return this.A06.A07(i10).A03;
    }

    public final long A0E(int i10, int i11) {
        C1285Zr A072 = this.A06.A07(i10);
        if (A072.A00 != -1) {
            return A072.A06[i11];
        }
        return -9223372036854775807L;
    }

    public final C1250Yh A0F(Object obj, Object obj2, int i10, long j10, long j11) {
        return A0G(obj, obj2, i10, j10, j11, C1284Zq.A08, false);
    }

    public final C1250Yh A0G(Object obj, Object obj2, int i10, long j10, long j11, C1284Zq c1284Zq, boolean z10) {
        this.A03 = obj;
        this.A04 = obj2;
        this.A00 = i10;
        this.A01 = j10;
        this.A02 = j11;
        this.A06 = c1284Zq;
        this.A05 = z10;
        return this;
    }

    public final boolean A0H(int i10) {
        return !this.A06.A07(i10).A07();
    }

    @MetaExoPlayerCustomization("Can be removed once MediaPeriodQueue is updated.")
    public final boolean A0I(int i10, int i11) {
        C1285Zr c1285Zr = this.A06.A05[i10];
        if (c1285Zr.A00 != -1) {
            int[] iArr = c1285Zr.A05;
            if (A07[2].length() == 11) {
                throw new RuntimeException();
            }
            A07[2] = "KV2GFfXtv35xYupWYP2sQJI3oJ5M";
            if (iArr[i11] != 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        C1250Yh c1250Yh = (C1250Yh) obj;
        if (AbstractC1672gE.A1E(this.A03, c1250Yh.A03) && AbstractC1672gE.A1E(this.A04, c1250Yh.A04) && this.A00 == c1250Yh.A00 && this.A01 == c1250Yh.A01 && this.A02 == c1250Yh.A02 && this.A05 == c1250Yh.A05 && AbstractC1672gE.A1E(this.A06, c1250Yh.A06)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = 7 * 31;
        int result = this.A03 == null ? 0 : this.A03.hashCode();
        int result2 = (i10 + result) * 31;
        int hashCode = this.A04 != null ? this.A04.hashCode() : 0;
        int result3 = this.A00;
        int result4 = (int) (this.A02 ^ (this.A02 >>> 32));
        int result5 = (((((((result2 + hashCode) * 31) + result3) * 31) + ((int) (this.A01 ^ (this.A01 >>> 32)))) * 31) + result4) * 31;
        int result6 = this.A06.hashCode();
        return ((result5 + (this.A05 ? 1 : 0)) * 31) + result6;
    }
}
