package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.Oy */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1020Oy implements InterfaceC1624fS {
    public static final List<C1021Oz> A01 = new ArrayList(50);
    public final Handler A00;

    public C1020Oy(Handler handler) {
        this.A00 = handler;
    }

    public static C1021Oz A00() {
        C1021Oz c1021Oz;
        synchronized (A01) {
            c1021Oz = A01.isEmpty() ? new C1021Oz() : A01.remove(A01.size() - 1);
        }
        return c1021Oz;
    }

    public static void A01(C1021Oz c1021Oz) {
        synchronized (A01) {
            if (A01.size() < 50) {
                A01.add(c1021Oz);
            }
        }
    }

    public final boolean A03(Runnable runnable) {
        return this.A00.post(runnable);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1624fS
    public final Looper A8H() {
        return this.A00.getLooper();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1624fS
    public final boolean A9d(int i10) {
        return this.A00.hasMessages(i10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1624fS
    public final C1021Oz AC1(int i10) {
        return A00().A01(this.A00.obtainMessage(i10), this);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1624fS
    public final C1021Oz AC2(int i10, int i11, int i12) {
        return A00().A01(this.A00.obtainMessage(i10, i11, i12), this);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1624fS
    public final C1021Oz AC3(int i10, int i11, int i12, Object obj) {
        return A00().A01(this.A00.obtainMessage(i10, i11, i12, obj), this);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1624fS
    public final C1021Oz AC4(int i10, Object obj) {
        return A00().A01(this.A00.obtainMessage(i10, obj), this);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1624fS
    public final void AHZ(int i10) {
        this.A00.removeMessages(i10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1624fS
    public final boolean AIG(int i10) {
        return this.A00.sendEmptyMessage(i10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1624fS
    public final boolean AIH(int i10, long j10) {
        return this.A00.sendEmptyMessageAtTime(i10, j10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1624fS
    public final boolean AIJ(InterfaceC1623fR interfaceC1623fR) {
        return ((C1021Oz) interfaceC1623fR).A03(this.A00);
    }
}
