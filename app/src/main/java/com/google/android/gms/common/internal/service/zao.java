package com.google.android.gms.common.internal.service;

import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.common.internal.TelemetryLoggingOptions;
import com.google.android.gms.internal.base.zad;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zao extends GoogleApi<TelemetryLoggingOptions> implements TelemetryLoggingClient {

    /* renamed from: a  reason: collision with root package name */
    private static final Api.ClientKey<zap> f12571a;

    /* renamed from: b  reason: collision with root package name */
    private static final Api.AbstractClientBuilder<zap, TelemetryLoggingOptions> f12572b;

    /* renamed from: c  reason: collision with root package name */
    private static final Api<TelemetryLoggingOptions> f12573c;

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f12574d = 0;

    static {
        Api.ClientKey<zap> clientKey = new Api.ClientKey<>();
        f12571a = clientKey;
        b bVar = new b();
        f12572b = bVar;
        f12573c = new Api<>("ClientTelemetry.API", bVar, clientKey);
    }

    public zao(Context context, TelemetryLoggingOptions telemetryLoggingOptions) {
        super(context, f12573c, telemetryLoggingOptions, GoogleApi.Settings.f12053c);
    }

    @Override // com.google.android.gms.common.internal.TelemetryLoggingClient
    public final Task<Void> a(final TelemetryData telemetryData) {
        TaskApiCall.Builder a10 = TaskApiCall.a();
        a10.d(zad.zaa);
        a10.c(false);
        a10.b(new RemoteCall() { // from class: com.google.android.gms.common.internal.service.zam
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                TelemetryData telemetryData2 = TelemetryData.this;
                int i10 = zao.f12574d;
                ((zai) ((zap) obj).getService()).Z(telemetryData2);
                ((TaskCompletionSource) obj2).setResult(null);
            }
        });
        return doBestEffortWrite(a10.a());
    }
}
