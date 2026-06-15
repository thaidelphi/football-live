package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;
/* compiled from: TintResources.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class y0 extends q0 {

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<Context> f1799b;

    public y0(Context context, Resources resources) {
        super(resources);
        this.f1799b = new WeakReference<>(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i10) throws Resources.NotFoundException {
        Drawable a10 = a(i10);
        Context context = this.f1799b.get();
        if (a10 != null && context != null) {
            p0.h().x(context, i10, a10);
        }
        return a10;
    }
}
