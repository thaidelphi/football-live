package com.facebook.ads.redexgen.X;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.6U  reason: invalid class name */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C6U extends Thread {
    public static byte[] A07;
    public static final String A08;
    public final int A00;
    public final Handler A01;
    public final C6W A02;
    public final C1900k1 A03;
    public final Runnable A04;
    public volatile long A05;
    public volatile boolean A06;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 101);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A07 = new byte[]{103, 99, 12, 96, 111, 115, 12, 101, 68, 85, 68, 66, 85, 78, 83, 10, 8, 3, 8, 31, 4, 14};
    }

    static {
        A02();
        A08 = C6U.class.getName();
    }

    public C6U(C1900k1 c1900k1, C6W c6w) {
        this(c1900k1, c6w, C06419m.A08(c1900k1));
    }

    public C6U(C1900k1 c1900k1, C6W c6w, int i10) {
        this.A01 = new Handler(Looper.getMainLooper());
        this.A04 = new Runnable() { // from class: com.facebook.ads.redexgen.X.6T
            @Override // java.lang.Runnable
            public final void run() {
                if (BQ.A02(this)) {
                    return;
                }
                try {
                    C6U.this.A05 = 0L;
                    C6U.this.A06 = false;
                } catch (Throwable th) {
                    BQ.A00(th, this);
                }
            }
        };
        this.A05 = 0L;
        this.A06 = false;
        setName(A01(0, 15, 68));
        this.A00 = i10;
        this.A03 = c1900k1;
        this.A02 = c6w;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            long j10 = this.A00;
            while (!isInterrupted()) {
                long interval = this.A05;
                boolean z10 = interval == 0;
                this.A05 = j10;
                if (z10) {
                    this.A01.post(this.A04);
                }
                try {
                    Thread.sleep(j10);
                    long interval2 = this.A05;
                    if (interval2 != 0 && !this.A06 && !Debug.isDebuggerConnected()) {
                        if (this.A02.A05()) {
                            this.A03.A08().AAu(A01(15, 7, 8), AbstractC06048a.A1D, new C06058b(this.A02.A04()));
                        }
                        this.A06 = true;
                    }
                } catch (InterruptedException unused) {
                    BuildConfigApi.isDebug();
                    return;
                }
            }
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
