package com.applovin.impl.sdk;

import com.applovin.impl.u2;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class o {

    /* renamed from: a  reason: collision with root package name */
    private final n f9120a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f9121b = new HashMap(5);

    /* renamed from: c  reason: collision with root package name */
    private final Object f9122c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final Map f9123d = Collections.synchronizedMap(new HashMap(5));

    /* renamed from: e  reason: collision with root package name */
    private final Map f9124e = Collections.synchronizedMap(new HashMap(5));

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f9125a;

        /* renamed from: b  reason: collision with root package name */
        private final String f9126b;

        /* renamed from: c  reason: collision with root package name */
        private final String f9127c;

        /* renamed from: d  reason: collision with root package name */
        private String f9128d;

        /* renamed from: e  reason: collision with root package name */
        private String f9129e;

        public a(String str, String str2, String str3) {
            this.f9125a = str;
            this.f9126b = str2;
            this.f9127c = str3;
        }

        protected boolean a(Object obj) {
            return obj instanceof a;
        }

        public String c() {
            return this.f9127c;
        }

        public String d() {
            return this.f9128d;
        }

        public String e() {
            return this.f9129e;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (aVar.a(this)) {
                    String b10 = b();
                    String b11 = aVar.b();
                    if (b10 != null ? b10.equals(b11) : b11 == null) {
                        String a10 = a();
                        String a11 = aVar.a();
                        if (a10 != null ? a10.equals(a11) : a11 == null) {
                            String c10 = c();
                            String c11 = aVar.c();
                            if (c10 != null ? c10.equals(c11) : c11 == null) {
                                String d10 = d();
                                String d11 = aVar.d();
                                if (d10 != null ? d10.equals(d11) : d11 == null) {
                                    String e8 = e();
                                    String e10 = aVar.e();
                                    return e8 != null ? e8.equals(e10) : e10 == null;
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            String b10 = b();
            int hashCode = b10 == null ? 43 : b10.hashCode();
            String a10 = a();
            int hashCode2 = ((hashCode + 59) * 59) + (a10 == null ? 43 : a10.hashCode());
            String c10 = c();
            int hashCode3 = (hashCode2 * 59) + (c10 == null ? 43 : c10.hashCode());
            String d10 = d();
            int hashCode4 = (hashCode3 * 59) + (d10 == null ? 43 : d10.hashCode());
            String e8 = e();
            return (hashCode4 * 59) + (e8 != null ? e8.hashCode() : 43);
        }

        public String toString() {
            return "MediationWaterfallWinnerTracker.WinningAd(bCode=" + b() + ", adapterName=" + a() + ", networkName=" + c() + ", secondWinnerAdapterName=" + d() + ", secondWinnerNetworkName=" + e() + ")";
        }

        public String b() {
            return this.f9125a;
        }

        public String a() {
            return this.f9126b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(j jVar) {
        this.f9120a = jVar.I();
    }

    public void a(u2 u2Var, u2 u2Var2) {
        synchronized (this.f9122c) {
            if (n.a()) {
                n nVar = this.f9120a;
                nVar.a("MediationWaterfallWinnerTracker", "Tracking winning ad: " + u2Var);
            }
            a aVar = new a(u2Var.C(), u2Var.c(), u2Var.getNetworkName());
            if (u2Var2 != null) {
                aVar.f9128d = u2Var2.c();
                aVar.f9129e = u2Var2.getNetworkName();
            }
            this.f9121b.put(u2Var.getAdUnitId(), aVar);
        }
        this.f9124e.put(u2Var.getAdUnitId(), u2Var.S());
    }

    public void b(u2 u2Var) {
        this.f9123d.put(u2Var.getAdUnitId(), u2Var.S());
    }

    public void c(u2 u2Var) {
        a(u2Var, null);
    }

    public String b(String str) {
        return (String) this.f9123d.get(str);
    }

    public a c(String str) {
        a aVar;
        synchronized (this.f9122c) {
            aVar = (a) this.f9121b.get(str);
        }
        return aVar;
    }

    public String a(String str) {
        return (String) this.f9124e.get(str);
    }

    public void a(u2 u2Var) {
        synchronized (this.f9122c) {
            String adUnitId = u2Var.getAdUnitId();
            a aVar = (a) this.f9121b.get(adUnitId);
            if (aVar == null) {
                if (n.a()) {
                    this.f9120a.a("MediationWaterfallWinnerTracker", "No previous winner to clear.");
                }
                return;
            }
            if (u2Var.C().equals(aVar.b())) {
                if (n.a()) {
                    n nVar = this.f9120a;
                    nVar.a("MediationWaterfallWinnerTracker", "Clearing previous winning ad: " + aVar);
                }
                this.f9121b.remove(adUnitId);
            } else if (n.a()) {
                n nVar2 = this.f9120a;
                nVar2.a("MediationWaterfallWinnerTracker", "Previous winner not cleared for ad: " + u2Var + " , since it could have already been updated with a new ad: " + aVar);
            }
        }
    }
}
