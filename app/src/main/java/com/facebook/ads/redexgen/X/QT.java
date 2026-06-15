package com.facebook.ads.redexgen.X;

import android.os.Looper;
import com.google.android.exoplayer2.Timeline;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class QT {
    public int A00;
    public int A01;
    public Looper A03;
    public Object A04;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final QR A0A;
    public final QS A0B;
    public final Timeline A0C;
    public final InterfaceC1596ez A0D;
    public long A02 = -9223372036854775807L;
    public boolean A05 = true;

    public QT(QR qr, QS qs, Timeline timeline, int i10, InterfaceC1596ez interfaceC1596ez, Looper looper) {
        this.A0A = qr;
        this.A0B = qs;
        this.A0C = timeline;
        this.A03 = looper;
        this.A0D = interfaceC1596ez;
        this.A00 = i10;
    }

    public final int A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A01;
    }

    public final long A02() {
        return this.A02;
    }

    public final Looper A03() {
        return this.A03;
    }

    public final QS A04() {
        return this.A0B;
    }

    public final QT A05() {
        AbstractC1589es.A08(!this.A09);
        if (this.A02 == -9223372036854775807L) {
            AbstractC1589es.A07(this.A05);
        }
        this.A09 = true;
        this.A0A.AII(this);
        return this;
    }

    public final QT A06(int i10) {
        AbstractC1589es.A08(!this.A09);
        this.A01 = i10;
        return this;
    }

    public final QT A07(Object obj) {
        AbstractC1589es.A08(!this.A09);
        this.A04 = obj;
        return this;
    }

    public final Timeline A08() {
        return this.A0C;
    }

    public final Object A09() {
        return this.A04;
    }

    public final synchronized void A0A(boolean z10) {
        this.A07 |= z10;
        this.A08 = true;
        notifyAll();
    }

    public final boolean A0B() {
        return this.A05;
    }

    public final synchronized boolean A0C() throws InterruptedException {
        AbstractC1589es.A08(this.A09);
        AbstractC1589es.A08(this.A03.getThread() != Thread.currentThread());
        while (!this.A08) {
            wait();
        }
        return this.A07;
    }

    public final synchronized boolean A0D() {
        return this.A06;
    }
}
