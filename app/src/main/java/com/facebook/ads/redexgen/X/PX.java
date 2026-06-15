package com.facebook.ads.redexgen.X;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class PX implements InterfaceC1509dZ {
    public int A00;
    public int A01;
    public InterfaceC1506dW A02;
    public InterfaceC1509dZ A04;
    public InterfaceC1562eR A05;
    public boolean A07;
    public InterfaceC1509dZ A03 = new C1037Pp();
    public InterfaceC1571ea A06 = InterfaceC1571ea.A00;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC1509dZ
    /* renamed from: A00 */
    public final C05084e A58() {
        return A01(this.A04 != null ? this.A04.A58() : null, this.A00, this.A01);
    }

    private C05084e A01(Q7 q72, int i10, int i11) {
        PY py;
        InterfaceC1562eR interfaceC1562eR = (InterfaceC1562eR) AbstractC1589es.A01(this.A05);
        if (this.A07 || q72 == null) {
            py = null;
        } else if (this.A02 != null) {
            py = this.A02.A57();
        } else {
            py = new C1025Pd().A00(interfaceC1562eR).A57();
        }
        return new C05084e(interfaceC1562eR, q72, this.A03.A58(), py, this.A06, i10, null, i11, null);
    }

    public final QV A02() {
        return null;
    }

    public final PX A03(int i10) {
        this.A00 = i10;
        return this;
    }

    public final PX A04(InterfaceC1509dZ interfaceC1509dZ) {
        this.A03 = interfaceC1509dZ;
        return this;
    }

    public final PX A05(InterfaceC1509dZ interfaceC1509dZ) {
        this.A04 = interfaceC1509dZ;
        return this;
    }

    public final PX A06(InterfaceC1562eR interfaceC1562eR) {
        this.A05 = interfaceC1562eR;
        return this;
    }

    public final C05084e A07() {
        return A01(this.A04 != null ? this.A04.A58() : null, this.A00 | 1, -1000);
    }
}
