package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.google.android.exoplayer2.offline.DownloadRequest;
import com.google.android.exoplayer2.scheduler.Requirements;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
/* renamed from: com.facebook.ads.redexgen.X.a5  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1299a5 {
    public static byte[] A0G;
    public static String[] A0H = {"EHyNV0VopsOtwSporiXH3IbUCIQKjXRj", "Q", "", "XmTJCs8qPSdQcdHdn61LRPPQ3smSG97I", "wDplLygIoXk8XNkot1UfjryK9SCAgYHB", "ECol1X044kK0FUMIHw", "4i0Hj8v1liMILlsDukoyXpRoFV", "Uw0qpJPhvEn15ioY0LVsH0H2Mn"};
    public static final Requirements A0I;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public C1325aY A05;
    public List<C1278Zk> A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final Context A0A;
    public final Handler A0B;
    public final HandlerC1296a2 A0C;
    public final RD A0D;
    public final InterfaceC1321aU A0E;
    public final CopyOnWriteArraySet<InterfaceC1298a4> A0F;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0G, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 118);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A0G = new byte[]{73, 116, 99, 92, 96, 109, 117, 105, 126, 54, 72, 99, 123, 98, 96, 99, 109, 104, 65, 109, 98, 109, 107, 105, 126};
        if (A0H[3].charAt(2) != 'T') {
            throw new RuntimeException();
        }
        String[] strArr = A0H;
        strArr[2] = "";
        strArr[1] = "z";
    }

    static {
        A03();
        A0I = new Requirements(1);
    }

    public C1299a5(Context context, RD rd, InterfaceC1312aJ interfaceC1312aJ) {
        this.A0A = context.getApplicationContext();
        this.A0D = rd;
        this.A01 = 3;
        this.A02 = 5;
        this.A07 = true;
        this.A06 = Collections.emptyList();
        this.A0F = new CopyOnWriteArraySet<>();
        Handler A0b = AbstractC1672gE.A0b(new Handler.Callback() { // from class: com.facebook.ads.redexgen.X.Zy
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean A0B;
                A0B = C1299a5.this.A0B(message);
                return A0B;
            }
        });
        this.A0B = A0b;
        HandlerThread handlerThread = new HandlerThread(A01(0, 25, 122));
        handlerThread.start();
        this.A0C = new HandlerC1296a2(handlerThread, rd, interfaceC1312aJ, A0b, this.A01, this.A02, this.A07);
        InterfaceC1321aU requirementsListener = new InterfaceC1321aU() { // from class: com.facebook.ads.redexgen.X.RI
            @Override // com.facebook.ads.redexgen.X.InterfaceC1321aU
            public final void AEr(C1325aY c1325aY, int i10) {
                C1299a5.this.A07(c1325aY, i10);
            }
        };
        this.A0E = requirementsListener;
        this.A05 = new C1325aY(context, requirementsListener, A0I);
        this.A03 = this.A05.A09();
        this.A04 = 1;
        this.A0C.obtainMessage(0, this.A03, 0).sendToTarget();
    }

    public C1299a5(Context context, InterfaceC1098Sb interfaceC1098Sb, InterfaceC1562eR interfaceC1562eR, InterfaceC1509dZ interfaceC1509dZ, Executor executor) {
        this(context, new C06178n(interfaceC1098Sb), new RL(new PX().A06(interfaceC1562eR).A05(interfaceC1509dZ), executor));
    }

    public static C1278Zk A00(C1278Zk c1278Zk, DownloadRequest downloadRequest, int i10, long j10) {
        int i11;
        int i12 = c1278Zk.A02;
        long j11 = (i12 == 5 || c1278Zk.A02()) ? j10 : c1278Zk.A05;
        if (i12 == 5 || i12 == 7) {
            i11 = 7;
        } else if (i10 != 0) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        return new C1278Zk(c1278Zk.A07.A02(downloadRequest), i11, j11, j10, -1L, i10, 0);
    }

    private void A02() {
        Iterator<InterfaceC1298a4> it = this.A0F.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A0H[5].length() != 18) {
                throw new RuntimeException();
            }
            String[] strArr = A0H;
            strArr[4] = "oYuwoExxSCJatCdoNpFVjUf8qQzmlhRf";
            strArr[0] = "XrlHvPXFODayNWGoxH1spJ6N8DDPEnzj";
            if (hasNext) {
                InterfaceC1298a4 listener = it.next();
                listener.AFn(this, this.A09);
            } else {
                return;
            }
        }
    }

    private void A04(int i10, int i11) {
        this.A04 -= i10;
        this.A00 = i11;
        if (A0I()) {
            Iterator<InterfaceC1298a4> it = this.A0F.iterator();
            while (it.hasNext()) {
                it.next().ADL(this);
            }
        }
    }

    private void A05(C1294a0 c1294a0) {
        this.A06 = Collections.unmodifiableList(c1294a0.A02);
        C1278Zk c1278Zk = c1294a0.A00;
        boolean A0A = A0A();
        if (c1294a0.A03) {
            CopyOnWriteArraySet<InterfaceC1298a4> copyOnWriteArraySet = this.A0F;
            String[] strArr = A0H;
            if (strArr[6].length() == strArr[7].length()) {
                String[] strArr2 = A0H;
                strArr2[2] = "";
                strArr2[1] = "M";
                Iterator<InterfaceC1298a4> it = copyOnWriteArraySet.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    if (A0H[5].length() == 18) {
                        A0H[5] = "Q0W7n66yvRpCOJYiKm";
                        if (!hasNext) {
                            break;
                        }
                        it.next().ACx(this, c1278Zk);
                    } else {
                        break;
                    }
                }
            }
            throw new RuntimeException();
        }
        Iterator<InterfaceC1298a4> it2 = this.A0F.iterator();
        while (it2.hasNext()) {
            it2.next().ACw(this, c1278Zk, c1294a0.A01);
        }
        if (A0A) {
            A02();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(C1325aY c1325aY, int i10) {
        Requirements A0A = c1325aY.A0A();
        if (this.A03 != i10) {
            this.A03 = i10;
            this.A04++;
            this.A0C.obtainMessage(2, i10, 0).sendToTarget();
        }
        boolean A0A2 = A0A();
        Iterator<InterfaceC1298a4> it = this.A0F.iterator();
        while (it.hasNext()) {
            it.next().AEq(this, A0A, i10);
        }
        if (A0A2) {
            A02();
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0017 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A08(java.util.List<com.facebook.ads.redexgen.X.C1278Zk> r4) {
        /*
            r3 = this;
            r0 = 1
            r3.A08 = r0
            java.util.List r0 = java.util.Collections.unmodifiableList(r4)
            r3.A06 = r0
            boolean r2 = r3.A0A()
            java.util.concurrent.CopyOnWriteArraySet<com.facebook.ads.redexgen.X.a4> r0 = r3.A0F
            java.util.Iterator r1 = r0.iterator()
        L13:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L23
            java.lang.Object r0 = r1.next()
            com.facebook.ads.redexgen.X.a4 r0 = (com.facebook.ads.redexgen.X.InterfaceC1298a4) r0
            r0.ADQ(r3)
            goto L13
        L23:
            if (r2 == 0) goto L28
            r3.A02()
        L28:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1299a5.A08(java.util.List):void");
    }

    private void A09(boolean z10) {
        if (this.A07 == z10) {
            return;
        }
        this.A07 = z10;
        this.A04++;
        this.A0C.obtainMessage(1, z10 ? 1 : 0, 0).sendToTarget();
        boolean A0A = A0A();
        if (A0H[5].length() != 18) {
            throw new RuntimeException();
        }
        A0H[5] = "E4f6B9BERK22LeseT5";
        Iterator<InterfaceC1298a4> it = this.A0F.iterator();
        while (it.hasNext()) {
            it.next();
        }
        if (A0A) {
            A02();
        }
    }

    private boolean A0A() {
        boolean z10 = false;
        boolean waitingForRequirements = this.A07;
        if (!waitingForRequirements && this.A03 != 0) {
            int i10 = 0;
            while (true) {
                if (i10 >= this.A06.size()) {
                    break;
                } else if (this.A06.get(i10).A02 == 0) {
                    z10 = true;
                    break;
                } else {
                    i10++;
                }
            }
        }
        boolean z11 = this.A09;
        String[] strArr = A0H;
        if (strArr[2].length() != strArr[1].length()) {
            String[] strArr2 = A0H;
            strArr2[4] = "QnTKkBInmSLAELxodsvJ0gnTh61QJ8rh";
            strArr2[0] = "e4U9zwIscy6duOvoDJhCr2uw4gou80MH";
            boolean waitingForRequirements2 = z11 != z10;
            this.A09 = z10;
            return waitingForRequirements2;
        }
        throw new RuntimeException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0B(Message message) {
        switch (message.what) {
            case 0:
                A08((List) message.obj);
                return true;
            case 1:
                int activeTaskCount = message.arg1;
                int processedMessageCount = message.arg2;
                A04(activeTaskCount, processedMessageCount);
                return true;
            case 2:
                C1294a0 update = (C1294a0) message.obj;
                A05(update);
                return true;
            default:
                throw new IllegalStateException();
        }
    }

    public final List<C1278Zk> A0D() {
        return this.A06;
    }

    public final void A0E() {
        A09(false);
    }

    public final void A0F(InterfaceC1298a4 interfaceC1298a4) {
        AbstractC1589es.A01(interfaceC1298a4);
        this.A0F.add(interfaceC1298a4);
    }

    public final void A0G(DownloadRequest downloadRequest) {
        A0H(downloadRequest, 0);
    }

    public final void A0H(DownloadRequest downloadRequest, int i10) {
        this.A04++;
        this.A0C.obtainMessage(6, i10, 0, downloadRequest).sendToTarget();
    }

    public final boolean A0I() {
        return this.A00 == 0 && this.A04 == 0;
    }
}
