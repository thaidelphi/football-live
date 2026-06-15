package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.g0  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1658g0 extends BY {
    public static String[] A02 = {"LRx", "usnMdIZ0FvkqiUZevNTWLktoEg5pLAC7", "DXfpDntuFVUaB3iAC9xpEYaXMcysh68b", "KPagnGwIHNxRQqHn90bhIF", "OiThbZ96vqk0YqBrWrlbCPGqj", "zO4ylzajSSdkzzLOGvXbKRrkPLlgkkF6", "2QDKj7W9IPpyibsxcOZVzQQBEZY6mcrJ", "j8cJ2BFMipeHC45SmF0VkU4zcd"};
    public final /* synthetic */ C1652fu A00;
    public final /* synthetic */ boolean A01;

    public C1658g0(C1652fu c1652fu, boolean z10) {
        this.A00 = c1652fu;
        this.A01 = z10;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void A05() {
        C0790Fx c0790Fx;
        boolean z10;
        c0790Fx = this.A00.A0M;
        DQ A0B = c0790Fx.A0B();
        if (A0B != null) {
            if (!this.A01) {
                boolean A0B2 = A0B.A0B();
                if (A02[4].length() != 25) {
                    throw new RuntimeException();
                }
                A02[4] = "GjOMFYo3T7nhomgErVvGRCVPy";
                if (!A0B2) {
                    z10 = true;
                    A0B.setPageDetailsVisible(z10);
                    A0B.setToolbarActionMode(this.A00.getCloseButtonStyle());
                }
            }
            z10 = false;
            A0B.setPageDetailsVisible(z10);
            A0B.setToolbarActionMode(this.A00.getCloseButtonStyle());
        }
    }
}
