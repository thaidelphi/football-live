package com.facebook.ads.redexgen.X;

import android.net.Uri;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public interface WJ extends O9 {
    void A3x(int i10) throws IOException;

    boolean A3y(int i10, boolean z10) throws IOException;

    long A8E();

    long A8Y();

    long A8d();

    @MetaExoPlayerCustomization("Added API for MP4 extractor")
    Uri A9F();

    int AG0(byte[] bArr, int i10, int i11) throws IOException;

    void AG1(byte[] bArr, int i10, int i11) throws IOException;

    boolean AG2(byte[] bArr, int i10, int i11, boolean z10) throws IOException;

    boolean AGZ(byte[] bArr, int i10, int i11, boolean z10) throws IOException;

    void AHr();

    int AJ6(int i10) throws IOException;

    void AJ9(int i10) throws IOException;

    @Override // com.facebook.ads.redexgen.X.O9
    int read(byte[] bArr, int i10, int i11) throws IOException;

    void readFully(byte[] bArr, int i10, int i11) throws IOException;
}
