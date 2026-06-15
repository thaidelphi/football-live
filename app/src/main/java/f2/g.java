package f2;

import android.graphics.Bitmap;
import java.io.IOException;
import java.nio.ByteBuffer;
/* compiled from: ByteBufferBitmapDecoder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class g implements w1.j<ByteBuffer, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    private final m f25314a;

    public g(m mVar) {
        this.f25314a = mVar;
    }

    @Override // w1.j
    /* renamed from: c */
    public y1.v<Bitmap> a(ByteBuffer byteBuffer, int i10, int i11, w1.h hVar) throws IOException {
        return this.f25314a.f(s2.a.f(byteBuffer), i10, i11, hVar);
    }

    @Override // w1.j
    /* renamed from: d */
    public boolean b(ByteBuffer byteBuffer, w1.h hVar) {
        return this.f25314a.q(byteBuffer);
    }
}
