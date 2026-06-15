package f2;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
/* compiled from: ResourceBitmapDecoder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class x implements w1.j<Uri, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    private final h2.d f25380a;

    /* renamed from: b  reason: collision with root package name */
    private final z1.e f25381b;

    public x(h2.d dVar, z1.e eVar) {
        this.f25380a = dVar;
        this.f25381b = eVar;
    }

    @Override // w1.j
    /* renamed from: c */
    public y1.v<Bitmap> a(Uri uri, int i10, int i11, w1.h hVar) {
        y1.v<Drawable> a10 = this.f25380a.a(uri, i10, i11, hVar);
        if (a10 == null) {
            return null;
        }
        return n.a(this.f25381b, a10.get(), i10, i11);
    }

    @Override // w1.j
    /* renamed from: d */
    public boolean b(Uri uri, w1.h hVar) {
        return "android.resource".equals(uri.getScheme());
    }
}
