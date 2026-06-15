package com.google.android.exoplayer2;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.X.AbstractC1672gE;
import com.facebook.ads.redexgen.X.AbstractC2178oq;
import com.facebook.ads.redexgen.X.C1044Pw;
import com.facebook.ads.redexgen.X.ZM;
import java.util.Arrays;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class Metadata implements Parcelable {
    public static byte[] A02;
    public static String[] A03 = {"kxpCHiuqwb319ak", "hgYNR9xwmJzTrUmvWP", "UjmNBGqzXVqaRhPhc8nQaNa2XIkQwrwf", "xuyEXqw6", "W6L28k2zs6J7xz43Q8FyavLwnrCoVUxT", "3PD7MaxC1L2qejFeayFzDYwxsQrmYkdz", "8KOMv12NqSZVxDUxecZ7L61I2P", "NeqdYL3o"};
    public static final Parcelable.Creator<Metadata> CREATOR;
    public final long A00;
    public final Entry[] A01;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
    public interface Entry extends Parcelable {
        byte[] A9Q();

        ZM A9R();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 11);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{114, 102, -74, -72, -85, -71, -85, -76, -70, -89, -70, -81, -75, -76, -102, -81, -77, -85, -101, -71, -125, -46, -37, -31, -33, -42, -46, -32, -86};
    }

    static {
        A01();
        CREATOR = new C1044Pw();
    }

    public Metadata(long j10, Entry... entryArr) {
        this.A00 = j10;
        this.A01 = entryArr;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x000f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Metadata(android.os.Parcel r4) {
        /*
            r3 = this;
            r3.<init>()
            int r0 = r4.readInt()
            com.google.android.exoplayer2.Metadata$Entry[] r0 = new com.google.android.exoplayer2.Metadata.Entry[r0]
            r3.A01 = r0
            r2 = 0
        Lc:
            com.google.android.exoplayer2.Metadata$Entry[] r0 = r3.A01
            int r0 = r0.length
            if (r2 >= r0) goto L24
            com.google.android.exoplayer2.Metadata$Entry[] r1 = r3.A01
            java.lang.Class<com.google.android.exoplayer2.Metadata$Entry> r0 = com.google.android.exoplayer2.Metadata.Entry.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r4.readParcelable(r0)
            com.google.android.exoplayer2.Metadata$Entry r0 = (com.google.android.exoplayer2.Metadata.Entry) r0
            r1[r2] = r0
            int r2 = r2 + 1
            goto Lc
        L24:
            long r0 = r4.readLong()
            r3.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.Metadata.<init>(android.os.Parcel):void");
    }

    public Metadata(List<? extends Entry> entries) {
        this((Entry[]) entries.toArray(new Entry[0]));
    }

    public Metadata(Entry... entryArr) {
        this(-9223372036854775807L, entryArr);
    }

    public final int A02() {
        return this.A01.length;
    }

    public final Entry A03(int i10) {
        return this.A01[i10];
    }

    public final Metadata A04(Metadata metadata) {
        if (metadata == null) {
            return this;
        }
        Entry[] entryArr = metadata.A01;
        if (A03[5].charAt(29) != 'k') {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[7] = "C8Evhzao";
        strArr[3] = "QbaOJa3F";
        return A05(entryArr);
    }

    public final Metadata A05(Entry... entryArr) {
        if (entryArr.length == 0) {
            return this;
        }
        return new Metadata(this.A00, (Entry[]) AbstractC1672gE.A1K(this.A01, entryArr));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Metadata metadata = (Metadata) obj;
        return Arrays.equals(this.A01, metadata.A01) && this.A00 == metadata.A00;
    }

    public final int hashCode() {
        int result = Arrays.hashCode(this.A01);
        int i10 = result * 31;
        int result2 = AbstractC2178oq.A00(this.A00);
        return i10 + result2;
    }

    public final String toString() {
        return A00(21, 8, 98) + Arrays.toString(this.A01) + (this.A00 == -9223372036854775807L ? A00(0, 0, 99) : A00(0, 21, 59) + this.A00);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.A01.length);
        for (Entry entry : this.A01) {
            parcel.writeParcelable(entry, 0);
        }
        parcel.writeLong(this.A00);
        if (A03[5].charAt(29) != 'k') {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[7] = "nLRRremv";
        strArr[3] = "2IGzY6dk";
    }
}
