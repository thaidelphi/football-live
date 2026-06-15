package com.iab.omid.library.startio.walking;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.startio.internal.e;
import com.iab.omid.library.startio.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<View, String> f16044a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<View, C0212a> f16045b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, View> f16046c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final HashSet<View> f16047d = new HashSet<>();

    /* renamed from: e  reason: collision with root package name */
    private final HashSet<String> f16048e = new HashSet<>();

    /* renamed from: f  reason: collision with root package name */
    private final HashSet<String> f16049f = new HashSet<>();

    /* renamed from: g  reason: collision with root package name */
    private final HashMap<String, String> f16050g = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    private final Map<View, Boolean> f16051h = new WeakHashMap();

    /* renamed from: i  reason: collision with root package name */
    private boolean f16052i;

    /* compiled from: Sta */
    /* renamed from: com.iab.omid.library.startio.walking.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class C0212a {

        /* renamed from: a  reason: collision with root package name */
        private final e f16053a;

        /* renamed from: b  reason: collision with root package name */
        private final ArrayList<String> f16054b = new ArrayList<>();

        public C0212a(e eVar, String str) {
            this.f16053a = eVar;
            a(str);
        }

        public e a() {
            return this.f16053a;
        }

        public void a(String str) {
            this.f16054b.add(str);
        }

        public ArrayList<String> b() {
            return this.f16054b;
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
            this.f16047d.addAll(hashSet);
            return null;
        }
        return "notAttached";
    }

    private void a(com.iab.omid.library.startio.adsession.a aVar) {
        for (e eVar : aVar.d()) {
            a(eVar, aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.startio.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0212a c0212a = this.f16045b.get(view);
        if (c0212a != null) {
            c0212a.a(aVar.getAdSessionId());
        } else {
            this.f16045b.put(view, new C0212a(eVar, aVar.getAdSessionId()));
        }
    }

    private Boolean b(View view) {
        if (view.hasWindowFocus()) {
            this.f16051h.remove(view);
            return Boolean.FALSE;
        } else if (this.f16051h.containsKey(view)) {
            return this.f16051h.get(view);
        } else {
            Map<View, Boolean> map = this.f16051h;
            Boolean bool = Boolean.FALSE;
            map.put(view, bool);
            return bool;
        }
    }

    public View a(String str) {
        return this.f16046c.get(str);
    }

    public void a() {
        this.f16044a.clear();
        this.f16045b.clear();
        this.f16046c.clear();
        this.f16047d.clear();
        this.f16048e.clear();
        this.f16049f.clear();
        this.f16050g.clear();
        this.f16052i = false;
    }

    public String b(String str) {
        return this.f16050g.get(str);
    }

    public HashSet<String> b() {
        return this.f16049f;
    }

    public C0212a c(View view) {
        C0212a c0212a = this.f16045b.get(view);
        if (c0212a != null) {
            this.f16045b.remove(view);
        }
        return c0212a;
    }

    public HashSet<String> c() {
        return this.f16048e;
    }

    public String d(View view) {
        if (this.f16044a.size() == 0) {
            return null;
        }
        String str = this.f16044a.get(view);
        if (str != null) {
            this.f16044a.remove(view);
        }
        return str;
    }

    public void d() {
        this.f16052i = true;
    }

    public c e(View view) {
        return this.f16047d.contains(view) ? c.PARENT_VIEW : this.f16052i ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void e() {
        com.iab.omid.library.startio.internal.c c10 = com.iab.omid.library.startio.internal.c.c();
        if (c10 != null) {
            for (com.iab.omid.library.startio.adsession.a aVar : c10.a()) {
                View c11 = aVar.c();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (c11 != null) {
                        String a10 = a(c11);
                        if (a10 == null) {
                            this.f16048e.add(adSessionId);
                            this.f16044a.put(c11, adSessionId);
                            a(aVar);
                        } else if (a10 != "noWindowFocus") {
                            this.f16049f.add(adSessionId);
                            this.f16046c.put(adSessionId, c11);
                            this.f16050g.put(adSessionId, a10);
                        }
                    } else {
                        this.f16049f.add(adSessionId);
                        this.f16050g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public boolean f(View view) {
        if (this.f16051h.containsKey(view)) {
            this.f16051h.put(view, Boolean.TRUE);
            return false;
        }
        return true;
    }
}
