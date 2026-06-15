package com.unity3d.ads.network.client;

import com.unity3d.ads.network.HttpClient;
import com.unity3d.ads.network.model.HttpRequest;
import com.unity3d.ads.network.model.HttpResponse;
import com.unity3d.services.core.domain.ISDKDispatchers;
import d9.i;
import d9.o;
import i8.o;
import i8.p;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.n;
import m8.d;
import n8.c;
import n9.a0;
import n9.e;
import n9.f;
import n9.v;
import n9.y;
/* compiled from: OkHttp3Client.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class OkHttp3Client implements HttpClient {
    private final v client;
    private final ISDKDispatchers dispatchers;

    public OkHttp3Client(ISDKDispatchers dispatchers, v client) {
        n.f(dispatchers, "dispatchers");
        n.f(client, "client");
        this.dispatchers = dispatchers;
        this.client = client;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object makeRequest(y yVar, long j10, long j11, d<? super a0> dVar) {
        d b10;
        Object c10;
        b10 = c.b(dVar);
        final o oVar = new o(b10, 1);
        oVar.C();
        v.b u10 = this.client.u();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        u10.c(j10, timeUnit).d(j11, timeUnit).a().c(yVar).a(new f() { // from class: com.unity3d.ads.network.client.OkHttp3Client$makeRequest$2$1
            @Override // n9.f
            public void onFailure(e call, IOException e8) {
                n.f(call, "call");
                n.f(e8, "e");
                d9.n<a0> nVar = oVar;
                o.a aVar = i8.o.f26626b;
                nVar.resumeWith(i8.o.b(p.a(e8)));
            }

            @Override // n9.f
            public void onResponse(e call, a0 response) {
                n.f(call, "call");
                n.f(response, "response");
                d9.n<a0> nVar = oVar;
                o.a aVar = i8.o.f26626b;
                nVar.resumeWith(i8.o.b(response));
            }
        });
        Object z10 = oVar.z();
        c10 = n8.d.c();
        if (z10 == c10) {
            h.c(dVar);
        }
        return z10;
    }

    @Override // com.unity3d.ads.network.HttpClient
    public Object execute(HttpRequest httpRequest, d<? super HttpResponse> dVar) {
        return i.g(this.dispatchers.getIo(), new OkHttp3Client$execute$2(httpRequest, this, null), dVar);
    }
}
