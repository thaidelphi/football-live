package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.WindowManager;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.gq  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1709gq {
    public static byte[] A0C;
    public static String[] A0D = {"G0Xt1hU7GwyJNrFWcYXDlV7NHLd7AFuq", "EZuZfACubY5qCrwPH", "9Cjlaq2lcIphQDKbLaFiZJQxIkLEs3fA", "aYyLs8We2y2dcYtIZcauluAIHMmFPeGS", "0PfaleH7zsMcRSzoYEDIJe6b8xxc2YZu", "hsW633r3gli70EacxNkef7UV1MpIu3qL", "ELpBWJma7iXhMXUG5x0D6yXjvwZkRb9a", "YYueXBeJXqvyV8fFsSM3b0EWa6ucq9wU"};
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public boolean A08;
    public final WindowManager A09;
    public final C1707go A0A;
    public final Choreographer$FrameCallbackC1708gp A0B;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 4);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0C = new byte[]{98, 111, 117, 118, 106, 103, Byte.MAX_VALUE, 105, 119, 112, 122, 113, 105};
    }

    static {
        A04();
    }

    public C1709gq() {
        this(null);
    }

    public C1709gq(Context context) {
        if (context != null) {
            this.A09 = (WindowManager) context.getSystemService(A02(7, 6, 26));
        } else {
            this.A09 = null;
        }
        if (this.A09 != null) {
            this.A0A = AbstractC1672gE.A02 >= 17 ? A01(context) : null;
            this.A0B = Choreographer$FrameCallbackC1708gp.A00();
        } else {
            this.A0A = null;
            this.A0B = null;
        }
        this.A06 = -9223372036854775807L;
        this.A07 = -9223372036854775807L;
    }

    public static long A00(long j10, long j11, long j12) {
        long j13;
        long vsyncCount = j12 * ((j10 - j11) / j12);
        long j14 = j11 + vsyncCount;
        if (j10 <= j14) {
            j13 = j14 - j12;
        } else {
            j13 = j14;
            j14 += j12;
        }
        return j14 - j10 < j10 - j13 ? j14 : j13;
    }

    private C1707go A01(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService(A02(0, 7, 2));
        if (displayManager == null) {
            return null;
        }
        return new C1707go(this, displayManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03() {
        Display defaultDisplay = this.A09.getDefaultDisplay();
        if (defaultDisplay != null) {
            this.A06 = (long) (1.0E9d / defaultDisplay.getRefreshRate());
            this.A07 = (this.A06 * 80) / 100;
        }
    }

    private boolean A06(long j10, long j11) {
        long j12 = j10 - this.A04;
        long elapsedFrameTimeNs = this.A05;
        return Math.abs((j11 - elapsedFrameTimeNs) - j12) > 20000000;
    }

    public final long A07(long j10, long j11) {
        long j12 = 1000 * j10;
        long j13 = j12;
        long j14 = j11;
        if (this.A08) {
            if (j10 != this.A02) {
                this.A01++;
                this.A00 = this.A03;
            }
            if (this.A01 >= 6) {
                long j15 = this.A00 + ((j12 - this.A04) / this.A01);
                if (!A06(j15, j11)) {
                    j14 = (this.A05 + j15) - this.A04;
                    j13 = j15;
                } else {
                    this.A08 = false;
                }
            } else if (A06(j12, j11)) {
                this.A08 = false;
            }
        }
        if (!this.A08) {
            this.A04 = j12;
            this.A05 = j11;
            this.A01 = 0L;
            this.A08 = true;
        }
        this.A02 = j10;
        this.A03 = j13;
        if (this.A0B == null || this.A06 == -9223372036854775807L) {
            return j14;
        }
        long j16 = this.A0B.A04;
        if (j16 == -9223372036854775807L) {
            return j14;
        }
        return A00(j14, j16, this.A06) - this.A07;
    }

    public final void A08() {
        if (this.A09 != null) {
            if (this.A0A != null) {
                this.A0A.A01();
            }
            Choreographer$FrameCallbackC1708gp choreographer$FrameCallbackC1708gp = this.A0B;
            if (A0D[1].length() == 30) {
                throw new RuntimeException();
            }
            A0D[2] = "JN49jYCij5h6Tq7S4CvQlwkO4QmujBno";
            choreographer$FrameCallbackC1708gp.A07();
        }
    }

    public final void A09() {
        this.A08 = false;
        if (this.A09 != null) {
            this.A0B.A06();
            C1707go c1707go = this.A0A;
            if (A0D[1].length() == 30) {
                throw new RuntimeException();
            }
            String[] strArr = A0D;
            strArr[7] = "NtrIb3NfnK1qxVFYT0bJp12oL7UKbRkp";
            strArr[6] = "iSeDF3WjO0vrQ5oYCKZT14gRJZ9FzjyJ";
            if (c1707go != null) {
                this.A0A.A00();
            }
            A03();
        }
    }
}
