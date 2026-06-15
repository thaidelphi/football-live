package com.facebook.ads.redexgen.X;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;
/* renamed from: com.facebook.ads.redexgen.X.61  reason: invalid class name */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class AnonymousClass61 implements TQ {
    public int A00;
    public boolean A01;
    public final C1211Wt A02 = new C1211Wt();
    public final C06228s A03 = new C06228s();
    public final Deque<AbstractC06208q> A04 = new ArrayDeque();

    public AnonymousClass61() {
        for (int i10 = 0; i10 < 2; i10++) {
            this.A04.addFirst(new AbstractC06208q() { // from class: com.facebook.ads.redexgen.X.0w
                @Override // com.facebook.ads.redexgen.X.AbstractC06208q, com.facebook.ads.redexgen.X.AbstractC1212Wu
                public final void A0B() {
                    AnonymousClass61.this.A03(this);
                }
            });
        }
        this.A00 = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC1108Sl
    /* renamed from: A00 */
    public final C06228s A5h() throws TP {
        AbstractC1589es.A08(!this.A01);
        if (this.A00 != 0) {
            return null;
        }
        this.A00 = 1;
        return this.A03;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC1108Sl
    /* renamed from: A01 */
    public final AbstractC06208q A5j() throws TP {
        AbstractC1589es.A08(!this.A01);
        if (this.A00 != 2 || this.A04.isEmpty()) {
            return null;
        }
        AbstractC06208q removeFirst = this.A04.removeFirst();
        if (this.A03.A05()) {
            removeFirst.A00(4);
        } else {
            removeFirst.A0C(this.A03.A01, new C1050Qe(this.A03.A01, this.A02.A02(((ByteBuffer) AbstractC1589es.A01(this.A03.A02)).array())), 0L);
        }
        this.A03.A0A();
        this.A00 = 0;
        return removeFirst;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC1108Sl
    /* renamed from: A02 */
    public final void AGR(C06228s c06228s) throws TP {
        AbstractC1589es.A08(!this.A01);
        AbstractC1589es.A08(this.A00 == 1);
        AbstractC1589es.A07(this.A03 == c06228s);
        this.A00 = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(AbstractC06208q abstractC06208q) {
        AbstractC1589es.A08(this.A04.size() < 2);
        AbstractC1589es.A07(!this.A04.contains(abstractC06208q));
        abstractC06208q.A0A();
        this.A04.addFirst(abstractC06208q);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1108Sl
    public final void AGj() {
        this.A01 = true;
    }

    @Override // com.facebook.ads.redexgen.X.TQ
    public final void AIn(long j10) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1108Sl
    public final void flush() {
        AbstractC1589es.A08(!this.A01);
        this.A03.A0A();
        this.A00 = 0;
    }
}
