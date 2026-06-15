package com.google.firebase.installations;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.d;
import f6.x;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import u6.d;
import u6.f;
/* compiled from: FirebaseInstallations.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class c implements r6.e {

    /* renamed from: m  reason: collision with root package name */
    private static final Object f14849m = new Object();

    /* renamed from: n  reason: collision with root package name */
    private static final ThreadFactory f14850n = new a();

    /* renamed from: a  reason: collision with root package name */
    private final c6.e f14851a;

    /* renamed from: b  reason: collision with root package name */
    private final u6.c f14852b;

    /* renamed from: c  reason: collision with root package name */
    private final t6.c f14853c;

    /* renamed from: d  reason: collision with root package name */
    private final i f14854d;

    /* renamed from: e  reason: collision with root package name */
    private final x<t6.b> f14855e;

    /* renamed from: f  reason: collision with root package name */
    private final r6.g f14856f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f14857g;

    /* renamed from: h  reason: collision with root package name */
    private final ExecutorService f14858h;

    /* renamed from: i  reason: collision with root package name */
    private final Executor f14859i;

    /* renamed from: j  reason: collision with root package name */
    private String f14860j;

    /* renamed from: k  reason: collision with root package name */
    private Set<s6.a> f14861k;

    /* renamed from: l  reason: collision with root package name */
    private final List<h> f14862l;

    /* compiled from: FirebaseInstallations.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f14863a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        @SuppressLint({"ThreadPoolCreation"})
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f14863a.getAndIncrement())));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FirebaseInstallations.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f14864a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f14865b;

        static {
            int[] iArr = new int[f.b.values().length];
            f14865b = iArr;
            try {
                iArr[f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14865b[f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14865b[f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[d.b.values().length];
            f14864a = iArr2;
            try {
                iArr2[d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14864a[d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"ThreadPoolCreation"})
    public c(final c6.e eVar, q6.b<o6.i> bVar, ExecutorService executorService, Executor executor) {
        this(executorService, executor, eVar, new u6.c(eVar.j(), bVar), new t6.c(eVar), i.c(), new x(new q6.b() { // from class: r6.d
            @Override // q6.b
            public final Object get() {
                t6.b y10;
                y10 = com.google.firebase.installations.c.y(c6.e.this);
                return y10;
            }
        }), new r6.g());
    }

    private String A(t6.d dVar) {
        if ((!this.f14851a.l().equals("CHIME_ANDROID_SDK") && !this.f14851a.t()) || !dVar.m()) {
            return this.f14856f.a();
        }
        String f10 = o().f();
        return TextUtils.isEmpty(f10) ? this.f14856f.a() : f10;
    }

    private t6.d B(t6.d dVar) throws d {
        u6.d d10 = this.f14852b.d(l(), dVar.d(), t(), m(), (dVar.d() == null || dVar.d().length() != 11) ? null : o().i());
        int i10 = b.f14864a[d10.e().ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return dVar.q("BAD CONFIG");
            }
            throw new d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
        }
        return dVar.s(d10.c(), d10.d(), this.f14854d.b(), d10.b().c(), d10.b().d());
    }

    private void C(Exception exc) {
        synchronized (this.f14857g) {
            Iterator<h> it = this.f14862l.iterator();
            while (it.hasNext()) {
                if (it.next().a(exc)) {
                    it.remove();
                }
            }
        }
    }

    private void D(t6.d dVar) {
        synchronized (this.f14857g) {
            Iterator<h> it = this.f14862l.iterator();
            while (it.hasNext()) {
                if (it.next().b(dVar)) {
                    it.remove();
                }
            }
        }
    }

    private synchronized void E(String str) {
        this.f14860j = str;
    }

    private synchronized void F(t6.d dVar, t6.d dVar2) {
        if (this.f14861k.size() != 0 && !TextUtils.equals(dVar.d(), dVar2.d())) {
            for (s6.a aVar : this.f14861k) {
                aVar.a(dVar2.d());
            }
        }
    }

    private Task<g> f() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        h(new e(this.f14854d, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task<String> g() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        h(new f(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private void h(h hVar) {
        synchronized (this.f14857g) {
            this.f14862l.add(hVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v(boolean r3) {
        /*
            r2 = this;
            t6.d r0 = r2.r()
            boolean r1 = r0.i()     // Catch: com.google.firebase.installations.d -> L5f
            if (r1 != 0) goto L22
            boolean r1 = r0.l()     // Catch: com.google.firebase.installations.d -> L5f
            if (r1 == 0) goto L11
            goto L22
        L11:
            if (r3 != 0) goto L1d
            com.google.firebase.installations.i r3 = r2.f14854d     // Catch: com.google.firebase.installations.d -> L5f
            boolean r3 = r3.f(r0)     // Catch: com.google.firebase.installations.d -> L5f
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            return
        L1d:
            t6.d r3 = r2.k(r0)     // Catch: com.google.firebase.installations.d -> L5f
            goto L26
        L22:
            t6.d r3 = r2.B(r0)     // Catch: com.google.firebase.installations.d -> L5f
        L26:
            r2.u(r3)
            r2.F(r0, r3)
            boolean r0 = r3.k()
            if (r0 == 0) goto L39
            java.lang.String r0 = r3.d()
            r2.E(r0)
        L39:
            boolean r0 = r3.i()
            if (r0 == 0) goto L4a
            com.google.firebase.installations.d r3 = new com.google.firebase.installations.d
            com.google.firebase.installations.d$a r0 = com.google.firebase.installations.d.a.BAD_CONFIG
            r3.<init>(r0)
            r2.C(r3)
            goto L5e
        L4a:
            boolean r0 = r3.j()
            if (r0 == 0) goto L5b
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r3.<init>(r0)
            r2.C(r3)
            goto L5e
        L5b:
            r2.D(r3)
        L5e:
            return
        L5f:
            r3 = move-exception
            r2.C(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.c.v(boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public final void x(final boolean z10) {
        t6.d s10 = s();
        if (z10) {
            s10 = s10.p();
        }
        D(s10);
        this.f14859i.execute(new Runnable() { // from class: r6.b
            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.installations.c.this.v(z10);
            }
        });
    }

    private t6.d k(t6.d dVar) throws d {
        u6.f e8 = this.f14852b.e(l(), dVar.d(), t(), dVar.f());
        int i10 = b.f14865b[e8.b().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    E(null);
                    return dVar.r();
                }
                throw new d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
            }
            return dVar.q("BAD CONFIG");
        }
        return dVar.o(e8.c(), e8.d(), this.f14854d.b());
    }

    private synchronized String n() {
        return this.f14860j;
    }

    private t6.b o() {
        return this.f14855e.get();
    }

    public static c p() {
        return q(c6.e.k());
    }

    public static c q(c6.e eVar) {
        Preconditions.b(eVar != null, "Null is not a valid value of FirebaseApp.");
        return (c) eVar.i(r6.e.class);
    }

    private t6.d r() {
        t6.d d10;
        synchronized (f14849m) {
            com.google.firebase.installations.b a10 = com.google.firebase.installations.b.a(this.f14851a.j(), "generatefid.lock");
            d10 = this.f14853c.d();
            if (a10 != null) {
                a10.b();
            }
        }
        return d10;
    }

    private t6.d s() {
        t6.d d10;
        synchronized (f14849m) {
            com.google.firebase.installations.b a10 = com.google.firebase.installations.b.a(this.f14851a.j(), "generatefid.lock");
            d10 = this.f14853c.d();
            if (d10.j()) {
                d10 = this.f14853c.b(d10.t(A(d10)));
            }
            if (a10 != null) {
                a10.b();
            }
        }
        return d10;
    }

    private void u(t6.d dVar) {
        synchronized (f14849m) {
            com.google.firebase.installations.b a10 = com.google.firebase.installations.b.a(this.f14851a.j(), "generatefid.lock");
            this.f14853c.b(dVar);
            if (a10 != null) {
                a10.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w() {
        x(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ t6.b y(c6.e eVar) {
        return new t6.b(eVar);
    }

    private void z() {
        Preconditions.h(m(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.h(t(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.h(l(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.b(i.h(m()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.b(i.g(l()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    @Override // r6.e
    public Task<g> a(final boolean z10) {
        z();
        Task<g> f10 = f();
        this.f14858h.execute(new Runnable() { // from class: r6.c
            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.installations.c.this.x(z10);
            }
        });
        return f10;
    }

    @Override // r6.e
    public Task<String> getId() {
        z();
        String n10 = n();
        if (n10 != null) {
            return Tasks.forResult(n10);
        }
        Task<String> g10 = g();
        this.f14858h.execute(new Runnable() { // from class: r6.a
            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.installations.c.this.w();
            }
        });
        return g10;
    }

    String l() {
        return this.f14851a.m().b();
    }

    String m() {
        return this.f14851a.m().c();
    }

    String t() {
        return this.f14851a.m().e();
    }

    @SuppressLint({"ThreadPoolCreation"})
    c(ExecutorService executorService, Executor executor, c6.e eVar, u6.c cVar, t6.c cVar2, i iVar, x<t6.b> xVar, r6.g gVar) {
        this.f14857g = new Object();
        this.f14861k = new HashSet();
        this.f14862l = new ArrayList();
        this.f14851a = eVar;
        this.f14852b = cVar;
        this.f14853c = cVar2;
        this.f14854d = iVar;
        this.f14855e = xVar;
        this.f14856f = gVar;
        this.f14858h = executorService;
        this.f14859i = executor;
    }
}
