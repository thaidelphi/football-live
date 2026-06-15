package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.51  reason: invalid class name */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class AnonymousClass51 implements Q7 {
    public static String[] A04 = {"8O6NxNXFBs71YOtLDSHVih5By1ynlGW9", "5kcYm1deIqpjb7XMaQ0NGj", "X12gxJqLzdDCLKt5fAN4D", "PXwPZopkVepbrNP264xVpR4njQkcGHYI", "0829f", "IeMmL", "VcaMLrlRPDtdwBv7yKnzyq0wzDs3iXCi", "oTNZToNiXGDP6UHHexhSb"};
    public long A00;
    public Uri A01 = Uri.EMPTY;
    public Map<String, List<String>> A02 = Collections.emptyMap();
    public final Q7 A03;

    public AnonymousClass51(Q7 q72) {
        this.A03 = (Q7) AbstractC1589es.A01(q72);
    }

    public final long A00() {
        return this.A00;
    }

    public final Uri A01() {
        return this.A01;
    }

    public final Map<String, List<String>> A02() {
        return this.A02;
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
    public final long AFq(C1519dj c1519dj) throws IOException {
        this.A01 = c1519dj.A06;
        this.A02 = Collections.emptyMap();
        long AFq = this.A03.AFq(c1519dj);
        this.A01 = (Uri) AbstractC1589es.A01(A9F());
        this.A02 = A8j();
        return AFq;
    }

    @Override // com.facebook.ads.redexgen.X.Q7
    public final void close() throws IOException {
        this.A03.close();
    }

    @Override // com.facebook.ads.redexgen.X.O9
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int read = this.A03.read(bArr, i10, i11);
        if (read != -1) {
            long j10 = this.A00;
            long j11 = read;
            String[] strArr = A04;
            String str = strArr[7];
            String str2 = strArr[2];
            int length = str.length();
            int bytesRead = str2.length();
            if (length != bytesRead) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[0] = "YAnyeWWgx32ib983O31NSy2gRb88nkVo";
            strArr2[3] = "eSbzoMjSMfUJexhPG1kEL6L2dyY8Aid8";
            this.A00 = j10 + j11;
        }
        return read;
    }
}
