package f2;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.IOException;
import java.nio.ByteBuffer;
/* compiled from: ByteBufferBitmapImageDecoderResourceDecoder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class h implements w1.j<ByteBuffer, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    private final d f25315a = new d();

    @Override // w1.j
    /* renamed from: c */
    public y1.v<Bitmap> a(ByteBuffer byteBuffer, int i10, int i11, w1.h hVar) throws IOException {
        return this.f25315a.a(ImageDecoder.createSource(byteBuffer), i10, i11, hVar);
    }

    @Override // w1.j
    /* renamed from: d */
    public boolean b(ByteBuffer byteBuffer, w1.h hVar) throws IOException {
        return true;
    }
}
