package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.Pd  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1025Pd implements InterfaceC1506dW {
    public InterfaceC1562eR A02;
    public long A01 = 5242880;
    public int A00 = 20480;

    public final C1025Pd A00(InterfaceC1562eR interfaceC1562eR) {
        this.A02 = interfaceC1562eR;
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1506dW
    public final PY A57() {
        return new PY((InterfaceC1562eR) AbstractC1589es.A01(this.A02), this.A01, this.A00);
    }
}
