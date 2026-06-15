package com.google.android.exoplayer2.extractor.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.X.AbstractC1045Px;
import com.facebook.ads.redexgen.X.AbstractC1672gE;
import com.facebook.ads.redexgen.X.VG;
import com.facebook.ads.redexgen.X.ZM;
import com.google.android.exoplayer2.Metadata;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class IcyHeaders implements Metadata.Entry {
    public static byte[] A06;
    public static String[] A07 = {"1mb6d1pcLi9sX9VOCu5asYX0FGnrn69C", "2c0Rq", "8fqwAELFi2dOj4NLQNvxJR56vUs7HwWZ", "seOcbfBUJBo8QJ4DWfLHTbaLR66jhl9M", "IhweZ5KoCZcu9XgZkjaq2JoyvTkXLa1O", "nSwYG5XkskyovneIOkWO2Zhs3t5sqyKD", "tEWMB", "J2Tqu0sm63v09lIwCgFDkGBkhMnvd1WV"};
    public static final Parcelable.Creator<IcyHeaders> CREATOR;
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 28);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{116, 126, 114, -76, -69, -58, -60, -77, -58, -73, -113, -115, -105, -117, -46, -48, -39, -35, -48, -88, -115, -73, -85, -8, -16, -1, -20, -17, -20, -1, -20, -44, -7, -1, -16, -3, 1, -20, -9, -56, 124, -106, -84, 123, -104, -108, -105, -104, -91, -90, 109, 83, -95, -108, -96, -104, 112, 85};
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
        CREATOR = new VG();
    }

    public IcyHeaders(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A05 = AbstractC1672gE.A1C(parcel);
        this.A01 = parcel.readInt();
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
        IcyHeaders icyHeaders = (IcyHeaders) obj;
        if (this.A00 == icyHeaders.A00 && AbstractC1672gE.A1E(this.A02, icyHeaders.A02) && AbstractC1672gE.A1E(this.A03, icyHeaders.A03) && AbstractC1672gE.A1E(this.A04, icyHeaders.A04) && this.A05 == icyHeaders.A05 && this.A01 == icyHeaders.A01) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A00;
        int result2 = ((17 * 31) + result) * 31;
        int result3 = this.A02 != null ? this.A02.hashCode() : 0;
        int result4 = (result2 + result3) * 31;
        int result5 = this.A03 != null ? this.A03.hashCode() : 0;
        int hashCode = (((result4 + result5) * 31) + (this.A04 != null ? this.A04.hashCode() : 0)) * 31;
        if (A07[0].charAt(18) != 'M') {
            A07[3] = "xz6mhNQrd09Dw7sN0OTyZa6IUuHzjUkZ";
            int result6 = this.A05 ? 1 : 0;
            return ((hashCode + result6) * 31) + this.A01;
        }
        throw new RuntimeException();
    }

    public final String toString() {
        return A00(40, 18, 23) + this.A03 + A00(11, 10, 79) + this.A02 + A00(0, 11, 54) + this.A00 + A00(21, 19, 111) + this.A01;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        AbstractC1672gE.A0w(parcel, this.A05);
        parcel.writeInt(this.A01);
    }
}
