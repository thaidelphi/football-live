package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.android.exoplayer2.text.Cue;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.Qf  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1051Qf implements InterfaceC0973Nb {
    public final long A00;
    @MetaExoPlayerCustomization("Oculus does not work well with Google Guava")
    public final List<C1053Qh> A01;
    public static final C1051Qf A03 = new C1051Qf(C0958Mm.A01(), 0);
    public static final String A04 = AbstractC1672gE.A0h(0);
    public static final String A05 = AbstractC1672gE.A0h(1);
    public static final InterfaceC0972Na<C1051Qf> A02 = new InterfaceC0972Na() { // from class: com.facebook.ads.redexgen.X.Qg
        @Override // com.facebook.ads.redexgen.X.InterfaceC0972Na
        public final InterfaceC0973Nb A6V(Bundle bundle) {
            C1051Qf A00;
            A00 = C1051Qf.A00(bundle);
            return A00;
        }
    };

    @MetaExoPlayerCustomization("Oculus does not work well with Google Guava")
    public C1051Qf(List<C1053Qh> list, long j10) {
        this.A01 = C0958Mm.A03((C1053Qh[]) list.toArray(new C1053Qh[0]));
        this.A00 = j10;
    }

    public static final C1051Qf A00(Bundle bundle) {
        List A01;
        List<Cue> cues = bundle.getParcelableArrayList(A04);
        if (cues == null) {
            A01 = C0958Mm.A01();
        } else {
            A01 = C1595ey.A01(C1053Qh.A0I, cues);
        }
        return new C1051Qf(A01, bundle.getLong(A05));
    }
}
