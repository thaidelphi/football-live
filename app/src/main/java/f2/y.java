package f2;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
/* compiled from: RoundedCorners.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class y extends f {

    /* renamed from: c  reason: collision with root package name */
    private static final byte[] f25382c = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(w1.f.f31964a);

    /* renamed from: b  reason: collision with root package name */
    private final int f25383b;

    public y(int i10) {
        s2.j.a(i10 > 0, "roundingRadius must be greater than 0.");
        this.f25383b = i10;
    }

    @Override // w1.f
    public void b(MessageDigest messageDigest) {
        messageDigest.update(f25382c);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f25383b).array());
    }

    @Override // f2.f
    protected Bitmap c(z1.e eVar, Bitmap bitmap, int i10, int i11) {
        return a0.n(eVar, bitmap, this.f25383b);
    }

    @Override // w1.f
    public boolean equals(Object obj) {
        return (obj instanceof y) && this.f25383b == ((y) obj).f25383b;
    }

    @Override // w1.f
    public int hashCode() {
        return s2.k.n(-569625254, s2.k.m(this.f25383b));
    }
}
