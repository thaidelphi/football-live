package com.unity3d.ads.core.domain;

import android.content.Context;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.core.HttpClient;
import d9.o0;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import t8.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidHttpClientProvider.kt */
@f(c = "com.unity3d.ads.core.domain.AndroidHttpClientProvider$invoke$client$1", f = "AndroidHttpClientProvider.kt", l = {50}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class AndroidHttpClientProvider$invoke$client$1 extends l implements p<o0, m8.d<? super HttpClient>, Object> {
    int label;
    final /* synthetic */ AndroidHttpClientProvider this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidHttpClientProvider$invoke$client$1(AndroidHttpClientProvider androidHttpClientProvider, m8.d<? super AndroidHttpClientProvider$invoke$client$1> dVar) {
        super(2, dVar);
        this.this$0 = androidHttpClientProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final m8.d<w> create(Object obj, m8.d<?> dVar) {
        return new AndroidHttpClientProvider$invoke$client$1(this.this$0, dVar);
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, m8.d<? super HttpClient> dVar) {
        return ((AndroidHttpClientProvider$invoke$client$1) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        Context context;
        ISDKDispatchers iSDKDispatchers;
        c10 = n8.d.c();
        int i10 = this.label;
        if (i10 == 0) {
            i8.p.b(obj);
            AndroidHttpClientProvider androidHttpClientProvider = this.this$0;
            context = androidHttpClientProvider.context;
            iSDKDispatchers = this.this$0.dispatchers;
            this.label = 1;
            obj = androidHttpClientProvider.buildNetworkClient(context, iSDKDispatchers, this);
            if (obj == c10) {
                return c10;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            i8.p.b(obj);
        }
        return obj;
    }
}
