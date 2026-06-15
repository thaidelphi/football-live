package com.unity3d.ads.core.data.datasource;

import b0.f;
import com.google.protobuf.ByteString;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import g9.g;
import i8.w;
import kotlin.jvm.internal.n;
import m8.d;
/* compiled from: AndroidByteStringDataSource.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class AndroidByteStringDataSource implements ByteStringDataSource {
    private final f<ByteStringStoreOuterClass.ByteStringStore> dataStore;

    public AndroidByteStringDataSource(f<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        n.f(dataStore, "dataStore");
        this.dataStore = dataStore;
    }

    @Override // com.unity3d.ads.core.data.datasource.ByteStringDataSource
    public Object get(d<? super ByteStringStoreOuterClass.ByteStringStore> dVar) {
        return g.r(g.f(this.dataStore.getData(), new AndroidByteStringDataSource$get$2(null)), dVar);
    }

    @Override // com.unity3d.ads.core.data.datasource.ByteStringDataSource
    public Object set(ByteString byteString, d<? super w> dVar) {
        Object c10;
        Object a10 = this.dataStore.a(new AndroidByteStringDataSource$set$2(byteString, null), dVar);
        c10 = n8.d.c();
        return a10 == c10 ? a10 : w.f26638a;
    }
}
