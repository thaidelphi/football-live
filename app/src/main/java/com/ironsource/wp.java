package com.ironsource;

import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class wp {

    /* renamed from: b  reason: collision with root package name */
    public static final a f21313b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final String f21314c = "enabled";

    /* renamed from: a  reason: collision with root package name */
    private final Boolean f21315a;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }
    }

    public wp(JSONObject features) {
        kotlin.jvm.internal.n.f(features, "features");
        this.f21315a = features.has("enabled") ? Boolean.valueOf(features.getBoolean("enabled")) : null;
    }

    public final Boolean a() {
        return this.f21315a;
    }
}
