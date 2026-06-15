package com.google.android.exoplayer2.extractor.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.X.AbstractC0986No;
import com.facebook.ads.redexgen.X.AbstractC1045Px;
import com.facebook.ads.redexgen.X.C1170Vd;
import com.facebook.ads.redexgen.X.ZM;
import com.google.android.exoplayer2.Metadata;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class SmtaMetadataEntry implements Metadata.Entry {
    public static byte[] A02;
    public static String[] A03 = {"zkyF7ZmBwFQanEK3wLxW9Bh6Q4jR7cOR", "aTHZekqS4wOz9YB7J96SM4HaLwSmFKqM", "LYJAmr9piPD84OPTHuPSIwi9UNriASSV", "nTZw7", "6QfnbcYdg7uwfzqdJGQC7zkwzwqu7Ah1", "Mbjf3J3NLjeOFyb2EMzXMTBDt", "KNyzK7P", "PQgDZUyaluxGHmn558F2"};
    public static final Parcelable.Creator<SmtaMetadataEntry> CREATOR;
    public final float A00;
    public final int A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A03;
            if (strArr[3].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A03[7] = "Xsorr5QuYwq9nnIUKdgq";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 112);
            i13++;
        }
    }

    public static void A01() {
        A02 = new byte[]{-79, -91, -8, -5, -24, -39, -22, -14, -11, -12, -9, -26, -15, -47, -26, -2, -22, -9, -56, -12, -6, -13, -7, -62, 16, 10, 17, -2, -41, -67, 0, -2, 13, 17, 18, 15, 2, -29, 15, -2, 10, 2, -17, -2, 17, 2, -38};
    }

    @Override // com.google.android.exoplayer2.Metadata.Entry
    public final /* synthetic */ byte[] A9Q() {
        return AbstractC1045Px.A01(this);
    }

    @Override // com.google.android.exoplayer2.Metadata.Entry
    public final /* synthetic */ ZM A9R() {
        return AbstractC1045Px.A00(this);
    }

    static {
        A01();
        CREATOR = new C1170Vd();
    }

    public SmtaMetadataEntry(float f10, int i10) {
        this.A00 = f10;
        this.A01 = i10;
    }

    public SmtaMetadataEntry(Parcel parcel) {
        this.A00 = parcel.readFloat();
        this.A01 = parcel.readInt();
    }

    public /* synthetic */ SmtaMetadataEntry(Parcel parcel, C1170Vd c1170Vd) {
        this(parcel);
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
        SmtaMetadataEntry smtaMetadataEntry = (SmtaMetadataEntry) obj;
        return this.A00 == smtaMetadataEntry.A00 && this.A01 == smtaMetadataEntry.A01;
    }

    public final int hashCode() {
        int result = AbstractC0986No.A00(this.A00);
        return (((17 * 31) + result) * 31) + this.A01;
    }

    public final String toString() {
        return A00(24, 23, 45) + this.A00 + A00(0, 24, 21) + this.A01;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.A00);
        parcel.writeInt(this.A01);
    }
}
