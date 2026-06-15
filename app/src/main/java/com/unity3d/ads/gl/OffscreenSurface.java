package com.unity3d.ads.gl;

import kotlin.jvm.internal.n;
/* compiled from: OffscreenSurface.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class OffscreenSurface extends EglSurfaceBase {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffscreenSurface(EglCore eglCore, int i10, int i11) {
        super(eglCore);
        n.f(eglCore, "eglCore");
        createOffscreenSurface(i10, i11);
    }

    public final void release() {
        releaseEglSurface();
    }
}
