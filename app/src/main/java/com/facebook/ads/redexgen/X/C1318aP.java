package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.scheduler.Requirements;
/* renamed from: com.facebook.ads.redexgen.X.aP  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1318aP implements Parcelable.Creator<Requirements> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final Requirements createFromParcel(Parcel parcel) {
        return new Requirements(parcel.readInt());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final Requirements[] newArray(int i10) {
        return new Requirements[i10];
    }
}
