package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.extractor.metadata.id3.PrivFrame;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class VT implements Parcelable.Creator<PrivFrame> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final PrivFrame createFromParcel(Parcel parcel) {
        return new PrivFrame(parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final PrivFrame[] newArray(int i10) {
        return new PrivFrame[i10];
    }
}
