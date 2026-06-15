package b5;

import android.view.Surface;
/* compiled from: MediaCodecVideoDecoderException.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class g extends x3.m {

    /* renamed from: c  reason: collision with root package name */
    public final int f5132c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f5133d;

    public g(Throwable th, x3.n nVar, Surface surface) {
        super(th, nVar);
        this.f5132c = System.identityHashCode(surface);
        this.f5133d = surface == null || surface.isValid();
    }
}
