package com.facebook.ads.redexgen.X;

import android.media.AudioDeviceInfo;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.nio.ByteBuffer;
/* renamed from: com.facebook.ads.redexgen.X.Rz  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public interface InterfaceC1096Rz {
    void A4z(ZM zm, int i10, int[] iArr) throws C1089Rs;

    void A5p();

    void A6C();

    void A6J();

    long A7V(boolean z10);

    C1264Yv A8c();

    boolean A9U(ByteBuffer byteBuffer, long j10, int i10) throws C1090Rt, C1095Ry;

    void A9X();

    boolean A9e();

    boolean AAE();

    void AG8();

    void AGA() throws C1095Ry;

    void AIM(C1280Zm c1280Zm);

    void AIN(int i10);

    void AIO(NY ny);

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "Enable Retry Audio Track")
    void AIW(boolean z10);

    void AIb(InterfaceC1092Rv interfaceC1092Rv);

    void AIj(C1264Yv c1264Yv);

    void AIm(RK rk);

    void AIo(AudioDeviceInfo audioDeviceInfo);

    void AIu(boolean z10);

    boolean AJS(ZM zm);

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Old API that can be removed when we move to MediaCodecRenderer2")
    boolean AJU(int i10, int i11);

    void flush();

    void pause();

    void setVolume(float f10);
}
