package com.iab.omid.library.adcolony.walking;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.adcolony.d.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<View, String> f15652a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<View, C0200a> f15653b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, View> f15654c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final HashSet<View> f15655d = new HashSet<>();

    /* renamed from: e  reason: collision with root package name */
    private final HashSet<String> f15656e = new HashSet<>();

    /* renamed from: f  reason: collision with root package name */
    private final HashSet<String> f15657f = new HashSet<>();

    /* renamed from: g  reason: collision with root package name */
    private final HashMap<String, String> f15658g = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    private final Map<View, Boolean> f15659h = new WeakHashMap();

    /* renamed from: i  reason: collision with root package name */
    private boolean f15660i;

    /* renamed from: com.iab.omid.library.adcolony.walking.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class C0200a {

        /* renamed from: a  reason: collision with root package name */
        private final com.iab.omid.library.adcolony.b.c f15664a;

        /* renamed from: b  reason: collision with root package name */
        private final ArrayList<String> f15665b = new ArrayList<>();

        public C0200a(com.iab.omid.library.adcolony.b.c cVar, String str) {
            this.f15664a = cVar;
            a(str);
        }

        public com.iab.omid.library.adcolony.b.c a() {
            return this.f15664a;
        }

        public void a(String str) {
            this.f15665b.add(str);
        }

        public ArrayList<String> b() {
            return this.f15665b;
        }
    }

    private void a(com.iab.omid.library.adcolony.adsession.a aVar) {
        for (com.iab.omid.library.adcolony.b.c cVar : aVar.a()) {
            a(cVar, aVar);
        }
    }

    private void a(com.iab.omid.library.adcolony.b.c cVar, com.iab.omid.library.adcolony.adsession.a aVar) {
        View view = cVar.a().get();
        if (view == null) {
            return;
        }
        C0200a c0200a = this.f15653b.get(view);
        if (c0200a != null) {
            c0200a.a(aVar.getAdSessionId());
        } else {
            this.f15653b.put(view, new C0200a(cVar, aVar.getAdSessionId()));
        }
    }

    private String e(View view) {
        if (Build.VERSION.SDK_INT < 19 || view.isAttachedToWindow()) {
            if (f(view).booleanValue()) {
                return "noWindowFocus";
            }
            HashSet hashSet = new HashSet();
            while (view != null) {
                String e8 = f.e(view);
                if (e8 != null) {
                    return e8;
                }
                hashSet.add(view);
                ViewParent parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            this.f15655d.addAll(hashSet);
            return null;
        }
        return "notAttached";
    }

    private Boolean f(View view) {
        if (view.hasWindowFocus()) {
            this.f15659h.remove(view);
            return Boolean.FALSE;
        } else if (this.f15659h.containsKey(view)) {
            return this.f15659h.get(view);
        } else {
            Map<View, Boolean> map = this.f15659h;
            Boolean bool = Boolean.FALSE;
            map.put(view, bool);
            return bool;
        }
    }

    public String a(View view) {
        if (this.f15652a.size() == 0) {
            return null;
        }
        String str = this.f15652a.get(view);
        if (str != null) {
            this.f15652a.remove(view);
        }
        return str;
    }

    public String a(String str) {
        return this.f15658g.get(str);
    }

    public HashSet<String> a() {
        return this.f15656e;
    }

    public View b(String str) {
        return this.f15654c.get(str);
    }

    public C0200a b(View view) {
        C0200a c0200a = this.f15653b.get(view);
        if (c0200a != null) {
            this.f15653b.remove(view);
        }
        return c0200a;
    }

    public HashSet<String> b() {
        return this.f15657f;
    }

    public c c(View view) {
        return this.f15655d.contains(view) ? c.PARENT_VIEW : this.f15660i ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void c() {
        com.iab.omid.library.adcolony.b.a a10 = com.iab.omid.library.adcolony.b.a.a();
        if (a10 != null) {
            for (com.iab.omid.library.adcolony.adsession.a aVar : a10.c()) {
                View e8 = aVar.e();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (e8 != null) {
                        String e10 = e(e8);
                        if (e10 == null) {
                            this.f15656e.add(adSessionId);
                            this.f15652a.put(e8, adSessionId);
                            a(aVar);
                        } else if (e10 != "noWindowFocus") {
                            this.f15657f.add(adSessionId);
                            this.f15654c.put(adSessionId, e8);
                            this.f15658g.put(adSessionId, e10);
                        }
                    } else {
                        this.f15657f.add(adSessionId);
                        this.f15658g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public void d() {
        this.f15652a.clear();
        this.f15653b.clear();
        this.f15654c.clear();
        this.f15655d.clear();
        this.f15656e.clear();
        this.f15657f.clear();
        this.f15658g.clear();
        this.f15660i = false;
    }

    public boolean d(View view) {
        if (this.f15659h.containsKey(view)) {
            this.f15659h.put(view, Boolean.TRUE);
            return false;
        }
        return true;
    }

    public void e() {
        this.f15660i = true;
    }
}
