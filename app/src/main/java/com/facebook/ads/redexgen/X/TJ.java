package com.facebook.ads.redexgen.X;

import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class TJ {
    public final int A00;
    public final R5 A01;
    public final CopyOnWriteArrayList<DrmSessionEventListener.EventDispatcher.ListenerAndHandler> A02;

    public TJ() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    public TJ(CopyOnWriteArrayList<DrmSessionEventListener.EventDispatcher.ListenerAndHandler> listenerAndHandlers, int i10, R5 r52) {
        this.A02 = listenerAndHandlers;
        this.A00 = i10;
        this.A01 = r52;
    }

    public final TJ A00(int i10, R5 r52) {
        return new TJ(this.A02, i10, r52);
    }
}
