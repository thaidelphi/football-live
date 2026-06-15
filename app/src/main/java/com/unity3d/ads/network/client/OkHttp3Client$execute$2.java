package com.unity3d.ads.network.client;

import com.unity3d.ads.network.mapper.HttpRequestToOkHttpRequestKt;
import com.unity3d.ads.network.model.HttpRequest;
import com.unity3d.ads.network.model.HttpResponse;
import d9.o0;
import i8.w;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.n;
import m8.d;
import n9.a0;
import n9.b0;
import n9.y;
import t8.p;
/* compiled from: OkHttp3Client.kt */
@f(c = "com.unity3d.ads.network.client.OkHttp3Client$execute$2", f = "OkHttp3Client.kt", l = {35}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class OkHttp3Client$execute$2 extends l implements p<o0, d<? super HttpResponse>, Object> {
    final /* synthetic */ HttpRequest $request;
    int label;
    final /* synthetic */ OkHttp3Client this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkHttp3Client$execute$2(HttpRequest httpRequest, OkHttp3Client okHttp3Client, d<? super OkHttp3Client$execute$2> dVar) {
        super(2, dVar);
        this.$request = httpRequest;
        this.this$0 = okHttp3Client;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        return new OkHttp3Client$execute$2(this.$request, this.this$0, dVar);
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, d<? super HttpResponse> dVar) {
        return ((OkHttp3Client$execute$2) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        c10 = n8.d.c();
        int i10 = this.label;
        if (i10 == 0) {
            i8.p.b(obj);
            y okHttpRequest = HttpRequestToOkHttpRequestKt.toOkHttpRequest(this.$request);
            this.label = 1;
            obj = this.this$0.makeRequest(okHttpRequest, this.$request.getConnectTimeout(), this.$request.getReadTimeout(), this);
            if (obj == c10) {
                return c10;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            i8.p.b(obj);
        }
        a0 a0Var = (a0) obj;
        int j10 = a0Var.j();
        Map<String, List<String>> h10 = a0Var.z().h();
        String sVar = a0Var.R().i().toString();
        b0 a10 = a0Var.a();
        String w10 = a10 != null ? a10.w() : null;
        if (w10 == null) {
            w10 = "";
        }
        n.e(h10, "toMultimap()");
        n.e(sVar, "toString()");
        return new HttpResponse(w10, j10, h10, sVar);
    }
}
