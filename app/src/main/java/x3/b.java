package x3;

import a5.m0;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import x3.b;
import x3.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AsynchronousMediaCodecAdapter.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class b implements l {

    /* renamed from: a  reason: collision with root package name */
    private final MediaCodec f32428a;

    /* renamed from: b  reason: collision with root package name */
    private final g f32429b;

    /* renamed from: c  reason: collision with root package name */
    private final e f32430c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f32431d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f32432e;

    /* renamed from: f  reason: collision with root package name */
    private int f32433f;

    /* compiled from: AsynchronousMediaCodecAdapter.java */
    /* renamed from: x3.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class C0376b implements l.b {

        /* renamed from: a  reason: collision with root package name */
        private final x5.k<HandlerThread> f32434a;

        /* renamed from: b  reason: collision with root package name */
        private final x5.k<HandlerThread> f32435b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f32436c;

        public C0376b(final int i10, boolean z10) {
            this(new x5.k() { // from class: x3.c
                @Override // x5.k
                public final Object get() {
                    HandlerThread e8;
                    e8 = b.C0376b.e(i10);
                    return e8;
                }
            }, new x5.k() { // from class: x3.d
                @Override // x5.k
                public final Object get() {
                    HandlerThread f10;
                    f10 = b.C0376b.f(i10);
                    return f10;
                }
            }, z10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ HandlerThread e(int i10) {
            return new HandlerThread(b.s(i10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ HandlerThread f(int i10) {
            return new HandlerThread(b.t(i10));
        }

        @Override // x3.l.b
        /* renamed from: d */
        public b a(l.a aVar) throws IOException {
            MediaCodec mediaCodec;
            b bVar;
            String str = aVar.f32481a.f32489a;
            b bVar2 = null;
            try {
                m0.a("createCodec:" + str);
                mediaCodec = MediaCodec.createByCodecName(str);
                try {
                    bVar = new b(mediaCodec, this.f32434a.get(), this.f32435b.get(), this.f32436c);
                } catch (Exception e8) {
                    e = e8;
                }
            } catch (Exception e10) {
                e = e10;
                mediaCodec = null;
            }
            try {
                m0.c();
                bVar.v(aVar.f32482b, aVar.f32484d, aVar.f32485e, aVar.f32486f);
                return bVar;
            } catch (Exception e11) {
                e = e11;
                bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.release();
                } else if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e;
            }
        }

        C0376b(x5.k<HandlerThread> kVar, x5.k<HandlerThread> kVar2, boolean z10) {
            this.f32434a = kVar;
            this.f32435b = kVar2;
            this.f32436c = z10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String s(int i10) {
        return u(i10, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String t(int i10) {
        return u(i10, "ExoPlayer:MediaCodecQueueingThread:");
    }

    private static String u(int i10, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i10 == 1) {
            sb.append("Audio");
        } else if (i10 == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i10);
            sb.append(")");
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        this.f32429b.h(this.f32428a);
        m0.a("configureCodec");
        this.f32428a.configure(mediaFormat, surface, mediaCrypto, i10);
        m0.c();
        this.f32430c.q();
        m0.a("startCodec");
        this.f32428a.start();
        m0.c();
        this.f32433f = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(l.c cVar, MediaCodec mediaCodec, long j10, long j11) {
        cVar.a(this, j10, j11);
    }

    private void x() {
        if (this.f32431d) {
            try {
                this.f32430c.r();
            } catch (InterruptedException e8) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e8);
            }
        }
    }

    @Override // x3.l
    public MediaFormat a() {
        return this.f32429b.g();
    }

    @Override // x3.l
    public void b(int i10) {
        x();
        this.f32428a.setVideoScalingMode(i10);
    }

    @Override // x3.l
    public ByteBuffer c(int i10) {
        return this.f32428a.getInputBuffer(i10);
    }

    @Override // x3.l
    public void d(Surface surface) {
        x();
        this.f32428a.setOutputSurface(surface);
    }

    @Override // x3.l
    public void e(int i10, int i11, int i12, long j10, int i13) {
        this.f32430c.m(i10, i11, i12, j10, i13);
    }

    @Override // x3.l
    public void f(final l.c cVar, Handler handler) {
        x();
        this.f32428a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: x3.a
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
                b.this.w(cVar, mediaCodec, j10, j11);
            }
        }, handler);
    }

    @Override // x3.l
    public void flush() {
        this.f32430c.i();
        this.f32428a.flush();
        this.f32429b.e();
        this.f32428a.start();
    }

    @Override // x3.l
    public boolean g() {
        return false;
    }

    @Override // x3.l
    public void h(Bundle bundle) {
        x();
        this.f32428a.setParameters(bundle);
    }

    @Override // x3.l
    public void i(int i10, long j10) {
        this.f32428a.releaseOutputBuffer(i10, j10);
    }

    @Override // x3.l
    public int j() {
        return this.f32429b.c();
    }

    @Override // x3.l
    public int k(MediaCodec.BufferInfo bufferInfo) {
        return this.f32429b.d(bufferInfo);
    }

    @Override // x3.l
    public void l(int i10, boolean z10) {
        this.f32428a.releaseOutputBuffer(i10, z10);
    }

    @Override // x3.l
    public void m(int i10, int i11, q3.c cVar, long j10, int i12) {
        this.f32430c.n(i10, i11, cVar, j10, i12);
    }

    @Override // x3.l
    public ByteBuffer n(int i10) {
        return this.f32428a.getOutputBuffer(i10);
    }

    @Override // x3.l
    public void release() {
        try {
            if (this.f32433f == 1) {
                this.f32430c.p();
                this.f32429b.o();
            }
            this.f32433f = 2;
        } finally {
            if (!this.f32432e) {
                this.f32428a.release();
                this.f32432e = true;
            }
        }
    }

    private b(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z10) {
        this.f32428a = mediaCodec;
        this.f32429b = new g(handlerThread);
        this.f32430c = new e(mediaCodec, handlerThread2);
        this.f32431d = z10;
        this.f32433f = 0;
    }
}
