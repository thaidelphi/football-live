package com.adcolony.sdk;

import com.appnext.ads.fullscreen.RewardedVideo;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class n0 {

    /* renamed from: a  reason: collision with root package name */
    private final int f6135a;

    /* renamed from: b  reason: collision with root package name */
    private final List<a> f6136b = new ArrayList();

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f6137a;

        /* renamed from: b  reason: collision with root package name */
        private final String f6138b;

        /* renamed from: c  reason: collision with root package name */
        private final int f6139c;

        /* renamed from: d  reason: collision with root package name */
        private final String[] f6140d;

        /* renamed from: e  reason: collision with root package name */
        private final String[] f6141e;

        /* renamed from: f  reason: collision with root package name */
        private final List<b> f6142f = new ArrayList();

        /* renamed from: g  reason: collision with root package name */
        private final List<c> f6143g = new ArrayList();

        /* renamed from: h  reason: collision with root package name */
        private final d f6144h;

        /* renamed from: i  reason: collision with root package name */
        private final Map<String, String> f6145i;

        a(f1 f1Var) throws JSONException {
            this.f6137a = f1Var.e("stream");
            this.f6138b = f1Var.e("table_name");
            this.f6139c = f1Var.a("max_rows", UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS);
            e1 l10 = f1Var.l("event_types");
            this.f6140d = l10 != null ? c0.a(l10) : new String[0];
            e1 l11 = f1Var.l("request_types");
            this.f6141e = l11 != null ? c0.a(l11) : new String[0];
            for (f1 f1Var2 : c0.b(f1Var.c("columns"))) {
                this.f6142f.add(new b(f1Var2));
            }
            for (f1 f1Var3 : c0.b(f1Var.c("indexes"))) {
                this.f6143g.add(new c(f1Var3, this.f6138b));
            }
            f1 n10 = f1Var.n("ttl");
            this.f6144h = n10 != null ? new d(n10) : null;
            this.f6145i = f1Var.m("queries").f();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int c() {
            return this.f6139c;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public String d() {
            return this.f6137a;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Map<String, String> e() {
            return this.f6145i;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public String f() {
            return this.f6138b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public d g() {
            return this.f6144h;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public List<b> a() {
            return this.f6142f;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public List<c> b() {
            return this.f6143g;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f6146a;

        /* renamed from: b  reason: collision with root package name */
        private final String f6147b;

        /* renamed from: c  reason: collision with root package name */
        private final Object f6148c;

        b(f1 f1Var) throws JSONException {
            this.f6146a = f1Var.e("name");
            this.f6147b = f1Var.e("type");
            this.f6148c = f1Var.o(RewardedVideo.VIDEO_MODE_DEFAULT);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Object a() {
            return this.f6148c;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public String b() {
            return this.f6146a;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public String c() {
            return this.f6147b;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class c {

        /* renamed from: a  reason: collision with root package name */
        private final String f6149a;

        /* renamed from: b  reason: collision with root package name */
        private final String[] f6150b;

        c(f1 f1Var, String str) throws JSONException {
            this.f6149a = str + "_" + f1Var.e("name");
            this.f6150b = c0.a(f1Var.c("columns"));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public String[] a() {
            return this.f6150b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public String b() {
            return this.f6149a;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class d {

        /* renamed from: a  reason: collision with root package name */
        private final long f6151a;

        /* renamed from: b  reason: collision with root package name */
        private final String f6152b;

        d(f1 f1Var) throws JSONException {
            this.f6151a = f1Var.d("seconds");
            this.f6152b = f1Var.e("column");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public String a() {
            return this.f6152b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public long b() {
            return this.f6151a;
        }
    }

    n0(f1 f1Var) throws JSONException {
        this.f6135a = f1Var.b("version");
        for (f1 f1Var2 : c0.b(f1Var.c("streams"))) {
            this.f6136b.add(new a(f1Var2));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static n0 a(f1 f1Var) {
        try {
            return new n0(f1Var);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.f6135a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<a> a() {
        return this.f6136b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a a(String str) {
        if (str.isEmpty()) {
            return null;
        }
        for (a aVar : this.f6136b) {
            for (String str2 : aVar.f6140d) {
                if (str.equals(str2)) {
                    return aVar;
                }
            }
            for (String str3 : aVar.f6141e) {
                if (str.equals(str3)) {
                    return aVar;
                }
            }
        }
        return null;
    }
}
