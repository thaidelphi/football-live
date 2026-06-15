package com.google.android.gms.common.images;

import android.widget.ImageView;
import com.google.android.gms.common.internal.Objects;
import java.lang.ref.WeakReference;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zae extends zag {

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<ImageView> f12453b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zae) {
            ImageView imageView = this.f12453b.get();
            ImageView imageView2 = ((zae) obj).f12453b.get();
            return (imageView2 == null || imageView == null || !Objects.a(imageView2, imageView)) ? false : true;
        }
        return false;
    }

    public final int hashCode() {
        return 0;
    }
}
