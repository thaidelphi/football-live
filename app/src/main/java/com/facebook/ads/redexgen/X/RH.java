package com.facebook.ads.redexgen.X;

import android.os.Handler;
import com.google.android.exoplayer2.offline.DownloadRequest;
import java.io.IOException;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class RH extends Thread implements InterfaceC1309aG {
    public long A00;
    public Exception A01;
    public final int A02;
    public final C1300a6 A03;
    public final DownloadRequest A04;
    public final InterfaceC1310aH A05;
    public final boolean A06;
    public volatile HandlerC1296a2 A07;
    public volatile boolean A08;

    public RH(DownloadRequest downloadRequest, InterfaceC1310aH interfaceC1310aH, C1300a6 c1300a6, boolean z10, int i10, HandlerC1296a2 handlerC1296a2) {
        this.A04 = downloadRequest;
        this.A05 = interfaceC1310aH;
        this.A03 = c1300a6;
        this.A06 = z10;
        this.A02 = i10;
        this.A07 = handlerC1296a2;
        this.A00 = -1L;
    }

    public static int A00(int i10) {
        return Math.min((i10 - 1) * 1000, 5000);
    }

    public static /* synthetic */ DownloadRequest A01(RH rh) {
        return rh.A04;
    }

    public static /* synthetic */ Exception A02(RH rh) {
        return rh.A01;
    }

    public static /* synthetic */ boolean A03(RH rh) {
        return rh.A06;
    }

    public static /* synthetic */ boolean A04(RH rh) {
        return rh.A08;
    }

    public final void A05(boolean z10) {
        if (z10) {
            this.A07 = null;
        }
        if (!this.A08) {
            this.A08 = true;
            this.A05.cancel();
            interrupt();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1309aG
    public final void AEh(long j10, long j11, float f10) {
        this.A03.A01 = j11;
        this.A03.A00 = f10;
        if (j10 != this.A00) {
            this.A00 = j10;
            HandlerC1296a2 handlerC1296a2 = this.A07;
            if (handlerC1296a2 != null) {
                handlerC1296a2.obtainMessage(10, (int) (j10 >> 32), (int) j10, this).sendToTarget();
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            try {
                if (this.A06) {
                    this.A05.remove();
                } else {
                    int i10 = 0;
                    long bytesDownloaded = -1;
                    while (!this.A08) {
                        try {
                            this.A05.A5t(this);
                            break;
                        } catch (IOException e8) {
                            if (!this.A08) {
                                long j10 = this.A03.A01;
                                if (j10 != bytesDownloaded) {
                                    bytesDownloaded = j10;
                                    i10 = 0;
                                }
                                i10++;
                                if (i10 <= this.A02) {
                                    Thread.sleep(A00(i10));
                                } else {
                                    throw e8;
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                BQ.A00(th, this);
                return;
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (Exception e10) {
            this.A01 = e10;
        }
        Handler internalHandler = this.A07;
        if (internalHandler != null) {
            internalHandler.obtainMessage(9, this).sendToTarget();
        }
    }
}
