package com.google.android.exoplayer2.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.X.AbstractC1672gE;
import com.facebook.ads.redexgen.X.VJ;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class ApicFrame extends Id3Frame {
    public static byte[] A04;
    public static final Parcelable.Creator<ApicFrame> CREATOR;
    public final int A00;
    public final String A01;
    public final String A02;
    public final byte[] A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 3);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{95, 83, 23, 22, 0, 16, 1, 26, 3, 7, 26, 28, 29, 78, 69, 95, 18, 22, 18, 26, 43, 6, 15, 26, 66, 68, 85, 76, 70};
    }

    static {
        A01();
        CREATOR = new VJ();
    }

    public ApicFrame(Parcel parcel) {
        super(A00(25, 4, 6));
        this.A02 = (String) AbstractC1672gE.A0f(parcel.readString());
        this.A01 = parcel.readString();
        this.A00 = parcel.readInt();
        this.A03 = (byte[]) AbstractC1672gE.A0f(parcel.createByteArray());
    }

    public ApicFrame(String str, String str2, int i10, byte[] bArr) {
        super(A00(25, 4, 6));
        this.A02 = str;
        this.A01 = str2;
        this.A00 = i10;
        this.A03 = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApicFrame apicFrame = (ApicFrame) obj;
        if (this.A00 == apicFrame.A00 && AbstractC1672gE.A1E(this.A02, apicFrame.A02) && AbstractC1672gE.A1E(this.A01, apicFrame.A01) && Arrays.equals(this.A03, apicFrame.A03)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A00;
        int result2 = ((17 * 31) + result) * 31;
        int result3 = this.A02 != null ? this.A02.hashCode() : 0;
        return ((((result2 + result3) * 31) + (this.A01 != null ? this.A01.hashCode() : 0)) * 31) + Arrays.hashCode(this.A03);
    }

    @Override // com.google.android.exoplayer2.extractor.metadata.id3.Id3Frame
    public final String toString() {
        return super.A00 + A00(14, 11, 124) + this.A02 + A00(0, 14, 112) + this.A01;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeByteArray(this.A03);
    }
}
