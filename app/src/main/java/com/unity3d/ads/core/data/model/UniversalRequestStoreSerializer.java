package com.unity3d.ads.core.data.model;

import b0.a;
import b0.k;
import com.google.protobuf.InvalidProtocolBufferException;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import i8.w;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.n;
import m8.d;
/* compiled from: UniversalRequestStoreSerializer.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class UniversalRequestStoreSerializer implements k<UniversalRequestStoreOuterClass.UniversalRequestStore> {
    private final UniversalRequestStoreOuterClass.UniversalRequestStore defaultValue;

    public UniversalRequestStoreSerializer() {
        UniversalRequestStoreOuterClass.UniversalRequestStore defaultInstance = UniversalRequestStoreOuterClass.UniversalRequestStore.getDefaultInstance();
        n.e(defaultInstance, "getDefaultInstance()");
        this.defaultValue = defaultInstance;
    }

    @Override // b0.k
    public Object readFrom(InputStream inputStream, d<? super UniversalRequestStoreOuterClass.UniversalRequestStore> dVar) {
        try {
            UniversalRequestStoreOuterClass.UniversalRequestStore parseFrom = UniversalRequestStoreOuterClass.UniversalRequestStore.parseFrom(inputStream);
            n.e(parseFrom, "parseFrom(input)");
            return parseFrom;
        } catch (InvalidProtocolBufferException e8) {
            throw new a("Cannot read proto.", e8);
        }
    }

    @Override // b0.k
    public /* bridge */ /* synthetic */ Object writeTo(UniversalRequestStoreOuterClass.UniversalRequestStore universalRequestStore, OutputStream outputStream, d dVar) {
        return writeTo2(universalRequestStore, outputStream, (d<? super w>) dVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // b0.k
    public UniversalRequestStoreOuterClass.UniversalRequestStore getDefaultValue() {
        return this.defaultValue;
    }

    /* renamed from: writeTo  reason: avoid collision after fix types in other method */
    public Object writeTo2(UniversalRequestStoreOuterClass.UniversalRequestStore universalRequestStore, OutputStream outputStream, d<? super w> dVar) {
        universalRequestStore.writeTo(outputStream);
        return w.f26638a;
    }
}
