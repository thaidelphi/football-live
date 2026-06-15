package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.Op  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1011Op implements InterfaceC1796iJ {
    public final /* synthetic */ AbstractC1014Os A00;

    public C1011Op(final AbstractC1014Os val$separatorMatcher) {
        this.A00 = val$separatorMatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.4a] */
    @Override // com.facebook.ads.redexgen.X.InterfaceC1796iJ
    /* renamed from: A00 */
    public final C05044a AAa(final C1797iK splitter, final CharSequence toSplit) {
        return new Oo(splitter, toSplit) { // from class: com.facebook.ads.redexgen.X.4a
            @Override // com.facebook.ads.redexgen.X.Oo
            public final int A04(int separatorPosition) {
                return separatorPosition + 1;
            }

            @Override // com.facebook.ads.redexgen.X.Oo
            public final int A05(int start) {
                return C1011Op.this.A00.A08(this.A03, start);
            }
        };
    }
}
