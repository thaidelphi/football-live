package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: com.facebook.ads.redexgen.X.Kh  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C0904Kh extends AbstractC1700gh {
    public final /* synthetic */ C0833Ho A00;

    public C0904Kh(C0833Ho c0833Ho) {
        this.A00 = c0833Ho;
    }

    @Override // com.facebook.ads.redexgen.X.F4
    public final void ACH() {
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1700gh, com.facebook.ads.redexgen.X.F4
    public final void AD9(int i10, String str) {
        AtomicBoolean atomicBoolean;
        InterfaceC0831Hm interfaceC0831Hm;
        InterfaceC0831Hm interfaceC0831Hm2;
        atomicBoolean = this.A00.A0B;
        atomicBoolean.set(true);
        interfaceC0831Hm = this.A00.A02;
        if (interfaceC0831Hm != null) {
            interfaceC0831Hm2 = this.A00.A02;
            interfaceC0831Hm2.ADv();
        }
    }

    @Override // com.facebook.ads.redexgen.X.F4
    public final void ADP() {
        AtomicBoolean atomicBoolean;
        AtomicBoolean atomicBoolean2;
        InterfaceC0831Hm interfaceC0831Hm;
        InterfaceC0831Hm interfaceC0831Hm2;
        atomicBoolean = this.A00.A0B;
        if (!atomicBoolean.get()) {
            atomicBoolean2 = this.A00.A0A;
            if (atomicBoolean2.compareAndSet(false, true)) {
                interfaceC0831Hm = this.A00.A02;
                if (interfaceC0831Hm != null) {
                    interfaceC0831Hm2 = this.A00.A02;
                    interfaceC0831Hm2.ADP();
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.F4
    public final void AFo() {
        InterfaceC0831Hm interfaceC0831Hm;
        InterfaceC0831Hm interfaceC0831Hm2;
        interfaceC0831Hm = this.A00.A02;
        if (interfaceC0831Hm != null) {
            interfaceC0831Hm2 = this.A00.A02;
            interfaceC0831Hm2.AFo();
        }
    }
}
