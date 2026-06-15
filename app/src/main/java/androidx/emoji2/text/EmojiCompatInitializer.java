package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.d;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.p;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class EmojiCompatInitializer implements x0.a<Boolean> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a extends d.c {
        protected a(Context context) {
            super(new b(context));
            b(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b implements d.g {

        /* renamed from: a  reason: collision with root package name */
        private final Context f3036a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public class a extends d.h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d.h f3037a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ThreadPoolExecutor f3038b;

            a(d.h hVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f3037a = hVar;
                this.f3038b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.d.h
            public void a(Throwable th) {
                try {
                    this.f3037a.a(th);
                } finally {
                    this.f3038b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.d.h
            public void b(l lVar) {
                try {
                    this.f3037a.b(lVar);
                } finally {
                    this.f3038b.shutdown();
                }
            }
        }

        b(Context context) {
            this.f3036a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.d.g
        public void a(final d.h hVar) {
            final ThreadPoolExecutor b10 = androidx.emoji2.text.b.b("EmojiCompatInitializer");
            b10.execute(new Runnable() { // from class: androidx.emoji2.text.e
                @Override // java.lang.Runnable
                public final void run() {
                    EmojiCompatInitializer.b.this.d(hVar, b10);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public void d(d.h hVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                i a10 = androidx.emoji2.text.c.a(this.f3036a);
                if (a10 != null) {
                    a10.c(threadPoolExecutor);
                    a10.a().a(new a(hVar, threadPoolExecutor));
                    return;
                }
                throw new RuntimeException("EmojiCompat font provider not available on this device.");
            } catch (Throwable th) {
                hVar.a(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                androidx.core.os.n.a("EmojiCompat.EmojiCompatInitializer.run");
                if (d.h()) {
                    d.b().k();
                }
            } finally {
                androidx.core.os.n.b();
            }
        }
    }

    @Override // x0.a
    /* renamed from: a */
    public Boolean create(Context context) {
        if (Build.VERSION.SDK_INT >= 19) {
            d.g(new a(context));
            b(context);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    void b(Context context) {
        final androidx.lifecycle.i lifecycle = ((p) androidx.startup.a.e(context).f(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.a(new androidx.lifecycle.d() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.d
            public /* synthetic */ void a(p pVar) {
                androidx.lifecycle.c.a(this, pVar);
            }

            @Override // androidx.lifecycle.d
            public void b(p pVar) {
                EmojiCompatInitializer.this.c();
                lifecycle.d(this);
            }

            @Override // androidx.lifecycle.d
            public /* synthetic */ void c(p pVar) {
                androidx.lifecycle.c.c(this, pVar);
            }

            @Override // androidx.lifecycle.d
            public /* synthetic */ void d(p pVar) {
                androidx.lifecycle.c.e(this, pVar);
            }

            @Override // androidx.lifecycle.d
            public /* synthetic */ void e(p pVar) {
                androidx.lifecycle.c.b(this, pVar);
            }

            @Override // androidx.lifecycle.d
            public /* synthetic */ void f(p pVar) {
                androidx.lifecycle.c.d(this, pVar);
            }
        });
    }

    void c() {
        androidx.emoji2.text.b.d().postDelayed(new c(), 500L);
    }

    @Override // x0.a
    public List<Class<? extends x0.a<?>>> dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
