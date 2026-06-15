package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.extractor.metadata.icy.IcyHeaders;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.List;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class R3 implements InterfaceC1542e7, InterfaceC1343aq {
    public long A00;
    public InterfaceC1157Uo A01;
    public C1519dj A02;
    public boolean A04;
    public final Uri A06;
    public final UL A07;
    public final InterfaceC1365bF A09;
    public final AnonymousClass51 A0A;
    public final C1599f2 A0B;
    public volatile boolean A0C;
    public final /* synthetic */ C05867h A0D;
    public final C1152Ug A08 = new C1152Ug();
    public boolean A03 = true;
    public final long A05 = C1344ar.A00();

    public R3(C05867h c05867h, Uri uri, Q7 q72, InterfaceC1365bF interfaceC1365bF, UL ul, C1599f2 c1599f2) {
        this.A0D = c05867h;
        this.A06 = uri;
        this.A0A = new AnonymousClass51(q72);
        this.A09 = interfaceC1365bF;
        this.A07 = ul;
        this.A0B = c1599f2;
    }

    public static /* synthetic */ long A00(R3 r32) {
        return r32.A05;
    }

    public static /* synthetic */ long A01(R3 r32) {
        return r32.A00;
    }

    public static /* synthetic */ C1519dj A02(R3 r32) {
        return r32.A02;
    }

    public static /* synthetic */ AnonymousClass51 A03(R3 r32) {
        return r32.A0A;
    }

    public void A04(long j10, long j11) {
        this.A08.A00 = j10;
        this.A00 = j11;
        this.A03 = true;
        this.A04 = false;
    }

    public static /* synthetic */ void A05(R3 r32, long j10, long j11) {
        r32.A04(j10, j11);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1542e7
    public final void A4h() {
        this.A0C = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1542e7
    public final void AAg() throws IOException {
        String str;
        IcyHeaders icyHeaders;
        IcyHeaders icyHeaders2;
        long j10;
        Handler handler;
        Runnable runnable;
        IcyHeaders icyHeaders3;
        IcyHeaders icyHeaders4;
        ZM zm;
        int i10 = 0;
        while (i10 == 0 && !this.A0C) {
            try {
                long j11 = this.A08.A00;
                Uri uri = this.A06;
                str = this.A0D.A0b;
                this.A02 = new C1519dj(uri, j11, -1L, str);
                long AFq = this.A0A.AFq(this.A02);
                if (AFq != -1) {
                    AFq += j11;
                    this.A0D.A0G();
                }
                this.A0D.A07 = null;
                Q7 q72 = this.A0A;
                icyHeaders = this.A0D.A07;
                if (icyHeaders != null) {
                    icyHeaders3 = this.A0D.A07;
                    if (icyHeaders3.A01 != -1) {
                        AnonymousClass51 anonymousClass51 = this.A0A;
                        icyHeaders4 = this.A0D.A07;
                        q72 = new Q7(anonymousClass51, icyHeaders4.A01, this) { // from class: com.facebook.ads.redexgen.X.7n
                            public static String[] A05 = {"KrZrFX7VeXkYRpEXQ1lf32035OaT5wWd", "XVsM", "llFvuJo", "U1ni", "0kr19y6", "ysbpS1odrzKoTQ1N3J7BWoJUcQZSRkl7", "Z", "YhdHrgpizYFEyiG8McIVBQmqLy38zBfL"};
                            public int A00;
                            public final int A01;
                            public final InterfaceC1343aq A02;
                            public final Q7 A03;
                            public final byte[] A04;

                            {
                                AbstractC1589es.A07(r4 > 0);
                                this.A03 = anonymousClass51;
                                this.A01 = r4;
                                this.A02 = this;
                                this.A04 = new byte[1];
                                this.A00 = r4;
                            }

                            private boolean A00() throws IOException {
                                int bytesRead = this.A03.read(this.A04, 0, 1);
                                if (bytesRead == -1) {
                                    return false;
                                }
                                int bytesRead2 = this.A04[0];
                                int offset = (bytesRead2 & 255) << 4;
                                if (offset == 0) {
                                    return true;
                                }
                                int i11 = 0;
                                int i12 = offset;
                                byte[] bArr = new byte[offset];
                                while (i12 > 0) {
                                    int bytesRead3 = this.A03.read(bArr, i11, i12);
                                    if (bytesRead3 == -1) {
                                        return false;
                                    }
                                    i11 += bytesRead3;
                                    i12 -= bytesRead3;
                                }
                                while (offset > 0) {
                                    int bytesRead4 = offset - 1;
                                    byte b10 = bArr[bytesRead4];
                                    if (A05[3].length() == 4) {
                                        A05[5] = "cDJ5b9WNPpZl9kiNRj0rNshyOkDll0Mq";
                                        if (b10 != 0) {
                                            break;
                                        }
                                        offset--;
                                    } else {
                                        throw new RuntimeException();
                                    }
                                }
                                if (offset > 0) {
                                    this.A02.ADK(new C1648fq(bArr, offset));
                                }
                                return true;
                            }

                            @Override // com.facebook.ads.redexgen.X.Q7
                            public final void A3t(InterfaceC1558eN interfaceC1558eN) {
                                AbstractC1589es.A01(interfaceC1558eN);
                                this.A03.A3t(interfaceC1558eN);
                            }

                            @Override // com.facebook.ads.redexgen.X.Q7
                            public final Map<String, List<String>> A8j() {
                                return this.A03.A8j();
                            }

                            @Override // com.facebook.ads.redexgen.X.Q7
                            public final Uri A9F() {
                                return this.A03.A9F();
                            }

                            @Override // com.facebook.ads.redexgen.X.Q7
                            public final long AFq(C1519dj c1519dj) {
                                throw new UnsupportedOperationException();
                            }

                            @Override // com.facebook.ads.redexgen.X.Q7
                            public final void close() {
                                throw new UnsupportedOperationException();
                            }

                            @Override // com.facebook.ads.redexgen.X.O9
                            public final int read(byte[] bArr, int i11, int i12) throws IOException {
                                if (this.A00 == 0) {
                                    if (!A00()) {
                                        return -1;
                                    }
                                    this.A00 = this.A01;
                                }
                                int read = this.A03.read(bArr, i11, Math.min(this.A00, i12));
                                if (read != -1) {
                                    int bytesRead = this.A00;
                                    this.A00 = bytesRead - read;
                                }
                                return read;
                            }
                        };
                        this.A01 = this.A0D.A0Z();
                        InterfaceC1157Uo interfaceC1157Uo = this.A01;
                        zm = C05867h.A0g;
                        interfaceC1157Uo.A6U(zm);
                    }
                }
                this.A09.AA2(q72, this.A06, this.A0A.A8j(), j11, AFq, this.A07);
                icyHeaders2 = this.A0D.A07;
                if (icyHeaders2 != null) {
                    this.A09.A5o();
                }
                if (this.A03) {
                    this.A09.AIC(j11, this.A00);
                    this.A03 = false;
                }
                while (i10 == 0 && !this.A0C) {
                    try {
                        this.A0B.A00();
                        i10 = this.A09.AGU(this.A08);
                        long position = this.A09.A7Q();
                        j10 = this.A0D.A0M;
                        if (position > j10 + j11) {
                            j11 = position;
                            this.A0B.A02();
                            handler = this.A0D.A0O;
                            runnable = this.A0D.A0a;
                            handler.post(runnable);
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i10 == 1) {
                    i10 = 0;
                } else if (this.A09.A7Q() != -1) {
                    this.A08.A00 = this.A09.A7Q();
                }
                AbstractC1514de.A00(this.A0A);
            } catch (Throwable th) {
                if (i10 != 1 && this.A09.A7Q() != -1) {
                    this.A08.A00 = this.A09.A7Q();
                }
                AbstractC1514de.A00(this.A0A);
                throw th;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1343aq
    public final void ADK(C1648fq c1648fq) {
        long A03;
        long max;
        if (this.A04) {
            A03 = this.A0D.A03(true);
            max = Math.max(A03, this.A00);
        } else {
            max = this.A00;
        }
        int A07 = c1648fq.A07();
        InterfaceC1157Uo interfaceC1157Uo = (InterfaceC1157Uo) AbstractC1589es.A01(this.A01);
        interfaceC1157Uo.AHx(c1648fq, A07);
        interfaceC1157Uo.AI0(max, 1, A07, 0, null);
        this.A04 = true;
    }
}
