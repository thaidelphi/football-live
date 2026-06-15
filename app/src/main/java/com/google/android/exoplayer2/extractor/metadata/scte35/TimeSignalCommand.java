package com.google.android.exoplayer2.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.X.C1180Vn;
import com.facebook.ads.redexgen.X.C1648fq;
import com.facebook.ads.redexgen.X.C1662g4;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new C1180Vn();
    public final long A00;
    public final long A01;

    public TimeSignalCommand(long j10, long j11) {
        this.A01 = j10;
        this.A00 = j11;
    }

    public /* synthetic */ TimeSignalCommand(long j10, long j11, C1180Vn c1180Vn) {
        this(j10, j11);
    }

    public static long A00(C1648fq c1648fq, long j10) {
        long A0I = c1648fq.A0I();
        if ((128 & A0I) == 0) {
            return -9223372036854775807L;
        }
        long ptsTime = 1 & A0I;
        long firstByte = c1648fq.A0Q();
        return (((ptsTime << 32) | firstByte) + j10) & 8589934591L;
    }

    public static TimeSignalCommand A01(C1648fq c1648fq, long j10, C1662g4 c1662g4) {
        long A00 = A00(c1648fq, j10);
        return new TimeSignalCommand(A00, c1662g4.A06(A00));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
    }
}
