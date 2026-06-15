package f2;

import android.graphics.Bitmap;
/* compiled from: BitmapResource.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class e implements y1.v<Bitmap>, y1.r {

    /* renamed from: a  reason: collision with root package name */
    private final Bitmap f25312a;

    /* renamed from: b  reason: collision with root package name */
    private final z1.e f25313b;

    public e(Bitmap bitmap, z1.e eVar) {
        this.f25312a = (Bitmap) s2.j.e(bitmap, "Bitmap must not be null");
        this.f25313b = (z1.e) s2.j.e(eVar, "BitmapPool must not be null");
    }

    public static e d(Bitmap bitmap, z1.e eVar) {
        if (bitmap == null) {
            return null;
        }
        return new e(bitmap, eVar);
    }

    @Override // y1.v
    public void a() {
        this.f25313b.c(this.f25312a);
    }

    @Override // y1.v
    public Class<Bitmap> b() {
        return Bitmap.class;
    }

    @Override // y1.v
    /* renamed from: c */
    public Bitmap get() {
        return this.f25312a;
    }

    @Override // y1.v
    public int getSize() {
        return s2.k.g(this.f25312a);
    }

    @Override // y1.r
    public void initialize() {
        this.f25312a.prepareToDraw();
    }
}
