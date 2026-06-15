package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class RE implements InterfaceC1310aH {
    public static byte[] A08;
    public static String[] A09 = {"uMWUqjzdvT", "JCiXwD9fbOJ6zbzJIqcGCn5sSqt0LRQF", "57MItfouy3vA8Xk70bmEVbgHOZ3ZiDhr", "0Oj5bCKjyYaUBav3ZkotafCPmqHs4LN9", "jQDBPIob659coWWd9cn9e1hxoV0W", "Plpspx2b5XYgIQ6XoPYNR66zb6Po4d", "vobWyVO53wo9DOiqvfsa5tfZ2hEa", "SMg7zuQOwNLh9aZZKsYOuBLn58fxxbRD"};
    public InterfaceC1309aG A00;
    public final QV A01;
    public final C1519dj A02;
    public final C05084e A03;
    public final C1577eg A04;
    public final Executor A05;
    public volatile AbstractRunnableFutureC1654fw<Void, IOException> A06;
    public volatile boolean A07;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 78);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A08 = new byte[]{64, 69, 69, 106, 104, 117, 121, Byte.MAX_VALUE, Byte.MAX_VALUE, 126, 76, 91, 83, 81, 72, 91};
    }

    static {
        A02();
    }

    public RE(ZE ze, PX px, Executor executor) {
        this.A05 = (Executor) AbstractC1589es.A01(executor);
        AbstractC1589es.A01(ze.A03);
        this.A02 = new C1516dg().A06(ze.A03.A00).A08(ze.A03.A04).A02(4).A09();
        this.A03 = px.A07();
        this.A04 = new C1577eg(this.A03, this.A02, null, new InterfaceC1576ef() { // from class: com.facebook.ads.redexgen.X.RG
            @Override // com.facebook.ads.redexgen.X.InterfaceC1576ef
            public final void AEi(long j10, long j11, long j12) {
                RE.this.A03(j10, j11, j12);
            }
        });
        this.A01 = px.A02();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(long j10, long j11, long j12) {
        float f10;
        if (this.A00 == null) {
            return;
        }
        if (j10 == -1 || j10 == 0) {
            f10 = -1.0f;
        } else {
            f10 = (((float) j11) * 100.0f) / ((float) j10);
        }
        this.A00.AEh(j10, j11, f10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1310aH
    public final void A5t(InterfaceC1309aG interfaceC1309aG) throws IOException, InterruptedException {
        this.A00 = interfaceC1309aG;
        if (0 != 0) {
            throw new NullPointerException(A01(0, 3, 111));
        }
        boolean z10 = false;
        while (!z10) {
            try {
                boolean finished = this.A07;
                if (finished) {
                    break;
                }
                this.A06 = new RF(this);
                if (0 == 0) {
                    this.A05.execute(this.A06);
                    try {
                        this.A06.get();
                        z10 = true;
                    } catch (ExecutionException e8) {
                        Throwable th = (Throwable) AbstractC1589es.A01(e8.getCause());
                        if (0 == 0) {
                            boolean finished2 = th instanceof IOException;
                            if (!finished2) {
                                AbstractC1672gE.A11(th);
                                throw null;
                            }
                            throw ((IOException) th);
                        }
                    }
                } else {
                    throw new NullPointerException(A01(3, 7, 84));
                }
            } catch (Throwable th2) {
                ((AbstractRunnableFutureC1654fw) AbstractC1589es.A01(this.A06)).A03();
                if (A09[5].length() == 1) {
                    throw new RuntimeException();
                }
                String[] strArr = A09;
                strArr[3] = "oMUAA4ylSx2MgE706wotjd5LCQps2nrb";
                strArr[1] = "rYIM7N2usn2vMEsEZAwpjtxu5A0ltiab";
                if (0 != 0) {
                    throw new NullPointerException(A01(10, 6, 112));
                }
                throw th2;
            }
        }
        ((AbstractRunnableFutureC1654fw) AbstractC1589es.A01(this.A06)).A03();
        if (0 != 0) {
            throw new NullPointerException(A01(10, 6, 112));
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.fw != com.google.android.exoplayer2.util.RunnableFutureTask<java.lang.Void, java.io.IOException> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC1310aH
    public final void cancel() {
        this.A07 = true;
        AbstractRunnableFutureC1654fw<Void, IOException> abstractRunnableFutureC1654fw = this.A06;
        if (abstractRunnableFutureC1654fw != null) {
            abstractRunnableFutureC1654fw.cancel(true);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1310aH
    public final void remove() {
        this.A03.A0E().AHa(this.A03.A0F().A4b(this.A02));
    }
}
