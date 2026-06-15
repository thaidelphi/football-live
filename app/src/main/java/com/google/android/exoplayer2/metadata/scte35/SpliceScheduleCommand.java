package com.google.android.exoplayer2.metadata.scte35;

import a5.c0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final List<c> f10631a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Parcelable.Creator<SpliceScheduleCommand> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public SpliceScheduleCommand createFromParcel(Parcel parcel) {
            return new SpliceScheduleCommand(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public SpliceScheduleCommand[] newArray(int i10) {
            return new SpliceScheduleCommand[i10];
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f10632a;

        /* renamed from: b  reason: collision with root package name */
        public final long f10633b;

        /* synthetic */ b(int i10, long j10, a aVar) {
            this(i10, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b c(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(Parcel parcel) {
            parcel.writeInt(this.f10632a);
            parcel.writeLong(this.f10633b);
        }

        private b(int i10, long j10) {
            this.f10632a = i10;
            this.f10633b = j10;
        }
    }

    /* synthetic */ SpliceScheduleCommand(Parcel parcel, a aVar) {
        this(parcel);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static SpliceScheduleCommand a(c0 c0Var) {
        int z10 = c0Var.z();
        ArrayList arrayList = new ArrayList(z10);
        for (int i10 = 0; i10 < z10; i10++) {
            arrayList.add(c.e(c0Var));
        }
        return new SpliceScheduleCommand(arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int size = this.f10631a.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.f10631a.get(i11).f(parcel);
        }
    }

    private SpliceScheduleCommand(List<c> list) {
        this.f10631a = Collections.unmodifiableList(list);
    }

    private SpliceScheduleCommand(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(c.d(parcel));
        }
        this.f10631a = Collections.unmodifiableList(arrayList);
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final long f10634a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f10635b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f10636c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f10637d;

        /* renamed from: e  reason: collision with root package name */
        public final long f10638e;

        /* renamed from: f  reason: collision with root package name */
        public final List<b> f10639f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f10640g;

        /* renamed from: h  reason: collision with root package name */
        public final long f10641h;

        /* renamed from: i  reason: collision with root package name */
        public final int f10642i;

        /* renamed from: j  reason: collision with root package name */
        public final int f10643j;

        /* renamed from: k  reason: collision with root package name */
        public final int f10644k;

        private c(long j10, boolean z10, boolean z11, boolean z12, List<b> list, long j11, boolean z13, long j12, int i10, int i11, int i12) {
            this.f10634a = j10;
            this.f10635b = z10;
            this.f10636c = z11;
            this.f10637d = z12;
            this.f10639f = Collections.unmodifiableList(list);
            this.f10638e = j11;
            this.f10640g = z13;
            this.f10641h = j12;
            this.f10642i = i10;
            this.f10643j = i11;
            this.f10644k = i12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c d(Parcel parcel) {
            return new c(parcel);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c e(c0 c0Var) {
            ArrayList arrayList;
            boolean z10;
            long j10;
            boolean z11;
            long j11;
            int i10;
            int i11;
            int i12;
            boolean z12;
            boolean z13;
            long j12;
            long B = c0Var.B();
            boolean z14 = (c0Var.z() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (z14) {
                arrayList = arrayList2;
                z10 = false;
                j10 = -9223372036854775807L;
                z11 = false;
                j11 = -9223372036854775807L;
                i10 = 0;
                i11 = 0;
                i12 = 0;
                z12 = false;
            } else {
                int z15 = c0Var.z();
                boolean z16 = (z15 & 128) != 0;
                boolean z17 = (z15 & 64) != 0;
                boolean z18 = (z15 & 32) != 0;
                long B2 = z17 ? c0Var.B() : -9223372036854775807L;
                if (!z17) {
                    int z19 = c0Var.z();
                    ArrayList arrayList3 = new ArrayList(z19);
                    for (int i13 = 0; i13 < z19; i13++) {
                        arrayList3.add(new b(c0Var.z(), c0Var.B(), null));
                    }
                    arrayList2 = arrayList3;
                }
                if (z18) {
                    long z20 = c0Var.z();
                    boolean z21 = (128 & z20) != 0;
                    j12 = ((((z20 & 1) << 32) | c0Var.B()) * 1000) / 90;
                    z13 = z21;
                } else {
                    z13 = false;
                    j12 = -9223372036854775807L;
                }
                int F = c0Var.F();
                int z22 = c0Var.z();
                z12 = z17;
                i12 = c0Var.z();
                j11 = j12;
                arrayList = arrayList2;
                long j13 = B2;
                i10 = F;
                i11 = z22;
                j10 = j13;
                boolean z23 = z16;
                z11 = z13;
                z10 = z23;
            }
            return new c(B, z14, z10, z12, arrayList, j10, z11, j11, i10, i11, i12);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(Parcel parcel) {
            parcel.writeLong(this.f10634a);
            parcel.writeByte(this.f10635b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f10636c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f10637d ? (byte) 1 : (byte) 0);
            int size = this.f10639f.size();
            parcel.writeInt(size);
            for (int i10 = 0; i10 < size; i10++) {
                this.f10639f.get(i10).d(parcel);
            }
            parcel.writeLong(this.f10638e);
            parcel.writeByte(this.f10640g ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f10641h);
            parcel.writeInt(this.f10642i);
            parcel.writeInt(this.f10643j);
            parcel.writeInt(this.f10644k);
        }

        private c(Parcel parcel) {
            this.f10634a = parcel.readLong();
            this.f10635b = parcel.readByte() == 1;
            this.f10636c = parcel.readByte() == 1;
            this.f10637d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                arrayList.add(b.c(parcel));
            }
            this.f10639f = Collections.unmodifiableList(arrayList);
            this.f10638e = parcel.readLong();
            this.f10640g = parcel.readByte() == 1;
            this.f10641h = parcel.readLong();
            this.f10642i = parcel.readInt();
            this.f10643j = parcel.readInt();
            this.f10644k = parcel.readInt();
        }
    }
}
