package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class ke {

    /* renamed from: a  reason: collision with root package name */
    private final ak f18056a;

    public ke(ak globalDataWriter) {
        kotlin.jvm.internal.n.f(globalDataWriter, "globalDataWriter");
        this.f18056a = globalDataWriter;
    }

    public final void a(JSONObject metaDataJson) {
        kotlin.jvm.internal.n.f(metaDataJson, "metaDataJson");
        if (metaDataJson.has(com.ironsource.mediationsdk.metadata.a.f18926i)) {
            try {
                Object remove = metaDataJson.remove(com.ironsource.mediationsdk.metadata.a.f18926i);
                kotlin.jvm.internal.n.d(remove, "null cannot be cast to non-null type java.util.ArrayList<*>{ kotlin.collections.TypeAliasesKt.ArrayList<*> }");
                ArrayList arrayList = (ArrayList) remove;
                if (!arrayList.isEmpty()) {
                    Object obj = arrayList.get(0);
                    kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.String");
                    this.f18056a.d((String) obj);
                }
            } catch (ClassCastException e8) {
                o9.d().a(e8);
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("got the following error " + e8.getMessage());
            }
        }
    }
}
