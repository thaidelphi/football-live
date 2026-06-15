package com.unity3d.ads.core.data.model;

import b0.a;
import b0.k;
import com.google.protobuf.InvalidProtocolBufferException;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import i8.w;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.n;
import m8.d;
/* compiled from: ByteStringSerializer.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class ByteStringSerializer implements k<ByteStringStoreOuterClass.ByteStringStore> {
    private final ByteStringStoreOuterClass.ByteStringStore defaultValue;

    public ByteStringSerializer() {
        ByteStringStoreOuterClass.ByteStringStore defaultInstance = ByteStringStoreOuterClass.ByteStringStore.getDefaultInstance();
        n.e(defaultInstance, "getDefaultInstance()");
        this.defaultValue = defaultInstance;
    }

    @Override // b0.k
    public Object readFrom(InputStream inputStream, d<? super ByteStringStoreOuterClass.ByteStringStore> dVar) {
        try {
            ByteStringStoreOuterClass.ByteStringStore parseFrom = ByteStringStoreOuterClass.ByteStringStore.parseFrom(inputStream);
            n.e(parseFrom, "parseFrom(input)");
            return parseFrom;
        } catch (InvalidProtocolBufferException e8) {
            throw new a("Cannot read proto.", e8);
        }
    }

    @Override // b0.k
    public /* bridge */ /* synthetic */ Object writeTo(ByteStringStoreOuterClass.ByteStringStore byteStringStore, OutputStream outputStream, d dVar) {
        return writeTo2(byteStringStore, outputStream, (d<? super w>) dVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // b0.k
    public ByteStringStoreOuterClass.ByteStringStore getDefaultValue() {
        return this.defaultValue;
    }

    /* renamed from: writeTo  reason: avoid collision after fix types in other method */
    public Object writeTo2(ByteStringStoreOuterClass.ByteStringStore byteStringStore, OutputStream outputStream, d<? super w> dVar) {
        byteStringStore.writeTo(outputStream);
        return w.f26638a;
    }
}
