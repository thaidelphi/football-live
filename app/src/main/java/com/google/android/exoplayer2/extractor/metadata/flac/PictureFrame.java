package com.google.android.exoplayer2.extractor.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.X.AbstractC1045Px;
import com.facebook.ads.redexgen.X.AbstractC1672gE;
import com.facebook.ads.redexgen.X.AbstractC1758hd;
import com.facebook.ads.redexgen.X.C1648fq;
import com.facebook.ads.redexgen.X.VD;
import com.facebook.ads.redexgen.X.ZM;
import com.google.android.exoplayer2.Metadata;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class PictureFrame implements Metadata.Entry {
    public static byte[] A08;
    public static final Parcelable.Creator<PictureFrame> CREATOR;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final String A05;
    public final String A06;
    public final byte[] A07;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static PictureFrame A00(C1648fq c1648fq) {
        int A0C = c1648fq.A0C();
        String A0X = c1648fq.A0X(c1648fq.A0C(), AbstractC1758hd.A02);
        String A0W = c1648fq.A0W(c1648fq.A0C());
        int A0C2 = c1648fq.A0C();
        int A0C3 = c1648fq.A0C();
        int A0C4 = c1648fq.A0C();
        int A0C5 = c1648fq.A0C();
        int A0C6 = c1648fq.A0C();
        byte[] bArr = new byte[A0C6];
        c1648fq.A0k(bArr, 0, A0C6);
        return new PictureFrame(A0C, A0X, A0W, A0C2, A0C3, A0C4, A0C5, bArr);
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 59);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A08 = new byte[]{50, 62, 122, 123, 109, 125, 108, 119, 110, 106, 119, 113, 112, 35, 122, 67, 73, 94, 95, 88, 79, 16, 10, 71, 67, 71, 79, 126, 83, 90, 79, 23};
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
        A02();
        CREATOR = new VD();
    }

    public PictureFrame(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.A03 = i10;
        this.A06 = str;
        this.A05 = str2;
        this.A04 = i11;
        this.A02 = i12;
        this.A01 = i13;
        this.A00 = i14;
        this.A07 = bArr;
    }

    public PictureFrame(Parcel parcel) {
        this.A03 = parcel.readInt();
        this.A06 = (String) AbstractC1672gE.A0f(parcel.readString());
        this.A05 = (String) AbstractC1672gE.A0f(parcel.readString());
        this.A04 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A07 = (byte[]) AbstractC1672gE.A0f(parcel.createByteArray());
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
        PictureFrame pictureFrame = (PictureFrame) obj;
        if (this.A03 == pictureFrame.A03 && this.A06.equals(pictureFrame.A06) && this.A05.equals(pictureFrame.A05) && this.A04 == pictureFrame.A04 && this.A02 == pictureFrame.A02 && this.A01 == pictureFrame.A01 && this.A00 == pictureFrame.A00 && Arrays.equals(this.A07, pictureFrame.A07)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A03;
        int result2 = this.A05.hashCode();
        int result3 = this.A02;
        int result4 = this.A00;
        return (((((((((((((((17 * 31) + result) * 31) + this.A06.hashCode()) * 31) + result2) * 31) + this.A04) * 31) + result3) * 31) + this.A01) * 31) + result4) * 31) + Arrays.hashCode(this.A07);
    }

    public final String toString() {
        return A01(14, 18, 17) + this.A06 + A01(0, 14, 37) + this.A05;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.A03);
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeByteArray(this.A07);
    }
}
