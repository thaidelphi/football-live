package com.unity3d.ads.core.data.datasource;

import b0.d;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.domain.GetOpenGLRendererInfo;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import i8.w;
import kotlin.coroutines.jvm.internal.b;
import kotlin.jvm.internal.n;
/* compiled from: FetchGLInfoDataMigration.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class FetchGLInfoDataMigration implements d<ByteStringStoreOuterClass.ByteStringStore> {
    private final GetOpenGLRendererInfo getOpenGLRendererInfo;

    public FetchGLInfoDataMigration(GetOpenGLRendererInfo getOpenGLRendererInfo) {
        n.f(getOpenGLRendererInfo, "getOpenGLRendererInfo");
        this.getOpenGLRendererInfo = getOpenGLRendererInfo;
    }

    private final ByteString gatherOpenGLRendererInfo() {
        return this.getOpenGLRendererInfo.invoke();
    }

    @Override // b0.d
    public Object cleanUp(m8.d<? super w> dVar) {
        return w.f26638a;
    }

    @Override // b0.d
    public /* bridge */ /* synthetic */ Object shouldMigrate(ByteStringStoreOuterClass.ByteStringStore byteStringStore, m8.d dVar) {
        return shouldMigrate2(byteStringStore, (m8.d<? super Boolean>) dVar);
    }

    @Override // b0.d
    public Object migrate(ByteStringStoreOuterClass.ByteStringStore byteStringStore, m8.d<? super ByteStringStoreOuterClass.ByteStringStore> dVar) {
        ByteString byteString;
        try {
            byteString = gatherOpenGLRendererInfo();
        } catch (Exception unused) {
            byteString = ByteString.EMPTY;
            n.e(byteString, "{\n            ByteString.EMPTY\n        }");
        }
        ByteStringStoreOuterClass.ByteStringStore build = ByteStringStoreOuterClass.ByteStringStore.newBuilder().setData(byteString).build();
        n.e(build, "newBuilder()\n           …rer)\n            .build()");
        return build;
    }

    /* renamed from: shouldMigrate  reason: avoid collision after fix types in other method */
    public Object shouldMigrate2(ByteStringStoreOuterClass.ByteStringStore byteStringStore, m8.d<? super Boolean> dVar) {
        return b.a(byteStringStore.getData().isEmpty());
    }
}
