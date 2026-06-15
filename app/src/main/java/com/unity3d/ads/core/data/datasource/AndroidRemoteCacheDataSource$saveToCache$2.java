package com.unity3d.ads.core.data.datasource;

import d9.o0;
import i8.w;
import java.io.File;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import m8.d;
import r8.k;
import r8.m;
import t8.p;
/* compiled from: AndroidRemoteCacheDataSource.kt */
@f(c = "com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource$saveToCache$2", f = "AndroidRemoteCacheDataSource.kt", l = {}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class AndroidRemoteCacheDataSource$saveToCache$2 extends l implements p<o0, d<? super Object>, Object> {
    final /* synthetic */ Object $body;
    final /* synthetic */ File $dest;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidRemoteCacheDataSource$saveToCache$2(Object obj, File file, d<? super AndroidRemoteCacheDataSource$saveToCache$2> dVar) {
        super(2, dVar);
        this.$body = obj;
        this.$dest = file;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        return new AndroidRemoteCacheDataSource$saveToCache$2(this.$body, this.$dest, dVar);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(o0 o0Var, d<Object> dVar) {
        return ((AndroidRemoteCacheDataSource$saveToCache$2) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // t8.p
    public /* bridge */ /* synthetic */ Object invoke(o0 o0Var, d<? super Object> dVar) {
        return invoke2(o0Var, (d<Object>) dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        n8.d.c();
        if (this.label == 0) {
            i8.p.b(obj);
            Object obj2 = this.$body;
            if (obj2 instanceof File) {
                m.l((File) obj2, this.$dest, true, 0, 4, null);
                return b.a(((File) this.$body).delete());
            } else if (obj2 instanceof byte[]) {
                this.$dest.createNewFile();
                k.h(this.$dest, (byte[]) this.$body);
                return w.f26638a;
            } else {
                throw new IllegalStateException("Unknown body type".toString());
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
