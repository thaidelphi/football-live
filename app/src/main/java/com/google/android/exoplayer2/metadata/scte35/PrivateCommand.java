package com.google.android.exoplayer2.metadata.scte35;

import a5.c0;
import a5.p0;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator<PrivateCommand> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final long f10612a;

    /* renamed from: b  reason: collision with root package name */
    public final long f10613b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f10614c;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Parcelable.Creator<PrivateCommand> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public PrivateCommand createFromParcel(Parcel parcel) {
            return new PrivateCommand(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public PrivateCommand[] newArray(int i10) {
            return new PrivateCommand[i10];
        }
    }

    /* synthetic */ PrivateCommand(Parcel parcel, a aVar) {
        this(parcel);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PrivateCommand a(c0 c0Var, int i10, long j10) {
        long B = c0Var.B();
        int i11 = i10 - 4;
        byte[] bArr = new byte[i11];
        c0Var.j(bArr, 0, i11);
        return new PrivateCommand(B, bArr, j10);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f10612a);
        parcel.writeLong(this.f10613b);
        parcel.writeByteArray(this.f10614c);
    }

    private PrivateCommand(long j10, byte[] bArr, long j11) {
        this.f10612a = j11;
        this.f10613b = j10;
        this.f10614c = bArr;
    }

    private PrivateCommand(Parcel parcel) {
        this.f10612a = parcel.readLong();
        this.f10613b = parcel.readLong();
        this.f10614c = (byte[]) p0.j(parcel.createByteArray());
    }
}
