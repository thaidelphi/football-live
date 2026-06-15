package com.facebook.ads.redexgen.X;

import java.io.Closeable;
import java.io.IOException;
/* renamed from: com.facebook.ads.redexgen.X.Cd  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C0692Cd implements Closeable {
    public C0691Cc A00;
    public boolean A01;
    public final C0690Cb A02;
    public final Runnable A03;

    public C0692Cd(long j10, Runnable runnable) {
        this.A02 = new C0690Cb(j10);
        this.A02.A02();
        this.A03 = runnable;
        this.A01 = false;
    }

    private final synchronized void A03() {
        if (this.A00 == null && !this.A01) {
            this.A00 = new C0691Cc(this);
        }
    }

    public final C0690Cb A04() {
        return this.A02;
    }

    public final synchronized void A05() {
        if (this.A01) {
            return;
        }
        if (this.A00 == null) {
            this.A00 = new C0691Cc(this);
        }
        this.A00.A00();
    }

    public final synchronized void A06() {
        if (this.A02.A05() && !this.A01) {
            A03();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        C0691Cc executing;
        synchronized (this) {
            this.A01 = true;
            executing = this.A00;
        }
        if (executing != null) {
            executing.close();
        }
    }
}
