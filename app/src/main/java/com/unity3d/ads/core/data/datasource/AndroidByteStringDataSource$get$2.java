package com.unity3d.ads.core.data.datasource;

import b0.a;
import com.google.protobuf.ByteString;
import com.unity3d.ads.datastore.ByteStringStoreKt;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import i8.p;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.n;
import m8.d;
import t8.q;
/* compiled from: AndroidByteStringDataSource.kt */
@f(c = "com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource$get$2", f = "AndroidByteStringDataSource.kt", l = {18}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class AndroidByteStringDataSource$get$2 extends l implements q<g9.f<? super ByteStringStoreOuterClass.ByteStringStore>, Throwable, d<? super w>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AndroidByteStringDataSource$get$2(d<? super AndroidByteStringDataSource$get$2> dVar) {
        super(3, dVar);
    }

    @Override // t8.q
    public final Object invoke(g9.f<? super ByteStringStoreOuterClass.ByteStringStore> fVar, Throwable th, d<? super w> dVar) {
        AndroidByteStringDataSource$get$2 androidByteStringDataSource$get$2 = new AndroidByteStringDataSource$get$2(dVar);
        androidByteStringDataSource$get$2.L$0 = fVar;
        androidByteStringDataSource$get$2.L$1 = th;
        return androidByteStringDataSource$get$2.invokeSuspend(w.f26638a);
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
                ByteStringStoreKt.Dsl.Companion companion = ByteStringStoreKt.Dsl.Companion;
                ByteStringStoreOuterClass.ByteStringStore.Builder newBuilder = ByteStringStoreOuterClass.ByteStringStore.newBuilder();
                n.e(newBuilder, "newBuilder()");
                ByteStringStoreKt.Dsl _create = companion._create(newBuilder);
                ByteString EMPTY = ByteString.EMPTY;
                n.e(EMPTY, "EMPTY");
                _create.setData(EMPTY);
                ByteStringStoreOuterClass.ByteStringStore _build = _create._build();
                this.L$0 = null;
                this.label = 1;
                if (fVar.emit(_build, this) == c10) {
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
