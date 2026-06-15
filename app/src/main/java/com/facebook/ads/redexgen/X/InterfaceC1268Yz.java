package com.facebook.ads.redexgen.X;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.util.Pair;
import android.view.Surface;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.nio.ByteBuffer;
/* renamed from: com.facebook.ads.redexgen.X.Yz  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public interface InterfaceC1268Yz {
    @MetaExoPlayerCustomization("No longer in upstream exo")
    void A4y(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10, Object obj);

    int A5i();

    int A5k(MediaCodec.BufferInfo bufferInfo);

    ByteBuffer A89(int i10);

    ByteBuffer A8U(int i10);

    MediaFormat A8V();

    @MetaExoPlayerCustomization("Added in D39791066")
    Pair<Long, Integer> A8Z();

    @MetaExoPlayerCustomization("Added in D39791066")
    int A9A();

    void AGQ(int i10, int i11, int i12, long j10, int i13);

    void AGS(int i10, int i11, C1107Sk c1107Sk, long j10, int i12);

    void AGj();

    void AGp(int i10, long j10);

    void AGq(int i10, boolean z10);

    void AIg(InterfaceC1267Yy interfaceC1267Yy, Handler handler);

    void AIh(Surface surface);

    void AIy(int i10);

    void flush();

    @MetaExoPlayerCustomization("No longer in upstream exo")
    @Deprecated
    void reset();

    @MetaExoPlayerCustomization("No longer in upstream exo")
    void start();

    @MetaExoPlayerCustomization("No longer in upstream exo")
    @Deprecated
    void stop();
}
