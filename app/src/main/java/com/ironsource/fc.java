package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class fc implements d2 {
    public final Map<String, Object> a(f1 adProperties) {
        kotlin.jvm.internal.n.f(adProperties, "adProperties");
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        String ad_unit = adProperties.a().toString();
        kotlin.jvm.internal.n.e(ad_unit, "adProperties.adFormat.toString()");
        hashMap.put(fl.f17487f, ad_unit);
        hashMap.put("adf", Integer.valueOf(vt.b(adProperties.a())));
        String uuid = adProperties.b().toString();
        kotlin.jvm.internal.n.e(uuid, "adProperties.adId.toString()");
        hashMap.put(fl.f17490i, uuid);
        hashMap.put("mediationAdUnitId", adProperties.c());
        hashMap.put("isMultipleAdUnits", 1);
        return hashMap;
    }
}
