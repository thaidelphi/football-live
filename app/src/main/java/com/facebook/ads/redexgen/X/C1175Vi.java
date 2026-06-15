package com.facebook.ads.redexgen.X;

import android.os.Parcel;
/* renamed from: com.facebook.ads.redexgen.X.Vi  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1175Vi {
    public final int A00;
    public final long A01;
    public final long A02;

    public C1175Vi(int i10, long j10, long j11) {
        this.A00 = i10;
        this.A02 = j10;
        this.A01 = j11;
    }

    public /* synthetic */ C1175Vi(int i10, long j10, long j11, C1174Vh c1174Vh) {
        this(i10, j10, j11);
    }

    public static C1175Vi A00(Parcel parcel) {
        return new C1175Vi(parcel.readInt(), parcel.readLong(), parcel.readLong());
    }

    public final void A01(Parcel parcel) {
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A02);
        parcel.writeLong(this.A01);
    }
}
