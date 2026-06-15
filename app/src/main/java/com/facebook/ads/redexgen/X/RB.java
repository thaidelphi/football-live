package com.facebook.ads.redexgen.X;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class RB implements InterfaceC1365bF {
    public static byte[] A03;
    public static String[] A04 = {"51zoTUQSZUkAm9N", "UmDZDEYxiFNidmc", "juFDCpz3v21RfDAwdfYhV9A2wKaxsmcO", "MhCn0J4SV0NDUAwG4DVpMSgSbJKOqp8K", "mTgNIz0SrBR0YJWzZDcYYsasjGQnrGPZ", "gUk4H2YjEaz2W3r8htX3i3SxyPgmNb3p", "gIYq6lStA20yFLF", "d0bSd06rXARdF1mViNDpEI0PQMof55jj"};
    public UK A00;
    public WJ A01;
    public final UO A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A04[5].charAt(2) == 'Y') {
                throw new RuntimeException();
            }
            A04[1] = "JhJbGfNBWj2SchhK4njS";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 86);
            i13++;
        }
    }

    public static void A01() {
        A03 = new byte[]{106, 99, 32, 44, 54, 47, 39, 99, 49, 38, 34, 39, 99, 55, 43, 38, 99, 48, 55, 49, 38, 34, 46, 109, 27, 58, 59, 48, 117, 58, 51, 117, 33, 61, 48, 117, 52, 35, 52, 60, 57, 52, 55, 57, 48, 117, 48, 45, 33, 39, 52, 54, 33, 58, 39, 38, 117, 125};
    }

    static {
        A01();
    }

    public RB(UO uo) {
        this.A02 = uo;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1365bF
    @MetaExoPlayerCustomization("No op, we don't include mp3 extractor due to apk size")
    public final void A5o() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1365bF
    public final long A7Q() {
        if (this.A01 != null) {
            return this.A01.A8d();
        }
        return -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
        if (r10.A8d() != r20) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006f, code lost:
        if (r10.A8d() != r20) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007b, code lost:
        r0 = false;
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC1365bF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AA2(@com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(" To be replaced with DataReader after upstream is updated") com.facebook.ads.redexgen.X.Q7 r17, android.net.Uri r18, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r19, long r20, long r22, com.facebook.ads.redexgen.X.UL r24) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.RB.AA2(com.facebook.ads.redexgen.X.Q7, android.net.Uri, java.util.Map, long, long, com.facebook.ads.redexgen.X.UL):void");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1365bF
    public final int AGU(C1152Ug c1152Ug) throws IOException {
        return ((UK) AbstractC1589es.A01(this.A00)).AGT((WJ) AbstractC1589es.A01(this.A01), c1152Ug);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1365bF
    public final void AGj() {
        if (this.A00 != null) {
            this.A00.AGj();
            this.A00 = null;
        }
        this.A01 = null;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1365bF
    public final void AIC(long j10, long j11) {
        ((UK) AbstractC1589es.A01(this.A00)).AIC(j10, j11);
    }
}
