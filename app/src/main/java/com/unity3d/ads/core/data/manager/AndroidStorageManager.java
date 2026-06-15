package com.unity3d.ads.core.data.manager;

import android.content.Context;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* compiled from: AndroidStorageManager.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class AndroidStorageManager implements StorageManager {
    public static final Companion Companion = new Companion(null);
    private static final String KEY_INITIALIZED = "configuration.hasInitialized";

    /* compiled from: AndroidStorageManager.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public void addStorageLocation(StorageManager.StorageType type, String fileName) {
        n.f(type, "type");
        n.f(fileName, "fileName");
        com.unity3d.services.core.device.StorageManager.addStorageLocation(type, fileName);
    }

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public Storage getStorage(StorageManager.StorageType type) {
        n.f(type, "type");
        Storage storage = com.unity3d.services.core.device.StorageManager.getStorage(type);
        n.e(storage, "getStorage(type)");
        return storage;
    }

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public void hasInitialized() {
        Storage storage = getStorage(StorageManager.StorageType.PRIVATE);
        storage.set(KEY_INITIALIZED, Boolean.TRUE);
        storage.writeStorage();
    }

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public boolean hasStorage(StorageManager.StorageType type) {
        n.f(type, "type");
        return com.unity3d.services.core.device.StorageManager.hasStorage(type);
    }

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public boolean init(Context context) {
        n.f(context, "context");
        return com.unity3d.services.core.device.StorageManager.init(context);
    }

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public void initStorage(StorageManager.StorageType type) {
        n.f(type, "type");
        com.unity3d.services.core.device.StorageManager.initStorage(type);
    }

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public void removeStorage(StorageManager.StorageType type) {
        n.f(type, "type");
        com.unity3d.services.core.device.StorageManager.removeStorage(type);
    }
}
