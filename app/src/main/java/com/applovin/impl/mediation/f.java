package com.applovin.impl.mediation;

import android.text.TextUtils;
import com.applovin.impl.d3;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.u2;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapters.MediationAdapterBase;
import com.applovin.sdk.AppLovinSdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class f {

    /* renamed from: b  reason: collision with root package name */
    private final com.applovin.impl.sdk.j f7816b;

    /* renamed from: c  reason: collision with root package name */
    private final com.applovin.impl.sdk.n f7817c;

    /* renamed from: a  reason: collision with root package name */
    private final Map f7815a = Collections.synchronizedMap(new HashMap(16));

    /* renamed from: d  reason: collision with root package name */
    private final Object f7818d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private final Map f7819e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private final Set f7820f = new HashSet();

    /* renamed from: g  reason: collision with root package name */
    private final Object f7821g = new Object();

    /* renamed from: h  reason: collision with root package name */
    private final Set f7822h = new HashSet();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f7823a;

        /* renamed from: b  reason: collision with root package name */
        private final String f7824b;

        /* renamed from: c  reason: collision with root package name */
        private final MaxAdFormat f7825c;

        /* renamed from: d  reason: collision with root package name */
        private final JSONObject f7826d;

        a(String str, String str2, u2 u2Var, com.applovin.impl.sdk.j jVar) {
            this.f7823a = str;
            this.f7824b = str2;
            JSONObject jSONObject = new JSONObject();
            this.f7826d = jSONObject;
            JsonUtils.putString(jSONObject, "class", str);
            JsonUtils.putString(jSONObject, "operation", str2);
            if (u2Var != null) {
                this.f7825c = u2Var.getFormat();
                JsonUtils.putString(jSONObject, "format", u2Var.getFormat().getLabel());
                return;
            }
            this.f7825c = null;
        }

        JSONObject a() {
            return this.f7826d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f7823a.equals(aVar.f7823a) && this.f7824b.equals(aVar.f7824b)) {
                MaxAdFormat maxAdFormat = this.f7825c;
                MaxAdFormat maxAdFormat2 = aVar.f7825c;
                return maxAdFormat == null ? maxAdFormat2 == null : maxAdFormat.equals(maxAdFormat2);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = ((this.f7823a.hashCode() * 31) + this.f7824b.hashCode()) * 31;
            MaxAdFormat maxAdFormat = this.f7825c;
            return hashCode + (maxAdFormat != null ? maxAdFormat.hashCode() : 0);
        }

        public String toString() {
            return "DisabledAdapterInfo{className='" + this.f7823a + "', operationTag='" + this.f7824b + "', format=" + this.f7825c + '}';
        }
    }

    public f(com.applovin.impl.sdk.j jVar) {
        if (jVar != null) {
            this.f7816b = jVar;
            this.f7817c = jVar.I();
            return;
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    public Collection a() {
        ArrayList arrayList;
        synchronized (this.f7821g) {
            arrayList = new ArrayList(this.f7822h.size());
            for (a aVar : this.f7822h) {
                arrayList.add(aVar.a());
            }
        }
        return arrayList;
    }

    public Collection b() {
        Set unmodifiableSet;
        synchronized (this.f7818d) {
            unmodifiableSet = Collections.unmodifiableSet(this.f7820f);
        }
        return unmodifiableSet;
    }

    public Collection c() {
        Set unmodifiableSet;
        synchronized (this.f7818d) {
            HashSet hashSet = new HashSet(this.f7819e.size());
            for (Class cls : this.f7819e.values()) {
                hashSet.add(cls.getName());
            }
            unmodifiableSet = Collections.unmodifiableSet(hashSet);
        }
        return unmodifiableSet;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g a(d3 d3Var) {
        return a(d3Var, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g a(d3 d3Var, boolean z10) {
        Class a10;
        g gVar;
        if (d3Var != null) {
            String c10 = d3Var.c();
            String b10 = d3Var.b();
            if (TextUtils.isEmpty(c10)) {
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n nVar = this.f7817c;
                    nVar.b("MediationAdapterManager", "No adapter name provided for " + b10 + ", not loading the adapter ");
                }
                return null;
            } else if (TextUtils.isEmpty(b10)) {
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n nVar2 = this.f7817c;
                    nVar2.b("MediationAdapterManager", "Unable to find default className for '" + c10 + "'");
                }
                return null;
            } else if (!z10 || (gVar = (g) this.f7815a.get(b10)) == null) {
                synchronized (this.f7818d) {
                    if (!this.f7820f.contains(b10)) {
                        if (this.f7819e.containsKey(b10)) {
                            a10 = (Class) this.f7819e.get(b10);
                        } else {
                            a10 = a(b10);
                            if (a10 == null) {
                                if (com.applovin.impl.sdk.n.a()) {
                                    com.applovin.impl.sdk.n nVar3 = this.f7817c;
                                    nVar3.k("MediationAdapterManager", "Adapter " + c10 + " could not be loaded, class " + b10 + " not found");
                                }
                                this.f7820f.add(b10);
                                return null;
                            }
                        }
                        g a11 = a(d3Var, a10, z10);
                        if (a11 != null) {
                            if (com.applovin.impl.sdk.n.a()) {
                                com.applovin.impl.sdk.n nVar4 = this.f7817c;
                                nVar4.a("MediationAdapterManager", "Loaded " + c10);
                            }
                            this.f7819e.put(b10, a10);
                            if (z10) {
                                this.f7815a.put(d3Var.b(), a11);
                            }
                            return a11;
                        }
                        if (com.applovin.impl.sdk.n.a()) {
                            com.applovin.impl.sdk.n nVar5 = this.f7817c;
                            nVar5.b("MediationAdapterManager", "Failed to load " + c10);
                        }
                        this.f7820f.add(b10);
                        return null;
                    }
                    if (com.applovin.impl.sdk.n.a()) {
                        com.applovin.impl.sdk.n nVar6 = this.f7817c;
                        nVar6.a("MediationAdapterManager", "Not attempting to load " + c10 + " due to prior errors");
                    }
                    return null;
                }
            } else {
                return gVar;
            }
        }
        throw new IllegalArgumentException("No adapter spec specified");
    }

    public void a(String str, String str2, u2 u2Var) {
        synchronized (this.f7821g) {
            this.f7816b.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n I = this.f7816b.I();
                I.b("MediationAdapterManager", "Adding " + str + " to list of disabled adapters.");
            }
            this.f7822h.add(new a(str, str2, u2Var, this.f7816b));
        }
    }

    private g a(d3 d3Var, Class cls, boolean z10) {
        try {
            return new g(d3Var, (MediationAdapterBase) cls.getConstructor(AppLovinSdk.class).newInstance(this.f7816b.q0()), z10, this.f7816b);
        } catch (Throwable th) {
            com.applovin.impl.sdk.n.c("MediationAdapterManager", "Failed to load adapter: " + d3Var, th);
            return null;
        }
    }

    private Class a(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (MaxAdapter.class.isAssignableFrom(cls)) {
                return cls.asSubclass(MaxAdapter.class);
            }
            com.applovin.impl.sdk.n.h("MediationAdapterManager", str + " error: not an instance of '" + MaxAdapter.class.getName() + "'.");
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
