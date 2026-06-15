package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.google.android.exoplayer2.Timeline;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArraySet;
/* renamed from: com.facebook.ads.redexgen.X.Dy  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C0739Dy extends AbstractC1279Zl implements ZQ {
    public static byte[] A0N;
    public float A00;
    public int A01;
    public int A02;
    public Surface A03;
    public SurfaceHolder A04;
    public TextureView A05;
    public C1280Zm A06;
    public OA A07;
    public OA A08;
    public ZM A09;
    public ZM A0A;
    public InterfaceC1352az A0B;
    public boolean A0C;
    public final Handler A0D;
    public final E9 A0E;
    public final SurfaceHolder$CallbackC1257Yo A0F;
    public final InterfaceC1241Xx A0G;
    public final CopyOnWriteArraySet<InterfaceC1086Rp> A0H;
    public final CopyOnWriteArraySet<QJ> A0I;
    public final CopyOnWriteArraySet<InterfaceC1273Ze> A0J;
    public final CopyOnWriteArraySet<InterfaceC1727h8> A0K;
    public final CopyOnWriteArraySet<InterfaceC1256Yn> A0L;
    public final InterfaceC1259Yq[] A0M;

    static {
        A0E();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public C0739Dy(Context context, InterfaceC1058Qm interfaceC1058Qm, AbstractC1490dG abstractC1490dG, PC pc, InterfaceC1502dS interfaceC1502dS, TO to, InterfaceC1771hs<InterfaceC1596ez, InterfaceC1241Xx> interfaceC1771hs, InterfaceC1596ez interfaceC1596ez) {
        this.A0F = new SurfaceHolder$CallbackC1257Yo(this);
        this.A0L = new CopyOnWriteArraySet<>();
        this.A0J = new CopyOnWriteArraySet<>();
        this.A0K = new CopyOnWriteArraySet<>();
        this.A0H = new CopyOnWriteArraySet<>();
        Looper myLooper = Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper();
        this.A0D = new Handler(myLooper);
        this.A0M = interfaceC1058Qm.A5O(this.A0D, this.A0F, this.A0F, this.A0F, this.A0F, to);
        this.A00 = 1.0f;
        this.A01 = 0;
        this.A06 = C1280Zm.A07;
        this.A02 = 1;
        this.A0E = A04(this.A0M, abstractC1490dG, pc, interfaceC1502dS, interfaceC1596ez);
        this.A0G = interfaceC1771hs.A41(interfaceC1596ez);
        this.A0G.AIl(this.A0E, myLooper);
        this.A0I = new CopyOnWriteArraySet<>();
    }

    public static String A07(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0N, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 115);
        }
        return new String(copyOfRange);
    }

    public static void A0E() {
        A0N = new byte[]{25, 47, 51, 54, 50, 43, 11, 62, 53, 22, 50, 39, 63, 43, 56, -3, 31, 28, 16, 11, 13, 15, -2, 15, 34, 30, 31, 28, 15, -10, 19, 29, 30, 15, 24, 15, 28, -54, 11, 22, 28, 15, 11, 14, 35, -54, 31, 24, 29, 15, 30, -54, 25, 28, -54, 28, 15, 26, 22, 11, 13, 15, 14, -40};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.hs != com.google.common.base.Function<com.google.android.exoplayer2.util.Clock, com.google.android.exoplayer2.analytics.AnalyticsCollector> */
    public C0739Dy(Context context, InterfaceC1058Qm interfaceC1058Qm, AbstractC1490dG abstractC1490dG, PC pc, InterfaceC1502dS interfaceC1502dS, TO to, InterfaceC1771hs<InterfaceC1596ez, InterfaceC1241Xx> interfaceC1771hs) {
        this(context, interfaceC1058Qm, abstractC1490dG, pc, interfaceC1502dS, to, interfaceC1771hs, InterfaceC1596ez.A00);
    }

    @Deprecated
    public C0739Dy(InterfaceC1058Qm interfaceC1058Qm, AbstractC1490dG abstractC1490dG, PC pc, InterfaceC1502dS interfaceC1502dS, TO to) {
        this(null, interfaceC1058Qm, abstractC1490dG, pc, interfaceC1502dS, to, new InterfaceC1771hs() { // from class: com.facebook.ads.redexgen.X.ZP
            @Override // com.facebook.ads.redexgen.X.InterfaceC1771hs
            public final Object A41(Object obj) {
                return new C0711Cw((InterfaceC1596ez) obj);
            }
        });
    }

    private final E9 A04(InterfaceC1259Yq[] interfaceC1259YqArr, AbstractC1490dG abstractC1490dG, PC pc, InterfaceC1502dS interfaceC1502dS, InterfaceC1596ez interfaceC1596ez) {
        return new E9(interfaceC1259YqArr, abstractC1490dG, pc, interfaceC1502dS, interfaceC1596ez);
    }

    private void A0D() {
        if (this.A05 != null) {
            if (this.A05.getSurfaceTextureListener() != this.A0F) {
                Log.w(A07(0, 15, 83), A07(15, 49, 55));
            } else {
                this.A05.setSurfaceTextureListener(null);
            }
            this.A05 = null;
        }
        if (this.A04 != null) {
            this.A04.removeCallback(this.A0F);
            this.A04 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0F(Surface surface, boolean z10) {
        InterfaceC1259Yq[] interfaceC1259YqArr;
        ArrayList<QT> arrayList = new ArrayList();
        for (InterfaceC1259Yq interfaceC1259Yq : this.A0M) {
            if (interfaceC1259Yq.A9D() == 2) {
                arrayList.add(this.A0E.A0L(interfaceC1259Yq).A06(1).A07(surface).A05());
            }
        }
        if (this.A03 != null && this.A03 != surface) {
            try {
                for (QT qt : arrayList) {
                    qt.A0C();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            if (this.A0C) {
                this.A03.release();
            }
        }
        this.A03 = surface;
        this.A0C = z10;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1279Zl
    public final void A0H(int i10, long j10) {
        this.A0G.ABz();
        this.A0E.A0H(i10, j10);
    }

    public final int A0I() {
        return this.A01;
    }

    public final ZM A0J() {
        return this.A09;
    }

    public final ZM A0K() {
        return this.A0A;
    }

    public final void A0L() {
        this.A0E.A0M();
        A0D();
        if (this.A03 != null) {
            if (this.A0C) {
                this.A03.release();
            }
            this.A03 = null;
        }
        if (this.A0B != null) {
            this.A0B.AHY(this.A0G);
            this.A0B = null;
        }
    }

    public final void A0M(float f10) {
        InterfaceC1259Yq[] interfaceC1259YqArr;
        float A00 = AbstractC1672gE.A00(f10, 0.0f, 1.0f);
        if (this.A00 == A00) {
            return;
        }
        this.A00 = A00;
        for (InterfaceC1259Yq interfaceC1259Yq : this.A0M) {
            if (interfaceC1259Yq.A9D() == 1) {
                this.A0E.A0L(interfaceC1259Yq).A06(2).A07(Float.valueOf(A00)).A05();
            }
        }
    }

    public final void A0N(Surface surface) {
        A0D();
        A0F(surface, false);
    }

    public final void A0O(QJ qj) {
        this.A0E.A0O(qj);
        this.A0I.add(qj);
    }

    public final void A0P(InterfaceC1256Yn interfaceC1256Yn) {
        this.A0L.add(interfaceC1256Yn);
    }

    public final void A0Q(InterfaceC1352az interfaceC1352az) {
        A0R(interfaceC1352az, true, true);
    }

    public final void A0R(InterfaceC1352az interfaceC1352az, boolean z10, boolean z11) {
        if (this.A0B != null) {
            this.A0B.AHY(this.A0G);
        }
        this.A0B = interfaceC1352az;
        interfaceC1352az.A3p(this.A0D, this.A0G);
        this.A0E.A0P(interfaceC1352az, z10, z11);
    }

    public final void A0S(boolean z10) {
        this.A0E.A0Q(z10);
    }

    public final boolean A0T() {
        return this.A0E.A0R();
    }

    @Override // com.facebook.ads.redexgen.X.QQ
    public final long A6x() {
        return this.A0E.A6x();
    }

    @Override // com.facebook.ads.redexgen.X.QQ
    public final long A7J() {
        return this.A0E.A7J();
    }

    @Override // com.facebook.ads.redexgen.X.QQ
    public final int A7O() {
        return this.A0E.A7O();
    }

    @Override // com.facebook.ads.redexgen.X.QQ
    public final int A7P() {
        return this.A0E.A7P();
    }

    @Override // com.facebook.ads.redexgen.X.QQ
    public final int A7R() {
        return this.A0E.A7R();
    }

    @Override // com.facebook.ads.redexgen.X.QQ
    public final int A7S() {
        return this.A0E.A7S();
    }

    @Override // com.facebook.ads.redexgen.X.QQ
    public final long A7U() {
        return this.A0E.A7U();
    }

    @Override // com.facebook.ads.redexgen.X.QQ
    public final Timeline A7W() {
        return this.A0E.A7W();
    }

    @Override // com.facebook.ads.redexgen.X.QQ
    public final int A7X() {
        return this.A0E.A7X();
    }

    @Override // com.facebook.ads.redexgen.X.QQ
    public final long A7i() {
        return this.A0E.A7i();
    }

    @Override // com.facebook.ads.redexgen.X.QQ
    public final long A99() {
        return this.A0E.A99();
    }

    @Override // com.facebook.ads.redexgen.X.QQ
    public final boolean AAS() {
        return this.A0E.AAS();
    }

    @Override // com.facebook.ads.redexgen.X.QQ
    public final void AJL(boolean z10) {
        this.A0E.AJL(z10);
        if (this.A0B != null) {
            this.A0B.AHY(this.A0G);
            this.A0B = null;
            if (z10) {
                this.A0B = null;
            }
        }
    }
}
