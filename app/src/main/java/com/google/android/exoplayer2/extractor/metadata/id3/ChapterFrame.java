package com.google.android.exoplayer2.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.X.AbstractC1672gE;
import com.facebook.ads.redexgen.X.VL;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class ChapterFrame extends Id3Frame {
    public static byte[] A06;
    public static String[] A07 = {"42PRO9CMtHuixhKMZCfWGgjREBzaihOI", "Wl0HlZO86GbiVap5WnL", "o2tjNOzfc4LEvIrttASHXB5A", "eB70JKpywdrE1WuN8e1", "Ib6tssmTIzi0GD8tAJ0vNHzGOcfSmAer", "TClfYyWJD0Be", "satzW9B2OYo6nY8KYGUvldEgt1PSCItn", "5u5x2WtXjf87PX4bnXeLuQzgk"};
    public static final Parcelable.Creator<ChapterFrame> CREATOR;
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final String A04;
    public final Id3Frame[] A05;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 27);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{-112, -107, -114, -99};
    }

    static {
        A01();
        CREATOR = new VL();
    }

    public ChapterFrame(Parcel parcel) {
        super(A00(0, 4, 50));
        this.A04 = (String) AbstractC1672gE.A0f(parcel.readString());
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A03 = parcel.readLong();
        this.A02 = parcel.readLong();
        int readInt = parcel.readInt();
        this.A05 = new Id3Frame[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            this.A05[i10] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }

    public ChapterFrame(String str, int i10, int i11, long j10, long j11, Id3Frame[] id3FrameArr) {
        super(A00(0, 4, 50));
        this.A04 = str;
        this.A01 = i10;
        this.A00 = i11;
        this.A03 = j10;
        this.A02 = j11;
        this.A05 = id3FrameArr;
    }

    @Override // com.google.android.exoplayer2.extractor.metadata.id3.Id3Frame, android.os.Parcelable
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
            String[] strArr = A07;
            if (strArr[1].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            A07[5] = "rRXacEZW3TUWiJccVt5PBZF7RedmGhj";
            if (cls == cls2) {
                ChapterFrame chapterFrame = (ChapterFrame) obj;
                if (this.A01 == chapterFrame.A01 && this.A00 == chapterFrame.A00 && this.A03 == chapterFrame.A03 && this.A02 == chapterFrame.A02 && AbstractC1672gE.A1E(this.A04, chapterFrame.A04) && Arrays.equals(this.A05, chapterFrame.A05)) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result;
        int result2 = this.A01;
        int i10 = ((((17 * 31) + result2) * 31) + this.A00) * 31;
        int result3 = (int) this.A03;
        int i11 = (((i10 + result3) * 31) + ((int) this.A02)) * 31;
        if (this.A04 != null) {
            String str = this.A04;
            if (A07[2].length() == 20) {
                throw new RuntimeException();
            }
            A07[2] = "pltJ4XxjKM";
            result = str.hashCode();
        } else {
            result = 0;
        }
        int i12 = i11 + result;
        String[] strArr = A07;
        String str2 = strArr[6];
        String str3 = strArr[0];
        int charAt = str2.charAt(5);
        int result4 = str3.charAt(5);
        if (charAt != result4) {
            A07[5] = "p6p0cZzeIQvWy9wtGx3HFjA3x92RMf";
            return i12;
        }
        A07[5] = "2jVLCWbFA0VdXt";
        return i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.A04);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A03);
        parcel.writeLong(this.A02);
        parcel.writeInt(this.A05.length);
        for (Id3Frame id3Frame : this.A05) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }
}
