package x3;

import a5.p0;
import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: AsynchronousMediaCodecBufferEnqueuer.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class e {

    /* renamed from: g  reason: collision with root package name */
    private static final ArrayDeque<b> f32439g = new ArrayDeque<>();

    /* renamed from: h  reason: collision with root package name */
    private static final Object f32440h = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final MediaCodec f32441a;

    /* renamed from: b  reason: collision with root package name */
    private final HandlerThread f32442b;

    /* renamed from: c  reason: collision with root package name */
    private Handler f32443c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicReference<RuntimeException> f32444d;

    /* renamed from: e  reason: collision with root package name */
    private final a5.g f32445e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f32446f;

    /* compiled from: AsynchronousMediaCodecBufferEnqueuer.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            e.this.f(message);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AsynchronousMediaCodecBufferEnqueuer.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f32448a;

        /* renamed from: b  reason: collision with root package name */
        public int f32449b;

        /* renamed from: c  reason: collision with root package name */
        public int f32450c;

        /* renamed from: d  reason: collision with root package name */
        public final MediaCodec.CryptoInfo f32451d = new MediaCodec.CryptoInfo();

        /* renamed from: e  reason: collision with root package name */
        public long f32452e;

        /* renamed from: f  reason: collision with root package name */
        public int f32453f;

        b() {
        }

        public void a(int i10, int i11, int i12, long j10, int i13) {
            this.f32448a = i10;
            this.f32449b = i11;
            this.f32450c = i12;
            this.f32452e = j10;
            this.f32453f = i13;
        }
    }

    public e(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new a5.g());
    }

    private void b() throws InterruptedException {
        this.f32445e.c();
        ((Handler) a5.a.e(this.f32443c)).obtainMessage(2).sendToTarget();
        this.f32445e.a();
    }

    private static void c(q3.c cVar, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = cVar.f30071f;
        cryptoInfo.numBytesOfClearData = e(cVar.f30069d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = e(cVar.f30070e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) a5.a.e(d(cVar.f30067b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) a5.a.e(d(cVar.f30066a, cryptoInfo.iv));
        cryptoInfo.mode = cVar.f30068c;
        if (p0.f482a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(cVar.f30072g, cVar.f30073h));
        }
    }

    private static byte[] d(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 != null && bArr2.length >= bArr.length) {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    private static int[] e(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 != null && iArr2.length >= iArr.length) {
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            return iArr2;
        }
        return Arrays.copyOf(iArr, iArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Message message) {
        int i10 = message.what;
        b bVar = null;
        if (i10 == 0) {
            bVar = (b) message.obj;
            g(bVar.f32448a, bVar.f32449b, bVar.f32450c, bVar.f32452e, bVar.f32453f);
        } else if (i10 == 1) {
            bVar = (b) message.obj;
            h(bVar.f32448a, bVar.f32449b, bVar.f32451d, bVar.f32452e, bVar.f32453f);
        } else if (i10 != 2) {
            this.f32444d.compareAndSet(null, new IllegalStateException(String.valueOf(message.what)));
        } else {
            this.f32445e.e();
        }
        if (bVar != null) {
            o(bVar);
        }
    }

    private void g(int i10, int i11, int i12, long j10, int i13) {
        try {
            this.f32441a.queueInputBuffer(i10, i11, i12, j10, i13);
        } catch (RuntimeException e8) {
            this.f32444d.compareAndSet(null, e8);
        }
    }

    private void h(int i10, int i11, MediaCodec.CryptoInfo cryptoInfo, long j10, int i12) {
        try {
            synchronized (f32440h) {
                this.f32441a.queueSecureInputBuffer(i10, i11, cryptoInfo, j10, i12);
            }
        } catch (RuntimeException e8) {
            this.f32444d.compareAndSet(null, e8);
        }
    }

    private void j() throws InterruptedException {
        ((Handler) a5.a.e(this.f32443c)).removeCallbacksAndMessages(null);
        b();
    }

    private static b k() {
        ArrayDeque<b> arrayDeque = f32439g;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new b();
            }
            return arrayDeque.removeFirst();
        }
    }

    private void l() {
        RuntimeException andSet = this.f32444d.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }

    private static void o(b bVar) {
        ArrayDeque<b> arrayDeque = f32439g;
        synchronized (arrayDeque) {
            arrayDeque.add(bVar);
        }
    }

    public void i() {
        if (this.f32446f) {
            try {
                j();
            } catch (InterruptedException e8) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e8);
            }
        }
    }

    public void m(int i10, int i11, int i12, long j10, int i13) {
        l();
        b k10 = k();
        k10.a(i10, i11, i12, j10, i13);
        ((Handler) p0.j(this.f32443c)).obtainMessage(0, k10).sendToTarget();
    }

    public void n(int i10, int i11, q3.c cVar, long j10, int i12) {
        l();
        b k10 = k();
        k10.a(i10, i11, 0, j10, i12);
        c(cVar, k10.f32451d);
        ((Handler) p0.j(this.f32443c)).obtainMessage(1, k10).sendToTarget();
    }

    public void p() {
        if (this.f32446f) {
            i();
            this.f32442b.quit();
        }
        this.f32446f = false;
    }

    public void q() {
        if (this.f32446f) {
            return;
        }
        this.f32442b.start();
        this.f32443c = new a(this.f32442b.getLooper());
        this.f32446f = true;
    }

    public void r() throws InterruptedException {
        b();
    }

    e(MediaCodec mediaCodec, HandlerThread handlerThread, a5.g gVar) {
        this.f32441a = mediaCodec;
        this.f32442b = handlerThread;
        this.f32445e = gVar;
        this.f32444d = new AtomicReference<>();
    }
}
