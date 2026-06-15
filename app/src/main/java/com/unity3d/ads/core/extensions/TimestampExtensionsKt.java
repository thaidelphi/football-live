package com.unity3d.ads.core.extensions;

import com.google.protobuf.Timestamp;
import kotlin.jvm.internal.n;
/* compiled from: TimestampExtensions.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class TimestampExtensionsKt {
    public static final long duration(long j10) {
        return System.nanoTime() - j10;
    }

    public static final Timestamp fromMillis(long j10) {
        long j11 = 1000;
        Timestamp build = Timestamp.newBuilder().setSeconds(j10 / j11).setNanos((int) ((j10 % j11) * 1000000)).build();
        n.e(build, "newBuilder().setSeconds(…000000).toInt())).build()");
        return build;
    }
}
