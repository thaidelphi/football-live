package com.ironsource.adapters.ironsource;

import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class LoadAdData {
    private final JSONObject localAdData;

    public LoadAdData() {
        this(null, 1, null);
    }

    public LoadAdData(JSONObject jSONObject) {
        this.localAdData = jSONObject == null ? new JSONObject() : jSONObject;
    }

    public /* synthetic */ LoadAdData(JSONObject jSONObject, int i10, h hVar) {
        this((i10 & 1) != 0 ? null : jSONObject);
    }

    public final String adUnitId() {
        String it = this.localAdData.optString("adUnitId");
        n.e(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final boolean isMultipleAdObjectsFlow() {
        return this.localAdData.optBoolean("isMultipleAdUnits", false);
    }
}
