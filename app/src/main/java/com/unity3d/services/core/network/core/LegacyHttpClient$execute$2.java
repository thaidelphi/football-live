package com.unity3d.services.core.network.core;

import com.unity3d.services.core.network.mapper.HttpRequestToWebRequestKt;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.request.WebRequest;
import d9.o0;
import i8.w;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.n;
import m8.d;
import t8.p;
/* compiled from: LegacyHttpClient.kt */
@f(c = "com.unity3d.services.core.network.core.LegacyHttpClient$execute$2", f = "LegacyHttpClient.kt", l = {}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class LegacyHttpClient$execute$2 extends l implements p<o0, d<? super HttpResponse>, Object> {
    final /* synthetic */ HttpRequest $request;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyHttpClient$execute$2(HttpRequest httpRequest, d<? super LegacyHttpClient$execute$2> dVar) {
        super(2, dVar);
        this.$request = httpRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        return new LegacyHttpClient$execute$2(this.$request, dVar);
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, d<? super HttpResponse> dVar) {
        return ((LegacyHttpClient$execute$2) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        n8.d.c();
        if (this.label == 0) {
            i8.p.b(obj);
            WebRequest webRequest = HttpRequestToWebRequestKt.toWebRequest(this.$request);
            String makeRequest = webRequest.makeRequest();
            int responseCode = webRequest.getResponseCode();
            Map<String, List<String>> headers = webRequest.getHeaders();
            String url = webRequest.getUrl().toString();
            if (makeRequest == null) {
                makeRequest = "";
            }
            n.e(headers, "headers");
            n.e(url, "toString()");
            return new HttpResponse(makeRequest, responseCode, headers, url, null, "legacy", 0L, 80, null);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
