package com.facebook.ads.redexgen.X;

import com.google.android.exoplayer2.Metadata;
import com.google.android.exoplayer2.extractor.metadata.emsg.EventMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class BU extends V4 {
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final EventMessage A00(C1648fq c1648fq) {
        return new EventMessage((String) AbstractC1589es.A01(c1648fq.A0U()), (String) AbstractC1589es.A01(c1648fq.A0U()), c1648fq.A0P(), c1648fq.A0P(), Arrays.copyOfRange(c1648fq.A0l(), c1648fq.A09(), c1648fq.A0A()));
    }

    @Override // com.facebook.ads.redexgen.X.V4
    public final Metadata A0R(Bi bi, ByteBuffer byteBuffer) {
        return new Metadata(A00(new C1648fq(byteBuffer.array(), byteBuffer.limit())));
    }
}
