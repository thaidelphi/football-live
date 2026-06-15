package com.unity3d.ads.core.data.datasource;

import com.google.protobuf.ByteString;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.n;
import m8.d;
import t8.p;
/* compiled from: AndroidByteStringDataSource.kt */
@f(c = "com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource$set$2", f = "AndroidByteStringDataSource.kt", l = {}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class AndroidByteStringDataSource$set$2 extends l implements p<ByteStringStoreOuterClass.ByteStringStore, d<? super ByteStringStoreOuterClass.ByteStringStore>, Object> {
    final /* synthetic */ ByteString $data;
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidByteStringDataSource$set$2(ByteString byteString, d<? super AndroidByteStringDataSource$set$2> dVar) {
        super(2, dVar);
        this.$data = byteString;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        AndroidByteStringDataSource$set$2 androidByteStringDataSource$set$2 = new AndroidByteStringDataSource$set$2(this.$data, dVar);
        androidByteStringDataSource$set$2.L$0 = obj;
        return androidByteStringDataSource$set$2;
    }

    @Override // t8.p
    public final Object invoke(ByteStringStoreOuterClass.ByteStringStore byteStringStore, d<? super ByteStringStoreOuterClass.ByteStringStore> dVar) {
        return ((AndroidByteStringDataSource$set$2) create(byteStringStore, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        n8.d.c();
        if (this.label == 0) {
            i8.p.b(obj);
            ByteStringStoreOuterClass.ByteStringStore build = ((ByteStringStoreOuterClass.ByteStringStore) this.L$0).toBuilder().setData(this.$data).build();
            n.e(build, "currentData.toBuilder()\n…\n                .build()");
            return build;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
