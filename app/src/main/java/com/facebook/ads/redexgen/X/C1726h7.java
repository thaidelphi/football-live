package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.SystemClock;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
/* renamed from: com.facebook.ads.redexgen.X.h7  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1726h7 {
    public final Handler A00;
    public final InterfaceC1727h8 A01;

    public C1726h7(Handler handler, InterfaceC1727h8 interfaceC1727h8) {
        this.A00 = interfaceC1727h8 != null ? (Handler) AbstractC1589es.A01(handler) : null;
        this.A01 = interfaceC1727h8;
    }

    public final void A00(final int i10, final long j10) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.h5
                @Override // java.lang.Runnable
                public final void run() {
                    C1726h7.this.A02(i10, j10);
                }
            });
        }
    }

    public final void A01(final int i10, final long j10) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.gx
                @Override // java.lang.Runnable
                public final void run() {
                    C1726h7.this.A03(i10, j10);
                }
            });
        }
    }

    public final /* synthetic */ void A02(int i10, long j10) {
        ((InterfaceC1727h8) AbstractC1672gE.A0f(this.A01)).ACk(i10, j10);
    }

    public final /* synthetic */ void A03(int i10, long j10) {
        ((InterfaceC1727h8) AbstractC1672gE.A0f(this.A01)).AD0(i10, j10);
    }

    @MetaExoPlayerCustomization("New event handler")
    public final void A04(int i10, ZM zm) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC1725h6(this, i10, zm));
        }
    }

    public final void A05(final OA oa) {
        oa.A02();
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.h1
                @Override // java.lang.Runnable
                public final void run() {
                    C1726h7.this.A07(oa);
                }
            });
        }
    }

    public final void A06(final OA oa) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.gu
                @Override // java.lang.Runnable
                public final void run() {
                    C1726h7.this.A08(oa);
                }
            });
        }
    }

    public final /* synthetic */ void A07(OA oa) {
        oa.A02();
        ((InterfaceC1727h8) AbstractC1672gE.A0f(this.A01)).AFW(oa);
    }

    public final /* synthetic */ void A08(OA oa) {
        ((InterfaceC1727h8) AbstractC1672gE.A0f(this.A01)).AFX(oa);
    }

    public final void A09(final ZM zm, final OD od) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.h0
                @Override // java.lang.Runnable
                public final void run() {
                    C1726h7.this.A0A(zm, od);
                }
            });
        }
    }

    public final /* synthetic */ void A0A(ZM zm, OD od) {
        ((InterfaceC1727h8) AbstractC1672gE.A0f(this.A01)).AFc(zm);
        ((InterfaceC1727h8) AbstractC1672gE.A0f(this.A01)).AFd(zm, od);
    }

    public final void A0B(final Y2 y22) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.gz
                @Override // java.lang.Runnable
                public final void run() {
                    C1726h7.this.A0C(y22);
                }
            });
        }
    }

    public final /* synthetic */ void A0C(Y2 y22) {
        ((InterfaceC1727h8) AbstractC1672gE.A0f(this.A01)).AFj(y22);
    }

    public final void A0D(final Object obj) {
        if (this.A00 != null) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.gy
                @Override // java.lang.Runnable
                public final void run() {
                    C1726h7.this.A0E(obj, elapsedRealtime);
                }
            });
        }
    }

    public final /* synthetic */ void A0E(Object obj, long j10) {
        ((InterfaceC1727h8) AbstractC1672gE.A0f(this.A01)).AEp(obj, j10);
    }

    @MetaExoPlayerCustomization("New event handler")
    public final void A0F(final String str) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.h2
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public final void A0G(final String str, final long j10, final long j11) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.gv
                @Override // java.lang.Runnable
                public final void run() {
                    C1726h7.this.A0H(str, j10, j11);
                }
            });
        }
    }

    public final /* synthetic */ void A0H(String str, long j10, long j11) {
        ((InterfaceC1727h8) AbstractC1672gE.A0f(this.A01)).AFV(str, j10, j11);
    }
}
