package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.extractor.metadata.scte35.SpliceInsertCommand;
/* renamed from: com.facebook.ads.redexgen.X.Vh  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1174Vh implements Parcelable.Creator<SpliceInsertCommand> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final SpliceInsertCommand createFromParcel(Parcel parcel) {
        return new SpliceInsertCommand(parcel, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final SpliceInsertCommand[] newArray(int i10) {
        return new SpliceInsertCommand[i10];
    }
}
