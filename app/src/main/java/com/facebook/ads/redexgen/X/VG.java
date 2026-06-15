package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.extractor.metadata.icy.IcyHeaders;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class VG implements Parcelable.Creator<IcyHeaders> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final IcyHeaders createFromParcel(Parcel parcel) {
        return new IcyHeaders(parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final IcyHeaders[] newArray(int i10) {
        return new IcyHeaders[i10];
    }
}
