package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.offline.DownloadRequest;
/* renamed from: com.facebook.ads.redexgen.X.a7  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1301a7 implements Parcelable.Creator<DownloadRequest> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final DownloadRequest createFromParcel(Parcel parcel) {
        return new DownloadRequest(parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final DownloadRequest[] newArray(int i10) {
        return new DownloadRequest[i10];
    }
}
