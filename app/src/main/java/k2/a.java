package k2;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import w1.h;
import y1.v;
/* compiled from: BitmapBytesTranscoder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class a implements e<Bitmap, byte[]> {

    /* renamed from: a  reason: collision with root package name */
    private final Bitmap.CompressFormat f27122a;

    /* renamed from: b  reason: collision with root package name */
    private final int f27123b;

    public a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Override // k2.e
    public v<byte[]> a(v<Bitmap> vVar, h hVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        vVar.get().compress(this.f27122a, this.f27123b, byteArrayOutputStream);
        vVar.a();
        return new g2.b(byteArrayOutputStream.toByteArray());
    }

    public a(Bitmap.CompressFormat compressFormat, int i10) {
        this.f27122a = compressFormat;
        this.f27123b = i10;
    }
}
