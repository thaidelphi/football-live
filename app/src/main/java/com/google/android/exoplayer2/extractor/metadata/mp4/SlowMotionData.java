package com.google.android.exoplayer2.extractor.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.X.AbstractC1013Or;
import com.facebook.ads.redexgen.X.AbstractC1045Px;
import com.facebook.ads.redexgen.X.AbstractC1589es;
import com.facebook.ads.redexgen.X.AbstractC1672gE;
import com.facebook.ads.redexgen.X.C1169Vb;
import com.facebook.ads.redexgen.X.VZ;
import com.facebook.ads.redexgen.X.ZM;
import com.google.android.exoplayer2.Metadata;
import com.google.android.exoplayer2.extractor.metadata.mp4.SlowMotionData;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class SlowMotionData implements Metadata.Entry {
    public static byte[] A01;
    public static String[] A02 = {"QneAKI9PIM", "yoq5fLNoJvvIfWsSArbDwAVHgL4cfD3x", "DEnpAxNcVV0KxvrkmrA16C6", "rYGo6FyG3VpfVhdbf", "ESLXNZ85GxDn7OTIMgmY1xCTg7yuSttb", "43Du7OpOKhG7qpXEERKpVYsGVuzq74rE", "MBlgY8r1gru2ziOOgwe3iuRtWj5tg95u", "rYYfFodHjk"};
    public static final Parcelable.Creator<SlowMotionData> CREATOR;
    public final List<Segment> A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            byte b10 = (byte) ((copyOfRange[i13] - i12) - 30);
            if (A02[4].charAt(6) != '8') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[6] = "q08QO6YxduDhnFTWTBqq3CqSQkm7K3gf";
            strArr[1] = "QsiZfi4nc4NkSm3MBWcK7QuHRja9ywKv";
            copyOfRange[i13] = b10;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-117, -92, -89, -81, -123, -89, -84, -95, -89, -90, 114, 88, -85, -99, -97, -91, -99, -90, -84, -85, 117};
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
        CREATOR = new VZ();
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
    public static final class Segment implements Parcelable {
        public static byte[] A03;
        public static final Comparator<Segment> A04;
        public static final Parcelable.Creator<Segment> CREATOR;
        public final int A00;
        public final long A01;
        public final long A02;

        public static String A01(int i10, int i11, int i12) {
            byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
            for (int i13 = 0; i13 < copyOfRange.length; i13++) {
                copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 45);
            }
            return new String(copyOfRange);
        }

        public static void A02() {
            A03 = new byte[]{20, 34, 32, 42, 34, 41, 51, 125, 103, 52, 51, 38, 53, 51, 19, 46, 42, 34, 10, 52, 122, 98, 35, 107, 103, 34, 41, 35, 19, 46, 42, 34, 10, 52, 122, 98, 35, 107, 103, 52, 55, 34, 34, 35, 3, 46, 49, 46, 52, 40, 53, 122, 98, 35};
        }

        static {
            A02();
            A04 = new Comparator() { // from class: com.facebook.ads.redexgen.X.Va
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int A05;
                    A05 = AbstractC1967l7.A01().A07(r2.A02, r3.A02).A07(r2.A01, r3.A01).A06(((SlowMotionData.Segment) obj).A00, ((SlowMotionData.Segment) obj2).A00).A05();
                    return A05;
                }
            };
            CREATOR = new C1169Vb();
        }

        public Segment(long j10, long j11, int i10) {
            AbstractC1589es.A07(j10 < j11);
            this.A02 = j10;
            this.A01 = j11;
            this.A00 = i10;
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
            Segment segment = (Segment) obj;
            return this.A02 == segment.A02 && this.A01 == segment.A01 && this.A00 == segment.A00;
        }

        public final int hashCode() {
            return AbstractC1013Or.A00(Long.valueOf(this.A02), Long.valueOf(this.A01), Integer.valueOf(this.A00));
        }

        public final String toString() {
            return AbstractC1672gE.A0n(A01(0, 54, 106), Long.valueOf(this.A02), Long.valueOf(this.A01), Integer.valueOf(this.A00));
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.A02);
            parcel.writeLong(this.A01);
            parcel.writeInt(this.A00);
        }
    }

    public SlowMotionData(List<Segment> segments) {
        this.A00 = segments;
        AbstractC1589es.A07(!A02(segments));
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x0015 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A02(java.util.List<com.google.android.exoplayer2.extractor.metadata.mp4.SlowMotionData.Segment> r7) {
        /*
            boolean r0 = r7.isEmpty()
            r6 = 0
            if (r0 == 0) goto L8
            return r6
        L8:
            java.lang.Object r0 = r7.get(r6)
            com.google.android.exoplayer2.extractor.metadata.mp4.SlowMotionData$Segment r0 = (com.google.android.exoplayer2.extractor.metadata.mp4.SlowMotionData.Segment) r0
            long r3 = r0.A01
            r5 = 1
        L11:
            int r0 = r7.size()
            if (r5 >= r0) goto L30
            java.lang.Object r0 = r7.get(r5)
            com.google.android.exoplayer2.extractor.metadata.mp4.SlowMotionData$Segment r0 = (com.google.android.exoplayer2.extractor.metadata.mp4.SlowMotionData.Segment) r0
            long r1 = r0.A02
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L25
            r0 = 1
            return r0
        L25:
            java.lang.Object r0 = r7.get(r5)
            com.google.android.exoplayer2.extractor.metadata.mp4.SlowMotionData$Segment r0 = (com.google.android.exoplayer2.extractor.metadata.mp4.SlowMotionData.Segment) r0
            long r3 = r0.A01
            int r5 = r5 + 1
            goto L11
        L30:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.metadata.mp4.SlowMotionData.A02(java.util.List):boolean");
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
        return this.A00.equals(((SlowMotionData) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return A00(0, 21, 26) + this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.A00);
    }
}
