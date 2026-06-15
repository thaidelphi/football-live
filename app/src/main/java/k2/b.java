package k2;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import f2.u;
import s2.j;
import w1.h;
import y1.v;
/* compiled from: BitmapDrawableTranscoder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class b implements e<Bitmap, BitmapDrawable> {

    /* renamed from: a  reason: collision with root package name */
    private final Resources f27124a;

    public b(Resources resources) {
        this.f27124a = (Resources) j.d(resources);
    }

    @Override // k2.e
    public v<BitmapDrawable> a(v<Bitmap> vVar, h hVar) {
        return u.d(this.f27124a, vVar);
    }
}
