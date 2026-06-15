package com.iab.omid.library.ironsrc.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.ironsrc.internal.j;
import com.iab.omid.library.ironsrc.processor.a;
import com.iab.omid.library.ironsrc.utils.f;
import com.iab.omid.library.ironsrc.utils.h;
import com.iab.omid.library.ironsrc.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class TreeWalker implements a.InterfaceC0206a {

    /* renamed from: i  reason: collision with root package name */
    private static TreeWalker f15901i = new TreeWalker();

    /* renamed from: j  reason: collision with root package name */
    private static Handler f15902j = new Handler(Looper.getMainLooper());

    /* renamed from: k  reason: collision with root package name */
    private static Handler f15903k = null;

    /* renamed from: l  reason: collision with root package name */
    private static final Runnable f15904l = new b();

    /* renamed from: m  reason: collision with root package name */
    private static final Runnable f15905m = new c();

    /* renamed from: b  reason: collision with root package name */
    private int f15907b;

    /* renamed from: h  reason: collision with root package name */
    private long f15913h;

    /* renamed from: a  reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f15906a = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private boolean f15908c = false;

    /* renamed from: d  reason: collision with root package name */
    private final List<com.iab.omid.library.ironsrc.weakreference.a> f15909d = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private com.iab.omid.library.ironsrc.walking.a f15911f = new com.iab.omid.library.ironsrc.walking.a();

    /* renamed from: e  reason: collision with root package name */
    private com.iab.omid.library.ironsrc.processor.b f15910e = new com.iab.omid.library.ironsrc.processor.b();

    /* renamed from: g  reason: collision with root package name */
    private com.iab.omid.library.ironsrc.walking.b f15912g = new com.iab.omid.library.ironsrc.walking.b(new com.iab.omid.library.ironsrc.walking.async.c());

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
            TreeWalker.this.f15912g.b();
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
            if (TreeWalker.f15903k != null) {
                TreeWalker.f15903k.post(TreeWalker.f15904l);
                TreeWalker.f15903k.postDelayed(TreeWalker.f15905m, 200L);
            }
        }
    }

    TreeWalker() {
    }

    private void a(long j10) {
        if (this.f15906a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f15906a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f15907b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f15907b, j10);
                }
            }
        }
    }

    private void a(View view, com.iab.omid.library.ironsrc.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.ironsrc.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.ironsrc.walking.c.PARENT_VIEW, z10);
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.ironsrc.processor.a b10 = this.f15910e.b();
        String b11 = this.f15911f.b(str);
        if (b11 != null) {
            JSONObject a10 = b10.a(view);
            com.iab.omid.library.ironsrc.utils.c.a(a10, str);
            com.iab.omid.library.ironsrc.utils.c.b(a10, b11);
            com.iab.omid.library.ironsrc.utils.c.a(jSONObject, a10);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        a.C0208a b10 = this.f15911f.b(view);
        if (b10 != null) {
            com.iab.omid.library.ironsrc.utils.c.a(jSONObject, b10);
            return true;
        }
        return false;
    }

    private boolean b(View view, JSONObject jSONObject) {
        String c10 = this.f15911f.c(view);
        if (c10 != null) {
            com.iab.omid.library.ironsrc.utils.c.a(jSONObject, c10);
            com.iab.omid.library.ironsrc.utils.c.a(jSONObject, Boolean.valueOf(this.f15911f.e(view)));
            com.iab.omid.library.ironsrc.utils.c.b(jSONObject, Boolean.valueOf(this.f15911f.c(c10)));
            this.f15911f.d();
            return true;
        }
        return false;
    }

    private void d() {
        a(f.b() - this.f15913h);
    }

    private void e() {
        this.f15907b = 0;
        this.f15909d.clear();
        this.f15908c = false;
        Iterator<com.iab.omid.library.ironsrc.adsession.a> it = com.iab.omid.library.ironsrc.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().e()) {
                this.f15908c = true;
                break;
            }
        }
        this.f15913h = f.b();
    }

    public static TreeWalker getInstance() {
        return f15901i;
    }

    private void i() {
        if (f15903k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f15903k = handler;
            handler.post(f15904l);
            f15903k.postDelayed(f15905m, 200L);
        }
    }

    private void k() {
        Handler handler = f15903k;
        if (handler != null) {
            handler.removeCallbacks(f15905m);
            f15903k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        e();
        f();
        d();
        j.b().a();
    }

    @Override // com.iab.omid.library.ironsrc.processor.a.InterfaceC0206a
    public void a(View view, com.iab.omid.library.ironsrc.processor.a aVar, JSONObject jSONObject, boolean z10) {
        com.iab.omid.library.ironsrc.walking.c d10;
        if (h.f(view) && (d10 = this.f15911f.d(view)) != com.iab.omid.library.ironsrc.walking.c.UNDERLYING_VIEW) {
            JSONObject a10 = aVar.a(view);
            com.iab.omid.library.ironsrc.utils.c.a(jSONObject, a10);
            if (!b(view, a10)) {
                boolean z11 = z10 || a(view, a10);
                if (this.f15908c && d10 == com.iab.omid.library.ironsrc.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f15909d.add(new com.iab.omid.library.ironsrc.weakreference.a(view));
                }
                a(view, aVar, a10, d10, z11);
            }
            this.f15907b++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f15906a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f15906a.add(treeWalkerTimeLogger);
    }

    void f() {
        this.f15911f.e();
        long b10 = f.b();
        com.iab.omid.library.ironsrc.processor.a a10 = this.f15910e.a();
        if (this.f15911f.b().size() > 0) {
            Iterator<String> it = this.f15911f.b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a11 = a10.a(null);
                a(next, this.f15911f.a(next), a11);
                com.iab.omid.library.ironsrc.utils.c.b(a11);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                this.f15912g.a(a11, hashSet, b10);
            }
        }
        if (this.f15911f.c().size() > 0) {
            JSONObject a12 = a10.a(null);
            a(null, a10, a12, com.iab.omid.library.ironsrc.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.ironsrc.utils.c.b(a12);
            this.f15912g.b(a12, this.f15911f.c(), b10);
            if (this.f15908c) {
                for (com.iab.omid.library.ironsrc.adsession.a aVar : com.iab.omid.library.ironsrc.internal.c.c().a()) {
                    aVar.a(this.f15909d);
                }
            }
        } else {
            this.f15912g.b();
        }
        this.f15911f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f15906a.clear();
        f15902j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f15906a.contains(treeWalkerTimeLogger)) {
            this.f15906a.remove(treeWalkerTimeLogger);
        }
    }
}
