package x3;

import a5.p0;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AsynchronousMediaCodecCallback.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class g extends MediaCodec.Callback {

    /* renamed from: b  reason: collision with root package name */
    private final HandlerThread f32456b;

    /* renamed from: c  reason: collision with root package name */
    private Handler f32457c;

    /* renamed from: h  reason: collision with root package name */
    private MediaFormat f32462h;

    /* renamed from: i  reason: collision with root package name */
    private MediaFormat f32463i;

    /* renamed from: j  reason: collision with root package name */
    private MediaCodec.CodecException f32464j;

    /* renamed from: k  reason: collision with root package name */
    private long f32465k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f32466l;

    /* renamed from: m  reason: collision with root package name */
    private IllegalStateException f32467m;

    /* renamed from: a  reason: collision with root package name */
    private final Object f32455a = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final k f32458d = new k();

    /* renamed from: e  reason: collision with root package name */
    private final k f32459e = new k();

    /* renamed from: f  reason: collision with root package name */
    private final ArrayDeque<MediaCodec.BufferInfo> f32460f = new ArrayDeque<>();

    /* renamed from: g  reason: collision with root package name */
    private final ArrayDeque<MediaFormat> f32461g = new ArrayDeque<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(HandlerThread handlerThread) {
        this.f32456b = handlerThread;
    }

    private void b(MediaFormat mediaFormat) {
        this.f32459e.a(-2);
        this.f32461g.add(mediaFormat);
    }

    private void f() {
        if (!this.f32461g.isEmpty()) {
            this.f32463i = this.f32461g.getLast();
        }
        this.f32458d.b();
        this.f32459e.b();
        this.f32460f.clear();
        this.f32461g.clear();
        this.f32464j = null;
    }

    private boolean i() {
        return this.f32465k > 0 || this.f32466l;
    }

    private void j() {
        k();
        l();
    }

    private void k() {
        IllegalStateException illegalStateException = this.f32467m;
        if (illegalStateException == null) {
            return;
        }
        this.f32467m = null;
        throw illegalStateException;
    }

    private void l() {
        MediaCodec.CodecException codecException = this.f32464j;
        if (codecException == null) {
            return;
        }
        this.f32464j = null;
        throw codecException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        synchronized (this.f32455a) {
            if (this.f32466l) {
                return;
            }
            long j10 = this.f32465k - 1;
            this.f32465k = j10;
            if (j10 > 0) {
                return;
            }
            if (j10 < 0) {
                n(new IllegalStateException());
            } else {
                f();
            }
        }
    }

    private void n(IllegalStateException illegalStateException) {
        synchronized (this.f32455a) {
            this.f32467m = illegalStateException;
        }
    }

    public int c() {
        synchronized (this.f32455a) {
            int i10 = -1;
            if (i()) {
                return -1;
            }
            j();
            if (!this.f32458d.d()) {
                i10 = this.f32458d.e();
            }
            return i10;
        }
    }

    public int d(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f32455a) {
            if (i()) {
                return -1;
            }
            j();
            if (this.f32459e.d()) {
                return -1;
            }
            int e8 = this.f32459e.e();
            if (e8 >= 0) {
                a5.a.h(this.f32462h);
                MediaCodec.BufferInfo remove = this.f32460f.remove();
                bufferInfo.set(remove.offset, remove.size, remove.presentationTimeUs, remove.flags);
            } else if (e8 == -2) {
                this.f32462h = this.f32461g.remove();
            }
            return e8;
        }
    }

    public void e() {
        synchronized (this.f32455a) {
            this.f32465k++;
            ((Handler) p0.j(this.f32457c)).post(new Runnable() { // from class: x3.f
                @Override // java.lang.Runnable
                public final void run() {
                    g.this.m();
                }
            });
        }
    }

    public MediaFormat g() {
        MediaFormat mediaFormat;
        synchronized (this.f32455a) {
            mediaFormat = this.f32462h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    public void h(MediaCodec mediaCodec) {
        a5.a.f(this.f32457c == null);
        this.f32456b.start();
        Handler handler = new Handler(this.f32456b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f32457c = handler;
    }

    public void o() {
        synchronized (this.f32455a) {
            this.f32466l = true;
            this.f32456b.quit();
            f();
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f32455a) {
            this.f32464j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.f32455a) {
            this.f32458d.a(i10);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f32455a) {
            MediaFormat mediaFormat = this.f32463i;
            if (mediaFormat != null) {
                b(mediaFormat);
                this.f32463i = null;
            }
            this.f32459e.a(i10);
            this.f32460f.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f32455a) {
            b(mediaFormat);
            this.f32463i = null;
        }
    }
}
