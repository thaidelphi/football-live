package com.facebook.ads.redexgen.X;

import android.database.Cursor;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class RO implements InterfaceC1282Zo {
    public final Cursor A00;

    public final /* synthetic */ boolean A01() {
        return AbstractC1281Zn.A00(this);
    }

    public RO(Cursor cursor) {
        this.A00 = cursor;
    }

    public final C1278Zk A00() {
        return C06178n.A03(this.A00);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A00.close();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1282Zo
    public final int getPosition() {
        return this.A00.getPosition();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1282Zo
    public final boolean moveToPosition(int i10) {
        return this.A00.moveToPosition(i10);
    }
}
