package com.unity3d.ads.core.domain;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage;
import d9.o0;
import i8.o;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import t8.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidHttpClientProvider.kt */
@f(c = "com.unity3d.ads.core.domain.AndroidHttpClientProvider$invoke$config$1", f = "AndroidHttpClientProvider.kt", l = {57}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class AndroidHttpClientProvider$invoke$config$1 extends l implements p<o0, m8.d<? super Configuration>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidHttpClientProvider this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidHttpClientProvider$invoke$config$1(AndroidHttpClientProvider androidHttpClientProvider, m8.d<? super AndroidHttpClientProvider$invoke$config$1> dVar) {
        super(2, dVar);
        this.this$0 = androidHttpClientProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final m8.d<w> create(Object obj, m8.d<?> dVar) {
        AndroidHttpClientProvider$invoke$config$1 androidHttpClientProvider$invoke$config$1 = new AndroidHttpClientProvider$invoke$config$1(this.this$0, dVar);
        androidHttpClientProvider$invoke$config$1.L$0 = obj;
        return androidHttpClientProvider$invoke$config$1;
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, m8.d<? super Configuration> dVar) {
        return ((AndroidHttpClientProvider$invoke$config$1) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        Object b10;
        ConfigFileFromLocalStorage configFileFromLocalStorage;
        Object mo53invokegIAlus;
        c10 = n8.d.c();
        int i10 = this.label;
        try {
            if (i10 == 0) {
                i8.p.b(obj);
                o0 o0Var = (o0) this.L$0;
                AndroidHttpClientProvider androidHttpClientProvider = this.this$0;
                o.a aVar = o.f26626b;
                configFileFromLocalStorage = androidHttpClientProvider.configFileFromLocalStorage;
                ConfigFileFromLocalStorage.Params params = new ConfigFileFromLocalStorage.Params(null, 1, null);
                this.label = 1;
                mo53invokegIAlus = configFileFromLocalStorage.mo53invokegIAlus(params, this);
                if (mo53invokegIAlus == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                i8.p.b(obj);
                mo53invokegIAlus = ((o) obj).i();
            }
            b10 = o.b(o.a(mo53invokegIAlus));
        } catch (Throwable th) {
            o.a aVar2 = o.f26626b;
            b10 = o.b(i8.p.a(th));
        }
        if (o.f(b10)) {
            b10 = null;
        }
        o oVar = (o) b10;
        if (oVar != null) {
            Object i11 = oVar.i();
            return o.f(i11) ? null : i11;
        }
        return null;
    }
}
