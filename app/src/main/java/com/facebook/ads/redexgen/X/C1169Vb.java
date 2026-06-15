package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.extractor.metadata.mp4.SlowMotionData;
/* renamed from: com.facebook.ads.redexgen.X.Vb  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1169Vb implements Parcelable.Creator<SlowMotionData.Segment> {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final SlowMotionData.Segment createFromParcel(Parcel parcel) {
        return new SlowMotionData.Segment(parcel.readLong(), parcel.readLong(), parcel.readInt());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final SlowMotionData.Segment[] newArray(int i10) {
        return new SlowMotionData.Segment[i10];
    }
}
