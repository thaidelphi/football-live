package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.extractor.metadata.mp4.MotionPhotoMetadata;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class VY implements Parcelable.Creator<MotionPhotoMetadata> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final MotionPhotoMetadata createFromParcel(Parcel parcel) {
        return new MotionPhotoMetadata(parcel, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final MotionPhotoMetadata[] newArray(int i10) {
        return new MotionPhotoMetadata[i10];
    }
}
