package com.iab.omid.library.applovin.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.applovin.processor.a;
import com.iab.omid.library.applovin.utils.f;
import com.iab.omid.library.applovin.utils.h;
import com.iab.omid.library.applovin.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class TreeWalker implements a.InterfaceC0202a {

    /* renamed from: i  reason: collision with root package name */
    private static TreeWalker f15767i = new TreeWalker();

    /* renamed from: j  reason: collision with root package name */
    private static Handler f15768j = new Handler(Looper.getMainLooper());

    /* renamed from: k  reason: collision with root package name */
    private static Handler f15769k = null;

    /* renamed from: l  reason: collision with root package name */
    private static final Runnable f15770l = new b();

    /* renamed from: m  reason: collision with root package name */
    private static final Runnable f15771m = new c();

    /* renamed from: b  reason: collision with root package name */
    private int f15773b;

    /* renamed from: h  reason: collision with root package name */
    private long f15779h;

    /* renamed from: a  reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f15772a = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private boolean f15774c = false;

    /* renamed from: d  reason: collision with root package name */
    private final List<com.iab.omid.library.applovin.weakreference.a> f15775d = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private com.iab.omid.library.applovin.walking.a f15777f = new com.iab.omid.library.applovin.walking.a();

    /* renamed from: e  reason: collision with root package name */
    private com.iab.omid.library.applovin.processor.b f15776e = new com.iab.omid.library.applovin.processor.b();

    /* renamed from: g  reason: collision with root package name */
    private com.iab.omid.library.applovin.walking.b f15778g = new com.iab.omid.library.applovin.walking.b(new com.iab.omid.library.applovin.walking.async.c());

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i10, long j10);
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i10, long j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.this.f15778g.b();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.getInstance().l();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TreeWalker.f15769k != null) {
                TreeWalker.f15769k.post(TreeWalker.f15770l);
                TreeWalker.f15769k.postDelayed(TreeWalker.f15771m, 200L);
            }
        }
    }

    TreeWalker() {
    }

    private void a(long j10) {
        if (this.f15772a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f15772a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f15773b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f15773b, j10);
                }
            }
        }
    }

    private void a(View view, com.iab.omid.library.applovin.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.applovin.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.applovin.walking.c.PARENT_VIEW, z10);
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.applovin.processor.a b10 = this.f15776e.b();
        String b11 = this.f15777f.b(str);
        if (b11 != null) {
            JSONObject a10 = b10.a(view);
            com.iab.omid.library.applovin.utils.c.a(a10, str);
            com.iab.omid.library.applovin.utils.c.b(a10, b11);
            com.iab.omid.library.applovin.utils.c.a(jSONObject, a10);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        a.C0204a c10 = this.f15777f.c(view);
        if (c10 != null) {
            com.iab.omid.library.applovin.utils.c.a(jSONObject, c10);
            return true;
        }
        return false;
    }

    private boolean b(View view, JSONObject jSONObject) {
        String d10 = this.f15777f.d(view);
        if (d10 != null) {
            com.iab.omid.library.applovin.utils.c.a(jSONObject, d10);
            com.iab.omid.library.applovin.utils.c.a(jSONObject, Boolean.valueOf(this.f15777f.f(view)));
            this.f15777f.d();
            return true;
        }
        return false;
    }

    private void d() {
        a(f.b() - this.f15779h);
    }

    private void e() {
        this.f15773b = 0;
        this.f15775d.clear();
        this.f15774c = false;
        Iterator<com.iab.omid.library.applovin.adsession.a> it = com.iab.omid.library.applovin.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().e()) {
                this.f15774c = true;
                break;
            }
        }
        this.f15779h = f.b();
    }

    public static TreeWalker getInstance() {
        return f15767i;
    }

    private void i() {
        if (f15769k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f15769k = handler;
            handler.post(f15770l);
            f15769k.postDelayed(f15771m, 200L);
        }
    }

    private void k() {
        Handler handler = f15769k;
        if (handler != null) {
            handler.removeCallbacks(f15771m);
            f15769k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        e();
        f();
        d();
    }

    @Override // com.iab.omid.library.applovin.processor.a.InterfaceC0202a
    public void a(View view, com.iab.omid.library.applovin.processor.a aVar, JSONObject jSONObject, boolean z10) {
        com.iab.omid.library.applovin.walking.c e8;
        if (h.d(view) && (e8 = this.f15777f.e(view)) != com.iab.omid.library.applovin.walking.c.UNDERLYING_VIEW) {
            JSONObject a10 = aVar.a(view);
            com.iab.omid.library.applovin.utils.c.a(jSONObject, a10);
            if (!b(view, a10)) {
                boolean z11 = z10 || a(view, a10);
                if (this.f15774c && e8 == com.iab.omid.library.applovin.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f15775d.add(new com.iab.omid.library.applovin.weakreference.a(view));
                }
                a(view, aVar, a10, e8, z11);
            }
            this.f15773b++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f15772a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f15772a.add(treeWalkerTimeLogger);
    }

    void f() {
        this.f15777f.e();
        long b10 = f.b();
        com.iab.omid.library.applovin.processor.a a10 = this.f15776e.a();
        if (this.f15777f.b().size() > 0) {
            Iterator<String> it = this.f15777f.b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a11 = a10.a(null);
                a(next, this.f15777f.a(next), a11);
                com.iab.omid.library.applovin.utils.c.b(a11);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                this.f15778g.a(a11, hashSet, b10);
            }
        }
        if (this.f15777f.c().size() > 0) {
            JSONObject a12 = a10.a(null);
            a(null, a10, a12, com.iab.omid.library.applovin.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.applovin.utils.c.b(a12);
            this.f15778g.b(a12, this.f15777f.c(), b10);
            if (this.f15774c) {
                for (com.iab.omid.library.applovin.adsession.a aVar : com.iab.omid.library.applovin.internal.c.c().a()) {
                    aVar.a(this.f15775d);
                }
            }
        } else {
            this.f15778g.b();
        }
        this.f15777f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f15772a.clear();
        f15768j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f15772a.contains(treeWalkerTimeLogger)) {
            this.f15772a.remove(treeWalkerTimeLogger);
        }
    }
}
