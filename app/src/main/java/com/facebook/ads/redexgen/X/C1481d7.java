package com.facebook.ads.redexgen.X;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.d7  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1481d7 extends AbstractC05435q<C1456ci> {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public DQ A04;
    public DR A05;
    public String A06;
    public List<C0821Hc> A07;
    public boolean A08;
    public final SparseBooleanArray A09 = new SparseBooleanArray();
    public final AbstractC2058md A0A;
    public final C05987t A0B;
    public final C1900k1 A0C;
    public final A7 A0D;
    public final C0710Cv A0E;
    public final C1492dI A0F;
    public final JL A0G;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public C1481d7(C1900k1 c1900k1, List<C0821Hc> list, AbstractC2058md abstractC2058md, A7 a72, C05987t c05987t, JL jl, C0710Cv c0710Cv, DR dr, String str, int i10, int i11, int i12, int i13, C1492dI c1492dI, DQ dq) {
        this.A0C = c1900k1;
        this.A0D = a72;
        this.A0B = c05987t;
        this.A0G = jl;
        this.A0E = c0710Cv;
        this.A05 = dr;
        this.A0A = abstractC2058md;
        this.A07 = list;
        this.A00 = i10;
        this.A03 = i13;
        this.A06 = str;
        this.A01 = i12;
        this.A02 = i11;
        this.A0F = c1492dI;
        this.A04 = dq;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC05435q
    /* renamed from: A01 */
    public final C1456ci A0D(ViewGroup viewGroup, int i10) {
        return new C1456ci(AbstractC0796Gd.A00(new C0789Fw(this.A0C, this.A0D, this.A05, this.A0A, null, this.A0G, this.A0E).A0N(this.A04).A0Q(), this.A03, this.A06, this.A0F), this.A09, this.A0G, this.A00, this.A01, this.A02, this.A07.size(), this.A0C, this.A0A.A1c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC05435q
    /* renamed from: A02 */
    public final void A0E(C1456ci c1456ci, int i10) {
        c1456ci.A0k(this.A07.get(i10), this.A0D, this.A0B, this.A0E, this.A06);
        if (!this.A08 && i10 == 0) {
            c1456ci.AIL();
            this.A08 = true;
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05435q
    public final int A0C() {
        return this.A07.size();
    }
}
