package com.facebook.ads.redexgen.X;

import com.google.android.exoplayer2.offline.DownloadRequest;
/* renamed from: com.facebook.ads.redexgen.X.Zk  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1278Zk {
    public final C1300a6 A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final DownloadRequest A07;

    public C1278Zk(DownloadRequest downloadRequest, int i10, long j10, long j11, long j12, int i11, int i12) {
        this(downloadRequest, i10, j10, j11, j12, i11, i12, new C1300a6());
    }

    public C1278Zk(DownloadRequest downloadRequest, int i10, long j10, long j11, long j12, int i11, int i12, C1300a6 c1300a6) {
        AbstractC1589es.A01(c1300a6);
        boolean z10 = true;
        AbstractC1589es.A07((i12 == 0) == (i10 != 4));
        if (i11 != 0) {
            AbstractC1589es.A07((i10 == 2 || i10 == 0) ? false : false);
        }
        this.A07 = downloadRequest;
        this.A02 = i10;
        this.A05 = j10;
        this.A06 = j11;
        this.A04 = j12;
        this.A03 = i11;
        this.A01 = i12;
        this.A00 = c1300a6;
    }

    public final float A00() {
        return this.A00.A00;
    }

    public final long A01() {
        return this.A00.A01;
    }

    public final boolean A02() {
        return this.A02 == 3 || this.A02 == 4;
    }
}
