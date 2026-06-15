package h2;

import android.graphics.drawable.Drawable;
import y1.v;
/* compiled from: NonOwnedDrawableResource.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class c extends b<Drawable> {
    private c(Drawable drawable) {
        super(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static v<Drawable> d(Drawable drawable) {
        if (drawable != null) {
            return new c(drawable);
        }
        return null;
    }

    @Override // y1.v
    public void a() {
    }

    @Override // y1.v
    public Class<Drawable> b() {
        return this.f26185a.getClass();
    }

    @Override // y1.v
    public int getSize() {
        return Math.max(1, this.f26185a.getIntrinsicWidth() * this.f26185a.getIntrinsicHeight() * 4);
    }
}
