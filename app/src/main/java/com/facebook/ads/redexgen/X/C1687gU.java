package com.facebook.ads.redexgen.X;

import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.unity3d.services.core.di.ServiceProvider;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
/* renamed from: com.facebook.ads.redexgen.X.gU  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1687gU {
    public static byte[] A0H;
    public static String[] A0I = {"saGB", "SUr8DbhdPR0QKESIBesBtIZf1RNXaDu9", "3B6ejn9Al9y6xF5Y3W4yjhs0CycLJbyo", "E0WyJ2mTzzweghTR8WcAEnnA9EHgxetY", "fWbuzygKrFV8uzJe9uAIQlSF71VqHG7u", "zMcsmU9c2Kvl8lZeN4cIZdRi6", "2RqqNgbCWElnDYjfvuqMXOiCo", "BukCkY6NOFEwtwv11zc1pxLHLxFvfGMh"};
    public Handler A04;
    public Pair<Long, ZM> A05;
    public Pair<Surface, C1655fx> A06;
    public CopyOnWriteArrayList<InterfaceC1608fC> A08;
    public boolean A0A;
    public boolean A0B;
    public final C0T A0C;
    public final C1706gn A0D;
    public final boolean A0G;
    public final ArrayDeque<Long> A0F = new ArrayDeque<>();
    public final ArrayDeque<Pair<Long, ZM>> A0E = new ArrayDeque<>();
    public int A00 = -1;
    public boolean A09 = true;
    public long A02 = -9223372036854775807L;
    public Y2 A07 = Y2.A05;
    public long A03 = -9223372036854775807L;
    public long A01 = -9223372036854775807L;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0H, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 104);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0H = new byte[]{36, 47, 47, 50, 58, -16, 41, 53, 36, 48, 40, -16, 39, 53, 50, 51, -21, -6, -19, -23, -4, -19, 31, 37, 46, 44, 33, 59, 57, 72, 29, 66, 68, 73, 72, 39, 73, 70, 58, 53, 55, 57, 41, 39, 54, 18, 39, 48, 38, 43, 48, 41, 11, 48, 50, 55, 54, 8, 52, 35, 47, 39, 5, 49, 55, 48, 54, 41, 28, 35, 28, 24, 42, 28, 71, 58, 67, 57, 58, 71, 36, 74, 73, 69, 74, 73, 27, 71, 54, 66, 58, 59, 45, 60, 17, 54, 56, 61, 60, 14, 58, 41, 53, 45, 17, 54, 46, 55, 64, 50, 65, 28, 66, 65, 61, 66, 65, 32, 66, 63, 51, 46, 48, 50, 22, 59, 51, 60};
    }

    static {
        A02();
    }

    public C1687gU(C1706gn c1706gn, C0T c0t, boolean z10) {
        this.A0D = c1706gn;
        this.A0C = c0t;
        this.A0G = z10;
    }

    private void A03(long j10, boolean z10) {
        AbstractC1589es.A02(null);
        throw new NullPointerException(A01(74, 17, 109));
    }

    @MetaExoPlayerCustomization("The threshold here is non configurable and too low. Our renderer stalls and gets stuck if this is too strict")
    public static boolean A04(long j10) {
        if (C0962Mq.A03(EnumC0959Mn.A1k)) {
            return j10 > ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT;
        }
        int releaseLowerThresholdUs = C0962Mq.A00(EnumC0960Mo.A08);
        int releaseUpperThresholdUs = C0962Mq.A00(EnumC0960Mo.A07);
        return releaseLowerThresholdUs > 0 && releaseUpperThresholdUs > 0 && j10 > ((long) releaseUpperThresholdUs) && j10 < ((long) releaseLowerThresholdUs);
    }

    public final MediaFormat A06(MediaFormat mediaFormat) {
        if (AbstractC1672gE.A02 >= 29 && C0T.A06(this.A0C).getApplicationContext().getApplicationInfo().targetSdkVersion >= 29) {
            mediaFormat.setInteger(A01(0, 16, 91), 0);
        }
        return mediaFormat;
    }

    public final Surface A07() {
        AbstractC1589es.A01(null);
        throw new NullPointerException(A01(27, 15, 108));
    }

    public final void A08() {
        AbstractC1589es.A01(null);
        throw new NullPointerException(A01(108, 20, 101));
    }

    public final void A09() {
        AbstractC1589es.A02(null);
        throw new NullPointerException(A01(22, 5, 81));
    }

    public final void A0A() {
        AbstractC1589es.A01(null);
        throw new NullPointerException(A01(67, 7, 79));
    }

    public final void A0B(long j10, long framePresentationTimeUs) {
        AbstractC1589es.A02(null);
        if (!this.A0F.isEmpty()) {
            boolean z10 = false;
            boolean z11 = this.A0C.A90() == 2;
            long longValue = ((Long) AbstractC1589es.A01(this.A0F.peek())).longValue();
            long bufferPresentationTimeUs = longValue + this.A01;
            C0T c0t = this.A0C;
            long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            String[] strArr = A0I;
            if (strArr[1].charAt(0) != strArr[2].charAt(0)) {
                String[] strArr2 = A0I;
                strArr2[4] = "fU7gnYNupTQ2ofEqE2TaOVKFwD2epkzJ";
                strArr2[7] = "vKJQEsbdN6osOsyvHaQThVc9tHPDg1PA";
                long A05 = C0T.A05(c0t, j10, framePresentationTimeUs, elapsedRealtime, bufferPresentationTimeUs, z11);
                if (this.A0A && this.A0F.size() == 1) {
                    z10 = true;
                }
                if (C0T.A0t(this.A0C, j10, A05)) {
                    A03(-1L, z10);
                    throw null;
                } else if (!z11 || j10 == C0T.A04(this.A0C) || A04(A05)) {
                    return;
                } else {
                    this.A0D.A0G(bufferPresentationTimeUs);
                    long A0B = this.A0D.A0B(System.nanoTime() + (A05 * 1000));
                    if (A0I[0].length() != 4) {
                        throw new RuntimeException();
                    }
                    A0I[0] = "RbcC";
                    if (this.A0C.A28((A0B - System.nanoTime()) / 1000, framePresentationTimeUs, z10)) {
                        A03(-2L, z10);
                        throw null;
                    }
                    if (!this.A0E.isEmpty()) {
                        Pair<Long, ZM> peek = this.A0E.peek();
                        if (A0I[3].length() != 32) {
                            throw new RuntimeException();
                        }
                        A0I[3] = "KfGNpTaUgCkdQJN08U7pd0S2v4WpjF17";
                        if (bufferPresentationTimeUs > ((Long) peek.first).longValue()) {
                            this.A05 = this.A0E.remove();
                        }
                    }
                    C0T.A0e(this.A0C, longValue, A0B, (ZM) this.A05.second, null);
                    if (this.A03 >= bufferPresentationTimeUs) {
                        this.A03 = -9223372036854775807L;
                    }
                    A03(A0B, z10);
                    throw null;
                }
            }
            throw new RuntimeException();
        }
    }

    public final void A0C(Surface surface, C1655fx c1655fx) {
        if (this.A06 != null && ((Surface) this.A06.first).equals(surface) && ((C1655fx) this.A06.second).equals(c1655fx)) {
            return;
        }
        this.A06 = Pair.create(surface, c1655fx);
        if (A0G()) {
            AbstractC1589es.A01(null);
            new C1659g1(surface, c1655fx.A03(), c1655fx.A02());
            throw new NullPointerException(A01(108, 20, 101));
        }
    }

    public final void A0D(ZM zm) {
        AbstractC1589es.A01(null);
        new C1609fD(zm.A0L, zm.A0A).A00(zm.A02).A01();
        throw new NullPointerException(A01(91, 17, 96));
    }

    public final void A0E(String str) {
        this.A00 = AbstractC1672gE.A09(C0T.A06(this.A0C), str, false);
    }

    public final void A0F(List<InterfaceC1608fC> list) {
        if (this.A08 == null) {
            this.A08 = new CopyOnWriteArrayList<>(list);
            return;
        }
        this.A08.clear();
        this.A08.addAll(list);
    }

    @MetaExoPlayerCustomization("SR video effects for AV1")
    public final boolean A0G() {
        return (!this.A0G || 0 == 0 || C0T.A0s(this.A0C)) ? false : true;
    }

    public final boolean A0H() {
        return this.A06 == null || !((C1655fx) this.A06.second).equals(C1655fx.A04);
    }

    public final boolean A0I() {
        return this.A0B;
    }

    public final boolean A0J(ZM zm, long j10) throws EK {
        AbstractC1589es.A08(!A0G());
        if (this.A09) {
            if (this.A08 == null) {
                this.A09 = false;
                return false;
            }
            this.A04 = AbstractC1672gE.A0Y();
            this.A0C.A26(zm.A0N);
            try {
                if (!C0T.A0j() && zm.A0F != 0) {
                    CopyOnWriteArrayList<InterfaceC1608fC> copyOnWriteArrayList = this.A08;
                    C1686gT.A00(zm.A0F);
                    copyOnWriteArrayList.add(0, null);
                }
                C1686gT.A01();
                C0T.A06(this.A0C);
                AbstractC1589es.A01(this.A08);
                Handler handler = this.A04;
                Objects.requireNonNull(handler);
                new SN(handler);
                new C1018Ow(this, zm);
                throw new NullPointerException(A01(16, 6, 32));
            } catch (Exception e8) {
                throw C0T.A09(this.A0C, e8, zm, 7000);
            }
        }
        return false;
    }

    public final boolean A0K(ZM zm, long j10, boolean z10) {
        AbstractC1589es.A02(null);
        AbstractC1589es.A08(this.A00 != -1);
        throw new NullPointerException(A01(42, 25, 90));
    }
}
