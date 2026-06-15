package com.google.android.exoplayer2.extractor.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.X.AbstractC1045Px;
import com.facebook.ads.redexgen.X.AbstractC1589es;
import com.facebook.ads.redexgen.X.VH;
import com.facebook.ads.redexgen.X.ZM;
import com.google.android.exoplayer2.Metadata;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class IcyInfo implements Metadata.Entry {
    public static byte[] A03;
    public static String[] A04 = {"Zng8oGJmVE4Mf4", "Qb38moAIi05XWO4LIwoWINBS7KSoc6AH", "EZdTlSgs2DBmrr6hoJDclxewvVeIM4WM", "IUq8t7X57byDvT80MlkG0U", "PLYYouVTir3unf", "QL5otPsOS2ctCQzUpWfMdpn7ovvEXYGX", "S9X3oW4lbCFVgCi5xR4NZ8i0XKELf0", "TeMWYaZNtnHTX4uB45AGqCMTUKNO528u"};
    public static final Parcelable.Creator<IcyInfo> CREATOR;
    public final String A00;
    public final String A01;
    public final byte[] A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 31);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{71, 77, 87, 52, 46, 122, 103, 122, 98, 107, 51, 44, 43, 125, 44, 34, 46, 123, 124, 98, 51, 44, 43, 125, 44, 34, 46, 124, 111, 121, 67, 107, 122, 111, 106, 111, 122, 111, 32, 98, 107, 96, 105, 122, 102, 51, 44, 43, 125, 44};
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
        CREATOR = new VH();
    }

    public IcyInfo(Parcel parcel) {
        this.A02 = (byte[]) AbstractC1589es.A01(parcel.createByteArray());
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }

    public IcyInfo(byte[] bArr, String str, String str2) {
        this.A02 = bArr;
        this.A00 = str;
        this.A01 = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            Class<?> cls = getClass();
            Class<?> cls2 = obj.getClass();
            String[] strArr = A04;
            if (strArr[5].charAt(9) != strArr[2].charAt(9)) {
                A04[3] = "ScW6PQeXjrvrzPKjYurzgtnSap";
                if (cls != cls2) {
                    return false;
                }
                return Arrays.equals(this.A02, ((IcyInfo) obj).A02);
            }
            throw new RuntimeException();
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.A02);
    }

    public final String toString() {
        return String.format(A00(0, 50, 17), this.A00, this.A01, Integer.valueOf(this.A02.length));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.A02);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
