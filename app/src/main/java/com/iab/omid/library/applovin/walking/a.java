package com.iab.omid.library.applovin.walking;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.applovin.internal.e;
import com.iab.omid.library.applovin.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<View, String> f15781a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<View, C0204a> f15782b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, View> f15783c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final HashSet<View> f15784d = new HashSet<>();

    /* renamed from: e  reason: collision with root package name */
    private final HashSet<String> f15785e = new HashSet<>();

    /* renamed from: f  reason: collision with root package name */
    private final HashSet<String> f15786f = new HashSet<>();

    /* renamed from: g  reason: collision with root package name */
    private final HashMap<String, String> f15787g = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    private final Map<View, Boolean> f15788h = new WeakHashMap();

    /* renamed from: i  reason: collision with root package name */
    private boolean f15789i;

    /* renamed from: com.iab.omid.library.applovin.walking.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class C0204a {

        /* renamed from: a  reason: collision with root package name */
        private final e f15790a;

        /* renamed from: b  reason: collision with root package name */
        private final ArrayList<String> f15791b = new ArrayList<>();

        public C0204a(e eVar, String str) {
            this.f15790a = eVar;
            a(str);
        }

        public e a() {
            return this.f15790a;
        }

        public void a(String str) {
            this.f15791b.add(str);
        }

        public ArrayList<String> b() {
            return this.f15791b;
        }
    }

    private String a(View view) {
        if (Build.VERSION.SDK_INT < 19 || view.isAttachedToWindow()) {
            if (b(view).booleanValue()) {
                return "noWindowFocus";
            }
            HashSet hashSet = new HashSet();
            while (view != null) {
                String a10 = h.a(view);
                if (a10 != null) {
                    return a10;
                }
                hashSet.add(view);
                ViewParent parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            this.f15784d.addAll(hashSet);
            return null;
        }
        return "notAttached";
    }

    private void a(com.iab.omid.library.applovin.adsession.a aVar) {
        for (e eVar : aVar.d()) {
            a(eVar, aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.applovin.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0204a c0204a = this.f15782b.get(view);
        if (c0204a != null) {
            c0204a.a(aVar.getAdSessionId());
        } else {
            this.f15782b.put(view, new C0204a(eVar, aVar.getAdSessionId()));
        }
    }

    private Boolean b(View view) {
        if (view.hasWindowFocus()) {
            this.f15788h.remove(view);
            return Boolean.FALSE;
        } else if (this.f15788h.containsKey(view)) {
            return this.f15788h.get(view);
        } else {
            Map<View, Boolean> map = this.f15788h;
            Boolean bool = Boolean.FALSE;
            map.put(view, bool);
            return bool;
        }
    }

    public View a(String str) {
        return this.f15783c.get(str);
    }

    public void a() {
        this.f15781a.clear();
        this.f15782b.clear();
        this.f15783c.clear();
        this.f15784d.clear();
        this.f15785e.clear();
        this.f15786f.clear();
        this.f15787g.clear();
        this.f15789i = false;
    }

    public String b(String str) {
        return this.f15787g.get(str);
    }

    public HashSet<String> b() {
        return this.f15786f;
    }

    public C0204a c(View view) {
        C0204a c0204a = this.f15782b.get(view);
        if (c0204a != null) {
            this.f15782b.remove(view);
        }
        return c0204a;
    }

    public HashSet<String> c() {
        return this.f15785e;
    }

    public String d(View view) {
        if (this.f15781a.size() == 0) {
            return null;
        }
        String str = this.f15781a.get(view);
        if (str != null) {
            this.f15781a.remove(view);
        }
        return str;
    }

    public void d() {
        this.f15789i = true;
    }

    public c e(View view) {
        return this.f15784d.contains(view) ? c.PARENT_VIEW : this.f15789i ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void e() {
        com.iab.omid.library.applovin.internal.c c10 = com.iab.omid.library.applovin.internal.c.c();
        if (c10 != null) {
            for (com.iab.omid.library.applovin.adsession.a aVar : c10.a()) {
                View c11 = aVar.c();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (c11 != null) {
                        String a10 = a(c11);
                        if (a10 == null) {
                            this.f15785e.add(adSessionId);
                            this.f15781a.put(c11, adSessionId);
                            a(aVar);
                        } else if (a10 != "noWindowFocus") {
                            this.f15786f.add(adSessionId);
                            this.f15783c.put(adSessionId, c11);
                            this.f15787g.put(adSessionId, a10);
                        }
                    } else {
                        this.f15786f.add(adSessionId);
                        this.f15787g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public boolean f(View view) {
        if (this.f15788h.containsKey(view)) {
            this.f15788h.put(view, Boolean.TRUE);
            return false;
        }
        return true;
    }
}
