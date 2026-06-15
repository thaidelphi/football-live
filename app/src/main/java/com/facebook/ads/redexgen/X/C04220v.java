package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.checkerframework.dataflow.qual.SideEffectFree;
/* renamed from: com.facebook.ads.redexgen.X.0v  reason: invalid class name and case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C04220v extends AbstractC0760Et implements Handler.Callback {
    public static byte[] A0H;
    public static String[] A0I = {"3WvyQm6eZ8fyu3DVkbaCyrAZnX3I6ufJ", "FZX0zBKkzAfc6z", "6l4vC0Lm5zxy6aFWmqrnB087ialuzwGI", "qqeCXiNIH0hdSmbKUzZAHpTsBt10hP0P", "cj", "sQzUbCBUfwO044aI", "9TFEzWk8WBCpCxrEkzjotM773HUVNOJT", "kKOvl6Wchw21fZ40J"};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public ZM A05;
    public TQ A06;
    public C06228s A07;
    public AbstractC06208q A08;
    public AbstractC06208q A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final Handler A0D;
    public final P6 A0E;
    public final InterfaceC1453cf A0F;
    public final InterfaceC1460cm A0G;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0H, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 7);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A0H = new byte[]{73, 111, 120, 110, 115, 110, 118, Byte.MAX_VALUE, 58, 126, Byte.MAX_VALUE, 121, 117, 126, 115, 116, 125, 58, 124, 123, 115, 118, Byte.MAX_VALUE, 126, 52, 58, 105, 110, 104, Byte.MAX_VALUE, 123, 119, 92, 117, 104, 119, 123, 110, 39, 119, 70, 91, 87, 113, 70, 77, 71, 70, 81, 70, 81};
    }

    static {
        A09();
    }

    public C04220v(InterfaceC1460cm interfaceC1460cm, Looper looper, InterfaceC1453cf interfaceC1453cf) {
        super(3);
        this.A0G = (InterfaceC1460cm) AbstractC1589es.A01(interfaceC1460cm);
        this.A0D = looper == null ? null : AbstractC1672gE.A0c(looper, this);
        this.A0F = interfaceC1453cf;
        this.A0E = new P6();
        this.A02 = -9223372036854775807L;
        this.A04 = -9223372036854775807L;
        this.A03 = -9223372036854775807L;
    }

    private long A00() {
        if (this.A01 == -1) {
            return Long.MAX_VALUE;
        }
        AbstractC1589es.A01(this.A09);
        if (this.A01 >= this.A09.A7u()) {
            return Long.MAX_VALUE;
        }
        return this.A09.A7t(this.A01);
    }

    @RequiresNonNull({"subtitle"})
    @SideEffectFree
    private long A01(long j10) {
        int A8Q = this.A09.A8Q(j10);
        if (A8Q != 0) {
            int nextEventTimeIndex = this.A09.A7u();
            if (nextEventTimeIndex != 0) {
                if (A8Q == -1) {
                    AbstractC06208q abstractC06208q = this.A09;
                    int nextEventTimeIndex2 = this.A09.A7u();
                    return abstractC06208q.A7t(nextEventTimeIndex2 - 1);
                }
                int nextEventTimeIndex3 = A8Q - 1;
                return this.A09.A7t(nextEventTimeIndex3);
            }
        }
        return ((AbstractC1212Wu) this.A09).A01;
    }

    @SideEffectFree
    private long A02(long j10) {
        boolean z10 = true;
        AbstractC1589es.A08(j10 != -9223372036854775807L);
        if (this.A04 == -9223372036854775807L) {
            z10 = false;
        }
        AbstractC1589es.A08(z10);
        return j10 - this.A04;
    }

    private void A04() {
        A0C(new C1051Qf(C0958Mm.A01(), A02(this.A03)));
    }

    private void A05() {
        this.A0C = true;
        this.A06 = this.A0F.A5A((ZM) AbstractC1589es.A01(this.A05));
    }

    private void A06() {
        this.A07 = null;
        this.A01 = -1;
        if (this.A09 != null) {
            this.A09.A0B();
            this.A09 = null;
        }
        if (this.A08 != null) {
            this.A08.A0B();
            this.A08 = null;
        }
    }

    private void A07() {
        A06();
        ((TQ) AbstractC1589es.A01(this.A06)).AGj();
        this.A06 = null;
        this.A00 = 0;
    }

    private void A08() {
        A07();
        A05();
    }

    private void A0A(TP tp) {
        AbstractC1633fb.A08(A03(39, 12, 36), A03(0, 39, 29) + this.A05, tp);
        A0D(new C1459cl(this.A05, tp));
        A04();
        A08();
    }

    private void A0B(C1051Qf c1051Qf) {
        this.A0G.ACp(c1051Qf.A01);
        this.A0G.ACo(c1051Qf);
    }

    private void A0C(C1051Qf c1051Qf) {
        if (this.A0D != null) {
            this.A0D.obtainMessage(0, c1051Qf).sendToTarget();
        } else {
            A0B(c1051Qf);
        }
    }

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "Method to propagate any SubtitleDecoder Error upwards")
    private void A0D(C1459cl c1459cl) {
        if (this.A0D != null) {
            this.A0D.obtainMessage(1, c1459cl).sendToTarget();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0760Et
    public final void A1Z() {
        this.A05 = null;
        this.A02 = -9223372036854775807L;
        A04();
        this.A04 = -9223372036854775807L;
        this.A03 = -9223372036854775807L;
        A07();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0760Et
    public final void A1a(long j10, boolean z10) {
        this.A03 = j10;
        A04();
        this.A0A = false;
        this.A0B = false;
        this.A02 = -9223372036854775807L;
        if (this.A00 != 0) {
            A08();
            return;
        }
        A06();
        ((TQ) AbstractC1589es.A01(this.A06)).flush();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0760Et
    public final void A1c(ZM[] zmArr, long j10, long j11) {
        this.A04 = j11;
        this.A05 = zmArr[0];
        if (this.A06 != null) {
            this.A00 = 1;
        } else {
            A05();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1259Yq
    public final boolean AAE() {
        return this.A0B;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1259Yq
    public final boolean AAT() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1259Yq
    public final void AHd(long j10, long j11) {
        int i10;
        this.A03 = j10;
        if (AAC() && this.A02 != -9223372036854775807L && j10 >= this.A02) {
            A06();
            String[] strArr = A0I;
            if (strArr[4].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A0I[0] = "FpNfrWwHerswMK3uzdCwXYpLOohu6ZxI";
            this.A0B = true;
        }
        if (this.A0B) {
            return;
        }
        if (this.A08 == null) {
            TQ tq = this.A06;
            String[] strArr2 = A0I;
            if (strArr2[7].length() != strArr2[1].length()) {
                A0I[6] = "pizgxuJ8qzJ0XY3Qb4fPPou13xZZyBde";
                ((TQ) AbstractC1589es.A01(tq)).AIn(j10);
            } else {
                ((TQ) AbstractC1589es.A01(tq)).AIn(j10);
            }
            try {
                this.A08 = ((TQ) AbstractC1589es.A01(this.A06)).A5j();
            } catch (TP e8) {
                A0A(e8);
                return;
            }
        }
        int A90 = A90();
        if (A0I[6].charAt(24) != '3') {
            String[] strArr3 = A0I;
            strArr3[4] = "FJ";
            strArr3[5] = "1OlycrCvfKlLNEvf";
            i10 = 0;
            if (A90 != 0) {
                return;
            }
        } else {
            String[] strArr4 = A0I;
            strArr4[3] = "rAwrherVLoB9hDbboAipBd54PP9tdkSf";
            strArr4[2] = "hVn1tpbZ7QSUOGOxJndIxosuMZKMmY4d";
            i10 = 2;
            if (A90 != 2) {
                return;
            }
        }
        boolean z10 = false;
        if (this.A09 != null) {
            long A00 = A00();
            while (A00 <= j10) {
                this.A01++;
                A00 = A00();
                z10 = true;
            }
        }
        if (this.A08 != null) {
            AbstractC06208q abstractC06208q = this.A08;
            boolean textRendererNeedsUpdate = abstractC06208q.A05();
            if (textRendererNeedsUpdate) {
                if (!z10 && A00() == Long.MAX_VALUE) {
                    if (this.A00 == i10) {
                        A08();
                    } else {
                        A06();
                        this.A0B = true;
                    }
                }
            } else if (((AbstractC1212Wu) abstractC06208q).A01 <= j10) {
                if (this.A09 != null) {
                    this.A09.A0B();
                }
                this.A01 = abstractC06208q.A8Q(j10);
                this.A09 = abstractC06208q;
                String[] strArr5 = A0I;
                if (strArr5[4].length() != strArr5[5].length()) {
                    String[] strArr6 = A0I;
                    strArr6[7] = "bBSmd5PctXg1QmIcB";
                    strArr6[1] = "qvmvf5RKavjwzG";
                    this.A08 = null;
                    z10 = true;
                } else {
                    this.A08 = null;
                    z10 = true;
                }
            }
        }
        if (z10) {
            AbstractC1589es.A01(this.A09);
            A0C(new C1051Qf(this.A09.A7N(j10), A02(A01(j10))));
        }
        if (this.A00 == i10) {
            return;
        }
        while (true) {
            try {
                boolean textRendererNeedsUpdate2 = this.A0A;
                if (!textRendererNeedsUpdate2) {
                    C06228s c06228s = this.A07;
                    if (c06228s == null) {
                        c06228s = ((TQ) AbstractC1589es.A01(this.A06)).A5h();
                        if (c06228s != null) {
                            this.A07 = c06228s;
                        } else {
                            return;
                        }
                    }
                    if (this.A00 == 1) {
                        c06228s.A02(4);
                        ((TQ) AbstractC1589es.A01(this.A06)).AGR(c06228s);
                        this.A07 = null;
                        this.A00 = i10;
                        return;
                    }
                    int A1R = A1R(this.A0E, c06228s, 0);
                    if (A1R == -4) {
                        boolean textRendererNeedsUpdate3 = c06228s.A05();
                        if (textRendererNeedsUpdate3) {
                            this.A0A = true;
                            this.A0C = false;
                        } else {
                            ZM zm = this.A0E.A00;
                            if (zm != null) {
                                c06228s.A00 = zm.A0M;
                                c06228s.A0B();
                                boolean z11 = this.A0C;
                                boolean textRendererNeedsUpdate4 = c06228s.A07();
                                this.A0C = (textRendererNeedsUpdate4 ? false : true) & z11;
                            } else {
                                return;
                            }
                        }
                        boolean textRendererNeedsUpdate5 = this.A0C;
                        if (!textRendererNeedsUpdate5) {
                            ((TQ) AbstractC1589es.A01(this.A06)).AGR(c06228s);
                            this.A07 = null;
                        }
                    } else if (A1R == -3) {
                        return;
                    }
                } else {
                    return;
                }
            } catch (TP e10) {
                A0A(e10);
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1054Qi
    public final int AJR(ZM zm) {
        if (this.A0F.AJS(zm)) {
            int A00 = AbstractC1047Qb.A00(4);
            if (A0I[6].charAt(24) != '3') {
                throw new RuntimeException();
            }
            String[] strArr = A0I;
            strArr[4] = "EN";
            strArr[5] = "jgxOlwVisoQfrYD7";
            return A00;
        } else if (Q2.A0E(zm.A0W)) {
            return AbstractC1047Qb.A00(1);
        } else {
            return AbstractC1047Qb.A00(0);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1259Yq, com.facebook.ads.redexgen.X.InterfaceC1054Qi
    public final String getName() {
        return A03(39, 12, 36);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                A0B((C1051Qf) message.obj);
                return true;
            case 1:
                return true;
            default:
                throw new IllegalStateException();
        }
    }
}
