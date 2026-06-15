package com.unity3d.ads.core.data.datasource;

import b0.a;
import com.unity3d.ads.datastore.WebviewConfigurationStore;
import i8.p;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.n;
import m8.d;
import t8.q;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WebviewConfigurationDataSource.kt */
@f(c = "com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource$get$2", f = "WebviewConfigurationDataSource.kt", l = {15}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class WebviewConfigurationDataSource$get$2 extends l implements q<g9.f<? super WebviewConfigurationStore.WebViewConfigurationStore>, Throwable, d<? super w>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public WebviewConfigurationDataSource$get$2(d<? super WebviewConfigurationDataSource$get$2> dVar) {
        super(3, dVar);
    }

    @Override // t8.q
    public final Object invoke(g9.f<? super WebviewConfigurationStore.WebViewConfigurationStore> fVar, Throwable th, d<? super w> dVar) {
        WebviewConfigurationDataSource$get$2 webviewConfigurationDataSource$get$2 = new WebviewConfigurationDataSource$get$2(dVar);
        webviewConfigurationDataSource$get$2.L$0 = fVar;
        webviewConfigurationDataSource$get$2.L$1 = th;
        return webviewConfigurationDataSource$get$2.invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        c10 = n8.d.c();
        int i10 = this.label;
        if (i10 == 0) {
            p.b(obj);
            g9.f fVar = (g9.f) this.L$0;
            Throwable th = (Throwable) this.L$1;
            if (th instanceof a) {
                WebviewConfigurationStore.WebViewConfigurationStore defaultInstance = WebviewConfigurationStore.WebViewConfigurationStore.getDefaultInstance();
                n.e(defaultInstance, "getDefaultInstance()");
                this.L$0 = null;
                this.label = 1;
                if (fVar.emit(defaultInstance, this) == c10) {
                    return c10;
                }
            } else {
                throw th;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            p.b(obj);
        }
        return w.f26638a;
    }
}
