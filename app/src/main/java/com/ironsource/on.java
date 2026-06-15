package com.ironsource;

import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class on {

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f19599a = new a();

        /* renamed from: b  reason: collision with root package name */
        public static final String f19600b = "SDKPluginType";

        /* renamed from: c  reason: collision with root package name */
        public static final String f19601c = "sessionid";

        private a() {
        }
    }

    public final Map<String, String> a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String pluginType = ConfigFile.getConfigFile().getPluginType();
        if (pluginType != null) {
            linkedHashMap.put(a.f19600b, pluginType);
        }
        String sessionId = IronSourceUtils.getSessionId();
        if (sessionId != null) {
            linkedHashMap.put("sessionid", sessionId);
        }
        return linkedHashMap;
    }
}
