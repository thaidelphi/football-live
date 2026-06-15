package com.facebook.ads.redexgen.X;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class RR implements ZX {
    public MediaCodecInfo[] A00;
    public final int A01;

    public RR(boolean z10, boolean z11) {
        int i10;
        if (z10 || z11) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        this.A01 = i10;
    }

    @EnsuresNonNull({"mediaCodecInfos"})
    private void A00() {
        if (this.A00 == null) {
            this.A00 = new MediaCodecList(this.A01).getCodecInfos();
        }
    }

    @Override // com.facebook.ads.redexgen.X.ZX
    public final int A7F() {
        A00();
        return this.A00.length;
    }

    @Override // com.facebook.ads.redexgen.X.ZX
    public final MediaCodecInfo A7G(int i10) {
        A00();
        return this.A00[i10];
    }

    @Override // com.facebook.ads.redexgen.X.ZX
    public final boolean AAG(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // com.facebook.ads.redexgen.X.ZX
    public final boolean AAH(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // com.facebook.ads.redexgen.X.ZX
    public final boolean AIA() {
        return true;
    }
}
