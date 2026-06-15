package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.EnumSet;
/* renamed from: com.facebook.ads.redexgen.X.mX  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C2052mX implements InterfaceC04722u {
    public static String[] A07 = {"LaTcnwnUfzgLTffZJQ1IPucRbglpEgMo", "12hOZJfgSqwHBnuTqXHxpHxEQ0NbZO7A", "Dr9pHE3G5odEHWCsCqxBSNpdFpwa86Mh", "MDWd5GjifHIGoqp8wS2KmhLcZ8", "Ozio236b3SA3ZtX", "C3UkekSSOdUqAnfYGByVev7l4a4YpLBv", "Q070rE4WAmrDPncHn0R1JG2tySYrh7TO", ""};
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC2058md A01;
    public final /* synthetic */ C2056mb A02;
    public final /* synthetic */ InterfaceC04722u A03;
    public final /* synthetic */ C04732v A04;
    public final /* synthetic */ C1900k1 A05;
    public final /* synthetic */ EnumSet A06;

    public C2052mX(C04732v c04732v, C1900k1 c1900k1, AbstractC2058md abstractC2058md, C2056mb c2056mb, int i10, InterfaceC04722u interfaceC04722u, EnumSet enumSet) {
        this.A04 = c04732v;
        this.A05 = c1900k1;
        this.A01 = abstractC2058md;
        this.A02 = c2056mb;
        this.A00 = i10;
        this.A03 = interfaceC04722u;
        this.A06 = enumSet;
    }

    private final void A00() {
        if (this.A00 + 1 < this.A02.A1W()) {
            this.A04.A0A(this.A05, this.A06, this.A02, this.A02.A1Z(this.A00 + 1), this.A00 + 1, this.A03);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04722u
    public final void AC8(AdError adError) {
        if (this.A00 == 0) {
            this.A03.AC8(adError);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04722u
    public final void AC9() {
        this.A05.A01().AIK(this.A01.A1g(), this.A02.A1a());
        if (this.A00 == 0) {
            InterfaceC04722u interfaceC04722u = this.A03;
            String[] strArr = A07;
            if (strArr[5].charAt(13) != strArr[6].charAt(13)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[3] = "Mfrds6r17BKRZSfVfcuH4MZ0YR";
            strArr2[4] = "cdrsota1fCopt7F";
            interfaceC04722u.AC9();
        }
        A00();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04722u
    public final void AGg() {
        if (this.A00 == 0) {
            this.A03.AGg();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04722u
    public final void AJc() {
        if (this.A00 == 0) {
            this.A03.AJc();
        }
    }
}
