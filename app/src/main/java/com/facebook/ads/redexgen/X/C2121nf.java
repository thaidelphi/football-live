package com.facebook.ads.redexgen.X;

import java.io.File;
/* renamed from: com.facebook.ads.redexgen.X.nf  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C2121nf implements C1G<File> {
    @Override // com.facebook.ads.redexgen.X.C1G
    public final C1F<File> A3n(File file, C1Y c1y) {
        if (file.exists()) {
            return new C1F<>(true, file);
        }
        return new C1F<>(false, null);
    }

    @Override // com.facebook.ads.redexgen.X.C1G
    public final void A53(File file, C1Y c1y) {
    }
}
