package com.facebook.ads.redexgen.X;

import java.io.ByteArrayInputStream;
/* renamed from: com.facebook.ads.redexgen.X.na  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C2116na implements C1X {
    public ByteArrayInputStream A00;
    public final byte[] A01;

    public C2116na(byte[] bArr) {
        this.A01 = bArr;
    }

    @Override // com.facebook.ads.redexgen.X.C1X
    public final void AFr(int i10) throws C2114nX {
        this.A00 = new ByteArrayInputStream(this.A01);
        this.A00.skip(i10);
    }

    @Override // com.facebook.ads.redexgen.X.C1X
    public final void close() throws C2114nX {
    }

    @Override // com.facebook.ads.redexgen.X.C1X
    public final int length() throws C2114nX {
        return this.A01.length;
    }

    @Override // com.facebook.ads.redexgen.X.C1X
    public final int read(byte[] bArr) throws C2114nX {
        return this.A00.read(bArr, 0, bArr.length);
    }
}
