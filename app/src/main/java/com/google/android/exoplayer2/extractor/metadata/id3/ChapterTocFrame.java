package com.google.android.exoplayer2.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.X.AbstractC1672gE;
import com.facebook.ads.redexgen.X.VM;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class ChapterTocFrame extends Id3Frame {
    public static byte[] A05;
    public static String[] A06 = {"s66Mul4RatCR8WjzArp5mGbIA4NHgNPm", "", "ExzOZBwKbvLDiJSNjXAmu1pXR8NqrMSY", "zU5KkNULb26Ax66XN1ebaihzwqwv7iMS", "AmtLMqWIzW9JmW0p9nfcp6Uk83awao68", "H4LNpFLimgWCZ2855WxLzQv0BFUvsq4T", "", "wxnGnBd7x379otnUaOxDUVqjqUKdfNSk"};
    public static final Parcelable.Creator<ChapterTocFrame> CREATOR;
    public final String A00;
    public final boolean A01;
    public final boolean A02;
    public final String[] A03;
    public final Id3Frame[] A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 12);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{-59, -42, -47, -59};
    }

    static {
        A01();
        CREATOR = new VM();
    }

    public ChapterTocFrame(Parcel parcel) {
        super(A00(0, 4, 118));
        this.A00 = (String) AbstractC1672gE.A0f(parcel.readString());
        this.A02 = parcel.readByte() != 0;
        this.A01 = parcel.readByte() != 0;
        this.A03 = (String[]) AbstractC1672gE.A0f(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.A04 = new Id3Frame[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            this.A04[i10] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }

    public ChapterTocFrame(String str, boolean z10, boolean z11, String[] strArr, Id3Frame[] id3FrameArr) {
        super(A00(0, 4, 118));
        this.A00 = str;
        this.A02 = z10;
        this.A01 = z11;
        this.A03 = strArr;
        this.A04 = id3FrameArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
        if (this.A02 == chapterTocFrame.A02 && this.A01 == chapterTocFrame.A01 && AbstractC1672gE.A1E(this.A00, chapterTocFrame.A00) && Arrays.equals(this.A03, chapterTocFrame.A03) && Arrays.equals(this.A04, chapterTocFrame.A04)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int result;
        int result2 = this.A02 ? 1 : 0;
        int i10 = ((((17 * 31) + result2) * 31) + (this.A01 ? 1 : 0)) * 31;
        if (this.A00 != null) {
            String str = this.A00;
            String[] strArr = A06;
            String str2 = strArr[0];
            String str3 = strArr[4];
            int charAt = str2.charAt(3);
            int result3 = str3.charAt(3);
            if (charAt == result3) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[6] = "";
            strArr2[1] = "";
            result = str.hashCode();
        } else {
            result = 0;
        }
        return i10 + result;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.A00);
        parcel.writeByte(this.A02 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A01 ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.A03);
        parcel.writeInt(this.A04.length);
        for (Id3Frame id3Frame : this.A04) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }
}
