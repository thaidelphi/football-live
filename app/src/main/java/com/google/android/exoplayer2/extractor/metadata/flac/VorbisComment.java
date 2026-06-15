package com.google.android.exoplayer2.extractor.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.X.AbstractC1045Px;
import com.facebook.ads.redexgen.X.AbstractC1672gE;
import com.facebook.ads.redexgen.X.VE;
import com.facebook.ads.redexgen.X.ZM;
import com.google.android.exoplayer2.Metadata;
import java.util.Arrays;
@Deprecated
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class VorbisComment implements Metadata.Entry {
    public static byte[] A02;
    public static String[] A03 = {"XFctrZXAKm4uljMLzO3PcBwOKv3K", "SCfwFn9Wo43Yq0xL", "Lrpyp3pIgc173FDkg4Ec3aelVuIulEy6", "YD8LDBMqvetzfMlKPXcHhnSpmSwM0pmr", "hOOP887", "ka5CmYy68Xf037hcGT3mhVIpFnxPhgNM", "jjn5Gs3ODIOX4m", "6Il7TUtSx33jq7Q"};
    public static final Parcelable.Creator<VorbisComment> CREATOR;
    public final String A00;
    public final String A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 27);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{63, 52, 33, 88, 66};
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
        CREATOR = new VE();
    }

    public VorbisComment(Parcel parcel) {
        this.A00 = (String) AbstractC1672gE.A0f(parcel.readString());
        this.A01 = (String) AbstractC1672gE.A0f(parcel.readString());
    }

    public VorbisComment(String str, String str2) {
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
            if (A03[1].length() == 3) {
                throw new RuntimeException();
            }
            A03[6] = "zw438AIvZeGpRtYZdJqtjVdL5jaFTNlQ";
            if (cls == obj.getClass()) {
                VorbisComment vorbisComment = (VorbisComment) obj;
                return this.A00.equals(vorbisComment.A00) && this.A01.equals(vorbisComment.A01);
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A00.hashCode();
        return (((17 * 31) + result) * 31) + this.A01.hashCode();
    }

    public final String toString() {
        return A00(1, 4, 121) + this.A00 + A00(0, 1, 25) + this.A01;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
