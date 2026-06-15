package com.facebook.ads.redexgen.X;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class S5 {
    public static byte[] A0X;
    public static String[] A0Y = {"8wbacqVK6DiJ9rQyfINmnV9qACxWjbdS", "NYsom1LLawXas8SUtNFVMj33KoHCQK26", "ESP3CpeSXxSHFVNVD", "Fkx7whNUPhs8wrRKOWyDkcaMBe6MunWz", "Igd7mjyBaLicz35A8Y1zNChJ3yjQ9wDf", "DYoMGgGHF4cXBYvSM9Z2HLLFwRlh2oRV", "FqpDNxSGzfyPMjuX4e0xBHLQxAoXaM", "sLBg2sulOnfLDnGrTrTN9MFQszzZ4z"};
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public long A0M;
    public AudioTrack A0N;
    public S2 A0O;
    public Method A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public final S3 A0V;
    public final long[] A0W;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0X, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 36);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A0X = new byte[]{7, 5, 20, -20, 1, 20, 5, 14, 3, 25};
    }

    static {
        A06();
    }

    public S5(S3 s32) {
        this.A0V = (S3) AbstractC1589es.A01(s32);
        if (AbstractC1672gE.A02 >= 18) {
            try {
                this.A0P = AudioTrack.class.getMethod(A03(0, 10, 124), null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.A0W = new long[10];
    }

    private long A00() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.A0M != -9223372036854775807L) {
            long currentTimeMs = this.A0M;
            long elapsedTimeSinceStopUs = (1000 * elapsedRealtime) - currentTimeMs;
            long A0Q = AbstractC1672gE.A0Q(elapsedTimeSinceStopUs, this.A00);
            long mediaTimeSinceStopUs = this.A04;
            long elapsedTimeSinceStopUs2 = this.A07;
            long currentTimeMs2 = this.A0L;
            return Math.min(elapsedTimeSinceStopUs2, currentTimeMs2 + ((mediaTimeSinceStopUs * A0Q) / 1000000));
        }
        long currentTimeMs3 = this.A0C;
        if (elapsedRealtime - currentTimeMs3 >= 5) {
            A09(elapsedRealtime);
            this.A0C = elapsedRealtime;
        }
        return this.A0I + (this.A0J << 32);
    }

    private long A01() {
        return A02(A00());
    }

    private long A02(long j10) {
        return (1000000 * j10) / this.A04;
    }

    private void A04() {
        long nanoTime = System.nanoTime() / 1000;
        long systemTimeUs = this.A0A;
        if (nanoTime - systemTimeUs >= 30000) {
            long A01 = A01();
            if (A01 == 0) {
                return;
            }
            this.A0W[this.A02] = AbstractC1672gE.A0R(A01, this.A00) - nanoTime;
            this.A02 = (this.A02 + 1) % 10;
            if (this.A05 < 10) {
                this.A05++;
            }
            this.A0A = nanoTime;
            this.A0K = 0L;
            for (int i10 = 0; i10 < this.A05; i10++) {
                long j10 = this.A0K;
                long j11 = this.A0W[i10];
                long playbackPositionUs = this.A05;
                if (A0Y[2].length() != 17) {
                    throw new RuntimeException();
                }
                A0Y[3] = "eVr3vDMEgXazxVBLYwDFMkwHxHWXOK5u";
                this.A0K = j10 + (j11 / playbackPositionUs);
            }
        }
        if (this.A0T) {
            return;
        }
        A07(nanoTime);
        A08(nanoTime);
    }

    private void A05() {
        this.A0K = 0L;
        this.A05 = 0;
        this.A02 = 0;
        this.A0A = 0L;
        this.A0D = 0L;
        this.A0H = 0L;
        this.A0U = false;
    }

    private void A07(long j10) {
        S2 s22 = (S2) AbstractC1589es.A01(this.A0O);
        if (!s22.A07(j10)) {
            return;
        }
        long A02 = s22.A02();
        long A01 = s22.A01();
        long audioTimestampSystemTimeUs = A01();
        if (Math.abs(A02 - j10) > 5000000) {
            this.A0V.AFH(A01, A02, j10, audioTimestampSystemTimeUs);
            s22.A04();
        } else if (Math.abs(A02(A01) - audioTimestampSystemTimeUs) > 5000000) {
            this.A0V.AEc(A01, A02, j10, audioTimestampSystemTimeUs);
            s22.A04();
        } else {
            s22.A03();
        }
    }

    private void A08(long j10) {
        if (this.A0R && this.A0P != null && j10 - this.A09 >= 500000) {
            try {
                this.A0E = (((Integer) AbstractC1672gE.A0f((Integer) this.A0P.invoke(AbstractC1589es.A01(this.A0N), new Object[0]))).intValue() * 1000) - this.A06;
                this.A0E = Math.max(this.A0E, 0L);
                if (this.A0E > 5000000) {
                    this.A0V.ADb(this.A0E);
                    this.A0E = 0L;
                }
            } catch (Exception unused) {
                this.A0P = null;
            }
            this.A09 = j10;
        }
    }

    private void A09(long j10) {
        AudioTrack audioTrack = (AudioTrack) AbstractC1589es.A01(this.A0N);
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return;
        }
        long rawPlaybackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
        if (this.A0T) {
            String[] strArr = A0Y;
            String str = strArr[6];
            String str2 = strArr[7];
            int state = str.length();
            if (state != str2.length()) {
                throw new RuntimeException();
            }
            A0Y[2] = "n5TjXeqXqsQz2ph0c";
            if (playState == 2 && rawPlaybackHeadPosition == 0) {
                this.A0F = this.A0I;
            }
            long j11 = this.A0F;
            String[] strArr2 = A0Y;
            String str3 = strArr2[6];
            String str4 = strArr2[7];
            int state2 = str3.length();
            if (state2 != str4.length()) {
                throw new RuntimeException();
            }
            String[] strArr3 = A0Y;
            strArr3[6] = "x8qj6cjvwFnzzrIskXNXV59LdD3KV8";
            strArr3[7] = "NzVNDfRit63WR7T8gz6GmPtiaEIQlB";
            rawPlaybackHeadPosition += j11;
        }
        int state3 = AbstractC1672gE.A02;
        if (state3 <= 29) {
            if (rawPlaybackHeadPosition == 0 && this.A0I > 0) {
                int state4 = A0Y[0].charAt(18);
                if (state4 != 78) {
                    throw new RuntimeException();
                }
                A0Y[3] = "0B56dO5wwcgPgsHq71zLdNstBKLm4Nh0";
                if (playState == 3) {
                    if (this.A08 == -9223372036854775807L) {
                        this.A08 = j10;
                        return;
                    }
                    return;
                }
            }
            this.A08 = -9223372036854775807L;
        }
        if (this.A0I > rawPlaybackHeadPosition) {
            long j12 = this.A0J;
            int state5 = A0Y[0].charAt(18);
            if (state5 != 78) {
                this.A0J = j12 + 1;
            } else {
                String[] strArr4 = A0Y;
                strArr4[1] = "KeMAtBG5u95BPypwerH9XJrym2gjsq7l";
                strArr4[4] = "vCyjbLg9JpbTUDPQN4wt55t5TXuVZX9d";
                this.A0J = j12 + 1;
            }
        }
        this.A0I = rawPlaybackHeadPosition;
    }

    private boolean A0A() {
        return this.A0T && ((AudioTrack) AbstractC1589es.A01(this.A0N)).getPlayState() == 2 && A00() == 0;
    }

    public static boolean A0B(int i10) {
        if (AbstractC1672gE.A02 < 23) {
            if (i10 != 5) {
                if (A0Y[0].charAt(18) != 'N') {
                    throw new RuntimeException();
                }
                A0Y[0] = "6RWKPdvcclumOu7126NegMcjgdt4OIjz";
                if (i10 == 6) {
                }
            }
            return true;
        }
        return false;
    }

    public final int A0C(long j10) {
        int bytesPending = (int) (j10 - (A00() * this.A03));
        return this.A01 - bytesPending;
    }

    public final long A0D(boolean z10) {
        long A0Q;
        if (((AudioTrack) AbstractC1589es.A01(this.A0N)).getPlayState() == 3) {
            A04();
        }
        long nanoTime = System.nanoTime() / 1000;
        S2 s22 = (S2) AbstractC1589es.A01(this.A0O);
        boolean A06 = s22.A06();
        if (A06) {
            A0Q = A02(s22.A01()) + AbstractC1672gE.A0Q(nanoTime - s22.A02(), this.A00);
        } else {
            if (this.A05 == 0) {
                A0Q = A01();
            } else {
                A0Q = AbstractC1672gE.A0Q(this.A0K + nanoTime, this.A00);
            }
            if (!z10) {
                A0Q = Math.max(0L, A0Q - this.A0E);
            }
        }
        if (this.A0S != A06) {
            this.A0H = this.A0D;
            this.A0G = this.A0B;
        }
        long j10 = nanoTime - this.A0H;
        if (j10 < 1000000) {
            long A0Q2 = this.A0G + AbstractC1672gE.A0Q(j10, this.A00);
            String[] strArr = A0Y;
            if (strArr[1].charAt(13) == strArr[4].charAt(13)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0Y;
            strArr2[1] = "eKsrd17kDOCc3WQJgxvNNEOO76uR1zC9";
            strArr2[4] = "aZjfb7u22Ipk2hwfTZo2h7TaCEu14RbG";
            long j11 = (j10 * 1000) / 1000000;
            A0Q = ((A0Q * j11) + ((1000 - j11) * A0Q2)) / 1000;
        }
        boolean z11 = this.A0U;
        String[] strArr3 = A0Y;
        if (strArr3[6].length() != strArr3[7].length()) {
            throw new RuntimeException();
        }
        A0Y[0] = "DTNkOZavrnFMqcdww4NZ0ue9OABpdJ4o";
        if (!z11) {
            long systemTimeUs = this.A0B;
            if (A0Q > systemTimeUs) {
                this.A0U = true;
                long A0P = AbstractC1672gE.A0P(A0Q - this.A0B);
                if (A0Y[3].charAt(8) == '1') {
                    throw new RuntimeException();
                }
                A0Y[2] = "o7Jv65SdG9Ddlx7A2";
                this.A0V.AEa(System.currentTimeMillis() - AbstractC1672gE.A0P(AbstractC1672gE.A0R(A0P, this.A00)));
            }
        }
        this.A0D = nanoTime;
        this.A0B = A0Q;
        this.A0S = A06;
        return A0Q;
    }

    public final void A0E() {
        A05();
        this.A0N = null;
        this.A0O = null;
    }

    public final void A0F() {
        ((S2) AbstractC1589es.A01(this.A0O)).A05();
    }

    public final void A0G(float f10) {
        this.A00 = f10;
        if (this.A0O != null) {
            this.A0O.A05();
        }
        A05();
    }

    public final void A0H(long j10) {
        this.A0L = A00();
        this.A0M = SystemClock.elapsedRealtime() * 1000;
        this.A07 = j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0I(android.media.AudioTrack r6, boolean r7, int r8, int r9, int r10) {
        /*
            r5 = this;
            r5.A0N = r6
            r5.A03 = r9
            r5.A01 = r10
            com.facebook.ads.redexgen.X.S2 r0 = new com.facebook.ads.redexgen.X.S2
            r0.<init>(r6)
            r5.A0O = r0
            int r0 = r6.getSampleRate()
            r5.A04 = r0
            r4 = 0
            if (r7 == 0) goto L65
            boolean r3 = A0B(r8)
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.S5.A0Y
            r0 = 3
            r1 = r1[r0]
            r0 = 8
            char r1 = r1.charAt(r0)
            r0 = 49
            if (r1 == r0) goto L67
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.S5.A0Y
            java.lang.String r1 = "qVnZXnffR2i8TvGrKyzCxjUh4EeU23CC"
            r0 = 3
            r2[r0] = r1
            if (r3 == 0) goto L65
            r0 = 1
        L33:
            r5.A0T = r0
            boolean r0 = com.facebook.ads.redexgen.X.AbstractC1672gE.A15(r8)
            r5.A0R = r0
            boolean r0 = r5.A0R
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == 0) goto L63
            int r10 = r10 / r9
            long r0 = (long) r10
            long r0 = r5.A02(r0)
        L4a:
            r5.A06 = r0
            r0 = 0
            r5.A0I = r0
            r5.A0J = r0
            r5.A0F = r0
            r5.A0Q = r4
            r5.A0M = r2
            r5.A08 = r2
            r5.A09 = r0
            r5.A0E = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r5.A00 = r0
            return
        L63:
            r0 = r2
            goto L4a
        L65:
            r0 = 0
            goto L33
        L67:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.S5.A0I(android.media.AudioTrack, boolean, int, int, int):void");
    }

    public final boolean A0J() {
        return ((AudioTrack) AbstractC1589es.A01(this.A0N)).getPlayState() == 3;
    }

    public final boolean A0K() {
        A05();
        if (this.A0M == -9223372036854775807L) {
            ((S2) AbstractC1589es.A01(this.A0O)).A05();
            return true;
        }
        return false;
    }

    public final boolean A0L(long j10) {
        return j10 > A00() || A0A();
    }

    public final boolean A0M(long j10) {
        if (this.A08 != -9223372036854775807L && j10 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (A0Y[5].charAt(1) != 'Y') {
                throw new RuntimeException();
            }
            A0Y[3] = "ewfrQCHA6LhOQLWe9bWqr3r93C9sdiPY";
            if (elapsedRealtime - this.A08 >= 200) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
        if (r6 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
        if (r6 == 0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0N(long r10) {
        /*
            r9 = this;
            android.media.AudioTrack r0 = r9.A0N
            java.lang.Object r0 = com.facebook.ads.redexgen.X.AbstractC1589es.A01(r0)
            android.media.AudioTrack r0 = (android.media.AudioTrack) r0
            int r3 = r0.getPlayState()
            boolean r0 = r9.A0T
            r4 = 1
            if (r0 == 0) goto L5d
            r6 = 2
            r5 = 0
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.S5.A0Y
            r0 = 2
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 17
            if (r1 == r0) goto L26
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L26:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.S5.A0Y
            java.lang.String r1 = "fYaBr0fBAYoXw14XS0LlIlydWNI0S8ek"
            r0 = 5
            r2[r0] = r1
            if (r3 != r6) goto L32
            r9.A0Q = r5
            return r5
        L32:
            if (r3 != r4) goto L5d
            long r7 = r9.A00()
            r0 = 0
            int r6 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.S5.A0Y
            r0 = 1
            r1 = r2[r0]
            r0 = 4
            r2 = r2[r0]
            r0 = 13
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L5a
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.S5.A0Y
            java.lang.String r1 = "K9K75Eynd1NA52jHnJGfOkaO4hd6hfrX"
            r0 = 3
            r2[r0] = r1
            if (r6 != 0) goto L5d
        L59:
            return r5
        L5a:
            if (r6 != 0) goto L5d
            goto L59
        L5d:
            boolean r1 = r9.A0Q
            boolean r0 = r9.A0L(r10)
            r9.A0Q = r0
            if (r1 == 0) goto L7a
            boolean r0 = r9.A0Q
            if (r0 != 0) goto L7a
            if (r3 == r4) goto L7a
            com.facebook.ads.redexgen.X.S3 r3 = r9.A0V
            int r2 = r9.A01
            long r0 = r9.A06
            long r0 = com.facebook.ads.redexgen.X.AbstractC1672gE.A0P(r0)
            r3.AFQ(r2, r0)
        L7a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.S5.A0N(long):boolean");
    }
}
