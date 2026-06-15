package f2;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;
/* compiled from: BitmapDrawableEncoder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class b implements w1.k<BitmapDrawable> {

    /* renamed from: a  reason: collision with root package name */
    private final z1.e f25295a;

    /* renamed from: b  reason: collision with root package name */
    private final w1.k<Bitmap> f25296b;

    public b(z1.e eVar, w1.k<Bitmap> kVar) {
        this.f25295a = eVar;
        this.f25296b = kVar;
    }

    @Override // w1.k
    public w1.c a(w1.h hVar) {
        return this.f25296b.a(hVar);
    }

    @Override // w1.d
    /* renamed from: c */
    public boolean b(y1.v<BitmapDrawable> vVar, File file, w1.h hVar) {
        return this.f25296b.b(new e(vVar.get().getBitmap(), this.f25295a), file, hVar);
    }
}
