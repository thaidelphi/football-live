package com.iab.omid.library.unity3d.walking;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.unity3d.internal.e;
import com.iab.omid.library.unity3d.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<View, String> f16172a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<View, C0216a> f16173b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, View> f16174c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final HashSet<View> f16175d = new HashSet<>();

    /* renamed from: e  reason: collision with root package name */
    private final HashSet<String> f16176e = new HashSet<>();

    /* renamed from: f  reason: collision with root package name */
    private final HashSet<String> f16177f = new HashSet<>();

    /* renamed from: g  reason: collision with root package name */
    private final HashMap<String, String> f16178g = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    private final Map<View, Boolean> f16179h = new WeakHashMap();

    /* renamed from: i  reason: collision with root package name */
    private boolean f16180i;

    /* renamed from: com.iab.omid.library.unity3d.walking.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class C0216a {

        /* renamed from: a  reason: collision with root package name */
        private final e f16181a;

        /* renamed from: b  reason: collision with root package name */
        private final ArrayList<String> f16182b = new ArrayList<>();

        public C0216a(e eVar, String str) {
            this.f16181a = eVar;
            a(str);
        }

        public e a() {
            return this.f16181a;
        }

        public void a(String str) {
            this.f16182b.add(str);
        }

        public ArrayList<String> b() {
            return this.f16182b;
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
            this.f16175d.addAll(hashSet);
            return null;
        }
        return "notAttached";
    }

    private void a(com.iab.omid.library.unity3d.adsession.a aVar) {
        for (e eVar : aVar.d()) {
            a(eVar, aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.unity3d.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0216a c0216a = this.f16173b.get(view);
        if (c0216a != null) {
            c0216a.a(aVar.getAdSessionId());
        } else {
            this.f16173b.put(view, new C0216a(eVar, aVar.getAdSessionId()));
        }
    }

    private Boolean b(View view) {
        if (view.hasWindowFocus()) {
            this.f16179h.remove(view);
            return Boolean.FALSE;
        } else if (this.f16179h.containsKey(view)) {
            return this.f16179h.get(view);
        } else {
            Map<View, Boolean> map = this.f16179h;
            Boolean bool = Boolean.FALSE;
            map.put(view, bool);
            return bool;
        }
    }

    public View a(String str) {
        return this.f16174c.get(str);
    }

    public void a() {
        this.f16172a.clear();
        this.f16173b.clear();
        this.f16174c.clear();
        this.f16175d.clear();
        this.f16176e.clear();
        this.f16177f.clear();
        this.f16178g.clear();
        this.f16180i = false;
    }

    public String b(String str) {
        return this.f16178g.get(str);
    }

    public HashSet<String> b() {
        return this.f16177f;
    }

    public C0216a c(View view) {
        C0216a c0216a = this.f16173b.get(view);
        if (c0216a != null) {
            this.f16173b.remove(view);
        }
        return c0216a;
    }

    public HashSet<String> c() {
        return this.f16176e;
    }

    public String d(View view) {
        if (this.f16172a.size() == 0) {
            return null;
        }
        String str = this.f16172a.get(view);
        if (str != null) {
            this.f16172a.remove(view);
        }
        return str;
    }

    public void d() {
        this.f16180i = true;
    }

    public c e(View view) {
        return this.f16175d.contains(view) ? c.PARENT_VIEW : this.f16180i ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void e() {
        com.iab.omid.library.unity3d.internal.c c10 = com.iab.omid.library.unity3d.internal.c.c();
        if (c10 != null) {
            for (com.iab.omid.library.unity3d.adsession.a aVar : c10.a()) {
                View c11 = aVar.c();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (c11 != null) {
                        String a10 = a(c11);
                        if (a10 == null) {
                            this.f16176e.add(adSessionId);
                            this.f16172a.put(c11, adSessionId);
                            a(aVar);
                        } else if (a10 != "noWindowFocus") {
                            this.f16177f.add(adSessionId);
                            this.f16174c.put(adSessionId, c11);
                            this.f16178g.put(adSessionId, a10);
                        }
                    } else {
                        this.f16177f.add(adSessionId);
                        this.f16178g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public boolean f(View view) {
        if (this.f16179h.containsKey(view)) {
            this.f16179h.put(view, Boolean.TRUE);
            return false;
        }
        return true;
    }
}
