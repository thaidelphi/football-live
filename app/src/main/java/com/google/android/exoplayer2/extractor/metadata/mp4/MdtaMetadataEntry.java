package com.google.android.exoplayer2.extractor.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.X.AbstractC1045Px;
import com.facebook.ads.redexgen.X.AbstractC1672gE;
import com.facebook.ads.redexgen.X.VX;
import com.facebook.ads.redexgen.X.ZM;
import com.google.android.exoplayer2.Metadata;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class MdtaMetadataEntry implements Metadata.Entry {
    public static byte[] A04;
    public static final Parcelable.Creator<MdtaMetadataEntry> CREATOR;
    public final int A00;
    public final int A01;
    public final String A02;
    public final byte[] A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 101);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{8, 1, 17, 4, 95, 69, 14, 0, 28, 88};
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
        CREATOR = new VX();
    }

    public MdtaMetadataEntry(Parcel parcel) {
        this.A02 = (String) AbstractC1672gE.A0f(parcel.readString());
        this.A03 = (byte[]) AbstractC1672gE.A0f(parcel.createByteArray());
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
    }

    public /* synthetic */ MdtaMetadataEntry(Parcel parcel, VX vx) {
        this(parcel);
    }

    public MdtaMetadataEntry(String str, byte[] bArr, int i10, int i11) {
        this.A02 = str;
        this.A03 = bArr;
        this.A00 = i10;
        this.A01 = i11;
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
        MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) obj;
        if (this.A02.equals(mdtaMetadataEntry.A02) && Arrays.equals(this.A03, mdtaMetadataEntry.A03) && this.A00 == mdtaMetadataEntry.A00 && this.A01 == mdtaMetadataEntry.A01) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A02.hashCode();
        int result2 = this.A00;
        return (((((((17 * 31) + result) * 31) + Arrays.hashCode(this.A03)) * 31) + result2) * 31) + this.A01;
    }

    public final String toString() {
        return A00(0, 10, 0) + this.A02;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.A02);
        parcel.writeByteArray(this.A03);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }
}
