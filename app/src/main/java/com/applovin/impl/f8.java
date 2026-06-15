package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class f8 {

    /* renamed from: f  reason: collision with root package name */
    public static final f8 f6992f = new f8();

    /* renamed from: a  reason: collision with root package name */
    private final f8 f6993a;

    /* renamed from: b  reason: collision with root package name */
    private final String f6994b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f6995c;

    /* renamed from: d  reason: collision with root package name */
    protected String f6996d;

    /* renamed from: e  reason: collision with root package name */
    protected final List f6997e;

    public f8(String str, Map map, f8 f8Var) {
        this.f6993a = f8Var;
        this.f6994b = str;
        this.f6995c = Collections.unmodifiableMap(map);
        this.f6997e = new ArrayList();
    }

    public Map a() {
        return this.f6995c;
    }

    public List b() {
        return Collections.unmodifiableList(this.f6997e);
    }

    public String c() {
        return this.f6994b;
    }

    public String d() {
        return this.f6996d;
    }

    public String toString() {
        return "XmlNode{elementName='" + this.f6994b + "', text='" + this.f6996d + "', attributes=" + this.f6995c + '}';
    }

    public List a(String str) {
        if (str != null) {
            ArrayList arrayList = new ArrayList(this.f6997e.size());
            for (f8 f8Var : this.f6997e) {
                if (str.equalsIgnoreCase(f8Var.c())) {
                    arrayList.add(f8Var);
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException("No name specified.");
    }

    public f8 b(String str) {
        if (str != null) {
            if (this.f6997e.size() > 0) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this);
                while (!arrayList.isEmpty()) {
                    f8 f8Var = (f8) arrayList.get(0);
                    arrayList.remove(0);
                    if (str.equalsIgnoreCase(f8Var.c())) {
                        return f8Var;
                    }
                    arrayList.addAll(f8Var.b());
                }
                return null;
            }
            return null;
        }
        throw new IllegalArgumentException("No name specified.");
    }

    public f8 c(String str) {
        if (str != null) {
            for (f8 f8Var : this.f6997e) {
                if (str.equalsIgnoreCase(f8Var.c())) {
                    return f8Var;
                }
            }
            return null;
        }
        throw new IllegalArgumentException("No name specified.");
    }

    private f8() {
        this.f6993a = null;
        this.f6994b = "";
        this.f6995c = Collections.emptyMap();
        this.f6996d = "";
        this.f6997e = Collections.emptyList();
    }
}
