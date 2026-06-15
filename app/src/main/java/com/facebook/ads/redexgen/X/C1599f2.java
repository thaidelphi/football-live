package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.f2  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1599f2 {
    public boolean A00;
    public final InterfaceC1596ez A01;

    public C1599f2() {
        this(InterfaceC1596ez.A00);
    }

    public C1599f2(InterfaceC1596ez interfaceC1596ez) {
        this.A01 = interfaceC1596ez;
    }

    public final synchronized void A00() throws InterruptedException {
        while (!this.A00) {
            wait();
        }
    }

    public final synchronized void A01() {
        boolean z10 = false;
        while (true) {
            boolean wasInterrupted = this.A00;
            if (wasInterrupted) {
                break;
            }
            try {
                wait();
            } catch (InterruptedException unused) {
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean A02() {
        boolean z10;
        z10 = this.A00;
        this.A00 = false;
        return z10;
    }

    public final synchronized boolean A03() {
        return this.A00;
    }

    public final synchronized boolean A04() {
        if (this.A00) {
            return false;
        }
        this.A00 = true;
        notifyAll();
        return true;
    }

    public final synchronized boolean A05(long j10) throws InterruptedException {
        if (j10 <= 0) {
            return this.A00;
        }
        long nowMs = this.A01.A69();
        long j11 = nowMs + j10;
        if (j11 < nowMs) {
            A00();
        } else {
            while (!this.A00 && nowMs < j11) {
                long endMs = j11 - nowMs;
                wait(endMs);
                nowMs = this.A01.A69();
            }
        }
        return this.A00;
    }
}
