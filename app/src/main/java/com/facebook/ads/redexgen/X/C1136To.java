package com.facebook.ads.redexgen.X;

import android.net.Uri;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.android.exoplayer2.Metadata;
import com.google.android.exoplayer2.extractor.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.extractor.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.extractor.metadata.id3.TextInformationFrame;
import com.google.protobuf.CodedOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
@MetaExoPlayerCustomization("DoNotStrip")
/* renamed from: com.facebook.ads.redexgen.X.To  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1136To implements UK {
    public static byte[] A0K;
    public static String[] A0L = {"cdjyapYaXDfZVR5QabZXuXJSqdBchziJ", "nimNTfdSt", "bUaBbjJGhBgHiWCakEYJpwEfqyXuj", "Kage5wxCbPx3yBOZ80TOBBLlenHgQiVK", "JCgji0i3zQq", "VZddAqqfrBshQQMgRlSdCciWU2WLazyh", "vDtbvLja5vfJi2aQiQrs5lD38", "b45OS7rTchdUsq3HFUsLJGFPe2kFRlSn"};
    public static final UO A0M;
    public static final VP A0N;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public Metadata A06;
    public UL A07;
    public InterfaceC1157Uo A08;
    public InterfaceC1157Uo A09;
    public InterfaceC1135Tn A0A;
    public boolean A0B;
    public boolean A0C;
    public final int A0D;
    public final long A0E;
    public final UV A0F;
    public final UX A0G;
    public final UY A0H;
    public final InterfaceC1157Uo A0I;
    public final C1648fq A0J;

    public static String A09(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0K, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 6);
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A0K = new byte[]{87, 97, 101, 118, 103, 108, 97, 96, 36, 112, 107, 107, 36, 105, 101, 106, 125, 36, 102, 125, 112, 97, 119, 42, 7, 31, 22, 29};
    }

    static {
        A0B();
        A0M = new UO() { // from class: com.facebook.ads.redexgen.X.Tq
            @Override // com.facebook.ads.redexgen.X.UO
            public final UK[] A5D() {
                return C1136To.A0G();
            }

            @Override // com.facebook.ads.redexgen.X.UO
            public final /* synthetic */ UK[] A5E(Uri uri, Map map) {
                return UN.A01(this, uri, map);
            }
        };
        A0N = new VP() { // from class: com.facebook.ads.redexgen.X.Tp
            @Override // com.facebook.ads.redexgen.X.VP
            public final boolean A6G(int i10, int i11, int i12, int i13, int i14) {
                return C1136To.A0C(i10, i11, i12, i13, i14);
            }
        };
    }

    @MetaExoPlayerCustomization("DoNotStrip")
    public C1136To() {
        this(0);
    }

    @MetaExoPlayerCustomization("DoNotStrip")
    public C1136To(int i10) {
        this(i10, -9223372036854775807L);
    }

    @MetaExoPlayerCustomization("DoNotStrip")
    public C1136To(int i10, long j10) {
        this.A0D = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.A0E = j10;
        this.A0J = new C1648fq(10);
        this.A0H = new UY();
        this.A0F = new UV();
        this.A02 = -9223372036854775807L;
        this.A0G = new UX();
        this.A0I = new WN();
        this.A08 = this.A0I;
    }

    @RequiresNonNull({"extractorOutput", "realTrackOutput"})
    private int A00(WJ wj) throws IOException {
        if (this.A01 == 0) {
            try {
                A0F(wj, false);
            } catch (EOFException unused) {
                String[] strArr = A0L;
                if (strArr[6].length() != strArr[2].length()) {
                    A0L[0] = "GKdCVmn2q4fdvlc3DlBWKa88Yoe8xYYV";
                    return -1;
                }
                throw new RuntimeException();
            }
        }
        if (this.A0A == null) {
            this.A0A = A07(wj);
            this.A07.AID(this.A0A);
            this.A08.A6U(new P5().A11(this.A0H.A06).A0h(CodedOutputStream.DEFAULT_BUFFER_SIZE).A0b(this.A0H.A01).A0m(this.A0H.A03).A0d(this.A0F.A00).A0e(this.A0F.A01).A0v((this.A0D & 8) != 0 ? null : this.A06).A14());
            this.A03 = wj.A8d();
        } else if (this.A03 != 0) {
            long A8d = wj.A8d();
            if (A8d < this.A03) {
                wj.AJ9((int) (this.A03 - A8d));
            }
        }
        return A01(wj);
    }

    @RequiresNonNull({"realTrackOutput", "seeker"})
    private int A01(WJ wj) throws IOException {
        if (this.A00 == 0) {
            wj.AHr();
            if (A0E(wj)) {
                return -1;
            }
            this.A0J.A0f(0);
            int A0C = this.A0J.A0C();
            int sampleHeaderData = this.A01;
            if (A0D(A0C, sampleHeaderData)) {
                int sampleHeaderData2 = UZ.A00(A0C);
                if (sampleHeaderData2 != -1) {
                    this.A0H.A00(A0C);
                    if (this.A02 == -9223372036854775807L) {
                        this.A02 = this.A0A.A97(wj.A8d());
                        if (this.A0E != -9223372036854775807L) {
                            this.A02 += this.A0E - this.A0A.A97(0L);
                        }
                    }
                    int sampleHeaderData3 = this.A0H.A02;
                    this.A00 = sampleHeaderData3;
                    if (this.A0A instanceof AB) {
                        AB ab = (AB) this.A0A;
                        long j10 = this.A04;
                        int sampleHeaderData4 = this.A0H.A04;
                        long A03 = A03(j10 + sampleHeaderData4);
                        long A8d = wj.A8d();
                        int sampleHeaderData5 = this.A0H.A02;
                        ab.A01(A03, A8d + sampleHeaderData5);
                        if (this.A0C && ab.A02(this.A05)) {
                            this.A0C = false;
                            if (A0L[0].charAt(10) != 'f') {
                                throw new RuntimeException();
                            }
                            A0L[5] = "4wAXMzKjENIzDA5gMxrjSBqvX23yWt8x";
                            this.A08 = this.A09;
                        }
                    }
                }
            }
            wj.AJ9(1);
            this.A01 = 0;
            return 0;
        }
        int AHv = this.A08.AHv(wj, this.A00, true);
        if (AHv == -1) {
            return -1;
        }
        int bytesAppended = this.A00;
        this.A00 = bytesAppended - AHv;
        int bytesAppended2 = this.A00;
        if (bytesAppended2 > 0) {
            return 0;
        }
        this.A08.AI0(A03(this.A04), 1, this.A0H.A02, 0, null);
        long j11 = this.A04;
        int bytesAppended3 = this.A0H.A04;
        this.A04 = j11 + bytesAppended3;
        this.A00 = 0;
        return 0;
    }

    public static int A02(C1648fq c1648fq, int i10) {
        if (c1648fq.A0A() >= i10 + 4) {
            c1648fq.A0f(i10);
            int A0C = c1648fq.A0C();
            if (A0C == 1483304551 || A0C == 1231971951) {
                return A0C;
            }
        }
        if (c1648fq.A0A() >= 40) {
            c1648fq.A0f(36);
            return c1648fq.A0C() == 1447187017 ? 1447187017 : 0;
        }
        return 0;
    }

    private long A03(long j10) {
        return this.A02 + ((1000000 * j10) / this.A0H.A03);
    }

    public static long A04(Metadata metadata) {
        if (metadata != null) {
            int A02 = metadata.A02();
            for (int i10 = 0; i10 < A02; i10++) {
                Metadata.Entry A03 = metadata.A03(i10);
                if ((A03 instanceof TextInformationFrame) && ((Id3Frame) ((TextInformationFrame) A03)).A00.equals(A09(24, 4, 85))) {
                    return AbstractC1672gE.A0O(Long.parseLong(((TextInformationFrame) A03).A02.get(0)));
                }
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    private AD A05(WJ wj, boolean z10) throws IOException {
        wj.AG1(this.A0J.A0l(), 0, 4);
        this.A0J.A0f(0);
        this.A0H.A00(this.A0J.A0C());
        return new AD(wj.A8E(), wj.A8d(), this.A0H, z10);
    }

    public static C06479s A06(Metadata metadata, long j10) {
        if (metadata != null) {
            int A02 = metadata.A02();
            for (int i10 = 0; i10 < A02; i10++) {
                Metadata.Entry entry = metadata.A03(i10);
                if (entry instanceof MlltFrame) {
                    return C06479s.A01(j10, (MlltFrame) entry, A04(metadata));
                }
            }
            return null;
        }
        return null;
    }

    private InterfaceC1135Tn A07(WJ wj) throws IOException {
        long A04;
        InterfaceC1135Tn A08 = A08(wj);
        C06479s A06 = A06(this.A06, wj.A8d());
        if (this.A0B) {
            return new C06369h();
        }
        InterfaceC1135Tn interfaceC1135Tn = null;
        if (A0L[5].charAt(15) != 'g') {
            throw new RuntimeException();
        }
        A0L[5] = "RtO9gFPsqDfXg2wgX4DAS0iEQfwUxEPB";
        if ((this.A0D & 4) != 0) {
            long j10 = -1;
            if (A06 != null) {
                A04 = A06.A7j();
                j10 = A06.A7Z();
            } else if (A08 != null) {
                A04 = A08.A7j();
                j10 = A08.A7Z();
            } else {
                Metadata metadata = this.A06;
                String[] strArr = A0L;
                if (strArr[6].length() != strArr[2].length()) {
                    String[] strArr2 = A0L;
                    strArr2[7] = "GUQVHBYBcJBjS5w5lVjg2Cu0ek6YSNjQ";
                    strArr2[3] = "r2XlV6gisyHteDSfpB43A6ycevT4svxV";
                    A04 = A04(metadata);
                } else {
                    String[] strArr3 = A0L;
                    strArr3[4] = "0lOeW4X8SJD";
                    strArr3[1] = "krcnpKYJt";
                    A04 = A04(metadata);
                }
            }
            interfaceC1135Tn = new AB(A04, wj.A8d(), j10);
        } else if (A06 != null) {
            interfaceC1135Tn = A06;
        } else if (A08 != null) {
            interfaceC1135Tn = A08;
        }
        boolean z10 = true;
        if (interfaceC1135Tn == null || (!interfaceC1135Tn.AAY() && (this.A0D & 1) != 0)) {
            if ((this.A0D & 2) == 0) {
                z10 = false;
            }
            return A05(wj, z10);
        }
        return interfaceC1135Tn;
    }

    private InterfaceC1135Tn A08(WJ wj) throws IOException {
        C1648fq c1648fq = new C1648fq(this.A0H.A02);
        wj.AG1(c1648fq.A0l(), 0, this.A0H.A02);
        int i10 = 21;
        if ((this.A0H.A05 & 1) != 0) {
            if (this.A0H.A01 != 1) {
                i10 = 36;
            }
        } else if (this.A0H.A01 == 1) {
            i10 = 13;
        }
        String[] strArr = A0L;
        if (strArr[6].length() != strArr[2].length()) {
            String[] strArr2 = A0L;
            strArr2[7] = "sOfPd1l9ShHh4gsnosGJVCxae46Vt962";
            strArr2[3] = "2yDa4XzkwQd9O40vdzFdTsameuu7GaSH";
            int A02 = A02(c1648fq, i10);
            if (A02 == 1483304551 || A02 == 1231971951) {
                C9V A01 = C9V.A01(wj.A8E(), wj.A8d(), this.A0H, c1648fq);
                if (A01 != null && !this.A0F.A03()) {
                    wj.AHr();
                    int xingBase = i10 + 141;
                    wj.A3x(xingBase);
                    wj.AG1(this.A0J.A0l(), 0, 3);
                    this.A0J.A0f(0);
                    UV uv = this.A0F;
                    int xingBase2 = this.A0J.A0K();
                    uv.A04(xingBase2);
                }
                int xingBase3 = this.A0H.A02;
                wj.AJ9(xingBase3);
                if (A01 != null && !A01.AAY() && A02 == 1231971951) {
                    return A05(wj, false);
                }
                return A01;
            } else if (A02 == 1447187017) {
                C06299a A00 = C06299a.A00(wj.A8E(), wj.A8d(), this.A0H, c1648fq);
                wj.AJ9(this.A0H.A02);
                return A00;
            } else {
                wj.AHr();
                return null;
            }
        }
        throw new RuntimeException();
    }

    @EnsuresNonNull({"extractorOutput", "realTrackOutput"})
    private void A0A() {
        AbstractC1589es.A02(this.A09);
    }

    public static /* synthetic */ boolean A0C(int i10, int i11, int i12, int i13, int i14) {
        return (i11 == 67 && i12 == 79 && i13 == 77 && (i14 == 77 || i10 == 2)) || (i11 == 77 && i12 == 76 && i13 == 76 && (i14 == 84 || i10 == 2));
    }

    public static boolean A0D(int i10, long j10) {
        return ((long) ((-128000) & i10)) == ((-128000) & j10);
    }

    private boolean A0E(WJ wj) throws IOException {
        if (this.A0A != null) {
            long A7Z = this.A0A.A7Z();
            if (A7Z != -1) {
                long dataEndPosition = wj.A8Y();
                if (dataEndPosition > A7Z - 4) {
                    return true;
                }
            }
        }
        try {
            return !wj.AG2(this.A0J.A0l(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private boolean A0F(WJ wj, boolean z10) throws IOException {
        int candidateSynchronizedHeaderData;
        int i10 = 0;
        int frameSize = 0;
        int i11 = 0;
        int searchedBytes = 0;
        int headerData = z10 ? 32768 : 131072;
        wj.AHr();
        int validFrameCount = (wj.A8d() > 0L ? 1 : (wj.A8d() == 0L ? 0 : -1));
        if (validFrameCount == 0) {
            int validFrameCount2 = this.A0D;
            int validFrameCount3 = (validFrameCount2 & 8) == 0 ? 1 : 0;
            Metadata A00 = this.A0G.A00(wj, validFrameCount3 != 0 ? null : A0N);
            if (A0L[5].charAt(15) != 103) {
                throw new RuntimeException();
            }
            String[] strArr = A0L;
            strArr[7] = "eORBeBWHV99UpwpaOFFR5UqaeJbwOlaD";
            strArr[3] = "erAb31F4soXlTVRY0ij4AX1PeWI3u3oR";
            this.A06 = A00;
            if (this.A06 != null) {
                this.A0F.A05(this.A06);
            }
            i11 = (int) wj.A8Y();
            if (!z10) {
                wj.AJ9(i11);
            }
        }
        while (true) {
            if (A0E(wj)) {
                if (i10 <= 0) {
                    throw new EOFException();
                }
            } else {
                this.A0J.A0f(0);
                int A0C = this.A0J.A0C();
                if ((frameSize != 0 && !A0D(A0C, frameSize)) || (candidateSynchronizedHeaderData = UZ.A00(A0C)) == -1) {
                    int candidateSynchronizedHeaderData2 = searchedBytes + 1;
                    if (searchedBytes == headerData) {
                        if (z10) {
                            return false;
                        }
                        throw Q6.A01(A09(0, 24, 2), null);
                    }
                    i10 = 0;
                    frameSize = 0;
                    if (z10) {
                        wj.AHr();
                        int validFrameCount4 = i11 + candidateSynchronizedHeaderData2;
                        wj.A3x(validFrameCount4);
                    } else {
                        wj.AJ9(1);
                    }
                    searchedBytes = candidateSynchronizedHeaderData2;
                } else {
                    i10++;
                    if (i10 == 1) {
                        this.A0H.A00(A0C);
                        frameSize = A0C;
                    } else if (i10 == 4) {
                        break;
                    }
                    int validFrameCount5 = candidateSynchronizedHeaderData - 4;
                    wj.A3x(validFrameCount5);
                }
            }
        }
        if (z10) {
            wj.AJ9(i11 + searchedBytes);
        } else {
            wj.AHr();
        }
        this.A01 = frameSize;
        return true;
    }

    public static /* synthetic */ UK[] A0G() {
        return new UK[]{new C1136To()};
    }

    @Override // com.facebook.ads.redexgen.X.UK
    public final void AA0(UL ul) {
        this.A07 = ul;
        this.A09 = this.A07.AJX(0, 1);
        this.A08 = this.A09;
        this.A07.A6E();
    }

    @Override // com.facebook.ads.redexgen.X.UK
    public final int AGT(WJ wj, C1152Ug c1152Ug) throws IOException {
        A0A();
        int A00 = A00(wj);
        if (A00 == -1 && (this.A0A instanceof AB)) {
            long A03 = A03(this.A04);
            long durationUs = this.A0A.A7j();
            int readResult = (durationUs > A03 ? 1 : (durationUs == A03 ? 0 : -1));
            if (readResult != 0) {
                ((AB) this.A0A).A00(A03);
                this.A07.AID(this.A0A);
            }
        }
        return A00;
    }

    @Override // com.facebook.ads.redexgen.X.UK
    public final void AGj() {
    }

    @Override // com.facebook.ads.redexgen.X.UK
    public final void AIC(long j10, long j11) {
        this.A01 = 0;
        this.A02 = -9223372036854775807L;
        this.A04 = 0L;
        this.A00 = 0;
        this.A05 = j11;
        if ((this.A0A instanceof AB) && !((AB) this.A0A).A02(j11)) {
            this.A0C = true;
            this.A08 = this.A0I;
        }
    }

    @Override // com.facebook.ads.redexgen.X.UK
    public final boolean AJB(WJ wj) throws IOException {
        return A0F(wj, true);
    }
}
