package com.unity3d.services.core.network.core;

import b9.c;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.data.model.exception.NetworkTimeoutException;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.services.core.network.core.OkHttp3Client;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import d9.o0;
import i8.w;
import java.io.File;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.n;
import m8.d;
import n9.a0;
import r8.k;
import t8.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OkHttp3Client.kt */
@f(c = "com.unity3d.services.core.network.core.OkHttp3Client$execute$2", f = "OkHttp3Client.kt", l = {74}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class OkHttp3Client$execute$2 extends l implements p<o0, d<? super HttpResponse>, Object> {
    final /* synthetic */ HttpRequest $request;
    int label;
    final /* synthetic */ OkHttp3Client this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkHttp3Client$execute$2(OkHttp3Client okHttp3Client, HttpRequest httpRequest, d<? super OkHttp3Client$execute$2> dVar) {
        super(2, dVar);
        this.this$0 = okHttp3Client;
        this.$request = httpRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        return new OkHttp3Client$execute$2(this.this$0, this.$request, dVar);
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, d<? super HttpResponse> dVar) {
        return ((OkHttp3Client$execute$2) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        Object makeRequest;
        AlternativeFlowReader alternativeFlowReader;
        c10 = n8.d.c();
        int i10 = this.label;
        try {
            if (i10 == 0) {
                i8.p.b(obj);
                OkHttp3Client okHttp3Client = this.this$0;
                HttpRequest httpRequest = this.$request;
                this.label = 1;
                makeRequest = okHttp3Client.makeRequest(httpRequest, httpRequest.getConnectTimeout(), this.$request.getReadTimeout(), this.$request.getWriteTimeout(), this);
                if (makeRequest == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                i8.p.b(obj);
                makeRequest = obj;
            }
            OkHttp3Client.RequestComplete requestComplete = (OkHttp3Client.RequestComplete) makeRequest;
            a0 component1 = requestComplete.component1();
            String component2 = requestComplete.component2();
            alternativeFlowReader = this.this$0.isAlternativeFlowReader;
            if (!alternativeFlowReader.invoke()) {
                if (component2 instanceof File) {
                    component2 = k.g((File) component2, null, 1, null);
                } else {
                    component2 = component2 instanceof byte[] ? new String((byte[]) component2, c.f5283b) : "";
                }
            }
            int j10 = component1.j();
            Map<String, List<String>> h10 = component1.z().h();
            String sVar = component1.R().i().toString();
            String str = component2 == null ? "" : component2;
            String wVar = component1.L().toString();
            n.e(h10, "toMultimap()");
            n.e(sVar, "toString()");
            n.e(wVar, "toString()");
            return new HttpResponse(str, j10, h10, sVar, wVar, OkHttp3Client.NETWORK_CLIENT_OKHTTP, 0L, 64, null);
        } catch (SocketTimeoutException unused) {
            throw new NetworkTimeoutException(OkHttp3Client.MSG_CONNECTION_TIMEOUT, null, null, this.$request.getBaseURL(), null, null, OkHttp3Client.NETWORK_CLIENT_OKHTTP, 54, null);
        } catch (IOException unused2) {
            throw new UnityAdsNetworkException(OkHttp3Client.MSG_CONNECTION_FAILED, null, null, this.$request.getBaseURL(), null, null, OkHttp3Client.NETWORK_CLIENT_OKHTTP, 54, null);
        }
    }
}
