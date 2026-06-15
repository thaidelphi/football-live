package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.util.List;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public interface UO {
    public static final UO A00 = new UO() { // from class: com.facebook.ads.redexgen.X.W4
        @Override // com.facebook.ads.redexgen.X.UO
        public final UK[] A5D() {
            return UN.A00();
        }

        @Override // com.facebook.ads.redexgen.X.UO
        public final /* synthetic */ UK[] A5E(Uri uri, Map map) {
            return UN.A01(this, uri, map);
        }
    };

    UK[] A5D();

    UK[] A5E(Uri uri, Map<String, List<String>> map);
}
