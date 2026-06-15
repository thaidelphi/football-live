package k2;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import w1.h;
import y1.v;
/* compiled from: DrawableBytesTranscoder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class c implements e<Drawable, byte[]> {

    /* renamed from: a  reason: collision with root package name */
    private final z1.e f27125a;

    /* renamed from: b  reason: collision with root package name */
    private final e<Bitmap, byte[]> f27126b;

    /* renamed from: c  reason: collision with root package name */
    private final e<j2.c, byte[]> f27127c;

    public c(z1.e eVar, e<Bitmap, byte[]> eVar2, e<j2.c, byte[]> eVar3) {
        this.f27125a = eVar;
        this.f27126b = eVar2;
        this.f27127c = eVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static v<j2.c> b(v<Drawable> vVar) {
        return vVar;
    }

    @Override // k2.e
    public v<byte[]> a(v<Drawable> vVar, h hVar) {
        Drawable drawable = vVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f27126b.a(f2.e.d(((BitmapDrawable) drawable).getBitmap(), this.f27125a), hVar);
        }
        if (drawable instanceof j2.c) {
            return this.f27127c.a(b(vVar), hVar);
        }
        return null;
    }
}
