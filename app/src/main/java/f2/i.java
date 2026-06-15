package f2;

import android.graphics.Bitmap;
import java.security.MessageDigest;
/* compiled from: CenterCrop.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class i extends f {

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f25316b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(w1.f.f31964a);

    @Override // w1.f
    public void b(MessageDigest messageDigest) {
        messageDigest.update(f25316b);
    }

    @Override // f2.f
    protected Bitmap c(z1.e eVar, Bitmap bitmap, int i10, int i11) {
        return a0.b(eVar, bitmap, i10, i11);
    }

    @Override // w1.f
    public boolean equals(Object obj) {
        return obj instanceof i;
    }

    @Override // w1.f
    public int hashCode() {
        return -599754482;
    }
}
