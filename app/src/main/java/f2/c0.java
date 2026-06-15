package f2;

import android.annotation.TargetApi;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import w1.g;
/* compiled from: VideoDecoder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class c0<T> implements w1.j<T, Bitmap> {

    /* renamed from: d  reason: collision with root package name */
    public static final w1.g<Long> f25301d = w1.g.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());

    /* renamed from: e  reason: collision with root package name */
    public static final w1.g<Integer> f25302e = w1.g.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());

    /* renamed from: f  reason: collision with root package name */
    private static final e f25303f = new e();

    /* renamed from: a  reason: collision with root package name */
    private final f<T> f25304a;

    /* renamed from: b  reason: collision with root package name */
    private final z1.e f25305b;

    /* renamed from: c  reason: collision with root package name */
    private final e f25306c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VideoDecoder.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements g.b<Long> {

        /* renamed from: a  reason: collision with root package name */
        private final ByteBuffer f25307a = ByteBuffer.allocate(8);

        a() {
        }

        @Override // w1.g.b
        /* renamed from: b */
        public void a(byte[] bArr, Long l10, MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f25307a) {
                this.f25307a.position(0);
                messageDigest.update(this.f25307a.putLong(l10.longValue()).array());
            }
        }
    }

    /* compiled from: VideoDecoder.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class b implements g.b<Integer> {

        /* renamed from: a  reason: collision with root package name */
        private final ByteBuffer f25308a = ByteBuffer.allocate(4);

        b() {
        }

        @Override // w1.g.b
        /* renamed from: b */
        public void a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            if (num == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f25308a) {
                this.f25308a.position(0);
                messageDigest.update(this.f25308a.putInt(num.intValue()).array());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VideoDecoder.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class c implements f<AssetFileDescriptor> {
        private c() {
        }

        @Override // f2.c0.f
        /* renamed from: b */
        public void a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VideoDecoder.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class d implements f<ByteBuffer> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: VideoDecoder.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public class a extends MediaDataSource {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ByteBuffer f25309a;

            a(ByteBuffer byteBuffer) {
                this.f25309a = byteBuffer;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // android.media.MediaDataSource
            public long getSize() {
                return this.f25309a.limit();
            }

            @Override // android.media.MediaDataSource
            public int readAt(long j10, byte[] bArr, int i10, int i11) {
                if (j10 >= this.f25309a.limit()) {
                    return -1;
                }
                this.f25309a.position((int) j10);
                int min = Math.min(i11, this.f25309a.remaining());
                this.f25309a.get(bArr, i10, min);
                return min;
            }
        }

        d() {
        }

        @Override // f2.c0.f
        /* renamed from: b */
        public void a(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(new a(byteBuffer));
        }
    }

    /* compiled from: VideoDecoder.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class e {
        e() {
        }

        public MediaMetadataRetriever a() {
            return new MediaMetadataRetriever();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VideoDecoder.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface f<T> {
        void a(MediaMetadataRetriever mediaMetadataRetriever, T t10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VideoDecoder.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class g implements f<ParcelFileDescriptor> {
        g() {
        }

        @Override // f2.c0.f
        /* renamed from: b */
        public void a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VideoDecoder.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class h extends RuntimeException {
        h() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    c0(z1.e eVar, f<T> fVar) {
        this(eVar, fVar, f25303f);
    }

    public static w1.j<AssetFileDescriptor, Bitmap> c(z1.e eVar) {
        return new c0(eVar, new c(null));
    }

    public static w1.j<ByteBuffer, Bitmap> d(z1.e eVar) {
        return new c0(eVar, new d());
    }

    private static Bitmap e(MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10, int i11, int i12, l lVar) {
        Bitmap g10 = (Build.VERSION.SDK_INT < 27 || i11 == Integer.MIN_VALUE || i12 == Integer.MIN_VALUE || lVar == l.f25328f) ? null : g(mediaMetadataRetriever, j10, i10, i11, i12, lVar);
        if (g10 == null) {
            g10 = f(mediaMetadataRetriever, j10, i10);
        }
        if (g10 != null) {
            return g10;
        }
        throw new h();
    }

    private static Bitmap f(MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10) {
        return mediaMetadataRetriever.getFrameAtTime(j10, i10);
    }

    @TargetApi(27)
    private static Bitmap g(MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10, int i11, int i12, l lVar) {
        try {
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (parseInt3 == 90 || parseInt3 == 270) {
                parseInt2 = parseInt;
                parseInt = parseInt2;
            }
            float b10 = lVar.b(parseInt, parseInt2, i11, i12);
            return mediaMetadataRetriever.getScaledFrameAtTime(j10, i10, Math.round(parseInt * b10), Math.round(b10 * parseInt2));
        } catch (Throwable th) {
            if (Log.isLoggable("VideoDecoder", 3)) {
                Log.d("VideoDecoder", "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame", th);
                return null;
            }
            return null;
        }
    }

    public static w1.j<ParcelFileDescriptor, Bitmap> h(z1.e eVar) {
        return new c0(eVar, new g());
    }

    @Override // w1.j
    public y1.v<Bitmap> a(T t10, int i10, int i11, w1.h hVar) throws IOException {
        long longValue = ((Long) hVar.c(f25301d)).longValue();
        if (longValue < 0 && longValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + longValue);
        }
        Integer num = (Integer) hVar.c(f25302e);
        if (num == null) {
            num = 2;
        }
        l lVar = (l) hVar.c(l.f25330h);
        if (lVar == null) {
            lVar = l.f25329g;
        }
        l lVar2 = lVar;
        MediaMetadataRetriever a10 = this.f25306c.a();
        try {
            this.f25304a.a(a10, t10);
            Bitmap e8 = e(a10, longValue, num.intValue(), i10, i11, lVar2);
            a10.release();
            return f2.e.d(e8, this.f25305b);
        } catch (Throwable th) {
            a10.release();
            throw th;
        }
    }

    @Override // w1.j
    public boolean b(T t10, w1.h hVar) {
        return true;
    }

    c0(z1.e eVar, f<T> fVar, e eVar2) {
        this.f25305b = eVar;
        this.f25304a = fVar;
        this.f25306c = eVar2;
    }
}
