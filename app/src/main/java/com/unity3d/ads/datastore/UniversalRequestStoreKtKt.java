package com.unity3d.ads.datastore;

import com.unity3d.ads.datastore.UniversalRequestStoreKt;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import i8.w;
import kotlin.jvm.internal.n;
import t8.l;
/* compiled from: UniversalRequestStoreKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class UniversalRequestStoreKtKt {
    /* renamed from: -initializeuniversalRequestStore  reason: not valid java name */
    public static final UniversalRequestStoreOuterClass.UniversalRequestStore m51initializeuniversalRequestStore(l<? super UniversalRequestStoreKt.Dsl, w> block) {
        n.f(block, "block");
        UniversalRequestStoreKt.Dsl.Companion companion = UniversalRequestStoreKt.Dsl.Companion;
        UniversalRequestStoreOuterClass.UniversalRequestStore.Builder newBuilder = UniversalRequestStoreOuterClass.UniversalRequestStore.newBuilder();
        n.e(newBuilder, "newBuilder()");
        UniversalRequestStoreKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final UniversalRequestStoreOuterClass.UniversalRequestStore copy(UniversalRequestStoreOuterClass.UniversalRequestStore universalRequestStore, l<? super UniversalRequestStoreKt.Dsl, w> block) {
        n.f(universalRequestStore, "<this>");
        n.f(block, "block");
        UniversalRequestStoreKt.Dsl.Companion companion = UniversalRequestStoreKt.Dsl.Companion;
        UniversalRequestStoreOuterClass.UniversalRequestStore.Builder builder = universalRequestStore.toBuilder();
        n.e(builder, "this.toBuilder()");
        UniversalRequestStoreKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
