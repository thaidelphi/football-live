package com.unity3d.ads.gl;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import kotlin.jvm.internal.n;
/* compiled from: EglSurfaceBase.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class EglSurfaceBase {
    private EGLSurface mEGLSurface;
    private EglCore mEglCore;
    private int mHeight;
    private int mWidth;

    /* JADX INFO: Access modifiers changed from: protected */
    public EglSurfaceBase(EglCore eglCore) {
        n.f(eglCore, "eglCore");
        this.mEGLSurface = EGL14.EGL_NO_SURFACE;
        this.mWidth = -1;
        this.mHeight = -1;
        this.mEglCore = eglCore;
    }

    public final void createOffscreenSurface(int i10, int i11) {
        if (this.mEGLSurface == EGL14.EGL_NO_SURFACE) {
            this.mEGLSurface = this.mEglCore.createOffscreenSurface(i10, i11);
            this.mWidth = i10;
            this.mHeight = i11;
            return;
        }
        throw new IllegalStateException("surface already created".toString());
    }

    public final void makeCurrent() {
        this.mEglCore.makeCurrent(this.mEGLSurface);
    }

    public final void releaseEglSurface() {
        this.mEglCore.releaseSurface(this.mEGLSurface);
        this.mEGLSurface = EGL14.EGL_NO_SURFACE;
        this.mHeight = -1;
        this.mWidth = -1;
    }
}
