package com.google.android.exoplayer2.metadata.scte35;

import a5.c0;
import a5.l0;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final long f10645a;

    /* renamed from: b  reason: collision with root package name */
    public final long f10646b;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Parcelable.Creator<TimeSignalCommand> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public TimeSignalCommand createFromParcel(Parcel parcel) {
            return new TimeSignalCommand(parcel.readLong(), parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public TimeSignalCommand[] newArray(int i10) {
            return new TimeSignalCommand[i10];
        }
    }

    /* synthetic */ TimeSignalCommand(long j10, long j11, a aVar) {
        this(j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static TimeSignalCommand a(c0 c0Var, long j10, l0 l0Var) {
        long b10 = b(c0Var, j10);
        return new TimeSignalCommand(b10, l0Var.b(b10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long b(c0 c0Var, long j10) {
        long z10 = c0Var.z();
        if ((128 & z10) != 0) {
            return 8589934591L & ((((z10 & 1) << 32) | c0Var.B()) + j10);
        }
        return -9223372036854775807L;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f10645a);
        parcel.writeLong(this.f10646b);
    }

    private TimeSignalCommand(long j10, long j11) {
        this.f10645a = j10;
        this.f10646b = j11;
    }
}
