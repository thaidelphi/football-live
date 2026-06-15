package com.applovin.impl.sdk;

import com.applovin.impl.u2;
import com.ironsource.c9;
import com.ironsource.m5;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private final j f8839a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f8840b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Object f8841c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final Map f8842d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final Object f8843e = new Object();

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f8844a;

        /* renamed from: b  reason: collision with root package name */
        private final String f8845b;

        /* renamed from: c  reason: collision with root package name */
        private final String f8846c;

        /* renamed from: d  reason: collision with root package name */
        private final String f8847d;

        /* renamed from: e  reason: collision with root package name */
        private final String f8848e;

        /* renamed from: f  reason: collision with root package name */
        private final String f8849f;

        /* renamed from: g  reason: collision with root package name */
        private final String f8850g;

        /* renamed from: h  reason: collision with root package name */
        private final int f8851h;

        /* renamed from: i  reason: collision with root package name */
        private long f8852i;

        /* renamed from: j  reason: collision with root package name */
        private final ArrayDeque f8853j;

        public String b() {
            return this.f8847d;
        }

        public String c() {
            return this.f8846c;
        }

        public String d() {
            return this.f8848e;
        }

        public String e() {
            return this.f8849f;
        }

        public String f() {
            return this.f8850g;
        }

        public String g() {
            return this.f8845b;
        }

        public int h() {
            return this.f8851h;
        }

        public c i() {
            return (c) this.f8853j.getLast();
        }

        public String toString() {
            return "AdInfo{state='" + i() + "', adUnitId='" + this.f8844a + "', format='" + this.f8845b + "', adapterName='" + this.f8846c + "', adapterClass='" + this.f8847d + "', adapterVersion='" + this.f8848e + "', bCode='" + this.f8849f + "', creativeId='" + this.f8850g + "', updated=" + this.f8852i + '}';
        }

        private b(u2 u2Var, c cVar) {
            this.f8853j = new ArrayDeque();
            this.f8844a = u2Var.getAdUnitId();
            this.f8845b = u2Var.getFormat().getLabel();
            this.f8846c = u2Var.c();
            this.f8847d = u2Var.b();
            this.f8848e = u2Var.z();
            this.f8849f = u2Var.C();
            this.f8850g = u2Var.getCreativeId();
            this.f8851h = u2Var.hashCode();
            a(cVar);
        }

        public String a() {
            return this.f8844a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(c cVar) {
            this.f8852i = System.currentTimeMillis();
            this.f8853j.add(cVar);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum c {
        LOAD("load"),
        SHOW(m5.f18419v),
        HIDE("hide"),
        CLICK(c9.f16851d),
        DESTROY("destroy"),
        SHOW_ERROR("show_error");
        

        /* renamed from: h  reason: collision with root package name */
        public static final Set f8860h = new HashSet(Arrays.asList(values()));

        /* renamed from: a  reason: collision with root package name */
        private final String f8862a;

        c(String str) {
            this.f8862a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f8862a;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface d {
        void a(b bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(j jVar) {
        this.f8839a = jVar;
        a();
    }

    public void a(u2 u2Var, c cVar) {
        synchronized (this.f8843e) {
            int hashCode = u2Var.hashCode();
            b bVar = (b) this.f8842d.get(Integer.valueOf(hashCode));
            if (bVar == null) {
                if (cVar == c.DESTROY) {
                    return;
                }
                bVar = new b(u2Var, cVar);
                this.f8842d.put(Integer.valueOf(hashCode), bVar);
            } else if (bVar.i() == cVar) {
                return;
            } else {
                bVar.a(cVar);
            }
            if (cVar == c.DESTROY) {
                this.f8842d.remove(Integer.valueOf(hashCode));
            }
            a(bVar, cVar);
        }
    }

    public void a() {
        synchronized (this.f8841c) {
            for (c cVar : c.values()) {
                this.f8840b.put(cVar, new HashSet());
            }
        }
    }

    public void a(d dVar, Set set) {
        synchronized (this.f8841c) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                a((c) it.next()).add(dVar);
            }
        }
    }

    public void a(d dVar) {
        synchronized (this.f8841c) {
            for (c cVar : this.f8840b.keySet()) {
                a(cVar).remove(dVar);
            }
        }
    }

    private Set a(c cVar) {
        synchronized (this.f8841c) {
            Set set = (Set) this.f8840b.get(cVar);
            if (com.applovin.impl.f1.a(set)) {
                return set;
            }
            return new HashSet();
        }
    }

    private void a(b bVar, c cVar) {
        synchronized (this.f8841c) {
            for (d dVar : a(cVar)) {
                dVar.a(bVar);
            }
        }
    }
}
