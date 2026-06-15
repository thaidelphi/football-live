package com.google.android.exoplayer2.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.X.AbstractC1672gE;
import com.facebook.ads.redexgen.X.C1173Vg;
import com.facebook.ads.redexgen.X.C1648fq;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator<PrivateCommand> CREATOR = new C1173Vg();
    public final long A00;
    public final long A01;
    public final byte[] A02;

    public PrivateCommand(long j10, byte[] bArr, long j11) {
        this.A01 = j11;
        this.A00 = j10;
        this.A02 = bArr;
    }

    public PrivateCommand(Parcel parcel) {
        this.A01 = parcel.readLong();
        this.A00 = parcel.readLong();
        this.A02 = (byte[]) AbstractC1672gE.A0f(parcel.createByteArray());
    }

    public /* synthetic */ PrivateCommand(Parcel parcel, C1173Vg c1173Vg) {
        this(parcel);
    }

    public static PrivateCommand A00(C1648fq c1648fq, int i10, long j10) {
        long A0Q = c1648fq.A0Q();
        byte[] bArr = new byte[i10 - 4];
        c1648fq.A0k(bArr, 0, bArr.length);
        return new PrivateCommand(A0Q, bArr, j10);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
        parcel.writeByteArray(this.A02);
    }
}
