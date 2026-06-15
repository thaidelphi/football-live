package com.facebook.ads.redexgen.X;

import android.os.Looper;
import android.os.SystemClock;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
/* renamed from: com.facebook.ads.redexgen.X.Pj  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1031Pj {
    public static byte[] A03;
    public static String[] A04 = {"ZXOVLljuGdQ2gTrQcY", "AnY6qwAsN2cEV2qqh7NXOlRMqgnXbL12", "C3RLqG3kgGcNKks9nj", "hVdBrTleqSQSp7EUmSxtJM2aSZeLdeTY", "hXXunCex6byJXMUYvVcZ4hsiNxREVLze", "", "x4jMW2yFkCQJ3TaFkNFEnsDLco7eFWBD", "kIVIyQ8JpM8glrZvZDd1g0aXlAolcLuw"};
    public static final C1540e5 A05;
    public static final C1540e5 A06;
    public static final C1540e5 A07;
    public static final C1540e5 A08;
    public HandlerC1541e6<? extends InterfaceC1542e7> A00;
    public IOException A01;
    public final InterfaceExecutorC1651ft A02;

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = copyOfRange[i13] - i12;
            if (A04[1].charAt(10) == 'p') {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[6] = "SkelYcjwr8Q4VqUF7DglQ0EZLKgb4BIV";
            strArr[3] = "BDhwTEuyuBQJLr2VSUkFJW2e1rFLtmdt";
            copyOfRange[i13] = (byte) (i14 - 43);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A03 = new byte[]{-127, -76, -85, -116, -88, -99, -75, -95, -82, 118, -120, -85, -99, -96, -95, -82, 118};
    }

    static {
        A07();
        A07 = A01(false, -9223372036854775807L);
        A08 = A01(true, -9223372036854775807L);
        A05 = new C1540e5(2, -9223372036854775807L);
        A06 = new C1540e5(3, -9223372036854775807L);
    }

    @MetaExoPlayerCustomization(type = {"MERGED"})
    public C1031Pj(InterfaceExecutorC1651ft interfaceExecutorC1651ft) {
        this.A02 = interfaceExecutorC1651ft;
    }

    @MetaExoPlayerCustomization(type = {"MERGED"})
    public C1031Pj(String str) {
        this(AbstractC1650fs.A00(AbstractC1672gE.A0u(A06(0, 17, 17) + str), new InterfaceC1600f3() { // from class: com.facebook.ads.redexgen.X.Pk
            @Override // com.facebook.ads.redexgen.X.InterfaceC1600f3
            public final void A2z(Object obj) {
                ((ExecutorService) obj).shutdown();
            }
        }));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.e4 != com.google.android.exoplayer2.upstream.Loader$Callback<T extends com.facebook.ads.redexgen.X.e7> */
    @MetaExoPlayerCustomization("D14742363 Needed to accept supplied looper for Exo2DashLiveManifestFetcher manifest loading")
    private final <T extends InterfaceC1542e7> long A00(Looper looper, T t10, InterfaceC1539e4<T> interfaceC1539e4, int i10) {
        AbstractC1589es.A08(looper != null);
        this.A01 = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new HandlerC1541e6(this, looper, t10, interfaceC1539e4, i10, elapsedRealtime).A06(0L);
        return elapsedRealtime;
    }

    public static C1540e5 A01(boolean z10, long j10) {
        return new C1540e5(z10 ? 1 : 0, j10);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.e4 != com.google.android.exoplayer2.upstream.Loader$Callback<T extends com.facebook.ads.redexgen.X.e7> */
    public final <T extends InterfaceC1542e7> long A08(T t10, InterfaceC1539e4<T> interfaceC1539e4, int i10) {
        Looper looper = (Looper) AbstractC1589es.A02(Looper.myLooper());
        return A00(looper, t10, interfaceC1539e4, i10);
    }

    public final void A09() {
        ((HandlerC1541e6) AbstractC1589es.A02(this.A00)).A07(false);
    }

    public final void A0A() {
        this.A01 = null;
    }

    public final void A0B(int i10) throws IOException {
        if (this.A01 == null) {
            if (this.A00 != null) {
                HandlerC1541e6<? extends InterfaceC1542e7> handlerC1541e6 = this.A00;
                if (i10 == Integer.MIN_VALUE) {
                    i10 = this.A00.A07;
                }
                handlerC1541e6.A05(i10);
                return;
            }
            return;
        }
        throw this.A01;
    }

    public final void A0C(InterfaceC1543e8 interfaceC1543e8) {
        if (this.A00 != null) {
            this.A00.A07(true);
        }
        if (interfaceC1543e8 != null) {
            this.A02.execute(new RunnableC1544e9(interfaceC1543e8));
        }
        this.A02.AGj();
    }

    public final boolean A0D() {
        return this.A01 != null;
    }

    public final boolean A0E() {
        return this.A00 != null;
    }
}
