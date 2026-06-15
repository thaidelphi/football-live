package f2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;
/* compiled from: DrawableTransformation.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class o implements w1.l<Drawable> {

    /* renamed from: b  reason: collision with root package name */
    private final w1.l<Bitmap> f25350b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f25351c;

    public o(w1.l<Bitmap> lVar, boolean z10) {
        this.f25350b = lVar;
        this.f25351c = z10;
    }

    private y1.v<Drawable> d(Context context, y1.v<Bitmap> vVar) {
        return u.d(context.getResources(), vVar);
    }

    @Override // w1.l
    public y1.v<Drawable> a(Context context, y1.v<Drawable> vVar, int i10, int i11) {
        z1.e f10 = com.bumptech.glide.b.c(context).f();
        Drawable drawable = vVar.get();
        y1.v<Bitmap> a10 = n.a(f10, drawable, i10, i11);
        if (a10 == null) {
            if (this.f25351c) {
                throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
            }
            return vVar;
        }
        y1.v<Bitmap> a11 = this.f25350b.a(context, a10, i10, i11);
        if (a11.equals(a10)) {
            a11.a();
            return vVar;
        }
        return d(context, a11);
    }

    @Override // w1.f
    public void b(MessageDigest messageDigest) {
        this.f25350b.b(messageDigest);
    }

    public w1.l<BitmapDrawable> c() {
        return this;
    }

    @Override // w1.f
    public boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f25350b.equals(((o) obj).f25350b);
        }
        return false;
    }

    @Override // w1.f
    public int hashCode() {
        return this.f25350b.hashCode();
    }
}
