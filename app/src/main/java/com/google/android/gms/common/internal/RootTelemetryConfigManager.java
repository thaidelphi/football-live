package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class RootTelemetryConfigManager {

    /* renamed from: b  reason: collision with root package name */
    private static RootTelemetryConfigManager f12523b;

    /* renamed from: c  reason: collision with root package name */
    private static final RootTelemetryConfiguration f12524c = new RootTelemetryConfiguration(0, false, false, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    private RootTelemetryConfiguration f12525a;

    private RootTelemetryConfigManager() {
    }

    @KeepForSdk
    public static synchronized RootTelemetryConfigManager b() {
        RootTelemetryConfigManager rootTelemetryConfigManager;
        synchronized (RootTelemetryConfigManager.class) {
            if (f12523b == null) {
                f12523b = new RootTelemetryConfigManager();
            }
            rootTelemetryConfigManager = f12523b;
        }
        return rootTelemetryConfigManager;
    }

    @KeepForSdk
    public RootTelemetryConfiguration a() {
        return this.f12525a;
    }

    public final synchronized void c(RootTelemetryConfiguration rootTelemetryConfiguration) {
        if (rootTelemetryConfiguration == null) {
            this.f12525a = f12524c;
            return;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration2 = this.f12525a;
        if (rootTelemetryConfiguration2 == null || rootTelemetryConfiguration2.z0() < rootTelemetryConfiguration.z0()) {
            this.f12525a = rootTelemetryConfiguration;
        }
    }
}
