package com.google.protobuf;

import com.google.protobuf.MapEntryLite;
import java.util.Map;
/* compiled from: MapFieldSchemaLite.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
class u implements t {
    private static <K, V> int i(int i10, Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        MapEntryLite mapEntryLite = (MapEntryLite) obj2;
        int i11 = 0;
        if (mapFieldLite.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : mapFieldLite.entrySet()) {
            i11 += mapEntryLite.computeMessageSize(i10, entry.getKey(), entry.getValue());
        }
        return i11;
    }

    private static <K, V> MapFieldLite<K, V> j(Object obj, Object obj2) {
        MapFieldLite<K, V> mapFieldLite = (MapFieldLite) obj;
        MapFieldLite<K, V> mapFieldLite2 = (MapFieldLite) obj2;
        if (!mapFieldLite2.isEmpty()) {
            if (!mapFieldLite.isMutable()) {
                mapFieldLite = mapFieldLite.mutableCopy();
            }
            mapFieldLite.mergeFrom(mapFieldLite2);
        }
        return mapFieldLite;
    }

    @Override // com.google.protobuf.t
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // com.google.protobuf.t
    public MapEntryLite.b<?, ?> b(Object obj) {
        return ((MapEntryLite) obj).getMetadata();
    }

    @Override // com.google.protobuf.t
    public Map<?, ?> c(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // com.google.protobuf.t
    public Object d(Object obj) {
        return MapFieldLite.emptyMapField().mutableCopy();
    }

    @Override // com.google.protobuf.t
    public Map<?, ?> e(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // com.google.protobuf.t
    public Object f(Object obj) {
        ((MapFieldLite) obj).makeImmutable();
        return obj;
    }

    @Override // com.google.protobuf.t
    public int g(int i10, Object obj, Object obj2) {
        return i(i10, obj, obj2);
    }

    @Override // com.google.protobuf.t
    public boolean h(Object obj) {
        return !((MapFieldLite) obj).isMutable();
    }
}
