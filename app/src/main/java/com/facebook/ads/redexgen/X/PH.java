package com.facebook.ads.redexgen.X;

import android.net.Uri;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.StreamKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class PH {
    public Uri A00;
    public ZC A04;
    public Object A05;
    public String A06;
    public String A07;
    public String A08;
    public PI A01 = new PI();
    public PK A02 = new PK();
    public List<StreamKey> A09 = Collections.emptyList();
    public List<MediaItem.SubtitleConfiguration> A0A = Collections.emptyList();
    public PN A03 = new PN();

    public final PH A00(Uri uri) {
        this.A00 = uri;
        return this;
    }

    public final PH A01(Object obj) {
        this.A05 = obj;
        return this;
    }

    public final PH A02(String str) {
        this.A06 = str;
        return this;
    }

    public final PH A03(String str) {
        this.A07 = (String) AbstractC1589es.A01(str);
        return this;
    }

    public final PH A04(List<StreamKey> streamKeys) {
        List<StreamKey> emptyList;
        if (streamKeys != null && !streamKeys.isEmpty()) {
            emptyList = Collections.unmodifiableList(new ArrayList(streamKeys));
        } else {
            emptyList = Collections.emptyList();
        }
        this.A09 = emptyList;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.ads.redexgen.X.ZE A05() {
        /*
            r11 = this;
            com.facebook.ads.redexgen.X.PK r0 = r11.A02
            android.net.Uri r0 = com.facebook.ads.redexgen.X.PK.A00(r0)
            if (r0 == 0) goto L10
            com.facebook.ads.redexgen.X.PK r0 = r11.A02
            java.util.UUID r0 = com.facebook.ads.redexgen.X.PK.A03(r0)
            if (r0 == 0) goto L60
        L10:
            r0 = 1
        L11:
            com.facebook.ads.redexgen.X.AbstractC1589es.A08(r0)
            r1 = 0
            android.net.Uri r2 = r11.A00
            if (r2 == 0) goto L38
            com.facebook.ads.redexgen.X.ZF r1 = new com.facebook.ads.redexgen.X.ZF
            java.lang.String r3 = r11.A08
            com.facebook.ads.redexgen.X.PK r0 = r11.A02
            java.util.UUID r0 = com.facebook.ads.redexgen.X.PK.A03(r0)
            if (r0 == 0) goto L5e
            com.facebook.ads.redexgen.X.PK r0 = r11.A02
            com.facebook.ads.redexgen.X.PL r4 = r0.A08()
        L2b:
            r5 = 0
            java.util.List<com.google.android.exoplayer2.StreamKey> r6 = r11.A09
            java.lang.String r7 = r11.A06
            java.util.List<com.google.android.exoplayer2.MediaItem$SubtitleConfiguration> r8 = r11.A0A
            java.lang.Object r9 = r11.A05
            r10 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
        L38:
            com.facebook.ads.redexgen.X.ZE r2 = new com.facebook.ads.redexgen.X.ZE
            java.lang.String r0 = r11.A07
            if (r0 == 0) goto L5b
            java.lang.String r3 = r11.A07
        L40:
            com.facebook.ads.redexgen.X.PI r0 = r11.A01
            com.facebook.ads.redexgen.X.E1 r4 = r0.A0B()
            com.facebook.ads.redexgen.X.PN r0 = r11.A03
            com.facebook.ads.redexgen.X.ZG r6 = r0.A05()
            com.facebook.ads.redexgen.X.ZC r0 = r11.A04
            if (r0 == 0) goto L58
            com.facebook.ads.redexgen.X.ZC r7 = r11.A04
        L52:
            r8 = 0
            r5 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        L58:
            com.facebook.ads.redexgen.X.ZC r7 = com.facebook.ads.redexgen.X.ZC.A0Z
            goto L52
        L5b:
            java.lang.String r3 = ""
            goto L40
        L5e:
            r4 = 0
            goto L2b
        L60:
            r0 = 0
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.PH.A05():com.facebook.ads.redexgen.X.ZE");
    }
}
