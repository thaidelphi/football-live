package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.facebook.ads.redexgen.X.InterfaceC1542e7;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.IOException;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.e6  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class HandlerC1541e6<T extends InterfaceC1542e7> extends Handler implements Runnable {
    public static byte[] A0C;
    public static String[] A0D = {"qRlIVfpybLSxoPLWf1TvcUw69qTji", "cSKUugD5eDDQMMPgDouuHQJJPVQpGyf5", "yOZKf7xLU5LJVytLPEHpMJqJz3Stf8V5", "fAagIk3TKLqXMjBZ", "BIij5mDFS23rAGHL30QPA0H1pIevJ9Q4", "5rhI7ybfNHxzM2SLipkBQtSml", "6VhIdsHK1vC0rDVw2X6nIiT8vfoGVBfb", "oTkpv8QcQ0P2p05BJbM5VXT605qhd"};
    public boolean A00;
    public int A01;
    public InterfaceC1539e4<T> A02;
    public C1540e5 A03;
    public IOException A04;
    public Thread A05;
    public boolean A06;
    public final int A07;
    public final long A08;
    public final T A09;
    public volatile boolean A0A;
    public final /* synthetic */ C1031Pj A0B;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A0D;
            if (strArr[3].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0D;
            strArr2[3] = "TIP2LCTlaY7VBEzS";
            strArr2[5] = "k9TNZr036js2liEpiAWKjrPj9";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 125);
            i13++;
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @MetaExoPlayerCustomization("Customized to support load retries")
    private void A02() {
        InterfaceExecutorC1651ft interfaceExecutorC1651ft;
        HandlerC1541e6 handlerC1541e6;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.A02.ADw(this.A09, elapsedRealtime, elapsedRealtime - this.A08, this.A01);
        this.A04 = null;
        interfaceExecutorC1651ft = this.A0B.A02;
        handlerC1541e6 = this.A0B.A00;
        interfaceExecutorC1651ft.execute((Runnable) AbstractC1589es.A01(handlerC1541e6));
    }

    public static void A04() {
        byte[] bArr = {16, 51, 61, 56, 8, 61, 47, 55, 87, 109, 108, 87, 126, 85, 125, 117, 119, 106, 97, 56, 125, 106, 106, 119, 106, 56, 116, 119, 121, 124, 113, 118, Byte.MAX_VALUE, 56, 107, 108, 106, 125, 121, 117, 57, 2, 9, 20, 28, 9, 15, 24, 9, 8, 76, 9, 30, 30, 3, 30, 76, 0, 3, 13, 8, 5, 2, 11, 76, 31, 24, 30, 9, 13, 1, 85, 110, 101, 120, 112, 101, 99, 116, 101, 100, 32, 101, 120, 99, 101, 112, 116, 105, 111, 110, 32, 104, 97, 110, 100, 108, 105, 110, 103, 32, 108, 111, 97, 100, 32, 99, 111, 109, 112, 108, 101, 116, 101, 100, 100, 95, 84, 73, 65, 84, 82, 69, 84, 85, 17, 84, 73, 82, 84, 65, 69, 88, 94, 95, 17, 93, 94, 80, 85, 88, 95, 86, 17, 66, 69, 67, 84, 80, 92, 17, 18, 28, 25, 71};
        String[] strArr = A0D;
        if (strArr[2].charAt(15) != strArr[4].charAt(15)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0D;
        strArr2[0] = "H0g8RzKpMK15rJa4eHG9oUaWFtLcI";
        strArr2[7] = "XOVfPWPqToSG8gL66MwxJtnpfJjML";
        A0C = bArr;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.os.Handler
    @MetaExoPlayerCustomization("enableContinueLoadingLogging and currentLoadErrorAction saving are custom")
    public final void handleMessage(Message message) {
        int i10;
        int i11;
        int i12;
        long j10;
        if (BQ.A02(this)) {
            return;
        }
        try {
            if (this.A0A) {
                return;
            }
            if (message.what == 0) {
                A02();
                this.A00 = false;
            } else if (message.what == 3) {
                throw ((Error) message.obj);
            } else {
                A03();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j11 = elapsedRealtime - this.A08;
                InterfaceC1539e4 interfaceC1539e4 = (InterfaceC1539e4) AbstractC1589es.A01(this.A02);
                if (this.A06) {
                    interfaceC1539e4.ADq(this.A09, elapsedRealtime, j11, false);
                    return;
                }
                switch (message.what) {
                    case 1:
                        try {
                            interfaceC1539e4.ADs(this.A09, elapsedRealtime, j11);
                            return;
                        } catch (RuntimeException e8) {
                            AbstractC1633fb.A08(A01(0, 8, 33), A01(71, 44, 125), e8);
                            this.A0B.A01 = new C1546eB(e8);
                            return;
                        }
                    case 2:
                        this.A04 = (IOException) message.obj;
                        this.A01++;
                        C1540e5 ADt = interfaceC1539e4.ADt(this.A09, elapsedRealtime, j11, this.A04, this.A01);
                        this.A03 = ADt;
                        i10 = ADt.A00;
                        if (i10 == 3) {
                            this.A0B.A01 = this.A04;
                            return;
                        }
                        i11 = ADt.A00;
                        if (i11 != 2) {
                            i12 = ADt.A00;
                            if (i12 == 1) {
                                this.A01 = 1;
                            }
                            this.A00 = true;
                            j10 = ADt.A01;
                            A06(j10 != -9223372036854775807L ? ADt.A01 : A00());
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    static {
        A04();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.e4 != com.google.android.exoplayer2.upstream.Loader$Callback<T extends com.facebook.ads.redexgen.X.e7> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.e6 != com.google.android.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.e7> */
    public HandlerC1541e6(C1031Pj c1031Pj, Looper looper, T loadable, InterfaceC1539e4<T> interfaceC1539e4, int i10, long j10) {
        super(looper);
        this.A0B = c1031Pj;
        this.A09 = loadable;
        this.A02 = interfaceC1539e4;
        this.A07 = i10;
        this.A08 = j10;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.e6 != com.google.android.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.e7> */
    @MetaExoPlayerCustomization("D36993743 Customized Hero Retry Delay Values")
    private long A00() {
        return MJ.A00(this.A01, 0);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.e6 != com.google.android.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.e7> */
    private void A03() {
        this.A0B.A00 = null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.e6 != com.google.android.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.e7> */
    public final void A05(int i10) throws IOException {
        if (this.A04 == null || this.A01 <= i10) {
            return;
        }
        throw this.A04;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.e6 != com.google.android.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.e7> */
    public final void A06(long j10) {
        HandlerC1541e6 handlerC1541e6;
        handlerC1541e6 = this.A0B.A00;
        AbstractC1589es.A08(handlerC1541e6 == null);
        this.A0B.A00 = this;
        if (j10 > 0) {
            sendEmptyMessageDelayed(0, j10);
        } else {
            A02();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.e6 != com.google.android.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.e7> */
    public final void A07(boolean z10) {
        this.A0A = z10;
        this.A04 = null;
        if (hasMessages(0)) {
            this.A06 = true;
            removeMessages(0);
            if (!z10) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                this.A06 = true;
                this.A09.A4h();
                Thread thread = this.A05;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z10) {
            A03();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ((InterfaceC1539e4) AbstractC1589es.A01(this.A02)).ADq(this.A09, elapsedRealtime, elapsedRealtime - this.A08, true);
            this.A02 = null;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.e6 != com.google.android.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.e7> */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        if (BQ.A02(this)) {
            return;
        }
        try {
            try {
                try {
                    try {
                        synchronized (this) {
                            z10 = !this.A06;
                            this.A05 = Thread.currentThread();
                        }
                        if (z10) {
                            AbstractC1663g5.A02(A01(IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, 5, 0) + this.A09.getClass().getSimpleName());
                            try {
                                this.A09.AAg();
                            } finally {
                                AbstractC1663g5.A00();
                            }
                        }
                        synchronized (this) {
                            this.A05 = null;
                            Thread.interrupted();
                        }
                        if (!this.A0A) {
                            sendEmptyMessage(1);
                        }
                    } catch (Error e8) {
                        if (!this.A0A) {
                            AbstractC1633fb.A08(A01(0, 8, 33), A01(40, 31, 17), e8);
                            obtainMessage(3, e8).sendToTarget();
                        }
                        throw e8;
                    }
                } catch (Exception e10) {
                    if (!this.A0A) {
                        AbstractC1633fb.A08(A01(0, 8, 33), A01(115, 35, 76), e10);
                        obtainMessage(2, new C1546eB(e10)).sendToTarget();
                    }
                }
            } catch (IOException e11) {
                if (!this.A0A) {
                    obtainMessage(2, e11).sendToTarget();
                }
            } catch (OutOfMemoryError e12) {
                if (!this.A0A) {
                    AbstractC1633fb.A08(A01(0, 8, 33), A01(8, 32, 101), e12);
                    obtainMessage(2, new C1546eB(e12)).sendToTarget();
                }
            }
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
