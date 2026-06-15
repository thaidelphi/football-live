package com.facebook.ads.redexgen.X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public interface RV {
    public static final ByteBuffer A00 = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    RT A4x(RT rt) throws RU;

    ByteBuffer A8T();

    boolean AAA();

    boolean AAE();

    void AGO();

    void AGP(ByteBuffer byteBuffer);

    void flush();
}
