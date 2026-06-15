package com.ironsource;

import java.util.HashMap;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class d1 implements e1 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f16935b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final String f16936c = "ext_";

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, String> f16937a = new HashMap();

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }
    }

    @Override // com.ironsource.e1
    public void a(String key, String value) {
        kotlin.jvm.internal.n.f(key, "key");
        kotlin.jvm.internal.n.f(value, "value");
        this.f16937a.put(key, value);
    }

    @Override // com.ironsource.e1
    public void a(HashMap<String, String> params) {
        kotlin.jvm.internal.n.f(params, "params");
        this.f16937a.putAll(params);
    }

    @Override // com.ironsource.e1
    public void b(String key, String value) {
        kotlin.jvm.internal.n.f(key, "key");
        kotlin.jvm.internal.n.f(value, "value");
        Map<String, String> map = this.f16937a;
        map.put("ext_" + key, value);
    }

    @Override // com.ironsource.e1
    public Map<String, String> get() {
        return this.f16937a;
    }
}
