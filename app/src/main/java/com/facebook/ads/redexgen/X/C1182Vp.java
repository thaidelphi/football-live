package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.extractor.metadata.vorbis.VorbisComment;
/* renamed from: com.facebook.ads.redexgen.X.Vp  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1182Vp implements Parcelable.Creator<VorbisComment> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final VorbisComment createFromParcel(Parcel parcel) {
        return new VorbisComment(parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final VorbisComment[] newArray(int i10) {
        return new VorbisComment[i10];
    }
}
