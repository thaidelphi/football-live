package x3;

import a5.m0;
import a5.p0;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import x3.l;
/* compiled from: SynchronousMediaCodecAdapter.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class x implements l {

    /* renamed from: a  reason: collision with root package name */
    private final MediaCodec f32551a;

    /* renamed from: b  reason: collision with root package name */
    private ByteBuffer[] f32552b;

    /* renamed from: c  reason: collision with root package name */
    private ByteBuffer[] f32553c;

    /* compiled from: SynchronousMediaCodecAdapter.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b implements l.b {
        @Override // x3.l.b
        public l a(l.a aVar) throws IOException {
            MediaCodec b10;
            MediaCodec mediaCodec = null;
            try {
                b10 = b(aVar);
            } catch (IOException e8) {
                e = e8;
            } catch (RuntimeException e10) {
                e = e10;
            }
            try {
                m0.a("configureCodec");
                b10.configure(aVar.f32482b, aVar.f32484d, aVar.f32485e, aVar.f32486f);
                m0.c();
                m0.a("startCodec");
                b10.start();
                m0.c();
                return new x(b10);
            } catch (IOException | RuntimeException e11) {
                e = e11;
                mediaCodec = b10;
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e;
            }
        }

        protected MediaCodec b(l.a aVar) throws IOException {
            a5.a.e(aVar.f32481a);
            String str = aVar.f32481a.f32489a;
            m0.a("createCodec:" + str);
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            m0.c();
            return createByCodecName;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(l.c cVar, MediaCodec mediaCodec, long j10, long j11) {
        cVar.a(this, j10, j11);
    }

    @Override // x3.l
    public MediaFormat a() {
        return this.f32551a.getOutputFormat();
    }

    @Override // x3.l
    public void b(int i10) {
        this.f32551a.setVideoScalingMode(i10);
    }

    @Override // x3.l
    public ByteBuffer c(int i10) {
        if (p0.f482a >= 21) {
            return this.f32551a.getInputBuffer(i10);
        }
        return ((ByteBuffer[]) p0.j(this.f32552b))[i10];
    }

    @Override // x3.l
    public void d(Surface surface) {
        this.f32551a.setOutputSurface(surface);
    }

    @Override // x3.l
    public void e(int i10, int i11, int i12, long j10, int i13) {
        this.f32551a.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    @Override // x3.l
    public void f(final l.c cVar, Handler handler) {
        this.f32551a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: x3.w
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
                x.this.p(cVar, mediaCodec, j10, j11);
            }
        }, handler);
    }

    @Override // x3.l
    public void flush() {
        this.f32551a.flush();
    }

    @Override // x3.l
    public boolean g() {
        return false;
    }

    @Override // x3.l
    public void h(Bundle bundle) {
        this.f32551a.setParameters(bundle);
    }

    @Override // x3.l
    public void i(int i10, long j10) {
        this.f32551a.releaseOutputBuffer(i10, j10);
    }

    @Override // x3.l
    public int j() {
        return this.f32551a.dequeueInputBuffer(0L);
    }

    @Override // x3.l
    public int k(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f32551a.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && p0.f482a < 21) {
                this.f32553c = this.f32551a.getOutputBuffers();
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // x3.l
    public void l(int i10, boolean z10) {
        this.f32551a.releaseOutputBuffer(i10, z10);
    }

    @Override // x3.l
    public void m(int i10, int i11, q3.c cVar, long j10, int i12) {
        this.f32551a.queueSecureInputBuffer(i10, i11, cVar.a(), j10, i12);
    }

    @Override // x3.l
    public ByteBuffer n(int i10) {
        if (p0.f482a >= 21) {
            return this.f32551a.getOutputBuffer(i10);
        }
        return ((ByteBuffer[]) p0.j(this.f32553c))[i10];
    }

    @Override // x3.l
    public void release() {
        this.f32552b = null;
        this.f32553c = null;
        this.f32551a.release();
    }

    private x(MediaCodec mediaCodec) {
        this.f32551a = mediaCodec;
        if (p0.f482a < 21) {
            this.f32552b = mediaCodec.getInputBuffers();
            this.f32553c = mediaCodec.getOutputBuffers();
        }
    }
}
