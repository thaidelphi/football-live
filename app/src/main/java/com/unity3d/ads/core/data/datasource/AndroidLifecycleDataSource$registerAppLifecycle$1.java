package com.unity3d.ads.core.data.datasource;

import androidx.lifecycle.a0;
import d9.o0;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import m8.d;
import t8.p;
/* compiled from: AndroidLifecycleDataSource.kt */
@f(c = "com.unity3d.ads.core.data.datasource.AndroidLifecycleDataSource$registerAppLifecycle$1", f = "AndroidLifecycleDataSource.kt", l = {}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class AndroidLifecycleDataSource$registerAppLifecycle$1 extends l implements p<o0, d<? super w>, Object> {
    int label;
    final /* synthetic */ AndroidLifecycleDataSource this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidLifecycleDataSource$registerAppLifecycle$1(AndroidLifecycleDataSource androidLifecycleDataSource, d<? super AndroidLifecycleDataSource$registerAppLifecycle$1> dVar) {
        super(2, dVar);
        this.this$0 = androidLifecycleDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        return new AndroidLifecycleDataSource$registerAppLifecycle$1(this.this$0, dVar);
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, d<? super w> dVar) {
        return ((AndroidLifecycleDataSource$registerAppLifecycle$1) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        n8.d.c();
        if (this.label == 0) {
            i8.p.b(obj);
            a0.f3588i.a().getLifecycle().a(this.this$0);
            return w.f26638a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
