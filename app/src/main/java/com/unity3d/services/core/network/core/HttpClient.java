package com.unity3d.services.core.network.core;

import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import m8.d;
/* compiled from: HttpClient.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public interface HttpClient {
    Object execute(HttpRequest httpRequest, d<? super HttpResponse> dVar);

    HttpResponse executeBlocking(HttpRequest httpRequest) throws Exception;
}
