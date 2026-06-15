package com.iab.omid.library.adcolony.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.adcolony.c.a;
import com.iab.omid.library.adcolony.d.d;
import com.iab.omid.library.adcolony.d.f;
import com.iab.omid.library.adcolony.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class TreeWalker implements a.InterfaceC0199a {

    /* renamed from: a  reason: collision with root package name */
    private static TreeWalker f15638a = new TreeWalker();

    /* renamed from: b  reason: collision with root package name */
    private static Handler f15639b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    private static Handler f15640c = null;

    /* renamed from: l  reason: collision with root package name */
    private static final Runnable f15641l = new Runnable() { // from class: com.iab.omid.library.adcolony.walking.TreeWalker.2
        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.getInstance().h();
        }
    };

    /* renamed from: m  reason: collision with root package name */
    private static final Runnable f15642m = new Runnable() { // from class: com.iab.omid.library.adcolony.walking.TreeWalker.3
        @Override // java.lang.Runnable
        public void run() {
            if (TreeWalker.f15640c != null) {
                TreeWalker.f15640c.post(TreeWalker.f15641l);
                TreeWalker.f15640c.postDelayed(TreeWalker.f15642m, 200L);
            }
        }
    };

    /* renamed from: e  reason: collision with root package name */
    private int f15644e;

    /* renamed from: k  reason: collision with root package name */
    private long f15650k;

    /* renamed from: d  reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f15643d = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private boolean f15645f = false;

    /* renamed from: g  reason: collision with root package name */
    private final List<com.iab.omid.library.adcolony.e.a> f15646g = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private a f15648i = new a();

    /* renamed from: h  reason: collision with root package name */
    private com.iab.omid.library.adcolony.c.b f15647h = new com.iab.omid.library.adcolony.c.b();

    /* renamed from: j  reason: collision with root package name */
    private b f15649j = new b(new com.iab.omid.library.adcolony.walking.a.c());

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i10, long j10);
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i10, long j10);
    }

    TreeWalker() {
    }

    private void a(long j10) {
        if (this.f15643d.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f15643d) {
                treeWalkerTimeLogger.onTreeProcessed(this.f15644e, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f15644e, j10);
                }
            }
        }
    }

    private void a(View view, com.iab.omid.library.adcolony.c.a aVar, JSONObject jSONObject, c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == c.PARENT_VIEW, z10);
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.adcolony.c.a b10 = this.f15647h.b();
        String a10 = this.f15648i.a(str);
        if (a10 != null) {
            JSONObject a11 = b10.a(view);
            com.iab.omid.library.adcolony.d.b.a(a11, str);
            com.iab.omid.library.adcolony.d.b.b(a11, a10);
            com.iab.omid.library.adcolony.d.b.a(jSONObject, a11);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        String a10 = this.f15648i.a(view);
        if (a10 != null) {
            com.iab.omid.library.adcolony.d.b.a(jSONObject, a10);
            com.iab.omid.library.adcolony.d.b.a(jSONObject, Boolean.valueOf(this.f15648i.d(view)));
            this.f15648i.e();
            return true;
        }
        return false;
    }

    private boolean b(View view, JSONObject jSONObject) {
        a.C0200a b10 = this.f15648i.b(view);
        if (b10 != null) {
            com.iab.omid.library.adcolony.d.b.a(jSONObject, b10);
            return true;
        }
        return false;
    }

    public static TreeWalker getInstance() {
        return f15638a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        i();
        d();
        j();
    }

    private void i() {
        this.f15644e = 0;
        this.f15646g.clear();
        this.f15645f = false;
        Iterator<com.iab.omid.library.adcolony.adsession.a> it = com.iab.omid.library.adcolony.b.a.a().c().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().b()) {
                this.f15645f = true;
                break;
            }
        }
        this.f15650k = d.a();
    }

    private void j() {
        a(d.a() - this.f15650k);
    }

    private void k() {
        if (f15640c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f15640c = handler;
            handler.post(f15641l);
            f15640c.postDelayed(f15642m, 200L);
        }
    }

    private void l() {
        Handler handler = f15640c;
        if (handler != null) {
            handler.removeCallbacks(f15642m);
            f15640c = null;
        }
    }

    public void a() {
        k();
    }

    @Override // com.iab.omid.library.adcolony.c.a.InterfaceC0199a
    public void a(View view, com.iab.omid.library.adcolony.c.a aVar, JSONObject jSONObject, boolean z10) {
        c c10;
        if (f.d(view) && (c10 = this.f15648i.c(view)) != c.UNDERLYING_VIEW) {
            JSONObject a10 = aVar.a(view);
            com.iab.omid.library.adcolony.d.b.a(jSONObject, a10);
            if (!a(view, a10)) {
                boolean z11 = z10 || b(view, a10);
                if (this.f15645f && c10 == c.OBSTRUCTION_VIEW && !z11) {
                    this.f15646g.add(new com.iab.omid.library.adcolony.e.a(view));
                }
                a(view, aVar, a10, c10, z11);
            }
            this.f15644e++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f15643d.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f15643d.add(treeWalkerTimeLogger);
    }

    public void b() {
        c();
        this.f15643d.clear();
        f15639b.post(new Runnable() { // from class: com.iab.omid.library.adcolony.walking.TreeWalker.1
            @Override // java.lang.Runnable
            public void run() {
                TreeWalker.this.f15649j.a();
            }
        });
    }

    public void c() {
        l();
    }

    void d() {
        this.f15648i.c();
        long a10 = d.a();
        com.iab.omid.library.adcolony.c.a a11 = this.f15647h.a();
        if (this.f15648i.b().size() > 0) {
            Iterator<String> it = this.f15648i.b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a12 = a11.a(null);
                a(next, this.f15648i.b(next), a12);
                com.iab.omid.library.adcolony.d.b.a(a12);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                this.f15649j.b(a12, hashSet, a10);
            }
        }
        if (this.f15648i.a().size() > 0) {
            JSONObject a13 = a11.a(null);
            a(null, a11, a13, c.PARENT_VIEW, false);
            com.iab.omid.library.adcolony.d.b.a(a13);
            this.f15649j.a(a13, this.f15648i.a(), a10);
            if (this.f15645f) {
                for (com.iab.omid.library.adcolony.adsession.a aVar : com.iab.omid.library.adcolony.b.a.a().c()) {
                    aVar.a(this.f15646g);
                }
            }
        } else {
            this.f15649j.a();
        }
        this.f15648i.d();
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f15643d.contains(treeWalkerTimeLogger)) {
            this.f15643d.remove(treeWalkerTimeLogger);
        }
    }
}
