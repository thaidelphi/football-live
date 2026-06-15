package com.iab.omid.library.startio.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.startio.processor.a;
import com.iab.omid.library.startio.utils.f;
import com.iab.omid.library.startio.utils.h;
import com.iab.omid.library.startio.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class TreeWalker implements a.InterfaceC0210a {

    /* renamed from: i  reason: collision with root package name */
    private static TreeWalker f16030i = new TreeWalker();

    /* renamed from: j  reason: collision with root package name */
    private static Handler f16031j = new Handler(Looper.getMainLooper());

    /* renamed from: k  reason: collision with root package name */
    private static Handler f16032k = null;

    /* renamed from: l  reason: collision with root package name */
    private static final Runnable f16033l = new b();

    /* renamed from: m  reason: collision with root package name */
    private static final Runnable f16034m = new c();

    /* renamed from: b  reason: collision with root package name */
    private int f16036b;

    /* renamed from: h  reason: collision with root package name */
    private long f16042h;

    /* renamed from: a  reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f16035a = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private boolean f16037c = false;

    /* renamed from: d  reason: collision with root package name */
    private final List<com.iab.omid.library.startio.weakreference.a> f16038d = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private com.iab.omid.library.startio.walking.a f16040f = new com.iab.omid.library.startio.walking.a();

    /* renamed from: e  reason: collision with root package name */
    private com.iab.omid.library.startio.processor.b f16039e = new com.iab.omid.library.startio.processor.b();

    /* renamed from: g  reason: collision with root package name */
    private com.iab.omid.library.startio.walking.b f16041g = new com.iab.omid.library.startio.walking.b(new com.iab.omid.library.startio.walking.async.c());

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i10, long j10);
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i10, long j10);
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.this.f16041g.b();
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class b implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.getInstance().l();
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class c implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            if (TreeWalker.f16032k != null) {
                TreeWalker.f16032k.post(TreeWalker.f16033l);
                TreeWalker.f16032k.postDelayed(TreeWalker.f16034m, 200L);
            }
        }
    }

    private void a(long j10) {
        if (this.f16035a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f16035a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f16036b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f16036b, j10);
                }
            }
        }
    }

    private void a(View view, com.iab.omid.library.startio.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.startio.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.startio.walking.c.PARENT_VIEW, z10);
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.startio.processor.a b10 = this.f16039e.b();
        String b11 = this.f16040f.b(str);
        if (b11 != null) {
            JSONObject a10 = b10.a(view);
            com.iab.omid.library.startio.utils.c.a(a10, str);
            com.iab.omid.library.startio.utils.c.b(a10, b11);
            com.iab.omid.library.startio.utils.c.a(jSONObject, a10);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        a.C0212a c10 = this.f16040f.c(view);
        if (c10 != null) {
            com.iab.omid.library.startio.utils.c.a(jSONObject, c10);
            return true;
        }
        return false;
    }

    private boolean b(View view, JSONObject jSONObject) {
        String d10 = this.f16040f.d(view);
        if (d10 != null) {
            com.iab.omid.library.startio.utils.c.a(jSONObject, d10);
            com.iab.omid.library.startio.utils.c.a(jSONObject, Boolean.valueOf(this.f16040f.f(view)));
            this.f16040f.d();
            return true;
        }
        return false;
    }

    private void d() {
        a(f.b() - this.f16042h);
    }

    private void e() {
        this.f16036b = 0;
        this.f16038d.clear();
        this.f16037c = false;
        Iterator<com.iab.omid.library.startio.adsession.a> it = com.iab.omid.library.startio.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().e()) {
                this.f16037c = true;
                break;
            }
        }
        this.f16042h = f.b();
    }

    public static TreeWalker getInstance() {
        return f16030i;
    }

    private void i() {
        if (f16032k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f16032k = handler;
            handler.post(f16033l);
            f16032k.postDelayed(f16034m, 200L);
        }
    }

    private void k() {
        Handler handler = f16032k;
        if (handler != null) {
            handler.removeCallbacks(f16034m);
            f16032k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        e();
        f();
        d();
    }

    @Override // com.iab.omid.library.startio.processor.a.InterfaceC0210a
    public void a(View view, com.iab.omid.library.startio.processor.a aVar, JSONObject jSONObject, boolean z10) {
        com.iab.omid.library.startio.walking.c e8;
        if (h.d(view) && (e8 = this.f16040f.e(view)) != com.iab.omid.library.startio.walking.c.UNDERLYING_VIEW) {
            JSONObject a10 = aVar.a(view);
            com.iab.omid.library.startio.utils.c.a(jSONObject, a10);
            if (!b(view, a10)) {
                boolean z11 = z10 || a(view, a10);
                if (this.f16037c && e8 == com.iab.omid.library.startio.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f16038d.add(new com.iab.omid.library.startio.weakreference.a(view));
                }
                a(view, aVar, a10, e8, z11);
            }
            this.f16036b++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f16035a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f16035a.add(treeWalkerTimeLogger);
    }

    public void f() {
        this.f16040f.e();
        long b10 = f.b();
        com.iab.omid.library.startio.processor.a a10 = this.f16039e.a();
        if (this.f16040f.b().size() > 0) {
            Iterator<String> it = this.f16040f.b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a11 = a10.a(null);
                a(next, this.f16040f.a(next), a11);
                com.iab.omid.library.startio.utils.c.b(a11);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                this.f16041g.a(a11, hashSet, b10);
            }
        }
        if (this.f16040f.c().size() > 0) {
            JSONObject a12 = a10.a(null);
            a(null, a10, a12, com.iab.omid.library.startio.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.startio.utils.c.b(a12);
            this.f16041g.b(a12, this.f16040f.c(), b10);
            if (this.f16037c) {
                for (com.iab.omid.library.startio.adsession.a aVar : com.iab.omid.library.startio.internal.c.c().a()) {
                    aVar.a(this.f16038d);
                }
            }
        } else {
            this.f16041g.b();
        }
        this.f16040f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f16035a.clear();
        f16031j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f16035a.contains(treeWalkerTimeLogger)) {
            this.f16035a.remove(treeWalkerTimeLogger);
        }
    }
}
