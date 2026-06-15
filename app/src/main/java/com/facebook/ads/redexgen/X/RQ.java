package com.facebook.ads.redexgen.X;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.util.Pair;
import android.view.Surface;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.nio.ByteBuffer;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class RQ implements InterfaceC1268Yz {
    public ByteBuffer[] A00;
    public ByteBuffer[] A01;
    public final MediaCodec A02;

    @MetaExoPlayerCustomization("This constructor is private in Exo r2.18.6 and builder pattern should be used.This can be fixed after MediaCodecPool.Java dependency is removed.Because the Factory calls start before allocating the adapter it can call getInputBuffers here. Butdo not do it while the constructor is public because start hasn't been called yet.See S358180")
    public RQ(MediaCodec mediaCodec) {
        this.A02 = mediaCodec;
    }

    public final /* synthetic */ void A00(InterfaceC1267Yy interfaceC1267Yy, MediaCodec mediaCodec, long j10, long j11) {
        interfaceC1267Yy.ADE(this, j10, j11);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1268Yz
    @MetaExoPlayerCustomization("Override is customization due to dependency on MediaCodec[Audio/Video]Renderer")
    public final void A4y(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10, Object obj) {
        this.A02.configure(mediaFormat, surface, mediaCrypto, i10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1268Yz
    public final int A5i() {
        return this.A02.dequeueInputBuffer(0L);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1268Yz
    public final int A5k(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.A02.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && AbstractC1672gE.A02 < 21) {
                this.A01 = this.A02.getOutputBuffers();
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1268Yz
    public final ByteBuffer A89(int i10) {
        if (AbstractC1672gE.A02 >= 21) {
            return this.A02.getInputBuffer(i10);
        }
        return ((ByteBuffer[]) AbstractC1672gE.A0f(this.A00))[i10];
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1268Yz
    public final ByteBuffer A8U(int i10) {
        if (AbstractC1672gE.A02 >= 21) {
            return this.A02.getOutputBuffer(i10);
        }
        return ((ByteBuffer[]) AbstractC1672gE.A0f(this.A01))[i10];
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1268Yz
    public final MediaFormat A8V() {
        return this.A02.getOutputFormat();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1268Yz
    @MetaExoPlayerCustomization("Added in D39791066")
    public final Pair<Long, Integer> A8Z() {
        return new Pair<>(0L, 0);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1268Yz
    @MetaExoPlayerCustomization("Added in D39791066")
    public final int A9A() {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1268Yz
    public final void AGQ(int i10, int i11, int i12, long j10, int i13) {
        this.A02.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1268Yz
    public final void AGS(int i10, int i11, C1107Sk c1107Sk, long j10, int i12) {
        this.A02.queueSecureInputBuffer(i10, i11, c1107Sk.A00(), j10, i12);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1268Yz
    public final void AGj() {
        this.A00 = null;
        this.A01 = null;
        this.A02.release();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1268Yz
    public final void AGp(int i10, long j10) {
        this.A02.releaseOutputBuffer(i10, j10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1268Yz
    public final void AGq(int i10, boolean z10) {
        this.A02.releaseOutputBuffer(i10, z10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1268Yz
    public final void AIg(final InterfaceC1267Yy interfaceC1267Yy, Handler handler) {
        this.A02.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: com.facebook.ads.redexgen.X.Za
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
                RQ.this.A00(interfaceC1267Yy, mediaCodec, j10, j11);
            }
        }, handler);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1268Yz
    public final void AIh(Surface surface) {
        this.A02.setOutputSurface(surface);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1268Yz
    public final void AIy(int i10) {
        this.A02.setVideoScalingMode(i10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1268Yz
    public final void flush() {
        this.A02.flush();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1268Yz
    @MetaExoPlayerCustomization
    public final void reset() {
        this.A02.reset();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1268Yz
    @MetaExoPlayerCustomization("Could be revisited after upgrading MediaCodecRenderer")
    public final void start() {
        this.A02.start();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1268Yz
    @MetaExoPlayerCustomization
    public final void stop() {
        this.A02.stop();
    }
}
