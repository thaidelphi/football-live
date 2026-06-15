package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.extractor.metadata.id3.ChapterTocFrame;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class VM implements Parcelable.Creator<ChapterTocFrame> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final ChapterTocFrame createFromParcel(Parcel parcel) {
        return new ChapterTocFrame(parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final ChapterTocFrame[] newArray(int i10) {
        return new ChapterTocFrame[i10];
    }
}
