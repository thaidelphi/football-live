package f2;

import android.content.Context;
import android.graphics.Bitmap;
/* compiled from: BitmapTransformation.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class f implements w1.l<Bitmap> {
    @Override // w1.l
    public final y1.v<Bitmap> a(Context context, y1.v<Bitmap> vVar, int i10, int i11) {
        if (s2.k.t(i10, i11)) {
            z1.e f10 = com.bumptech.glide.b.c(context).f();
            Bitmap bitmap = vVar.get();
            if (i10 == Integer.MIN_VALUE) {
                i10 = bitmap.getWidth();
            }
            if (i11 == Integer.MIN_VALUE) {
                i11 = bitmap.getHeight();
            }
            Bitmap c10 = c(f10, bitmap, i10, i11);
            return bitmap.equals(c10) ? vVar : e.d(c10, f10);
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i10 + " or height: " + i11 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }

    protected abstract Bitmap c(z1.e eVar, Bitmap bitmap, int i10, int i11);
}
