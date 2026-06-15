package com.google.android.exoplayer2.extractor.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.X.AbstractC1045Px;
import com.facebook.ads.redexgen.X.AbstractC2178oq;
import com.facebook.ads.redexgen.X.VY;
import com.facebook.ads.redexgen.X.ZM;
import com.google.android.exoplayer2.Metadata;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class MotionPhotoMetadata implements Metadata.Entry {
    public static byte[] A05;
    public static String[] A06 = {"ku", "1hwgnGXdpF9", "o2MIIDCtNouwjymUEO0UQeAxQtBhD9Y1", "QmUveHwvh3NjEh4eWi19CYxXWv7Ygl4M", "", "NgdDNkmoRoayoNJTWizQDk14ffenkXLI", "m4pQSnrnPJTpaN5YyjYraohqcw5JFjCC", ""};
    public static final Parcelable.Creator<MotionPhotoMetadata> CREATOR;
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 106);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{126, 114, 34, 58, 61, 38, 61, 2, 32, 55, 33, 55, 60, 38, 51, 38, 59, 61, 60, 6, 59, 63, 55, 33, 38, 51, 63, 34, 7, 33, 111, 62, 50, 98, 122, 125, 102, 125, 65, 123, 104, 119, 47, 57, 53, 99, 124, 113, 112, 122, 70, 124, 111, 112, 40, 53, 57, 111, 112, 125, 124, 118, 74, 109, 120, 107, 109, 73, 118, 106, 112, 109, 112, 118, 119, 36, 116, 86, 77, 80, 86, 87, 25, 73, 81, 86, 77, 86, 25, 84, 92, 77, 88, 93, 88, 77, 88, 3, 25, 73, 81, 86, 77, 86, 106, 77, 88, 75, 77, 105, 86, 74, 80, 77, 80, 86, 87, 4};
        if (A06[3].charAt(1) != 'm') {
            throw new RuntimeException();
        }
        A06[1] = "BnKuPCM4YfHpfUmuJ11tvah0elpA4LfO";
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
        CREATOR = new VY();
    }

    public MotionPhotoMetadata(long j10, long j11, long j12, long j13, long j14) {
        this.A02 = j10;
        this.A01 = j11;
        this.A00 = j12;
        this.A04 = j13;
        this.A03 = j14;
    }

    public MotionPhotoMetadata(Parcel parcel) {
        this.A02 = parcel.readLong();
        this.A01 = parcel.readLong();
        this.A00 = parcel.readLong();
        this.A04 = parcel.readLong();
        this.A03 = parcel.readLong();
    }

    public /* synthetic */ MotionPhotoMetadata(Parcel parcel, VY vy) {
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
        if (A06[0].length() == 2) {
            String[] strArr = A06;
            strArr[6] = "ll6xjQmHrfmhrjgcZFY36flQjkuXuFh8";
            strArr[2] = "s7J3CuDtr8LjkS0NABBOQNXtjiBoQ8a7";
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            MotionPhotoMetadata motionPhotoMetadata = (MotionPhotoMetadata) obj;
            if (this.A02 == motionPhotoMetadata.A02 && this.A01 == motionPhotoMetadata.A01) {
                int i10 = (this.A00 > motionPhotoMetadata.A00 ? 1 : (this.A00 == motionPhotoMetadata.A00 ? 0 : -1));
                String[] strArr2 = A06;
                if (strArr2[6].charAt(23) != strArr2[2].charAt(23)) {
                    A06[1] = "KlXN0P3XPFqQZ";
                    if (i10 == 0 && this.A04 == motionPhotoMetadata.A04 && this.A03 == motionPhotoMetadata.A03) {
                        return true;
                    }
                }
            }
            return false;
        }
        throw new RuntimeException();
    }

    public final int hashCode() {
        int result = AbstractC2178oq.A00(this.A02);
        int result2 = AbstractC2178oq.A00(this.A00);
        int result3 = AbstractC2178oq.A00(this.A03);
        return (((((((((17 * 31) + result) * 31) + AbstractC2178oq.A00(this.A01)) * 31) + result2) * 31) + AbstractC2178oq.A00(this.A04)) * 31) + result3;
    }

    public final String toString() {
        return A00(76, 42, 83) + this.A02 + A00(31, 12, 120) + this.A01 + A00(0, 31, 56) + this.A00 + A00(55, 21, 115) + this.A04 + A00(43, 12, 127) + this.A03;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.A02);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
        parcel.writeLong(this.A04);
        parcel.writeLong(this.A03);
    }
}
