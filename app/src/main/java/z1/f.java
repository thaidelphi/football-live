package z1;

import android.graphics.Bitmap;
/* compiled from: BitmapPoolAdapter.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class f implements e {
    @Override // z1.e
    public void a(int i10) {
    }

    @Override // z1.e
    public void b() {
    }

    @Override // z1.e
    public void c(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // z1.e
    public Bitmap d(int i10, int i11, Bitmap.Config config) {
        return Bitmap.createBitmap(i10, i11, config);
    }

    @Override // z1.e
    public Bitmap e(int i10, int i11, Bitmap.Config config) {
        return d(i10, i11, config);
    }
}
