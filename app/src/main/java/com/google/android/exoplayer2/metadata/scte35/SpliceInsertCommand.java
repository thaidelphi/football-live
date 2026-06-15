package com.google.android.exoplayer2.metadata.scte35;

import a5.c0;
import a5.l0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final long f10615a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f10616b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f10617c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f10618d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f10619e;

    /* renamed from: f  reason: collision with root package name */
    public final long f10620f;

    /* renamed from: g  reason: collision with root package name */
    public final long f10621g;

    /* renamed from: h  reason: collision with root package name */
    public final List<b> f10622h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f10623i;

    /* renamed from: j  reason: collision with root package name */
    public final long f10624j;

    /* renamed from: k  reason: collision with root package name */
    public final int f10625k;

    /* renamed from: l  reason: collision with root package name */
    public final int f10626l;

    /* renamed from: m  reason: collision with root package name */
    public final int f10627m;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Parcelable.Creator<SpliceInsertCommand> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public SpliceInsertCommand createFromParcel(Parcel parcel) {
            return new SpliceInsertCommand(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public SpliceInsertCommand[] newArray(int i10) {
            return new SpliceInsertCommand[i10];
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f10628a;

        /* renamed from: b  reason: collision with root package name */
        public final long f10629b;

        /* renamed from: c  reason: collision with root package name */
        public final long f10630c;

        /* synthetic */ b(int i10, long j10, long j11, a aVar) {
            this(i10, j10, j11);
        }

        public static b a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        public void b(Parcel parcel) {
            parcel.writeInt(this.f10628a);
            parcel.writeLong(this.f10629b);
            parcel.writeLong(this.f10630c);
        }

        private b(int i10, long j10, long j11) {
            this.f10628a = i10;
            this.f10629b = j10;
            this.f10630c = j11;
        }
    }

    /* synthetic */ SpliceInsertCommand(Parcel parcel, a aVar) {
        this(parcel);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static SpliceInsertCommand a(c0 c0Var, long j10, l0 l0Var) {
        List list;
        boolean z10;
        boolean z11;
        long j11;
        boolean z12;
        long j12;
        int i10;
        int i11;
        int i12;
        boolean z13;
        boolean z14;
        long j13;
        long B = c0Var.B();
        boolean z15 = (c0Var.z() & 128) != 0;
        List emptyList = Collections.emptyList();
        if (z15) {
            list = emptyList;
            z10 = false;
            z11 = false;
            j11 = -9223372036854775807L;
            z12 = false;
            j12 = -9223372036854775807L;
            i10 = 0;
            i11 = 0;
            i12 = 0;
            z13 = false;
        } else {
            int z16 = c0Var.z();
            boolean z17 = (z16 & 128) != 0;
            boolean z18 = (z16 & 64) != 0;
            boolean z19 = (z16 & 32) != 0;
            boolean z20 = (z16 & 16) != 0;
            long b10 = (!z18 || z20) ? -9223372036854775807L : TimeSignalCommand.b(c0Var, j10);
            if (!z18) {
                int z21 = c0Var.z();
                ArrayList arrayList = new ArrayList(z21);
                for (int i13 = 0; i13 < z21; i13++) {
                    int z22 = c0Var.z();
                    long b11 = !z20 ? TimeSignalCommand.b(c0Var, j10) : -9223372036854775807L;
                    arrayList.add(new b(z22, b11, l0Var.b(b11), null));
                }
                emptyList = arrayList;
            }
            if (z19) {
                long z23 = c0Var.z();
                boolean z24 = (128 & z23) != 0;
                j13 = ((((z23 & 1) << 32) | c0Var.B()) * 1000) / 90;
                z14 = z24;
            } else {
                z14 = false;
                j13 = -9223372036854775807L;
            }
            i10 = c0Var.F();
            z13 = z18;
            i11 = c0Var.z();
            i12 = c0Var.z();
            list = emptyList;
            long j14 = b10;
            z12 = z14;
            j12 = j13;
            z11 = z20;
            z10 = z17;
            j11 = j14;
        }
        return new SpliceInsertCommand(B, z15, z10, z13, z11, j11, l0Var.b(j11), list, z12, j12, i10, i11, i12);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f10615a);
        parcel.writeByte(this.f10616b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f10617c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f10618d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f10619e ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f10620f);
        parcel.writeLong(this.f10621g);
        int size = this.f10622h.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.f10622h.get(i11).b(parcel);
        }
        parcel.writeByte(this.f10623i ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f10624j);
        parcel.writeInt(this.f10625k);
        parcel.writeInt(this.f10626l);
        parcel.writeInt(this.f10627m);
    }

    private SpliceInsertCommand(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List<b> list, boolean z14, long j13, int i10, int i11, int i12) {
        this.f10615a = j10;
        this.f10616b = z10;
        this.f10617c = z11;
        this.f10618d = z12;
        this.f10619e = z13;
        this.f10620f = j11;
        this.f10621g = j12;
        this.f10622h = Collections.unmodifiableList(list);
        this.f10623i = z14;
        this.f10624j = j13;
        this.f10625k = i10;
        this.f10626l = i11;
        this.f10627m = i12;
    }

    private SpliceInsertCommand(Parcel parcel) {
        this.f10615a = parcel.readLong();
        this.f10616b = parcel.readByte() == 1;
        this.f10617c = parcel.readByte() == 1;
        this.f10618d = parcel.readByte() == 1;
        this.f10619e = parcel.readByte() == 1;
        this.f10620f = parcel.readLong();
        this.f10621g = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(b.a(parcel));
        }
        this.f10622h = Collections.unmodifiableList(arrayList);
        this.f10623i = parcel.readByte() == 1;
        this.f10624j = parcel.readLong();
        this.f10625k = parcel.readInt();
        this.f10626l = parcel.readInt();
        this.f10627m = parcel.readInt();
    }
}
