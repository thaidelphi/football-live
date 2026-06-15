package com.unity3d.services.core.request.metrics;

import j8.i0;
import j8.j0;
import java.util.Map;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* compiled from: Metric.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class Metric {
    public static final Companion Companion = new Companion(null);
    private static final String METRIC_NAME = "n";
    private static final String METRIC_TAGS = "t";
    private static final String METRIC_VALUE = "v";
    private final String name;
    private final Map<String, String> tags;
    private final Object value;

    /* compiled from: Metric.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public Metric(String str) {
        this(str, null, null, 6, null);
    }

    public Metric(String str, Object obj) {
        this(str, obj, null, 4, null);
    }

    public Metric(String str, Object obj, Map<String, String> tags) {
        n.f(tags, "tags");
        this.name = str;
        this.value = obj;
        this.tags = tags;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Metric copy$default(Metric metric, String str, Object obj, Map map, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            str = metric.name;
        }
        if ((i10 & 2) != 0) {
            obj = metric.value;
        }
        if ((i10 & 4) != 0) {
            map = metric.tags;
        }
        return metric.copy(str, obj, map);
    }

    public final String component1() {
        return this.name;
    }

    public final Object component2() {
        return this.value;
    }

    public final Map<String, String> component3() {
        return this.tags;
    }

    public final Metric copy(String str, Object obj, Map<String, String> tags) {
        n.f(tags, "tags");
        return new Metric(str, obj, tags);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Metric) {
            Metric metric = (Metric) obj;
            return n.a(this.name, metric.name) && n.a(this.value, metric.value) && n.a(this.tags, metric.tags);
        }
        return false;
    }

    public final String getName() {
        return this.name;
    }

    public final Map<String, String> getTags() {
        return this.tags;
    }

    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Object obj = this.value;
        return ((hashCode + (obj != null ? obj.hashCode() : 0)) * 31) + this.tags.hashCode();
    }

    public final Map<String, Object> toMap() {
        Map b10;
        Map<String, Object> a10;
        b10 = i0.b();
        String str = this.name;
        if (str != null) {
            b10.put("n", str);
        }
        Object obj = this.value;
        if (obj != null) {
            b10.put(METRIC_VALUE, obj);
        }
        if (!this.tags.isEmpty()) {
            b10.put(METRIC_TAGS, this.tags);
        }
        a10 = i0.a(b10);
        return a10;
    }

    public String toString() {
        return "Metric(name=" + this.name + ", value=" + this.value + ", tags=" + this.tags + ')';
    }

    public /* synthetic */ Metric(String str, Object obj, Map map, int i10, h hVar) {
        this(str, (i10 & 2) != 0 ? null : obj, (i10 & 4) != 0 ? j0.f() : map);
    }
}
