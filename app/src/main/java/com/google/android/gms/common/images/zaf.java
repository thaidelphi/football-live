package com.google.android.gms.common.images;

import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.internal.Objects;
import java.lang.ref.WeakReference;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zaf extends zag {

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<ImageManager.OnImageLoadedListener> f12454b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zaf) {
            zaf zafVar = (zaf) obj;
            ImageManager.OnImageLoadedListener onImageLoadedListener = this.f12454b.get();
            ImageManager.OnImageLoadedListener onImageLoadedListener2 = zafVar.f12454b.get();
            return onImageLoadedListener2 != null && onImageLoadedListener != null && Objects.a(onImageLoadedListener2, onImageLoadedListener) && Objects.a(zafVar.f12455a, this.f12455a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.b(this.f12455a);
    }
}
