package com.appnext.core;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import f2.y;
import java.lang.ref.WeakReference;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class l {
    private static volatile l dr;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        void Z();
    }

    private l() {
    }

    public static l aa() {
        if (dr == null) {
            synchronized (l.class) {
                if (dr == null) {
                    dr = new l();
                }
            }
        }
        return dr;
    }

    public final void a(Context context, ImageView imageView, String str, a aVar) {
        a(context, imageView, str, 0, false, aVar);
    }

    public final void b(Context context, ImageView imageView, String str, int i10, a aVar) {
        a(context, imageView, str, 16, true, aVar);
    }

    public final void a(Context context, ImageView imageView, String str, int i10, a aVar) {
        a(context, imageView, str, 16, false, aVar);
    }

    private void a(Context context, ImageView imageView, String str, int i10, boolean z10, a aVar) {
        final WeakReference weakReference = null;
        if (aVar != null) {
            try {
                weakReference = new WeakReference(aVar);
            } catch (Throwable th) {
                com.appnext.base.a.a("ImageLoader$displayImage", th);
                return;
            }
        }
        if (context == null || imageView == null || TextUtils.isEmpty(str)) {
            return;
        }
        com.bumptech.glide.j<Drawable> h02 = com.bumptech.glide.b.t(context.getApplicationContext()).r(str).h0(new o2.e<Drawable>() { // from class: com.appnext.core.l.1
            @Override // o2.e
            /* renamed from: a */
            public final boolean onResourceReady(Drawable drawable, Object obj, p2.h<Drawable> hVar, w1.a aVar2, boolean z11) {
                try {
                    WeakReference weakReference2 = weakReference;
                    if (weakReference2 != null) {
                        weakReference2.get();
                        return false;
                    }
                    return false;
                } catch (Throwable unused) {
                    return false;
                }
            }

            @Override // o2.e
            public final boolean onLoadFailed(y1.q qVar, Object obj, p2.h<Drawable> hVar, boolean z11) {
                a aVar2;
                try {
                    WeakReference weakReference2 = weakReference;
                    if (weakReference2 == null || (aVar2 = (a) weakReference2.get()) == null) {
                        return false;
                    }
                    aVar2.Z();
                    return false;
                } catch (Throwable unused) {
                    return false;
                }
            }
        });
        o2.f fVar = new o2.f();
        if (i10 > 0) {
            fVar.e0(new y(i10));
        }
        if (z10) {
            fVar.g(y1.j.f32924a);
        }
        h02.c(fVar).s0(imageView);
    }
}
