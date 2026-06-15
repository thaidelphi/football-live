package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import b0.d;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import i8.w;
import kotlin.coroutines.jvm.internal.b;
import kotlin.jvm.internal.n;
/* compiled from: PreservingByteStringPreferenceMigration.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class PreservingByteStringPreferenceMigration implements d<ByteStringStoreOuterClass.ByteStringStore> {
    private final Context context;
    private final GetByteStringData getByteStringData;
    private final String key;
    private final String name;

    public PreservingByteStringPreferenceMigration(Context context, String name, String key, GetByteStringData getByteStringData) {
        n.f(context, "context");
        n.f(name, "name");
        n.f(key, "key");
        n.f(getByteStringData, "getByteStringData");
        this.context = context;
        this.name = name;
        this.key = key;
        this.getByteStringData = getByteStringData;
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
        if (byteStringStore.getData().isEmpty()) {
            boolean z10 = false;
            String string = this.context.getSharedPreferences(this.name, 0).getString(this.key, null);
            if ((string == null || string.length() == 0) ? true : true) {
                return byteStringStore;
            }
            ByteStringStoreOuterClass.ByteStringStore build = ByteStringStoreOuterClass.ByteStringStore.newBuilder().setData(this.getByteStringData.invoke(string)).build();
            n.e(build, "newBuilder()\n           …                 .build()");
            return build;
        }
        return byteStringStore;
    }

    /* renamed from: shouldMigrate  reason: avoid collision after fix types in other method */
    public Object shouldMigrate2(ByteStringStoreOuterClass.ByteStringStore byteStringStore, m8.d<? super Boolean> dVar) {
        return b.a(byteStringStore.getData().isEmpty());
    }
}
