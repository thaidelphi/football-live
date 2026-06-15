package f2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;
/* compiled from: DrawableToBitmapConverter.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class n {

    /* renamed from: a  reason: collision with root package name */
    private static final z1.e f25349a = new a();

    /* compiled from: DrawableToBitmapConverter.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends z1.f {
        a() {
        }

        @Override // z1.f, z1.e
        public void c(Bitmap bitmap) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static y1.v<Bitmap> a(z1.e eVar, Drawable drawable, int i10, int i11) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z10 = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmap = null;
        } else {
            bitmap = b(eVar, current, i10, i11);
            z10 = true;
        }
        if (!z10) {
            eVar = f25349a;
        }
        return e.d(bitmap, eVar);
    }

    private static Bitmap b(z1.e eVar, Drawable drawable, int i10, int i11) {
        if (i10 == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            return null;
        } else if (i11 == Integer.MIN_VALUE && drawable.getIntrinsicHeight() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
            }
            return null;
        } else {
            if (drawable.getIntrinsicWidth() > 0) {
                i10 = drawable.getIntrinsicWidth();
            }
            if (drawable.getIntrinsicHeight() > 0) {
                i11 = drawable.getIntrinsicHeight();
            }
            Lock h10 = a0.h();
            h10.lock();
            Bitmap d10 = eVar.d(i10, i11, Bitmap.Config.ARGB_8888);
            try {
                Canvas canvas = new Canvas(d10);
                drawable.setBounds(0, 0, i10, i11);
                drawable.draw(canvas);
                canvas.setBitmap(null);
                return d10;
            } finally {
                h10.unlock();
            }
        }
    }
}
