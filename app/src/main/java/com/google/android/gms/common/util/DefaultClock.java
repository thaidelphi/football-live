package com.google.android.gms.common.util;

import android.os.SystemClock;
import com.google.android.gms.common.annotation.KeepForSdk;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class DefaultClock implements Clock {

    /* renamed from: a  reason: collision with root package name */
    private static final DefaultClock f12732a = new DefaultClock();

    private DefaultClock() {
    }

    @KeepForSdk
    public static Clock d() {
        return f12732a;
    }

    @Override // com.google.android.gms.common.util.Clock
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override // com.google.android.gms.common.util.Clock
    public final long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.common.util.Clock
    public final long c() {
        return System.nanoTime();
    }
}
