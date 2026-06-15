package j2;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.ironsource.b9;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;
import s2.k;
import v1.a;
/* compiled from: ByteBufferGifDecoder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class a implements w1.j<ByteBuffer, c> {

    /* renamed from: f  reason: collision with root package name */
    private static final C0303a f26788f = new C0303a();

    /* renamed from: g  reason: collision with root package name */
    private static final b f26789g = new b();

    /* renamed from: a  reason: collision with root package name */
    private final Context f26790a;

    /* renamed from: b  reason: collision with root package name */
    private final List<ImageHeaderParser> f26791b;

    /* renamed from: c  reason: collision with root package name */
    private final b f26792c;

    /* renamed from: d  reason: collision with root package name */
    private final C0303a f26793d;

    /* renamed from: e  reason: collision with root package name */
    private final j2.b f26794e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ByteBufferGifDecoder.java */
    /* renamed from: j2.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class C0303a {
        C0303a() {
        }

        v1.a a(a.InterfaceC0366a interfaceC0366a, v1.c cVar, ByteBuffer byteBuffer, int i10) {
            return new v1.e(interfaceC0366a, cVar, byteBuffer, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ByteBufferGifDecoder.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final Queue<v1.d> f26795a = k.e(0);

        b() {
        }

        synchronized v1.d a(ByteBuffer byteBuffer) {
            v1.d poll;
            poll = this.f26795a.poll();
            if (poll == null) {
                poll = new v1.d();
            }
            return poll.p(byteBuffer);
        }

        synchronized void b(v1.d dVar) {
            dVar.a();
            this.f26795a.offer(dVar);
        }
    }

    public a(Context context, List<ImageHeaderParser> list, z1.e eVar, z1.b bVar) {
        this(context, list, eVar, bVar, f26789g, f26788f);
    }

    private e c(ByteBuffer byteBuffer, int i10, int i11, v1.d dVar, w1.h hVar) {
        Bitmap.Config config;
        long b10 = s2.f.b();
        try {
            v1.c c10 = dVar.c();
            if (c10.b() > 0 && c10.c() == 0) {
                if (hVar.c(i.f26836a) == w1.b.PREFER_RGB_565) {
                    config = Bitmap.Config.RGB_565;
                } else {
                    config = Bitmap.Config.ARGB_8888;
                }
                v1.a a10 = this.f26793d.a(this.f26794e, c10, byteBuffer, e(c10, i10, i11));
                a10.d(config);
                a10.b();
                Bitmap a11 = a10.a();
                if (a11 == null) {
                    return null;
                }
                e eVar = new e(new c(this.f26790a, a10, e2.c.c(), i10, i11, a11));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + s2.f.a(b10));
                }
                return eVar;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + s2.f.a(b10));
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + s2.f.a(b10));
            }
        }
    }

    private static int e(v1.c cVar, int i10, int i11) {
        int min = Math.min(cVar.a() / i11, cVar.d() / i10);
        int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + max + ", target dimens: [" + i10 + "x" + i11 + "], actual dimens: [" + cVar.d() + "x" + cVar.a() + b9.i.f16698e);
        }
        return max;
    }

    @Override // w1.j
    /* renamed from: d */
    public e a(ByteBuffer byteBuffer, int i10, int i11, w1.h hVar) {
        v1.d a10 = this.f26792c.a(byteBuffer);
        try {
            return c(byteBuffer, i10, i11, a10, hVar);
        } finally {
            this.f26792c.b(a10);
        }
    }

    @Override // w1.j
    /* renamed from: f */
    public boolean b(ByteBuffer byteBuffer, w1.h hVar) throws IOException {
        return !((Boolean) hVar.c(i.f26837b)).booleanValue() && com.bumptech.glide.load.a.f(this.f26791b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    a(Context context, List<ImageHeaderParser> list, z1.e eVar, z1.b bVar, b bVar2, C0303a c0303a) {
        this.f26790a = context.getApplicationContext();
        this.f26791b = list;
        this.f26793d = c0303a;
        this.f26794e = new j2.b(eVar, bVar);
        this.f26792c = bVar2;
    }
}
