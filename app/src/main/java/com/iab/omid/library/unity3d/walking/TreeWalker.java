package com.iab.omid.library.unity3d.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.unity3d.processor.a;
import com.iab.omid.library.unity3d.utils.f;
import com.iab.omid.library.unity3d.utils.h;
import com.iab.omid.library.unity3d.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class TreeWalker implements a.InterfaceC0214a {

    /* renamed from: i  reason: collision with root package name */
    private static TreeWalker f16158i = new TreeWalker();

    /* renamed from: j  reason: collision with root package name */
    private static Handler f16159j = new Handler(Looper.getMainLooper());

    /* renamed from: k  reason: collision with root package name */
    private static Handler f16160k = null;

    /* renamed from: l  reason: collision with root package name */
    private static final Runnable f16161l = new b();

    /* renamed from: m  reason: collision with root package name */
    private static final Runnable f16162m = new c();

    /* renamed from: b  reason: collision with root package name */
    private int f16164b;

    /* renamed from: h  reason: collision with root package name */
    private long f16170h;

    /* renamed from: a  reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f16163a = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private boolean f16165c = false;

    /* renamed from: d  reason: collision with root package name */
    private final List<com.iab.omid.library.unity3d.weakreference.a> f16166d = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private com.iab.omid.library.unity3d.walking.a f16168f = new com.iab.omid.library.unity3d.walking.a();

    /* renamed from: e  reason: collision with root package name */
    private com.iab.omid.library.unity3d.processor.b f16167e = new com.iab.omid.library.unity3d.processor.b();

    /* renamed from: g  reason: collision with root package name */
    private com.iab.omid.library.unity3d.walking.b f16169g = new com.iab.omid.library.unity3d.walking.b(new com.iab.omid.library.unity3d.walking.async.c());

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
            TreeWalker.this.f16169g.b();
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
            if (TreeWalker.f16160k != null) {
                TreeWalker.f16160k.post(TreeWalker.f16161l);
                TreeWalker.f16160k.postDelayed(TreeWalker.f16162m, 200L);
            }
        }
    }

    TreeWalker() {
    }

    private void a(long j10) {
        if (this.f16163a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f16163a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f16164b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f16164b, j10);
                }
            }
        }
    }

    private void a(View view, com.iab.omid.library.unity3d.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.unity3d.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.unity3d.walking.c.PARENT_VIEW, z10);
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.unity3d.processor.a b10 = this.f16167e.b();
        String b11 = this.f16168f.b(str);
        if (b11 != null) {
            JSONObject a10 = b10.a(view);
            com.iab.omid.library.unity3d.utils.c.a(a10, str);
            com.iab.omid.library.unity3d.utils.c.b(a10, b11);
            com.iab.omid.library.unity3d.utils.c.a(jSONObject, a10);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        a.C0216a c10 = this.f16168f.c(view);
        if (c10 != null) {
            com.iab.omid.library.unity3d.utils.c.a(jSONObject, c10);
            return true;
        }
        return false;
    }

    private boolean b(View view, JSONObject jSONObject) {
        String d10 = this.f16168f.d(view);
        if (d10 != null) {
            com.iab.omid.library.unity3d.utils.c.a(jSONObject, d10);
            com.iab.omid.library.unity3d.utils.c.a(jSONObject, Boolean.valueOf(this.f16168f.f(view)));
            this.f16168f.d();
            return true;
        }
        return false;
    }

    private void d() {
        a(f.b() - this.f16170h);
    }

    private void e() {
        this.f16164b = 0;
        this.f16166d.clear();
        this.f16165c = false;
        Iterator<com.iab.omid.library.unity3d.adsession.a> it = com.iab.omid.library.unity3d.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().e()) {
                this.f16165c = true;
                break;
            }
        }
        this.f16170h = f.b();
    }

    public static TreeWalker getInstance() {
        return f16158i;
    }

    private void i() {
        if (f16160k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f16160k = handler;
            handler.post(f16161l);
            f16160k.postDelayed(f16162m, 200L);
        }
    }

    private void k() {
        Handler handler = f16160k;
        if (handler != null) {
            handler.removeCallbacks(f16162m);
            f16160k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        e();
        f();
        d();
    }

    @Override // com.iab.omid.library.unity3d.processor.a.InterfaceC0214a
    public void a(View view, com.iab.omid.library.unity3d.processor.a aVar, JSONObject jSONObject, boolean z10) {
        com.iab.omid.library.unity3d.walking.c e8;
        if (h.d(view) && (e8 = this.f16168f.e(view)) != com.iab.omid.library.unity3d.walking.c.UNDERLYING_VIEW) {
            JSONObject a10 = aVar.a(view);
            com.iab.omid.library.unity3d.utils.c.a(jSONObject, a10);
            if (!b(view, a10)) {
                boolean z11 = z10 || a(view, a10);
                if (this.f16165c && e8 == com.iab.omid.library.unity3d.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f16166d.add(new com.iab.omid.library.unity3d.weakreference.a(view));
                }
                a(view, aVar, a10, e8, z11);
            }
            this.f16164b++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f16163a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f16163a.add(treeWalkerTimeLogger);
    }

    void f() {
        this.f16168f.e();
        long b10 = f.b();
        com.iab.omid.library.unity3d.processor.a a10 = this.f16167e.a();
        if (this.f16168f.b().size() > 0) {
            Iterator<String> it = this.f16168f.b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a11 = a10.a(null);
                a(next, this.f16168f.a(next), a11);
                com.iab.omid.library.unity3d.utils.c.b(a11);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                this.f16169g.a(a11, hashSet, b10);
            }
        }
        if (this.f16168f.c().size() > 0) {
            JSONObject a12 = a10.a(null);
            a(null, a10, a12, com.iab.omid.library.unity3d.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.unity3d.utils.c.b(a12);
            this.f16169g.b(a12, this.f16168f.c(), b10);
            if (this.f16165c) {
                for (com.iab.omid.library.unity3d.adsession.a aVar : com.iab.omid.library.unity3d.internal.c.c().a()) {
                    aVar.a(this.f16166d);
                }
            }
        } else {
            this.f16169g.b();
        }
        this.f16168f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f16163a.clear();
        f16159j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f16163a.contains(treeWalkerTimeLogger)) {
            this.f16163a.remove(treeWalkerTimeLogger);
        }
    }
}
