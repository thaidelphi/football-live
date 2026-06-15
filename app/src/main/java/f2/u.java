package f2;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
/* compiled from: LazyBitmapDrawableResource.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class u implements y1.v<BitmapDrawable>, y1.r {

    /* renamed from: a  reason: collision with root package name */
    private final Resources f25371a;

    /* renamed from: b  reason: collision with root package name */
    private final y1.v<Bitmap> f25372b;

    private u(Resources resources, y1.v<Bitmap> vVar) {
        this.f25371a = (Resources) s2.j.d(resources);
        this.f25372b = (y1.v) s2.j.d(vVar);
    }

    public static y1.v<BitmapDrawable> d(Resources resources, y1.v<Bitmap> vVar) {
        if (vVar == null) {
            return null;
        }
        return new u(resources, vVar);
    }

    @Override // y1.v
    public void a() {
        this.f25372b.a();
    }

    @Override // y1.v
    public Class<BitmapDrawable> b() {
        return BitmapDrawable.class;
    }

    @Override // y1.v
    /* renamed from: c */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f25371a, this.f25372b.get());
    }

    @Override // y1.v
    public int getSize() {
        return this.f25372b.getSize();
    }

    @Override // y1.r
    public void initialize() {
        y1.v<Bitmap> vVar = this.f25372b;
        if (vVar instanceof y1.r) {
            ((y1.r) vVar).initialize();
        }
    }
}
