package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.hm  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1766hm implements DP {
    public static String[] A02 = {"YUGwJzzikBNzfLIllCMdkir2Jyj8DuFq", "ntVfVONdyCctXWp", "AonpNDk7AlTTh7WnvPqW51ITIbVwFUJp", "NJZ9S98WzFijxyBcJxql7T6JOIFmEfw7", "8QFO", "nOxceDp", "zcnAPzBVA2CXXQsDQKs94da1Vf1b77Qu", "s6TvhQwfXdUE9Ss2QaqLkXkKVbAwWXrL"};
    public final /* synthetic */ C05576e A00;
    public final /* synthetic */ AbstractC1762hh A01;

    public C1766hm(AbstractC1762hh abstractC1762hh, C05576e c05576e) {
        this.A01 = abstractC1762hh;
        this.A00 = c05576e;
    }

    @Override // com.facebook.ads.redexgen.X.DP
    public final void AC5(DQ dq) {
        if (dq.getToolbarActionMode() == 8) {
            this.A01.A0W();
            return;
        }
        this.A01.A0D.A04(AE.A07, null);
        if (this.A01.A0e()) {
            return;
        }
        AbstractC1762hh abstractC1762hh = this.A01;
        if (A02[3].charAt(29) != 'f') {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[0] = "pLKL5MIsKfCUMWoMxvxDNCAoAO8BGlnS";
        strArr[7] = "7PsgTAKpTeXTqL7VuWAjeXRdKL6HZN4L";
        if (abstractC1762hh.A0b()) {
            this.A01.A0a(this.A00);
        } else {
            this.A00.finish(1);
        }
    }
}
