package com.iab.omid.library.ironsrc.walking;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.ironsrc.internal.e;
import com.iab.omid.library.ironsrc.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<View, String> f15915a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<View, C0208a> f15916b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, View> f15917c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final HashSet<View> f15918d = new HashSet<>();

    /* renamed from: e  reason: collision with root package name */
    private final HashSet<String> f15919e = new HashSet<>();

    /* renamed from: f  reason: collision with root package name */
    private final HashSet<String> f15920f = new HashSet<>();

    /* renamed from: g  reason: collision with root package name */
    private final HashMap<String, String> f15921g = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    private final HashSet<String> f15922h = new HashSet<>();

    /* renamed from: i  reason: collision with root package name */
    private final Map<View, Boolean> f15923i = new WeakHashMap();

    /* renamed from: j  reason: collision with root package name */
    private boolean f15924j;

    /* renamed from: com.iab.omid.library.ironsrc.walking.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class C0208a {

        /* renamed from: a  reason: collision with root package name */
        private final e f15925a;

        /* renamed from: b  reason: collision with root package name */
        private final ArrayList<String> f15926b = new ArrayList<>();

        public C0208a(e eVar, String str) {
            this.f15925a = eVar;
            a(str);
        }

        public e a() {
            return this.f15925a;
        }

        public void a(String str) {
            this.f15926b.add(str);
        }

        public ArrayList<String> b() {
            return this.f15926b;
        }
    }

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.f15923i.remove(view);
            return Boolean.FALSE;
        } else if (this.f15923i.containsKey(view)) {
            return this.f15923i.get(view);
        } else {
            Map<View, Boolean> map = this.f15923i;
            Boolean bool = Boolean.FALSE;
            map.put(view, bool);
            return bool;
        }
    }

    private String a(View view, boolean z10) {
        if (Build.VERSION.SDK_INT < 19 || view.isAttachedToWindow()) {
            if (!a(view).booleanValue() || z10) {
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
                this.f15918d.addAll(hashSet);
                return null;
            }
            return "noWindowFocus";
        }
        return "notAttached";
    }

    private void a(com.iab.omid.library.ironsrc.adsession.a aVar) {
        for (e eVar : aVar.d()) {
            a(eVar, aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.ironsrc.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0208a c0208a = this.f15916b.get(view);
        if (c0208a != null) {
            c0208a.a(aVar.getAdSessionId());
        } else {
            this.f15916b.put(view, new C0208a(eVar, aVar.getAdSessionId()));
        }
    }

    public View a(String str) {
        return this.f15917c.get(str);
    }

    public void a() {
        this.f15915a.clear();
        this.f15916b.clear();
        this.f15917c.clear();
        this.f15918d.clear();
        this.f15919e.clear();
        this.f15920f.clear();
        this.f15921g.clear();
        this.f15924j = false;
        this.f15922h.clear();
    }

    public C0208a b(View view) {
        C0208a c0208a = this.f15916b.get(view);
        if (c0208a != null) {
            this.f15916b.remove(view);
        }
        return c0208a;
    }

    public String b(String str) {
        return this.f15921g.get(str);
    }

    public HashSet<String> b() {
        return this.f15920f;
    }

    public String c(View view) {
        if (this.f15915a.size() == 0) {
            return null;
        }
        String str = this.f15915a.get(view);
        if (str != null) {
            this.f15915a.remove(view);
        }
        return str;
    }

    public HashSet<String> c() {
        return this.f15919e;
    }

    public boolean c(String str) {
        return this.f15922h.contains(str);
    }

    public c d(View view) {
        return this.f15918d.contains(view) ? c.PARENT_VIEW : this.f15924j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void d() {
        this.f15924j = true;
    }

    public void e() {
        com.iab.omid.library.ironsrc.internal.c c10 = com.iab.omid.library.ironsrc.internal.c.c();
        if (c10 != null) {
            for (com.iab.omid.library.ironsrc.adsession.a aVar : c10.a()) {
                View c11 = aVar.c();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (c11 != null) {
                        boolean e8 = h.e(c11);
                        if (e8) {
                            this.f15922h.add(adSessionId);
                        }
                        String a10 = a(c11, e8);
                        if (a10 == null) {
                            this.f15919e.add(adSessionId);
                            this.f15915a.put(c11, adSessionId);
                            a(aVar);
                        } else if (a10 != "noWindowFocus") {
                            this.f15920f.add(adSessionId);
                            this.f15917c.put(adSessionId, c11);
                            this.f15921g.put(adSessionId, a10);
                        }
                    } else {
                        this.f15920f.add(adSessionId);
                        this.f15921g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public boolean e(View view) {
        if (this.f15923i.containsKey(view)) {
            this.f15923i.put(view, Boolean.TRUE);
            return false;
        }
        return true;
    }
}
