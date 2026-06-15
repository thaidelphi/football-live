package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.extractor.metadata.mp4.SmtaMetadataEntry;
/* renamed from: com.facebook.ads.redexgen.X.Vd  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1170Vd implements Parcelable.Creator<SmtaMetadataEntry> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final SmtaMetadataEntry createFromParcel(Parcel parcel) {
        return new SmtaMetadataEntry(parcel, (C1170Vd) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final SmtaMetadataEntry[] newArray(int i10) {
        return new SmtaMetadataEntry[i10];
    }
}
