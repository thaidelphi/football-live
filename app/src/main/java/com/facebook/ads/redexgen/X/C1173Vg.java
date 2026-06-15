package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.extractor.metadata.scte35.PrivateCommand;
/* renamed from: com.facebook.ads.redexgen.X.Vg  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1173Vg implements Parcelable.Creator<PrivateCommand> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final PrivateCommand createFromParcel(Parcel parcel) {
        return new PrivateCommand(parcel, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final PrivateCommand[] newArray(int i10) {
        return new PrivateCommand[i10];
    }
}
