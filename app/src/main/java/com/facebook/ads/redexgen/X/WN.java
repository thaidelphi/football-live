package com.facebook.ads.redexgen.X;

import android.net.Uri;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.protobuf.CodedOutputStream;
import java.io.EOFException;
import java.io.IOException;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class WN implements InterfaceC1157Uo {
    public final byte[] A00 = new byte[CodedOutputStream.DEFAULT_BUFFER_SIZE];

    @Override // com.facebook.ads.redexgen.X.InterfaceC1157Uo
    public final /* synthetic */ int AHv(O9 o92, int i10, boolean z10) {
        return AbstractC1155Ul.A00(this, o92, i10, z10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1157Uo
    public final /* synthetic */ void AHx(C1648fq c1648fq, int i10) {
        AbstractC1155Ul.A01(this, c1648fq, i10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1157Uo
    public final void A6U(ZM zm) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1157Uo
    public final int AHw(O9 o92, int i10, boolean z10, int i11) throws IOException {
        int bytesSkipped = o92.read(this.A00, 0, Math.min(this.A00.length, i10));
        if (bytesSkipped == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        return bytesSkipped;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1157Uo
    public final void AHy(C1648fq c1648fq, int i10, int i11) {
        c1648fq.A0g(i10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1157Uo
    public final void AI0(long j10, int i10, int i11, int i12, C1156Um c1156Um) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1157Uo
    @MetaExoPlayerCustomization("New API added for Meta")
    public final void AJk(Uri uri) {
    }
}
