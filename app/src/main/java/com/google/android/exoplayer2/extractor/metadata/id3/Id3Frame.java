package com.google.android.exoplayer2.extractor.metadata.id3;

import com.facebook.ads.redexgen.X.AbstractC1045Px;
import com.facebook.ads.redexgen.X.ZM;
import com.google.android.exoplayer2.Metadata;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class Id3Frame implements Metadata.Entry {
    public final String A00;

    @Override // com.google.android.exoplayer2.Metadata.Entry
    public final /* synthetic */ byte[] A9Q() {
        return AbstractC1045Px.A01(this);
    }

    @Override // com.google.android.exoplayer2.Metadata.Entry
    public final /* synthetic */ ZM A9R() {
        return AbstractC1045Px.A00(this);
    }

    public Id3Frame(String str) {
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.A00;
    }
}
