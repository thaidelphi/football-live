package f2;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.IOException;
/* compiled from: BitmapDrawableDecoder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class a<DataType> implements w1.j<DataType, BitmapDrawable> {

    /* renamed from: a  reason: collision with root package name */
    private final w1.j<DataType, Bitmap> f25287a;

    /* renamed from: b  reason: collision with root package name */
    private final Resources f25288b;

    public a(Resources resources, w1.j<DataType, Bitmap> jVar) {
        this.f25288b = (Resources) s2.j.d(resources);
        this.f25287a = (w1.j) s2.j.d(jVar);
    }

    @Override // w1.j
    public y1.v<BitmapDrawable> a(DataType datatype, int i10, int i11, w1.h hVar) throws IOException {
        return u.d(this.f25288b, this.f25287a.a(datatype, i10, i11, hVar));
    }

    @Override // w1.j
    public boolean b(DataType datatype, w1.h hVar) throws IOException {
        return this.f25287a.b(datatype, hVar);
    }
}
