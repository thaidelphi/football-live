package com.unity3d.ads.core.data.datasource;

import b0.f;
import com.google.protobuf.ByteString;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import g9.g;
import i8.w;
import kotlin.jvm.internal.n;
import m8.d;
/* compiled from: UniversalRequestDataSource.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class UniversalRequestDataSource {
    private final f<UniversalRequestStoreOuterClass.UniversalRequestStore> universalRequestStore;

    public UniversalRequestDataSource(f<UniversalRequestStoreOuterClass.UniversalRequestStore> universalRequestStore) {
        n.f(universalRequestStore, "universalRequestStore");
        this.universalRequestStore = universalRequestStore;
    }

    public final Object get(d<? super UniversalRequestStoreOuterClass.UniversalRequestStore> dVar) {
        return g.r(g.f(this.universalRequestStore.getData(), new UniversalRequestDataSource$get$2(null)), dVar);
    }

    public final Object remove(String str, d<? super w> dVar) {
        Object c10;
        Object a10 = this.universalRequestStore.a(new UniversalRequestDataSource$remove$2(str, null), dVar);
        c10 = n8.d.c();
        return a10 == c10 ? a10 : w.f26638a;
    }

    public final Object set(String str, ByteString byteString, d<? super w> dVar) {
        Object c10;
        Object a10 = this.universalRequestStore.a(new UniversalRequestDataSource$set$2(str, byteString, null), dVar);
        c10 = n8.d.c();
        return a10 == c10 ? a10 : w.f26638a;
    }
}
