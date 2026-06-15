package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.extractor.metadata.mp4.MdtaMetadataEntry;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class VX implements Parcelable.Creator<MdtaMetadataEntry> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final MdtaMetadataEntry createFromParcel(Parcel parcel) {
        return new MdtaMetadataEntry(parcel, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final MdtaMetadataEntry[] newArray(int i10) {
        return new MdtaMetadataEntry[i10];
    }
}
