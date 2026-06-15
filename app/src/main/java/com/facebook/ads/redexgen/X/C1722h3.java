package com.facebook.ads.redexgen.X;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.h3  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1722h3 extends AbstractC05435q<C1483d9> {
    public int A00;
    public int A01;
    public int A02;
    public DR A03;
    public JL A04;
    public String A05;
    public List<C0821Hc> A06;
    public final SparseBooleanArray A07 = new SparseBooleanArray();
    public final AbstractC2058md A08;
    public final C05987t A09;
    public final C1900k1 A0A;
    public final A7 A0B;
    public final C1816ie A0C;
    public final C0710Cv A0D;
    public final C0926Ld A0E;
    public final C1355b5 A0F;

    public C1722h3(C1900k1 c1900k1, List<C0821Hc> list, AbstractC2058md abstractC2058md, A7 a72, C1816ie c1816ie, DR dr, String str, C0926Ld c0926Ld, C1355b5 c1355b5) {
        this.A0A = c1900k1;
        this.A0B = a72;
        this.A0C = c1816ie;
        this.A09 = c1816ie.A11();
        this.A04 = c1816ie.A1B();
        this.A0D = c1816ie.A1A();
        this.A03 = dr;
        this.A08 = abstractC2058md;
        this.A06 = list;
        this.A05 = str;
        this.A0E = c0926Ld;
        this.A0F = c1355b5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC05435q
    /* renamed from: A01 */
    public final C1483d9 A0D(ViewGroup viewGroup, int i10) {
        return new C1483d9(FR.A00(new C0789Fw(this.A0A, this.A0B, this.A03, this.A08, null, this.A04, this.A0D).A0O(this.A0F).A0K(this.A0C).A0Q(), this.A0C, this.A05, this.A0E), this.A07, this.A04, this.A06.size(), this.A0A, this.A08.A1c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC05435q
    /* renamed from: A02 */
    public final void A0E(C1483d9 c1483d9, int i10) {
        c1483d9.A0k(this.A04);
        c1483d9.A0j(this.A06.get(i10), this.A0B, this.A09, this.A0D, this.A05, this.A00, this.A02, this.A01);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05435q
    public final int A0C() {
        return this.A06.size();
    }

    public final void A0G(int i10, int i11, int i12) {
        boolean needsUpdate = i10 != this.A00;
        this.A00 = i10;
        this.A02 = i11;
        this.A01 = i12;
        if (needsUpdate) {
            A06();
        }
    }

    public final void A0H(JL jl) {
        this.A04 = jl;
    }
}
