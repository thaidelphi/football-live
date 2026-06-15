package com.unity3d.ads.core.data.datasource;

import com.unity3d.ads.datastore.WebviewConfigurationStore;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import m8.d;
import t8.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WebviewConfigurationDataSource.kt */
@f(c = "com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource$set$2", f = "WebviewConfigurationDataSource.kt", l = {}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class WebviewConfigurationDataSource$set$2 extends l implements p<WebviewConfigurationStore.WebViewConfigurationStore, d<? super WebviewConfigurationStore.WebViewConfigurationStore>, Object> {
    final /* synthetic */ WebviewConfigurationStore.WebViewConfigurationStore $data;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebviewConfigurationDataSource$set$2(WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore, d<? super WebviewConfigurationDataSource$set$2> dVar) {
        super(2, dVar);
        this.$data = webViewConfigurationStore;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        return new WebviewConfigurationDataSource$set$2(this.$data, dVar);
    }

    @Override // t8.p
    public final Object invoke(WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore, d<? super WebviewConfigurationStore.WebViewConfigurationStore> dVar) {
        return ((WebviewConfigurationDataSource$set$2) create(webViewConfigurationStore, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        n8.d.c();
        if (this.label == 0) {
            i8.p.b(obj);
            return this.$data;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
