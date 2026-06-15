package com.unity3d.ads.core.data.datasource;

import b0.f;
import com.unity3d.ads.datastore.WebviewConfigurationStore;
import g9.g;
import i8.w;
import kotlin.jvm.internal.n;
import m8.d;
/* compiled from: WebviewConfigurationDataSource.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class WebviewConfigurationDataSource {
    private final f<WebviewConfigurationStore.WebViewConfigurationStore> webviewConfigurationStore;

    public WebviewConfigurationDataSource(f<WebviewConfigurationStore.WebViewConfigurationStore> webviewConfigurationStore) {
        n.f(webviewConfigurationStore, "webviewConfigurationStore");
        this.webviewConfigurationStore = webviewConfigurationStore;
    }

    public final Object get(d<? super WebviewConfigurationStore.WebViewConfigurationStore> dVar) {
        return g.r(g.f(this.webviewConfigurationStore.getData(), new WebviewConfigurationDataSource$get$2(null)), dVar);
    }

    public final Object set(WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore, d<? super w> dVar) {
        Object c10;
        Object a10 = this.webviewConfigurationStore.a(new WebviewConfigurationDataSource$set$2(webViewConfigurationStore, null), dVar);
        c10 = n8.d.c();
        return a10 == c10 ? a10 : w.f26638a;
    }
}
