package com.google.android.exoplayer2.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.X.AbstractC1672gE;
import com.facebook.ads.redexgen.X.VS;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class MlltFrame extends Id3Frame {
    public static byte[] A05;
    public static String[] A06 = {"Hhl5inxkvQuz7ek8JuLrW24yOH12VNxs", "CHrwR1Svzvdb8Vg1KpjucNQpBYA9NI45", "VwDz5wHo7cpPdQWbvxxukgCGViswxP6", "npaFUko7HEA8HHptKjZiEuvlBgoJWyRW", "R3zrCsZDMbvPt0NJ16On502hT2T", "thaXGCMYpNkQybXtCh2tbuSHjooMz8Bk", "LQmU0COiG4q4363l51MjFeGL1jDFL8DU", "LBlz4ypxMjvoqINQaHUoTnwCLcQJHpic"};
    public static final Parcelable.Creator<MlltFrame> CREATOR;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int[] A03;
    public final int[] A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A06;
            if (strArr[6].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[0] = "4hrLMGcgHLWgzu4WMaPGPLZD96WTkRVE";
            strArr2[5] = "ihrL4dCkvpMNOe7jyk5scgIORFIqL7D0";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 48);
            i13++;
        }
    }

    public static void A01() {
        A05 = new byte[]{-72, -73, -73, -65};
    }

    static {
        A01();
        CREATOR = new VS();
    }

    public MlltFrame(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super(A00(0, 4, 59));
        this.A02 = i10;
        this.A00 = i11;
        this.A01 = i12;
        this.A03 = iArr;
        this.A04 = iArr2;
    }

    public MlltFrame(Parcel parcel) {
        super(A00(0, 4, 59));
        this.A02 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A03 = (int[]) AbstractC1672gE.A0f(parcel.createIntArray());
        this.A04 = (int[]) AbstractC1672gE.A0f(parcel.createIntArray());
    }

    @Override // com.google.android.exoplayer2.extractor.metadata.id3.Id3Frame, android.os.Parcelable
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
        MlltFrame mlltFrame = (MlltFrame) obj;
        if (this.A02 == mlltFrame.A02 && this.A00 == mlltFrame.A00 && this.A01 == mlltFrame.A01 && Arrays.equals(this.A03, mlltFrame.A03) && Arrays.equals(this.A04, mlltFrame.A04)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A02;
        int result2 = this.A01;
        int result3 = Arrays.hashCode(this.A04);
        return (((((((((17 * 31) + result) * 31) + this.A00) * 31) + result2) * 31) + Arrays.hashCode(this.A03)) * 31) + result3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeIntArray(this.A03);
        parcel.writeIntArray(this.A04);
    }
}
