package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.Vm */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1179Vm {
    public static String[] A0B = {"vqbiLoEhKys4aieq", "vX97iLQeaWcX1", "ItjShmGM6oyUC4uSf0mbO", "L3I4aeE5PLS", "FhMurB0WqmmBDxTj", "X", "VuFt7BNgawbHotzEa1ukcM", "QXR6byGu9hJJuZOC5o0Nv9NtX0Y2AOHa"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final List<C1178Vl> A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C1179Vm A02(C1648fq c1648fq) {
        long A0Q = c1648fq.A0Q();
        boolean z10 = (c1648fq.A0I() & 128) != 0;
        boolean z11 = false;
        boolean z12 = false;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z13 = false;
        long j10 = -9223372036854775807L;
        if (!z10) {
            int A0I = c1648fq.A0I();
            z11 = (A0I & 128) != 0;
            z12 = (A0I & 64) != 0;
            boolean z14 = (A0I & 32) != 0;
            r14 = z12 ? c1648fq.A0Q() : -9223372036854775807L;
            if (!z12) {
                int A0I2 = c1648fq.A0I();
                arrayList = new ArrayList(A0I2);
                for (int i13 = 0; i13 < A0I2; i13++) {
                    arrayList.add(new C1178Vl(c1648fq.A0I(), c1648fq.A0Q(), null));
                }
            }
            if (z14) {
                long A0I3 = c1648fq.A0I();
                z13 = (128 & A0I3) != 0;
                long A0Q2 = ((1 & A0I3) << 32) | c1648fq.A0Q();
                if (A0B[7].charAt(30) == 'E') {
                    throw new RuntimeException();
                }
                A0B[3] = "tdltZI3J";
                j10 = (1000 * A0Q2) / 90;
            }
            i10 = c1648fq.A0M();
            i11 = c1648fq.A0I();
            i12 = c1648fq.A0I();
        }
        return new C1179Vm(A0Q, z10, z11, z12, arrayList, r14, z13, j10, i10, i11, i12);
    }

    public C1179Vm(long j10, boolean z10, boolean z11, boolean z12, List<C1178Vl> list, long j11, boolean z13, long j12, int i10, int i11, int i12) {
        this.A04 = j10;
        this.A0A = z10;
        this.A08 = z11;
        this.A09 = z12;
        this.A06 = Collections.unmodifiableList(list);
        this.A05 = j11;
        this.A07 = z13;
        this.A03 = j12;
        this.A02 = i10;
        this.A00 = i11;
        this.A01 = i12;
    }

    public C1179Vm(Parcel parcel) {
        C1178Vl A00;
        this.A04 = parcel.readLong();
        this.A0A = parcel.readByte() == 1;
        this.A08 = parcel.readByte() == 1;
        this.A09 = parcel.readByte() == 1;
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            A00 = C1178Vl.A00(parcel);
            arrayList.add(A00);
        }
        this.A06 = Collections.unmodifiableList(arrayList);
        this.A05 = parcel.readLong();
        int componentSpliceListLength = parcel.readByte();
        this.A07 = componentSpliceListLength == 1;
        this.A03 = parcel.readLong();
        int componentSpliceListLength2 = parcel.readInt();
        this.A02 = componentSpliceListLength2;
        int componentSpliceListLength3 = parcel.readInt();
        this.A00 = componentSpliceListLength3;
        int componentSpliceListLength4 = parcel.readInt();
        this.A01 = componentSpliceListLength4;
    }

    public static C1179Vm A00(Parcel parcel) {
        return new C1179Vm(parcel);
    }

    public static /* synthetic */ C1179Vm A01(Parcel parcel) {
        return A00(parcel);
    }

    public static /* synthetic */ C1179Vm A03(C1648fq c1648fq) {
        return A02(c1648fq);
    }

    public void A04(Parcel parcel) {
        parcel.writeLong(this.A04);
        parcel.writeByte(this.A0A ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A08 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A09 ? (byte) 1 : (byte) 0);
        int size = this.A06.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            this.A06.get(i10).A02(parcel);
        }
        parcel.writeLong(this.A05);
        parcel.writeByte(this.A07 ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A03);
        int componentSpliceListSize = this.A02;
        parcel.writeInt(componentSpliceListSize);
        int componentSpliceListSize2 = this.A00;
        parcel.writeInt(componentSpliceListSize2);
        int componentSpliceListSize3 = this.A01;
        parcel.writeInt(componentSpliceListSize3);
    }

    public static /* synthetic */ void A05(C1179Vm c1179Vm, Parcel parcel) {
        c1179Vm.A04(parcel);
    }
}
