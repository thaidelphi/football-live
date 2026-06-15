package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.gm  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class Choreographer$FrameCallbackC1705gm implements Choreographer.FrameCallback, Handler.Callback {
    public static byte[] A05;
    public static final Choreographer$FrameCallbackC1705gm A06;
    public int A00;
    public Choreographer A01;
    public final Handler A02;
    public volatile long A04 = -9223372036854775807L;
    public final HandlerThread A03 = new HandlerThread(A01(0, 35, 38));

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 111);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A05 = new byte[]{-38, 13, 4, -27, 1, -10, 14, -6, 7, -49, -37, 7, -10, 2, -6, -25, -6, 1, -6, -10, 8, -6, -40, -3, 4, 7, -6, 4, -4, 7, -10, 5, -3, -6, 7, 34, 53, 48, 49, 59, 18, 62, 45, 57, 49, 30, 49, 56, 49, 45, 63, 49, 20, 49, 56, 60, 49, 62, 57, 86, 92, 81, 70, 3, 86, 68, 80, 83, 79, 76, 81, 74, 3, 71, 76, 86, 68, 69, 79, 72, 71, 3, 71, 88, 72, 3, 87, 82, 3, 83, 79, 68, 87, 73, 82, 85, 80, 3, 72, 85, 85, 82, 85};
    }

    static {
        A05();
        A06 = new Choreographer$FrameCallbackC1705gm();
    }

    public Choreographer$FrameCallbackC1705gm() {
        this.A03.start();
        this.A02 = AbstractC1672gE.A0c(this.A03.getLooper(), this);
        this.A02.sendEmptyMessage(0);
    }

    public static Choreographer$FrameCallbackC1705gm A00() {
        return A06;
    }

    private void A02() {
        if (this.A01 != null) {
            this.A00++;
            if (this.A00 == 1) {
                this.A01.postFrameCallback(this);
            }
        }
    }

    private void A03() {
        try {
            this.A01 = Choreographer.getInstance();
        } catch (RuntimeException e8) {
            AbstractC1633fb.A0A(A01(35, 23, 93), A01(58, 45, 116), e8);
        }
    }

    private void A04() {
        if (this.A01 != null) {
            this.A00--;
            if (this.A00 == 0) {
                this.A01.removeFrameCallback(this);
                this.A04 = -9223372036854775807L;
            }
        }
    }

    public final void A06() {
        this.A02.sendEmptyMessage(1);
    }

    public final void A07() {
        this.A02.sendEmptyMessage(2);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        this.A04 = j10;
        ((Choreographer) AbstractC1589es.A01(this.A01)).postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                A03();
                return true;
            case 1:
                A02();
                return true;
            case 2:
                A04();
                return true;
            default:
                return false;
        }
    }
}
