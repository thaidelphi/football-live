package com.unity3d.ads.core.data.datasource;

import com.google.protobuf.ByteString;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import i8.w;
import m8.d;
/* compiled from: ByteStringDataSource.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public interface ByteStringDataSource {
    Object get(d<? super ByteStringStoreOuterClass.ByteStringStore> dVar);

    Object set(ByteString byteString, d<? super w> dVar);
}
