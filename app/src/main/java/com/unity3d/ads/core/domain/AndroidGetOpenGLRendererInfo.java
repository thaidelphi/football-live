package com.unity3d.ads.core.domain;

import android.opengl.GLES20;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.gl.EglCore;
import com.unity3d.ads.gl.OffscreenSurface;
import kotlin.jvm.internal.n;
/* compiled from: AndroidGetOpenGLRendererInfo.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class AndroidGetOpenGLRendererInfo implements GetOpenGLRendererInfo {
    private final SessionRepository sessionRepository;

    public AndroidGetOpenGLRendererInfo(SessionRepository sessionRepository) {
        n.f(sessionRepository, "sessionRepository");
        this.sessionRepository = sessionRepository;
    }

    @Override // com.unity3d.ads.core.domain.GetOpenGLRendererInfo
    public ByteString invoke() {
        if (this.sessionRepository.getFeatureFlags().getOpenglGpuEnabled()) {
            EglCore eglCore = new EglCore(null, 2);
            OffscreenSurface offscreenSurface = new OffscreenSurface(eglCore, 1, 1);
            offscreenSurface.makeCurrent();
            String renderer = GLES20.glGetString(7937);
            n.e(renderer, "renderer");
            byte[] bytes = renderer.getBytes(b9.c.f5283b);
            n.e(bytes, "this as java.lang.String).getBytes(charset)");
            ByteString copyFrom = ByteString.copyFrom(bytes);
            offscreenSurface.release();
            eglCore.release();
            n.e(copyFrom, "{\n            // We need…dererByteString\n        }");
            return copyFrom;
        }
        ByteString empty = ByteString.empty();
        n.e(empty, "{\n            ByteString.empty()\n        }");
        return empty;
    }
}
