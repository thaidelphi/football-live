package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class b0<T> implements OnCompleteListener<T> {

    /* renamed from: a  reason: collision with root package name */
    private final GoogleApiManager f12190a;

    /* renamed from: b  reason: collision with root package name */
    private final int f12191b;

    /* renamed from: c  reason: collision with root package name */
    private final ApiKey<?> f12192c;

    /* renamed from: d  reason: collision with root package name */
    private final long f12193d;

    /* renamed from: e  reason: collision with root package name */
    private final long f12194e;

    @VisibleForTesting
    b0(GoogleApiManager googleApiManager, int i10, ApiKey<?> apiKey, long j10, long j11, String str, String str2) {
        this.f12190a = googleApiManager;
        this.f12191b = i10;
        this.f12192c = apiKey;
        this.f12193d = j10;
        this.f12194e = j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> b0<T> a(GoogleApiManager googleApiManager, int i10, ApiKey<?> apiKey) {
        boolean z10;
        if (googleApiManager.f()) {
            RootTelemetryConfiguration a10 = RootTelemetryConfigManager.b().a();
            if (a10 == null) {
                z10 = true;
            } else if (!a10.o0()) {
                return null;
            } else {
                z10 = a10.y0();
                zabq w10 = googleApiManager.w(apiKey);
                if (w10 != null) {
                    if (!(w10.s() instanceof BaseGmsClient)) {
                        return null;
                    }
                    BaseGmsClient baseGmsClient = (BaseGmsClient) w10.s();
                    if (baseGmsClient.hasConnectionInfo() && !baseGmsClient.isConnecting()) {
                        ConnectionTelemetryConfiguration b10 = b(w10, baseGmsClient, i10);
                        if (b10 == null) {
                            return null;
                        }
                        w10.D();
                        z10 = b10.z0();
                    }
                }
            }
            return new b0<>(googleApiManager, i10, apiKey, z10 ? System.currentTimeMillis() : 0L, z10 ? SystemClock.elapsedRealtime() : 0L, null, null);
        }
        return null;
    }

    private static ConnectionTelemetryConfiguration b(zabq<?> zabqVar, BaseGmsClient<?> baseGmsClient, int i10) {
        int[] n02;
        int[] o02;
        ConnectionTelemetryConfiguration telemetryConfiguration = baseGmsClient.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.y0() || ((n02 = telemetryConfiguration.n0()) != null ? !ArrayUtils.b(n02, i10) : !((o02 = telemetryConfiguration.o0()) == null || !ArrayUtils.b(o02, i10))) || zabqVar.p() >= telemetryConfiguration.X()) {
            return null;
        }
        return telemetryConfiguration;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task<T> task) {
        zabq w10;
        int i10;
        int i11;
        int i12;
        int X;
        long j10;
        long j11;
        int i13;
        if (this.f12190a.f()) {
            RootTelemetryConfiguration a10 = RootTelemetryConfigManager.b().a();
            if ((a10 == null || a10.o0()) && (w10 = this.f12190a.w(this.f12192c)) != null && (w10.s() instanceof BaseGmsClient)) {
                BaseGmsClient baseGmsClient = (BaseGmsClient) w10.s();
                boolean z10 = true;
                int i14 = 0;
                boolean z11 = this.f12193d > 0;
                int gCoreServiceId = baseGmsClient.getGCoreServiceId();
                if (a10 != null) {
                    z11 &= a10.y0();
                    int X2 = a10.X();
                    int n02 = a10.n0();
                    i10 = a10.z0();
                    if (baseGmsClient.hasConnectionInfo() && !baseGmsClient.isConnecting()) {
                        ConnectionTelemetryConfiguration b10 = b(w10, baseGmsClient, this.f12191b);
                        if (b10 == null) {
                            return;
                        }
                        if (!b10.z0() || this.f12193d <= 0) {
                            z10 = false;
                        }
                        n02 = b10.X();
                        z11 = z10;
                    }
                    i12 = X2;
                    i11 = n02;
                } else {
                    i10 = 0;
                    i11 = 100;
                    i12 = 5000;
                }
                GoogleApiManager googleApiManager = this.f12190a;
                if (task.isSuccessful()) {
                    X = 0;
                } else {
                    if (task.isCanceled()) {
                        i14 = 100;
                    } else {
                        Exception exception = task.getException();
                        if (exception instanceof ApiException) {
                            Status a11 = ((ApiException) exception).a();
                            int n03 = a11.n0();
                            ConnectionResult X3 = a11.X();
                            X = X3 == null ? -1 : X3.X();
                            i14 = n03;
                        } else {
                            i14 = 101;
                        }
                    }
                    X = -1;
                }
                if (z11) {
                    long j12 = this.f12193d;
                    long currentTimeMillis = System.currentTimeMillis();
                    i13 = (int) (SystemClock.elapsedRealtime() - this.f12194e);
                    j10 = j12;
                    j11 = currentTimeMillis;
                } else {
                    j10 = 0;
                    j11 = 0;
                    i13 = -1;
                }
                googleApiManager.I(new MethodInvocation(this.f12191b, i14, X, j10, j11, null, null, gCoreServiceId, i13), i10, i12, i11);
            }
        }
    }
}
