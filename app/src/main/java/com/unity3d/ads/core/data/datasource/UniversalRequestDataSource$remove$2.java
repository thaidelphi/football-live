package com.unity3d.ads.core.data.datasource;

import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.n;
import m8.d;
import t8.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UniversalRequestDataSource.kt */
@f(c = "com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$remove$2", f = "UniversalRequestDataSource.kt", l = {}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class UniversalRequestDataSource$remove$2 extends l implements p<UniversalRequestStoreOuterClass.UniversalRequestStore, d<? super UniversalRequestStoreOuterClass.UniversalRequestStore>, Object> {
    final /* synthetic */ String $key;
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniversalRequestDataSource$remove$2(String str, d<? super UniversalRequestDataSource$remove$2> dVar) {
        super(2, dVar);
        this.$key = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        UniversalRequestDataSource$remove$2 universalRequestDataSource$remove$2 = new UniversalRequestDataSource$remove$2(this.$key, dVar);
        universalRequestDataSource$remove$2.L$0 = obj;
        return universalRequestDataSource$remove$2;
    }

    @Override // t8.p
    public final Object invoke(UniversalRequestStoreOuterClass.UniversalRequestStore universalRequestStore, d<? super UniversalRequestStoreOuterClass.UniversalRequestStore> dVar) {
        return ((UniversalRequestDataSource$remove$2) create(universalRequestStore, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        n8.d.c();
        if (this.label == 0) {
            i8.p.b(obj);
            UniversalRequestStoreOuterClass.UniversalRequestStore.Builder builder = ((UniversalRequestStoreOuterClass.UniversalRequestStore) this.L$0).toBuilder();
            builder.removeUniversalRequestMap(this.$key);
            UniversalRequestStoreOuterClass.UniversalRequestStore build = builder.build();
            n.e(build, "dataBuilder.build()");
            return build;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
