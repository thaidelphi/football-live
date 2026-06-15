package com.unity3d.services.core.request.metrics;

import com.unity3d.services.core.log.DeviceLog;
import d9.k0;
import java.util.List;
import m8.a;
import m8.g;
/* compiled from: CoroutineExceptionHandler.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class MetricSender$sendMetrics$$inlined$CoroutineExceptionHandler$1 extends a implements k0 {
    final /* synthetic */ List $metrics$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricSender$sendMetrics$$inlined$CoroutineExceptionHandler$1(k0.b bVar, List list) {
        super(bVar);
        this.$metrics$inlined = list;
    }

    @Override // d9.k0
    public void handleException(g gVar, Throwable th) {
        DeviceLog.debug("Metric " + this.$metrics$inlined + " failed to send with error: " + th);
    }
}
