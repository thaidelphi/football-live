package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: GlideExperiments.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<?>, Object> f10287a;

    /* compiled from: GlideExperiments.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Map<Class<?>, Object> f10288a = new HashMap();

        /* JADX INFO: Access modifiers changed from: package-private */
        public e b() {
            return new e(this);
        }
    }

    e(a aVar) {
        this.f10287a = Collections.unmodifiableMap(new HashMap(aVar.f10288a));
    }

    public boolean a(Class<Object> cls) {
        return this.f10287a.containsKey(cls);
    }
}
