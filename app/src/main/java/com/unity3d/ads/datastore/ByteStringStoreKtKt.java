package com.unity3d.ads.datastore;

import com.unity3d.ads.datastore.ByteStringStoreKt;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import i8.w;
import kotlin.jvm.internal.n;
import t8.l;
/* compiled from: ByteStringStoreKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class ByteStringStoreKtKt {
    /* renamed from: -initializebyteStringStore  reason: not valid java name */
    public static final ByteStringStoreOuterClass.ByteStringStore m50initializebyteStringStore(l<? super ByteStringStoreKt.Dsl, w> block) {
        n.f(block, "block");
        ByteStringStoreKt.Dsl.Companion companion = ByteStringStoreKt.Dsl.Companion;
        ByteStringStoreOuterClass.ByteStringStore.Builder newBuilder = ByteStringStoreOuterClass.ByteStringStore.newBuilder();
        n.e(newBuilder, "newBuilder()");
        ByteStringStoreKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final ByteStringStoreOuterClass.ByteStringStore copy(ByteStringStoreOuterClass.ByteStringStore byteStringStore, l<? super ByteStringStoreKt.Dsl, w> block) {
        n.f(byteStringStore, "<this>");
        n.f(block, "block");
        ByteStringStoreKt.Dsl.Companion companion = ByteStringStoreKt.Dsl.Companion;
        ByteStringStoreOuterClass.ByteStringStore.Builder builder = byteStringStore.toBuilder();
        n.e(builder, "this.toBuilder()");
        ByteStringStoreKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
