package com.unity3d.services.core.device;

import b9.c;
import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import g9.l0;
import g9.w;
import j8.o;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
import org.json.JSONObject;
import t8.l;
/* compiled from: Storage.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class Storage extends JsonStorage {
    public static final Companion Companion = new Companion(null);
    private static final w<List<l<StorageEventInfo, i8.w>>> onStorageEventCallbacks = l0.a(o.d());
    private final String _targetFileName;
    private final StorageManager.StorageType type;

    /* compiled from: Storage.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final void addStorageEventCallback(l<? super StorageEventInfo, i8.w> callback) {
            Object value;
            n.f(callback, "callback");
            w wVar = Storage.onStorageEventCallbacks;
            do {
                value = wVar.getValue();
            } while (!wVar.i(value, o.F((List) value, callback)));
        }

        public final void removeStorageEventCallback(l<? super StorageEventInfo, i8.w> callback) {
            Object value;
            n.f(callback, "callback");
            w wVar = Storage.onStorageEventCallbacks;
            do {
                value = wVar.getValue();
            } while (!wVar.i(value, o.D((List) value, callback)));
        }
    }

    public Storage(String _targetFileName, StorageManager.StorageType type) {
        n.f(_targetFileName, "_targetFileName");
        n.f(type, "type");
        this._targetFileName = _targetFileName;
        this.type = type;
    }

    public final synchronized boolean clearStorage() {
        clearData();
        return new File(this._targetFileName).delete();
    }

    public final StorageManager.StorageType getType() {
        return this.type;
    }

    public final synchronized boolean initStorage() {
        readStorage();
        super.initData();
        return true;
    }

    public final synchronized boolean readStorage() {
        byte[] readFileBytes;
        boolean z10 = true;
        try {
            try {
                readFileBytes = Utilities.readFileBytes(new File(this._targetFileName));
            } catch (FileNotFoundException e8) {
                DeviceLog.debug("Storage JSON file not found in local cache:", e8);
                z10 = false;
                return z10;
            }
        } catch (Exception e10) {
            DeviceLog.debug("Failed to read storage JSON file:", e10);
            z10 = false;
            return z10;
        }
        if (readFileBytes == null) {
            return false;
        }
        setData(new JSONObject(new String(readFileBytes, c.f5283b)));
        return z10;
    }

    public final synchronized void sendEvent(StorageEvent storageEvent, Object obj) {
        List<l<StorageEventInfo, i8.w>> value = onStorageEventCallbacks.getValue();
        if (!value.isEmpty()) {
            n.c(storageEvent);
            StorageEventInfo storageEventInfo = new StorageEventInfo(storageEvent, this.type, obj);
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                ((l) it.next()).invoke(storageEventInfo);
            }
            return;
        }
        if (!(WebViewApp.getCurrentApp() != null ? WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.STORAGE, storageEvent, this.type.name(), obj) : false)) {
            DeviceLog.debug("Couldn't send storage event to WebApp");
        }
    }

    public final synchronized boolean storageFileExists() {
        return new File(this._targetFileName).exists();
    }

    public final synchronized boolean writeStorage() {
        File file = new File(this._targetFileName);
        if (getData() != null) {
            return Utilities.writeFile(file, getData().toString());
        }
        return false;
    }
}
