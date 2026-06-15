package f2;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import com.ironsource.b9;
import java.io.IOException;
/* compiled from: BitmapImageDecoderResourceDecoder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class d extends e2.a<Bitmap> {

    /* renamed from: b  reason: collision with root package name */
    private final z1.e f25311b = new z1.f();

    @Override // e2.a
    protected y1.v<Bitmap> c(ImageDecoder.Source source, int i10, int i11, ImageDecoder.OnHeaderDecodedListener onHeaderDecodedListener) throws IOException {
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(source, onHeaderDecodedListener);
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + decodeBitmap.getWidth() + "x" + decodeBitmap.getHeight() + "] for [" + i10 + "x" + i11 + b9.i.f16698e);
        }
        return new e(decodeBitmap, this.f25311b);
    }
}
