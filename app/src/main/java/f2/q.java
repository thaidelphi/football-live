package f2;

import android.graphics.Bitmap;
import java.security.MessageDigest;
/* compiled from: FitCenter.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class q extends f {

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f25352b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(w1.f.f31964a);

    @Override // w1.f
    public void b(MessageDigest messageDigest) {
        messageDigest.update(f25352b);
    }

    @Override // f2.f
    protected Bitmap c(z1.e eVar, Bitmap bitmap, int i10, int i11) {
        return a0.e(eVar, bitmap, i10, i11);
    }

    @Override // w1.f
    public boolean equals(Object obj) {
        return obj instanceof q;
    }

    @Override // w1.f
    public int hashCode() {
        return 1572326941;
    }
}
