package f2;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: InputStreamBitmapImageDecoderResourceDecoder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class t implements w1.j<InputStream, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    private final d f25370a = new d();

    @Override // w1.j
    /* renamed from: c */
    public y1.v<Bitmap> a(InputStream inputStream, int i10, int i11, w1.h hVar) throws IOException {
        return this.f25370a.a(ImageDecoder.createSource(s2.a.b(inputStream)), i10, i11, hVar);
    }

    @Override // w1.j
    /* renamed from: d */
    public boolean b(InputStream inputStream, w1.h hVar) throws IOException {
        return true;
    }
}
