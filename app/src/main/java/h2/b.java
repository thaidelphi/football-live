package h2;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import s2.j;
import y1.r;
import y1.v;
/* compiled from: DrawableResource.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class b<T extends Drawable> implements v<T>, r {

    /* renamed from: a  reason: collision with root package name */
    protected final T f26185a;

    public b(T t10) {
        this.f26185a = (T) j.d(t10);
    }

    @Override // y1.v
    /* renamed from: c */
    public final T get() {
        Drawable.ConstantState constantState = this.f26185a.getConstantState();
        if (constantState == null) {
            return this.f26185a;
        }
        return (T) constantState.newDrawable();
    }

    @Override // y1.r
    public void initialize() {
        T t10 = this.f26185a;
        if (t10 instanceof BitmapDrawable) {
            ((BitmapDrawable) t10).getBitmap().prepareToDraw();
        } else if (t10 instanceof j2.c) {
            ((j2.c) t10).e().prepareToDraw();
        }
    }
}
