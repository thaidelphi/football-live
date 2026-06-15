package x3;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import n3.m1;
/* compiled from: MediaCodecAdapter.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface l {

    /* compiled from: MediaCodecAdapter.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final n f32481a;

        /* renamed from: b  reason: collision with root package name */
        public final MediaFormat f32482b;

        /* renamed from: c  reason: collision with root package name */
        public final m1 f32483c;

        /* renamed from: d  reason: collision with root package name */
        public final Surface f32484d;

        /* renamed from: e  reason: collision with root package name */
        public final MediaCrypto f32485e;

        /* renamed from: f  reason: collision with root package name */
        public final int f32486f;

        private a(n nVar, MediaFormat mediaFormat, m1 m1Var, Surface surface, MediaCrypto mediaCrypto, int i10) {
            this.f32481a = nVar;
            this.f32482b = mediaFormat;
            this.f32483c = m1Var;
            this.f32484d = surface;
            this.f32485e = mediaCrypto;
            this.f32486f = i10;
        }

        public static a a(n nVar, MediaFormat mediaFormat, m1 m1Var, MediaCrypto mediaCrypto) {
            return new a(nVar, mediaFormat, m1Var, null, mediaCrypto, 0);
        }

        public static a b(n nVar, MediaFormat mediaFormat, m1 m1Var, Surface surface, MediaCrypto mediaCrypto) {
            return new a(nVar, mediaFormat, m1Var, surface, mediaCrypto, 0);
        }
    }

    /* compiled from: MediaCodecAdapter.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b {
        l a(a aVar) throws IOException;
    }

    /* compiled from: MediaCodecAdapter.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface c {
        void a(l lVar, long j10, long j11);
    }

    MediaFormat a();

    void b(int i10);

    ByteBuffer c(int i10);

    void d(Surface surface);

    void e(int i10, int i11, int i12, long j10, int i13);

    void f(c cVar, Handler handler);

    void flush();

    boolean g();

    void h(Bundle bundle);

    void i(int i10, long j10);

    int j();

    int k(MediaCodec.BufferInfo bufferInfo);

    void l(int i10, boolean z10);

    void m(int i10, int i11, q3.c cVar, long j10, int i12);

    ByteBuffer n(int i10);

    void release();
}
