package com.google.android.exoplayer2.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.X.C1174Vh;
import com.facebook.ads.redexgen.X.C1175Vi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public static String[] A0D = {"1gMfdHoLkKNhoCqhKe6qLfiJGSezJg8B", "zm2SBnMS5XNjZWSMsupBhea4HrWKdVyh", "faixS", "WVnIPxdl1TSIJGfqykPYzP6CfEVxBQdv", "xhcz4JkMNye8fJUllYlgDZiPzZjPPz0A", "Ic16CYMI8HSWlFRdvoHz5Qnkj4K9zu22", "", "tI1rP6AVkVHBDDKgUCtZIqVKSC49N82u"};
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new C1174Vh();
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final List<C1175Vi> A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public SpliceInsertCommand(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List<C1175Vi> list, boolean z14, long j13, int i10, int i11, int i12) {
        this.A06 = j10;
        this.A0B = z10;
        this.A09 = z11;
        this.A0A = z12;
        this.A0C = z13;
        this.A05 = j11;
        this.A04 = j12;
        this.A07 = Collections.unmodifiableList(list);
        this.A08 = z14;
        this.A03 = j13;
        this.A02 = i10;
        this.A00 = i11;
        this.A01 = i12;
    }

    public SpliceInsertCommand(Parcel parcel) {
        this.A06 = parcel.readLong();
        this.A0B = parcel.readByte() == 1;
        this.A09 = parcel.readByte() == 1;
        this.A0A = parcel.readByte() == 1;
        this.A0C = parcel.readByte() == 1;
        this.A05 = parcel.readLong();
        this.A04 = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(C1175Vi.A00(parcel));
        }
        this.A07 = Collections.unmodifiableList(arrayList);
        int componentSpliceListSize = parcel.readByte();
        this.A08 = componentSpliceListSize == 1;
        this.A03 = parcel.readLong();
        int componentSpliceListSize2 = parcel.readInt();
        this.A02 = componentSpliceListSize2;
        int componentSpliceListSize3 = parcel.readInt();
        this.A00 = componentSpliceListSize3;
        int componentSpliceListSize4 = parcel.readInt();
        this.A01 = componentSpliceListSize4;
    }

    public /* synthetic */ SpliceInsertCommand(Parcel parcel, C1174Vh c1174Vh) {
        this(parcel);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
        if (r3 != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
        r19 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ca, code lost:
        if (r3 != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cd, code lost:
        r19 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.exoplayer2.extractor.metadata.scte35.SpliceInsertCommand A00(com.facebook.ads.redexgen.X.C1648fq r31, long r32, com.facebook.ads.redexgen.X.C1662g4 r34) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.metadata.scte35.SpliceInsertCommand.A00(com.facebook.ads.redexgen.X.fq, long, com.facebook.ads.redexgen.X.g4):com.google.android.exoplayer2.extractor.metadata.scte35.SpliceInsertCommand");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.A06);
        parcel.writeByte(this.A0B ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A09 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0A ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0C ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A05);
        parcel.writeLong(this.A04);
        int size = this.A07.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.A07.get(i11).A01(parcel);
            String[] strArr = A0D;
            String str = strArr[0];
            String str2 = strArr[3];
            int i12 = str.charAt(26);
            int componentSpliceListSize = str2.charAt(26);
            if (i12 == componentSpliceListSize) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0D;
            strArr2[0] = "acdZtyKQWwFOkb0LeuSSK6oVpigTtFwS";
            strArr2[3] = "oW2YHXdWM7oaa9PVsYpqNd9hNaJbSWC6";
        }
        parcel.writeByte(this.A08 ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A03);
        int componentSpliceListSize2 = this.A02;
        parcel.writeInt(componentSpliceListSize2);
        if (A0D[4].charAt(28) != 'P') {
            throw new RuntimeException();
        }
        A0D[7] = "buqtg1B9heztt2PcICLF7S0iD4uzSUde";
        int componentSpliceListSize3 = this.A00;
        parcel.writeInt(componentSpliceListSize3);
        int componentSpliceListSize4 = this.A01;
        parcel.writeInt(componentSpliceListSize4);
    }
}
