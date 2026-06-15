package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.DrmInitData;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class OM implements Parcelable.Creator<DrmInitData.SchemeData> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final DrmInitData.SchemeData createFromParcel(Parcel parcel) {
        return new DrmInitData.SchemeData(parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final DrmInitData.SchemeData[] newArray(int i10) {
        return new DrmInitData.SchemeData[i10];
    }
}
