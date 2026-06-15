package com.unity3d.services.core.device;

import com.unity3d.services.core.device.StorageManager;
import kotlin.jvm.internal.n;
/* compiled from: Storage.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class StorageEventInfo {
    private final StorageEvent eventType;
    private final StorageManager.StorageType storageType;
    private final Object value;

    public StorageEventInfo(StorageEvent eventType, StorageManager.StorageType storageType, Object obj) {
        n.f(eventType, "eventType");
        n.f(storageType, "storageType");
        this.eventType = eventType;
        this.storageType = storageType;
        this.value = obj;
    }

    public static /* synthetic */ StorageEventInfo copy$default(StorageEventInfo storageEventInfo, StorageEvent storageEvent, StorageManager.StorageType storageType, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            storageEvent = storageEventInfo.eventType;
        }
        if ((i10 & 2) != 0) {
            storageType = storageEventInfo.storageType;
        }
        if ((i10 & 4) != 0) {
            obj = storageEventInfo.value;
        }
        return storageEventInfo.copy(storageEvent, storageType, obj);
    }

    public final StorageEvent component1() {
        return this.eventType;
    }

    public final StorageManager.StorageType component2() {
        return this.storageType;
    }

    public final Object component3() {
        return this.value;
    }

    public final StorageEventInfo copy(StorageEvent eventType, StorageManager.StorageType storageType, Object obj) {
        n.f(eventType, "eventType");
        n.f(storageType, "storageType");
        return new StorageEventInfo(eventType, storageType, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StorageEventInfo) {
            StorageEventInfo storageEventInfo = (StorageEventInfo) obj;
            return this.eventType == storageEventInfo.eventType && this.storageType == storageEventInfo.storageType && n.a(this.value, storageEventInfo.value);
        }
        return false;
    }

    public final StorageEvent getEventType() {
        return this.eventType;
    }

    public final StorageManager.StorageType getStorageType() {
        return this.storageType;
    }

    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = ((this.eventType.hashCode() * 31) + this.storageType.hashCode()) * 31;
        Object obj = this.value;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "StorageEventInfo(eventType=" + this.eventType + ", storageType=" + this.storageType + ", value=" + this.value + ')';
    }
}
