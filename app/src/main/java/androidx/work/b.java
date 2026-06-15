package androidx.work;

import android.os.Build;
import com.google.android.gms.common.api.Api;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: Configuration.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    final Executor f4589a;

    /* renamed from: b  reason: collision with root package name */
    final Executor f4590b;

    /* renamed from: c  reason: collision with root package name */
    final c0 f4591c;

    /* renamed from: d  reason: collision with root package name */
    final m f4592d;

    /* renamed from: e  reason: collision with root package name */
    final x f4593e;

    /* renamed from: f  reason: collision with root package name */
    final k f4594f;

    /* renamed from: g  reason: collision with root package name */
    final String f4595g;

    /* renamed from: h  reason: collision with root package name */
    final int f4596h;

    /* renamed from: i  reason: collision with root package name */
    final int f4597i;

    /* renamed from: j  reason: collision with root package name */
    final int f4598j;

    /* renamed from: k  reason: collision with root package name */
    final int f4599k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f4600l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Configuration.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f4601a = new AtomicInteger(0);

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f4602b;

        a(boolean z10) {
            this.f4602b = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            String str = this.f4602b ? "WM.task-" : "androidx.work-";
            return new Thread(runnable, str + this.f4601a.incrementAndGet());
        }
    }

    /* compiled from: Configuration.java */
    /* renamed from: androidx.work.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class C0083b {

        /* renamed from: a  reason: collision with root package name */
        Executor f4604a;

        /* renamed from: b  reason: collision with root package name */
        c0 f4605b;

        /* renamed from: c  reason: collision with root package name */
        m f4606c;

        /* renamed from: d  reason: collision with root package name */
        Executor f4607d;

        /* renamed from: e  reason: collision with root package name */
        x f4608e;

        /* renamed from: f  reason: collision with root package name */
        k f4609f;

        /* renamed from: g  reason: collision with root package name */
        String f4610g;

        /* renamed from: h  reason: collision with root package name */
        int f4611h = 4;

        /* renamed from: i  reason: collision with root package name */
        int f4612i = 0;

        /* renamed from: j  reason: collision with root package name */
        int f4613j = Api.BaseClientBuilder.API_PRIORITY_OTHER;

        /* renamed from: k  reason: collision with root package name */
        int f4614k = 20;

        public b a() {
            return new b(this);
        }
    }

    /* compiled from: Configuration.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface c {
        b a();
    }

    b(C0083b c0083b) {
        Executor executor = c0083b.f4604a;
        if (executor == null) {
            this.f4589a = a(false);
        } else {
            this.f4589a = executor;
        }
        Executor executor2 = c0083b.f4607d;
        if (executor2 == null) {
            this.f4600l = true;
            this.f4590b = a(true);
        } else {
            this.f4600l = false;
            this.f4590b = executor2;
        }
        c0 c0Var = c0083b.f4605b;
        if (c0Var == null) {
            this.f4591c = c0.c();
        } else {
            this.f4591c = c0Var;
        }
        m mVar = c0083b.f4606c;
        if (mVar == null) {
            this.f4592d = m.c();
        } else {
            this.f4592d = mVar;
        }
        x xVar = c0083b.f4608e;
        if (xVar == null) {
            this.f4593e = new e1.a();
        } else {
            this.f4593e = xVar;
        }
        this.f4596h = c0083b.f4611h;
        this.f4597i = c0083b.f4612i;
        this.f4598j = c0083b.f4613j;
        this.f4599k = c0083b.f4614k;
        this.f4594f = c0083b.f4609f;
        this.f4595g = c0083b.f4610g;
    }

    private Executor a(boolean z10) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), b(z10));
    }

    private ThreadFactory b(boolean z10) {
        return new a(z10);
    }

    public String c() {
        return this.f4595g;
    }

    public k d() {
        return this.f4594f;
    }

    public Executor e() {
        return this.f4589a;
    }

    public m f() {
        return this.f4592d;
    }

    public int g() {
        return this.f4598j;
    }

    public int h() {
        if (Build.VERSION.SDK_INT == 23) {
            return this.f4599k / 2;
        }
        return this.f4599k;
    }

    public int i() {
        return this.f4597i;
    }

    public int j() {
        return this.f4596h;
    }

    public x k() {
        return this.f4593e;
    }

    public Executor l() {
        return this.f4590b;
    }

    public c0 m() {
        return this.f4591c;
    }
}
