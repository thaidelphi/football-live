package com.facebook.ads.redexgen.X;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class SH {
    public static byte[] A0A;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final ZM A07;
    public final boolean A08;
    public final RV[] A09;

    static {
        A07();
    }

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 115);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0A = new byte[]{-43, -10, -9, -14, 6, -3, 5, -46, 6, -11, -6, 0, -28, -6, -1, -4, -29, -10, -22, -19, -27, -62, -10, -27, -22, -16, -43, -13, -30, -28, -20, -69, -95, -12, -11, -30, -11, -26, -66, -90, -27, -83, -95, -30, -10, -27, -22, -16, -43, -13, -30, -28, -20, -62, -19, -19, -16, -28, -30, -11, -26, -27, -81, -24, -26, -11, -87, -86, -66, -90, -27};
    }

    public SH(ZM zm, int i10, int i11, int i12, int i13, int i14, int i15, int i16, RV[] rvArr, boolean z10) {
        this.A07 = zm;
        this.A01 = i10;
        this.A04 = i11;
        this.A05 = i12;
        this.A06 = i13;
        this.A02 = i14;
        this.A03 = i15;
        this.A00 = i16;
        this.A09 = rvArr;
        this.A08 = z10;
    }

    public static AudioAttributes A00() {
        return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
    }

    public static AudioAttributes A01(C1280Zm c1280Zm, boolean z10) {
        if (z10) {
            return A00();
        }
        return c1280Zm.A01().A00;
    }

    private AudioTrack A02(C1280Zm c1280Zm, int i10) {
        int A04 = AbstractC1672gE.A04(c1280Zm.A05);
        if (i10 != 0) {
            return new AudioTrack(A04, this.A06, this.A02, this.A03, this.A00, 1, i10);
        }
        return new AudioTrack(A04, this.A06, this.A02, this.A03, this.A00, 1);
    }

    private AudioTrack A03(boolean z10, C1280Zm c1280Zm, int i10) {
        if (AbstractC1672gE.A02 >= 29) {
            return A05(z10, c1280Zm, i10);
        }
        if (AbstractC1672gE.A02 >= 21) {
            return A04(z10, c1280Zm, i10);
        }
        return A02(c1280Zm, i10);
    }

    private AudioTrack A04(boolean z10, C1280Zm c1280Zm, int i10) {
        AudioFormat A0D;
        AudioAttributes A01 = A01(c1280Zm, z10);
        A0D = XM.A0D(this.A06, this.A02, this.A03);
        return new AudioTrack(A01, A0D, this.A00, 1, i10);
    }

    private AudioTrack A05(boolean z10, C1280Zm c1280Zm, int i10) {
        AudioFormat A0D;
        A0D = XM.A0D(this.A06, this.A02, this.A03);
        AudioAttributes audioTrackAttributes = A01(c1280Zm, z10);
        AudioTrack.Builder audioFormat = new AudioTrack.Builder().setAudioAttributes(audioTrackAttributes).setAudioFormat(A0D);
        boolean z11 = true;
        AudioTrack.Builder sessionId = audioFormat.setTransferMode(1).setBufferSizeInBytes(this.A00).setSessionId(i10);
        if (this.A04 != 1) {
            z11 = false;
        }
        return sessionId.setOffloadedPlayback(z11).build();
    }

    public final long A08(long j10) {
        return (1000000 * j10) / this.A06;
    }

    public final long A09(long j10) {
        return (1000000 * j10) / this.A07.A0G;
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D23918943: Monitor the audio track usage through audioTrackAllocated")
    public final AudioTrack A0A(boolean z10, C1280Zm c1280Zm, int i10) throws C1090Rt {
        AtomicInteger atomicInteger;
        AtomicInteger atomicInteger2;
        AtomicInteger atomicInteger3;
        AtomicInteger atomicInteger4;
        AtomicInteger atomicInteger5;
        try {
            AudioTrack A03 = A03(z10, c1280Zm, i10);
            atomicInteger2 = XM.A0y;
            atomicInteger2.incrementAndGet();
            int state = A03.getState();
            if (state == 1) {
                return A03;
            }
            try {
                A03.release();
                atomicInteger5 = XM.A0y;
                atomicInteger5.decrementAndGet();
            } catch (Exception e8) {
                Integer valueOf = Integer.valueOf(state);
                atomicInteger3 = XM.A0y;
                AbstractC1633fb.A08(A06(0, 16, 30), String.format(A06(16, 55, 14), valueOf, Integer.valueOf(atomicInteger3.get())), e8);
            }
            int i11 = this.A06;
            int i12 = this.A02;
            int i13 = this.A00;
            ZM zm = this.A07;
            boolean A0D = A0D();
            atomicInteger4 = XM.A0y;
            throw new C1090Rt(state, i11, i12, i13, zm, A0D, null, atomicInteger4.get());
        } catch (IllegalArgumentException | UnsupportedOperationException e10) {
            int i14 = this.A06;
            int i15 = this.A02;
            int i16 = this.A00;
            ZM zm2 = this.A07;
            boolean A0D2 = A0D();
            atomicInteger = XM.A0y;
            throw new C1090Rt(0, i14, i15, i16, zm2, A0D2, e10, atomicInteger.get());
        }
    }

    public final C1088Rr A0B() {
        return new C1088Rr(this.A03, this.A06, this.A02, this.A08, this.A04 == 1, this.A00);
    }

    public final SH A0C(int i10) {
        return new SH(this.A07, this.A01, this.A04, this.A05, this.A06, this.A02, this.A03, i10, this.A09, this.A08);
    }

    public final boolean A0D() {
        return this.A04 == 1;
    }

    public final boolean A0E(SH sh) {
        return sh.A04 == this.A04 && sh.A03 == this.A03 && sh.A06 == this.A06 && sh.A02 == this.A02 && sh.A05 == this.A05;
    }
}
