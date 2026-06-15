package com.facebook.ads.redexgen.X;

import android.os.Handler;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* renamed from: com.facebook.ads.redexgen.X.bA  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1360bA {
    public final int A00;
    public final R5 A01;
    public final long A02;
    public final CopyOnWriteArrayList<C1359b9> A03;

    public C1360bA() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    public C1360bA(CopyOnWriteArrayList<C1359b9> copyOnWriteArrayList, int i10, R5 r52, long j10) {
        this.A03 = copyOnWriteArrayList;
        this.A00 = i10;
        this.A01 = r52;
        this.A02 = j10;
    }

    private long A00(long j10) {
        long A0P = AbstractC1672gE.A0P(j10);
        if (A0P == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long mediaTimeMs = this.A02;
        return mediaTimeMs + A0P;
    }

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "https://github.com/androidx/media/pull/1768")
    private final void A01(final C1344ar c1344ar, final C1347au c1347au, final int i10) {
        Iterator<C1359b9> it = this.A03.iterator();
        while (it.hasNext()) {
            C1359b9 next = it.next();
            final InterfaceC1361bB interfaceC1361bB = next.A01;
            AbstractC1672gE.A1B(next.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.b4
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public final C1360bA A02(int i10, R5 r52, long j10) {
        return new C1360bA(this.A03, i10, r52, j10);
    }

    public final void A03(int i10, ZM zm, int i11, Object obj, long j10) {
        A0C(new C1347au(1, i10, zm, i11, obj, A00(j10), -9223372036854775807L));
    }

    public final void A04(Handler handler, InterfaceC1361bB interfaceC1361bB) {
        AbstractC1589es.A01(handler);
        AbstractC1589es.A01(interfaceC1361bB);
        this.A03.add(new C1359b9(handler, interfaceC1361bB));
    }

    public final void A05(C1344ar c1344ar, int i10, int i11, ZM zm, int i12, Object obj, long j10, long j11) {
        A09(c1344ar, new C1347au(i10, i11, zm, i12, obj, A00(j10), A00(j11)));
    }

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "https://github.com/androidx/media/pull/1768")
    public final void A06(C1344ar c1344ar, int i10, int i11, ZM zm, int i12, Object obj, long j10, long j11, int i13) {
        A01(c1344ar, new C1347au(i10, i11, zm, i12, obj, A00(j10), A00(j11)), i13);
    }

    public final void A07(C1344ar c1344ar, int i10, int i11, ZM zm, int i12, Object obj, long j10, long j11, IOException iOException, boolean z10) {
        A0A(c1344ar, new C1347au(i10, i11, zm, i12, obj, A00(j10), A00(j11)), iOException, z10);
    }

    public final void A08(@MetaExoPlayerCustomization C1344ar c1344ar, @MetaExoPlayerCustomization int i10, int i11, ZM zm, int i12, Object obj, long j10, long j11, Object obj2, Object obj3) {
        A0B(c1344ar, new C1347au(i10, i11, zm, i12, obj, A00(j10), A00(j11)), obj2, obj3);
    }

    public final void A09(final C1344ar c1344ar, final C1347au c1347au) {
        Iterator<C1359b9> it = this.A03.iterator();
        while (it.hasNext()) {
            C1359b9 next = it.next();
            final InterfaceC1361bB listener = next.A01;
            AbstractC1672gE.A1B(next.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.b3
                @Override // java.lang.Runnable
                public final void run() {
                    C1360bA.this.A0E(listener, c1344ar, c1347au);
                }
            });
        }
    }

    public final void A0A(final C1344ar c1344ar, final C1347au c1347au, final IOException iOException, final boolean z10) {
        Iterator<C1359b9> it = this.A03.iterator();
        while (it.hasNext()) {
            C1359b9 next = it.next();
            final InterfaceC1361bB interfaceC1361bB = next.A01;
            AbstractC1672gE.A1B(next.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.b2
                @Override // java.lang.Runnable
                public final void run() {
                    C1360bA.this.A0F(interfaceC1361bB, c1344ar, c1347au, iOException, z10);
                }
            });
        }
    }

    public final void A0B(@MetaExoPlayerCustomization final C1344ar c1344ar, @MetaExoPlayerCustomization final C1347au c1347au, final Object obj, final Object obj2) {
        Iterator<C1359b9> it = this.A03.iterator();
        while (it.hasNext()) {
            C1359b9 next = it.next();
            final InterfaceC1361bB interfaceC1361bB = next.A01;
            AbstractC1672gE.A1B(next.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.b7
                @Override // java.lang.Runnable
                public final void run() {
                    C1360bA.this.A0G(interfaceC1361bB, c1344ar, c1347au, obj, obj2);
                }
            });
        }
    }

    public final void A0C(final C1347au c1347au) {
        Iterator<C1359b9> it = this.A03.iterator();
        while (it.hasNext()) {
            C1359b9 next = it.next();
            final InterfaceC1361bB listener = next.A01;
            AbstractC1672gE.A1B(next.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.b8
                @Override // java.lang.Runnable
                public final void run() {
                    C1360bA.this.A0H(listener, c1347au);
                }
            });
        }
    }

    public final void A0D(InterfaceC1361bB interfaceC1361bB) {
        Iterator<C1359b9> it = this.A03.iterator();
        while (it.hasNext()) {
            C1359b9 listenerAndHandler = it.next();
            if (listenerAndHandler.A01 == interfaceC1361bB) {
                this.A03.remove(listenerAndHandler);
            }
        }
    }

    public final /* synthetic */ void A0E(InterfaceC1361bB interfaceC1361bB, C1344ar c1344ar, C1347au c1347au) {
        interfaceC1361bB.ADp(this.A00, this.A01, c1344ar, c1347au);
    }

    public final /* synthetic */ void A0F(InterfaceC1361bB interfaceC1361bB, C1344ar c1344ar, C1347au c1347au, IOException iOException, boolean z10) {
        interfaceC1361bB.ADu(this.A00, this.A01, c1344ar, c1347au, iOException, z10);
    }

    public final /* synthetic */ void A0G(InterfaceC1361bB interfaceC1361bB, C1344ar c1344ar, C1347au c1347au, Object obj, Object obj2) {
        interfaceC1361bB.ADr(this.A00, this.A01, c1344ar, c1347au, obj, obj2);
    }

    public final /* synthetic */ void A0H(InterfaceC1361bB interfaceC1361bB, C1347au c1347au) {
        interfaceC1361bB.ACz(this.A00, this.A01, c1347au);
    }
}
