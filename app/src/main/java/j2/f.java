package j2;

import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;
import w1.l;
import y1.v;
/* compiled from: GifDrawableTransformation.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class f implements l<c> {

    /* renamed from: b  reason: collision with root package name */
    private final l<Bitmap> f26810b;

    public f(l<Bitmap> lVar) {
        this.f26810b = (l) s2.j.d(lVar);
    }

    @Override // w1.l
    public v<c> a(Context context, v<c> vVar, int i10, int i11) {
        c cVar = vVar.get();
        v<Bitmap> eVar = new f2.e(cVar.e(), com.bumptech.glide.b.c(context).f());
        v<Bitmap> a10 = this.f26810b.a(context, eVar, i10, i11);
        if (!eVar.equals(a10)) {
            eVar.a();
        }
        cVar.m(this.f26810b, a10.get());
        return vVar;
    }

    @Override // w1.f
    public void b(MessageDigest messageDigest) {
        this.f26810b.b(messageDigest);
    }

    @Override // w1.f
    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f26810b.equals(((f) obj).f26810b);
        }
        return false;
    }

    @Override // w1.f
    public int hashCode() {
        return this.f26810b.hashCode();
    }
}
