package com.unity3d.services.core.network.core;

import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import d9.i;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
import m8.d;
/* compiled from: LegacyHttpClient.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class LegacyHttpClient implements HttpClient {
    public static final Companion Companion = new Companion(null);
    private static final String NETWORK_CLIENT_LEGACY = "legacy";
    private final ISDKDispatchers dispatchers;

    /* compiled from: LegacyHttpClient.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public LegacyHttpClient(ISDKDispatchers dispatchers) {
        n.f(dispatchers, "dispatchers");
        this.dispatchers = dispatchers;
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    public Object execute(HttpRequest httpRequest, d<? super HttpResponse> dVar) {
        return i.g(this.dispatchers.getIo(), new LegacyHttpClient$execute$2(httpRequest, null), dVar);
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    public HttpResponse executeBlocking(HttpRequest request) {
        n.f(request, "request");
        return (HttpResponse) i.e(this.dispatchers.getIo(), new LegacyHttpClient$executeBlocking$1(this, request, null));
    }
}
