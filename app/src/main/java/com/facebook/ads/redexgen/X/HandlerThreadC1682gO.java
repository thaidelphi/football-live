package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.google.android.exoplayer2.video.DummySurface;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.gO  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class HandlerThreadC1682gO extends HandlerThread implements Handler.Callback {
    public static byte[] A05;
    public Handler A00;
    public RunnableC1607fB A01;
    public DummySurface A02;
    public Error A03;
    public RuntimeException A04;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 30);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{102, 87, 79, 79, 91, 113, 87, 80, 68, 67, 65, 71, 32, 7, 15, 10, 3, 2, 70, 18, 9, 70, 15, 8, 15, 18, 15, 7, 10, 15, 28, 3, 70, 2, 19, 11, 11, 31, 70, 21, 19, 20, 0, 7, 5, 3, 30, 57, 49, 52, 61, 60, 120, 44, 55, 120, 42, 61, 52, 61, 57, 43, 61, 120, 60, 45, 53, 53, 33, 120, 43, 45, 42, 62, 57, 59, 61, 70, 87, 79, 79, 91, 113, 87, 80, 68, 67, 65, 71};
    }

    public HandlerThreadC1682gO() {
        super(A00(77, 12, 60));
    }

    private void A01() {
        AbstractC1589es.A01(this.A01);
        this.A01.A08();
    }

    private void A03(int i10) {
        AbstractC1589es.A01(this.A01);
        this.A01.A09(i10);
        this.A02 = new DummySurface(this, this.A01.A07(), i10 != 0);
    }

    public final DummySurface A04(int i10) {
        start();
        this.A00 = new Handler(getLooper(), this);
        this.A01 = new RunnableC1607fB(this.A00);
        boolean z10 = false;
        synchronized (this) {
            this.A00.obtainMessage(1, i10, 0).sendToTarget();
            while (this.A02 == null && this.A04 == null && this.A03 == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        if (this.A04 == null) {
            if (this.A03 == null) {
                return (DummySurface) AbstractC1589es.A01(this.A02);
            }
            throw this.A03;
        }
        throw this.A04;
    }

    public final void A05() {
        AbstractC1589es.A01(this.A00);
        this.A00.sendEmptyMessage(2);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        try {
            switch (message.what) {
                case 1:
                    try {
                        A03(message.arg1);
                        synchronized (this) {
                            notify();
                        }
                    } catch (Error e8) {
                        AbstractC1633fb.A08(A00(0, 12, 60), A00(12, 34, 120), e8);
                        this.A03 = e8;
                        synchronized (this) {
                            notify();
                        }
                    } catch (RuntimeException e10) {
                        AbstractC1633fb.A08(A00(0, 12, 60), A00(12, 34, 120), e10);
                        this.A04 = e10;
                        synchronized (this) {
                            notify();
                        }
                    }
                    return true;
                case 2:
                    try {
                        A01();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                default:
                    return true;
            }
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }
}
