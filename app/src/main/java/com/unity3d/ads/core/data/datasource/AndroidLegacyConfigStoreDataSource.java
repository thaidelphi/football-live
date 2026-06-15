package com.unity3d.ads.core.data.datasource;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.manager.StorageManager;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.datastore.ByteStringStoreKt;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager;
import i8.o;
import i8.p;
import i8.w;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
import m8.d;
/* compiled from: AndroidLegacyConfigStoreDataSource.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class AndroidLegacyConfigStoreDataSource implements ByteStringDataSource {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_CONFIGURATION_STORE = "configuration.store";
    private final StorageManager storageManager;

    /* compiled from: AndroidLegacyConfigStoreDataSource.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public AndroidLegacyConfigStoreDataSource(StorageManager storageManager) {
        n.f(storageManager, "storageManager");
        this.storageManager = storageManager;
    }

    @Override // com.unity3d.ads.core.data.datasource.ByteStringDataSource
    public Object get(d<? super ByteStringStoreOuterClass.ByteStringStore> dVar) {
        Object b10;
        Object obj = this.storageManager.getStorage(StorageManager.StorageType.PRIVATE).get(KEY_CONFIGURATION_STORE);
        String str = obj instanceof String ? (String) obj : null;
        try {
            o.a aVar = o.f26626b;
            b10 = o.b(str != null ? ProtobufExtensionsKt.fromBase64(str, true) : null);
        } catch (Throwable th) {
            o.a aVar2 = o.f26626b;
            b10 = o.b(p.a(th));
        }
        ByteString EMPTY = o.f(b10) ? null : b10;
        ByteStringStoreKt.Dsl.Companion companion = ByteStringStoreKt.Dsl.Companion;
        ByteStringStoreOuterClass.ByteStringStore.Builder newBuilder = ByteStringStoreOuterClass.ByteStringStore.newBuilder();
        n.e(newBuilder, "newBuilder()");
        ByteStringStoreKt.Dsl _create = companion._create(newBuilder);
        if (EMPTY == null) {
            EMPTY = ByteString.EMPTY;
            n.e(EMPTY, "EMPTY");
        }
        _create.setData(EMPTY);
        return _create._build();
    }

    @Override // com.unity3d.ads.core.data.datasource.ByteStringDataSource
    public Object set(ByteString byteString, d<? super w> dVar) {
        Storage storage = this.storageManager.getStorage(StorageManager.StorageType.PRIVATE);
        storage.set(KEY_CONFIGURATION_STORE, ProtobufExtensionsKt.toBase64(byteString, true));
        storage.writeStorage();
        return w.f26638a;
    }
}
