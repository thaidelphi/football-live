package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.gp  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class Choreographer$FrameCallbackC1708gp implements Choreographer.FrameCallback, Handler.Callback {
    public static byte[] A05;
    public static String[] A06 = {"uKCrUhLeLNE2bbaqTzHqmVoWf5w1rYVu", "A4eIkZpZRh11nb1KckaHxrLNGtHhD0TK", "SLhmNsGzHL8KcroYUEXGMbqgT3ahKBkO", "Ahz43YDUeJdqdZwVn", "u8jwHHegX093FDawWVIfkyfN4hqXxEAs", "JA3CZKf3kSlLhBnFxVjTNInFKj", "sNP4eW1x69y4cz3Ux", "BLPat4gP1SehHfWI2EZik7VQtZQcBq2P"};
    public static final Choreographer$FrameCallbackC1708gp A07;
    public int A00;
    public Choreographer A01;
    public final Handler A02;
    public volatile long A04 = -9223372036854775807L;
    public final HandlerThread A03 = new HandlerThread(A01(0, 26, 108));

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 19);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A05 = new byte[]{-62, -25, -18, -15, -28, -18, -26, -15, -32, -17, -25, -28, -15, -50, -10, -19, -28, -15, -71, -57, -32, -19, -29, -21, -28, -15};
        if (A06[2].length() == 26) {
            throw new RuntimeException();
        }
        A06[4] = "ODOKa8Of8c4RzKYNE64poliXvKONzExP";
    }

    static {
        A05();
        A07 = new Choreographer$FrameCallbackC1708gp();
    }

    public Choreographer$FrameCallbackC1708gp() {
        this.A03.start();
        this.A02 = AbstractC1672gE.A0c(this.A03.getLooper(), this);
        this.A02.sendEmptyMessage(0);
    }

    public static Choreographer$FrameCallbackC1708gp A00() {
        return A07;
    }

    private void A02() {
        this.A00++;
        if (this.A00 == 1) {
            this.A01.postFrameCallback(this);
        }
    }

    private void A03() {
        this.A01 = Choreographer.getInstance();
    }

    private void A04() {
        this.A00--;
        if (this.A00 == 0) {
            this.A01.removeFrameCallback(this);
            this.A04 = -9223372036854775807L;
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
        this.A01.postFrameCallbackDelayed(this, 500L);
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
