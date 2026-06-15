package com.unity3d.ads.core.extensions;

import com.unity3d.services.store.JsonSerializable;
import java.util.List;
import kotlin.jvm.internal.n;
import org.json.JSONArray;
/* compiled from: JsonSerializableExtensions.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class JsonSerializableExtensionsKt {
    public static final JSONArray toJsonArray(List<? extends JsonSerializable> list) {
        n.f(list, "<this>");
        JSONArray jSONArray = new JSONArray();
        for (JsonSerializable jsonSerializable : list) {
            jSONArray.put(jsonSerializable.toJson());
        }
        return jSONArray;
    }
}
