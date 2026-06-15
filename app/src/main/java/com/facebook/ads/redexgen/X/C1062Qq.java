package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.StreamKey;
/* renamed from: com.facebook.ads.redexgen.X.Qq  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1062Qq implements Parcelable.Creator<StreamKey> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final StreamKey createFromParcel(Parcel parcel) {
        return new StreamKey(parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final StreamKey[] newArray(int i10) {
        return new StreamKey[i10];
    }
}
