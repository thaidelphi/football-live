package com.facebook.ads.redexgen.X;

import androidx.recyclerview.widget.RecyclerView;
import com.facebook.ads.redexgen.X.AbstractC1212Wu;
import com.facebook.ads.redexgen.X.C1109Sm;
import com.facebook.ads.redexgen.X.C1214Ww;
import java.util.ArrayDeque;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Ws  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC1210Ws<I extends C1214Ww, O extends AbstractC1212Wu, E extends C1109Sm> implements InterfaceC1108Sl<I, O, E> {
    public static byte[] A0D;
    public static String[] A0E = {"OGKn90ycJwm1TUt4RXzb4q3FhLUPbSB4", "IVcJdAMRKKFnEK9dP8wELAYPf1hoMC8w", "wCh73KZYK1hx3dvkW", "eo7R32beAumhoqwl4w9lMvZF8yhg5ngY", "uDMiDXBgxgrVqgIrGA66TlfcSTP3PEBR", "FPRLOu", "y3MWo7qYHky9Rwpxe2jzaLP2PFX8pszA", "o3IcHhj5mZ6IpViu5MjLxKpkGtz3Q2SR"};
    public int A00;
    public int A01;
    public int A02;
    public E A03;
    public I A04;
    public boolean A05;
    public boolean A06;
    public final Thread A08;
    public final I[] A0B;
    public final O[] A0C;
    public final Object A07 = new Object();
    public final ArrayDeque<I> A09 = new ArrayDeque<>();
    public final ArrayDeque<O> A0A = new ArrayDeque<>();

    public static String A0O(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 12);
        }
        return new String(copyOfRange);
    }

    public static void A0S() {
        A0D = new byte[]{19, 46, 57, 6, 58, 55, 47, 51, 36, 108, 5, 63, 59, 38, 58, 51, 18, 51, 53, 57, 50, 51, 36};
    }

    public abstract E A0Y(I i10, O o10, boolean z10);

    public abstract E A0Z(Throwable th);

    public abstract I A0a();

    public abstract O A0c();

    static {
        A0S();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ws != com.google.android.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Ww, O extends com.facebook.ads.redexgen.X.Wu, E extends com.facebook.ads.redexgen.X.Sm> */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0020 */
    /* JADX WARN: Incorrect condition in loop: B:8:0x0035 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC1210Ws(I[] r4, O[] r5) {
        /*
            r3 = this;
            r3.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r3.A07 = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r3.A09 = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r3.A0A = r0
            r3.A0B = r4
            int r0 = r4.length
            r3.A00 = r0
            r2 = 0
        L1e:
            int r0 = r3.A00
            if (r2 >= r0) goto L2d
            I extends com.facebook.ads.redexgen.X.Ww[] r1 = r3.A0B
            com.facebook.ads.redexgen.X.Ww r0 = r3.A0a()
            r1[r2] = r0
            int r2 = r2 + 1
            goto L1e
        L2d:
            r3.A0C = r5
            int r0 = r5.length
            r3.A01 = r0
            r2 = 0
        L33:
            int r0 = r3.A01
            if (r2 >= r0) goto L42
            O extends com.facebook.ads.redexgen.X.Wu[] r1 = r3.A0C
            com.facebook.ads.redexgen.X.Wu r0 = r3.A0c()
            r1[r2] = r0
            int r2 = r2 + 1
            goto L33
        L42:
            r2 = 0
            r1 = 23
            r0 = 90
            java.lang.String r1 = A0O(r2, r1, r0)
            com.facebook.ads.redexgen.X.Sq r0 = new com.facebook.ads.redexgen.X.Sq
            r0.<init>(r3, r1)
            r3.A08 = r0
            java.lang.Thread r0 = r3.A08
            r0.start()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AbstractC1210Ws.<init>(com.facebook.ads.redexgen.X.Ww[], com.facebook.ads.redexgen.X.Wu[]):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ws != com.google.android.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Ww, O extends com.facebook.ads.redexgen.X.Wu, E extends com.facebook.ads.redexgen.X.Sm> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC1108Sl
    /* renamed from: A0N */
    public final I A5h() throws C1109Sm {
        I i10;
        I i11;
        synchronized (this.A07) {
            A0Q();
            AbstractC1589es.A08(this.A04 == null);
            if (this.A00 == 0) {
                i10 = null;
            } else {
                I[] iArr = this.A0B;
                int i12 = this.A00 - 1;
                this.A00 = i12;
                i10 = iArr[i12];
            }
            this.A04 = i10;
            i11 = this.A04;
        }
        return i11;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ws != com.google.android.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Ww, O extends com.facebook.ads.redexgen.X.Wu, E extends com.facebook.ads.redexgen.X.Sm> */
    private void A0P() {
        if (A0W()) {
            Object obj = this.A07;
            String[] strArr = A0E;
            if (strArr[0].charAt(23) != strArr[3].charAt(23)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0E;
            strArr2[5] = "GWb36I";
            strArr2[2] = "WgOnifBYC4Gu6aXJH";
            obj.notify();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ws != com.google.android.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Ww, O extends com.facebook.ads.redexgen.X.Wu, E extends com.facebook.ads.redexgen.X.Sm> */
    private void A0Q() throws C1109Sm {
        E exception = this.A03;
        if (exception == null) {
            return;
        }
        throw exception;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ws != com.google.android.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Ww, O extends com.facebook.ads.redexgen.X.Wu, E extends com.facebook.ads.redexgen.X.Sm> */
    public void A0R() {
        while (A0X()) {
            try {
            } catch (InterruptedException e8) {
                throw new IllegalStateException(e8);
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ws != com.google.android.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Ww, O extends com.facebook.ads.redexgen.X.Wu, E extends com.facebook.ads.redexgen.X.Sm> */
    private void A0T(I inputBuffer) {
        inputBuffer.A0A();
        I[] iArr = this.A0B;
        int i10 = this.A00;
        this.A00 = i10 + 1;
        iArr[i10] = inputBuffer;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ws != com.google.android.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Ww, O extends com.facebook.ads.redexgen.X.Wu, E extends com.facebook.ads.redexgen.X.Sm> */
    private void A0U(O outputBuffer) {
        outputBuffer.A0A();
        O[] oArr = this.A0C;
        int i10 = this.A01;
        this.A01 = i10 + 1;
        oArr[i10] = outputBuffer;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ws != com.google.android.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Ww, O extends com.facebook.ads.redexgen.X.Wu, E extends com.facebook.ads.redexgen.X.Sm> */
    private boolean A0W() {
        return !this.A09.isEmpty() && this.A01 > 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ws != com.google.android.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Ww, O extends com.facebook.ads.redexgen.X.Wu, E extends com.facebook.ads.redexgen.X.Sm> */
    private boolean A0X() throws InterruptedException {
        E exception;
        synchronized (this.A07) {
            while (!this.A06 && !A0W()) {
                this.A07.wait();
            }
            if (this.A06) {
                return false;
            }
            I removeFirst = this.A09.removeFirst();
            O[] oArr = this.A0C;
            int i10 = this.A01 - 1;
            this.A01 = i10;
            O o10 = oArr[i10];
            boolean z10 = this.A05;
            this.A05 = false;
            if (removeFirst.A05()) {
                o10.A00(4);
            } else {
                if (removeFirst.A04()) {
                    o10.A00(RecyclerView.UNDEFINED_DURATION);
                }
                if (removeFirst.A06()) {
                    o10.A00(134217728);
                }
                try {
                    exception = A0Y(removeFirst, o10, z10);
                } catch (OutOfMemoryError e8) {
                    exception = A0Z(e8);
                } catch (RuntimeException e10) {
                    exception = A0Z(e10);
                }
                if (exception != null) {
                    synchronized (this.A07) {
                        this.A03 = exception;
                    }
                    return false;
                }
            }
            synchronized (this.A07) {
                if (this.A05) {
                    o10.A0B();
                } else if (o10.A04()) {
                    this.A02++;
                    o10.A0B();
                } else {
                    o10.A00 = this.A02;
                    this.A02 = 0;
                    this.A0A.addLast(o10);
                }
                A0T(removeFirst);
            }
            return true;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ws != com.google.android.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Ww, O extends com.facebook.ads.redexgen.X.Wu, E extends com.facebook.ads.redexgen.X.Sm> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC1108Sl
    /* renamed from: A0b */
    public final O A5j() throws C1109Sm {
        synchronized (this.A07) {
            A0Q();
            if (this.A0A.isEmpty()) {
                return null;
            }
            return this.A0A.removeFirst();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ws != com.google.android.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Ww, O extends com.facebook.ads.redexgen.X.Wu, E extends com.facebook.ads.redexgen.X.Sm> */
    public final void A0d(int i10) {
        AbstractC1589es.A08(this.A00 == this.A0B.length);
        for (I i11 : this.A0B) {
            i11.A0C(i10);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ws != com.google.android.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Ww, O extends com.facebook.ads.redexgen.X.Wu, E extends com.facebook.ads.redexgen.X.Sm> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC1108Sl
    /* renamed from: A0e */
    public final void AGR(I inputBuffer) throws C1109Sm {
        synchronized (this.A07) {
            A0Q();
            AbstractC1589es.A07(inputBuffer == this.A04);
            this.A09.addLast(inputBuffer);
            A0P();
            this.A04 = null;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ws != com.google.android.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Ww, O extends com.facebook.ads.redexgen.X.Wu, E extends com.facebook.ads.redexgen.X.Sm> */
    public void A0f(O outputBuffer) {
        synchronized (this.A07) {
            A0U(outputBuffer);
            A0P();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ws != com.google.android.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Ww, O extends com.facebook.ads.redexgen.X.Wu, E extends com.facebook.ads.redexgen.X.Sm> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC1108Sl
    public final void AGj() {
        synchronized (this.A07) {
            this.A06 = true;
            this.A07.notify();
        }
        try {
            this.A08.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ws != com.google.android.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Ww, O extends com.facebook.ads.redexgen.X.Wu, E extends com.facebook.ads.redexgen.X.Sm> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC1108Sl
    public final void flush() {
        synchronized (this.A07) {
            this.A05 = true;
            this.A02 = 0;
            if (this.A04 != null) {
                A0T(this.A04);
                this.A04 = null;
            }
            while (!this.A09.isEmpty()) {
                A0T(this.A09.removeFirst());
            }
            while (!this.A0A.isEmpty()) {
                this.A0A.removeFirst().A0B();
            }
        }
    }
}
