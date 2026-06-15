package com.unity3d.services.core.network.core;

import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.network.model.HttpRequest;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import m8.d;
import t8.p;
/* compiled from: OkHttp3Client.kt */
@f(c = "com.unity3d.services.core.network.core.OkHttp3Client$makeRequest$2$1$onResponse$downloadProgressLoggingJob$3", f = "OkHttp3Client.kt", l = {}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class OkHttp3Client$makeRequest$2$1$onResponse$downloadProgressLoggingJob$3 extends l implements p<Integer, d<? super w>, Object> {
    final /* synthetic */ HttpRequest $request;
    /* synthetic */ int I$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkHttp3Client$makeRequest$2$1$onResponse$downloadProgressLoggingJob$3(HttpRequest httpRequest, d<? super OkHttp3Client$makeRequest$2$1$onResponse$downloadProgressLoggingJob$3> dVar) {
        super(2, dVar);
        this.$request = httpRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        OkHttp3Client$makeRequest$2$1$onResponse$downloadProgressLoggingJob$3 okHttp3Client$makeRequest$2$1$onResponse$downloadProgressLoggingJob$3 = new OkHttp3Client$makeRequest$2$1$onResponse$downloadProgressLoggingJob$3(this.$request, dVar);
        okHttp3Client$makeRequest$2$1$onResponse$downloadProgressLoggingJob$3.I$0 = ((Number) obj).intValue();
        return okHttp3Client$makeRequest$2$1$onResponse$downloadProgressLoggingJob$3;
    }

    public final Object invoke(int i10, d<? super w> dVar) {
        return ((OkHttp3Client$makeRequest$2$1$onResponse$downloadProgressLoggingJob$3) create(Integer.valueOf(i10), dVar)).invokeSuspend(w.f26638a);
    }

    @Override // t8.p
    public /* bridge */ /* synthetic */ Object invoke(Integer num, d<? super w> dVar) {
        return invoke(num.intValue(), dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        n8.d.c();
        if (this.label == 0) {
            i8.p.b(obj);
            int i10 = this.I$0;
            DeviceLog.debug("Downloaded " + i10 + "% of " + this.$request.getBaseURL());
            return w.f26638a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
