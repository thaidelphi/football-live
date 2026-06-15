package com.google.android.exoplayer2.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.X.AbstractC1672gE;
import com.facebook.ads.redexgen.X.VR;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class InternalFrame extends Id3Frame {
    public static byte[] A03;
    public static String[] A04 = {"qjfoPMjSoLeMEsbv0kBP6GSnZYOaRwFi", "Ej91gG4g9EM35GARJxPSHQW34fl5Yzjc", "KG2lMO0Ya6y9ge0dACt6gcmv1h1NJRbr", "buEhb0VMoyyfKzGCx2VzdTfwfPFdsNhG", "GuuLHjqXaV9e1ihfw1GpqaHmrqUXSVhn", "h2hqhvMvcpFAmfQjJqtCPI5X4", "8dHpczYZ9EIem65EdPmTOUQhLozA0uKi", "rj1NbwK"};
    public static final Parcelable.Creator<InternalFrame> CREATOR;
    public final String A00;
    public final String A01;
    public final String A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 53);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{37, 41, 109, 108, 122, 106, 123, 96, 121, 125, 96, 102, 103, 52, 5, 5, 5, 5, 61, 39, 99, 104, 106, 102, 110, 105, 58};
        String[] strArr = A04;
        if (strArr[6].charAt(21) == strArr[3].charAt(21)) {
            throw new RuntimeException();
        }
        A04[4] = "apuDQ9vUHh0EW90kaUGCLZYBexRHSrpY";
    }

    static {
        A01();
        CREATOR = new VR();
    }

    public InternalFrame(Parcel parcel) {
        super(A00(14, 4, 29));
        this.A01 = (String) AbstractC1672gE.A0f(parcel.readString());
        this.A00 = (String) AbstractC1672gE.A0f(parcel.readString());
        this.A02 = (String) AbstractC1672gE.A0f(parcel.readString());
    }

    public InternalFrame(String str, String str2, String str3) {
        super(A00(14, 4, 29));
        this.A01 = str;
        this.A00 = str2;
        this.A02 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InternalFrame internalFrame = (InternalFrame) obj;
        if (AbstractC1672gE.A1E(this.A00, internalFrame.A00) && AbstractC1672gE.A1E(this.A01, internalFrame.A01) && AbstractC1672gE.A1E(this.A02, internalFrame.A02)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = 17 * 31;
        int result = this.A01 != null ? this.A01.hashCode() : 0;
        int hashCode = (((i10 + result) * 31) + (this.A00 != null ? this.A00.hashCode() : 0)) * 31;
        if (A04[0].charAt(3) != 'h') {
            String[] strArr = A04;
            strArr[2] = "oTJUS3xxU4qP8SSFfERRCQs2meNtKvc3";
            strArr[1] = "bf2Rx6WGjRO3ApmPJZMB1cRNBWEvdXY3";
            int hashCode2 = hashCode + (this.A02 != null ? this.A02.hashCode() : 0);
            if (A04[4].charAt(28) != 'f') {
                String[] strArr2 = A04;
                strArr2[7] = "ATTyaU0";
                strArr2[5] = "msOXPcqO6mEvfO9CHl40o7KjV";
                return hashCode2;
            }
            throw new RuntimeException();
        }
        throw new RuntimeException();
    }

    @Override // com.google.android.exoplayer2.extractor.metadata.id3.Id3Frame
    public final String toString() {
        return super.A00 + A00(18, 9, 50) + this.A01 + A00(0, 14, 60) + this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(super.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }
}
