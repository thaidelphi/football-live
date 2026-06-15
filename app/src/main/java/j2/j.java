package j2;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import y1.v;
/* compiled from: StreamGifDecoder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class j implements w1.j<InputStream, c> {

    /* renamed from: a  reason: collision with root package name */
    private final List<ImageHeaderParser> f26838a;

    /* renamed from: b  reason: collision with root package name */
    private final w1.j<ByteBuffer, c> f26839b;

    /* renamed from: c  reason: collision with root package name */
    private final z1.b f26840c;

    public j(List<ImageHeaderParser> list, w1.j<ByteBuffer, c> jVar, z1.b bVar) {
        this.f26838a = list;
        this.f26839b = jVar;
        this.f26840c = bVar;
    }

    private static byte[] e(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e8) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e8);
                return null;
            }
            return null;
        }
    }

    @Override // w1.j
    /* renamed from: c */
    public v<c> a(InputStream inputStream, int i10, int i11, w1.h hVar) throws IOException {
        byte[] e8 = e(inputStream);
        if (e8 == null) {
            return null;
        }
        return this.f26839b.a(ByteBuffer.wrap(e8), i10, i11, hVar);
    }

    @Override // w1.j
    /* renamed from: d */
    public boolean b(InputStream inputStream, w1.h hVar) throws IOException {
        return !((Boolean) hVar.c(i.f26837b)).booleanValue() && com.bumptech.glide.load.a.e(this.f26838a, inputStream, this.f26840c) == ImageHeaderParser.ImageType.GIF;
    }
}
