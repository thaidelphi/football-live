package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.core.provider.g;
import androidx.emoji2.text.d;
import androidx.emoji2.text.i;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
/* compiled from: FontRequestEmojiCompatConfig.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class i extends d.c {

    /* renamed from: j  reason: collision with root package name */
    private static final a f3101j = new a();

    /* compiled from: FontRequestEmojiCompatConfig.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a {
        public Typeface a(Context context, g.b bVar) throws PackageManager.NameNotFoundException {
            return androidx.core.provider.g.a(context, null, new g.b[]{bVar});
        }

        public g.a b(Context context, androidx.core.provider.e eVar) throws PackageManager.NameNotFoundException {
            return androidx.core.provider.g.b(context, null, eVar);
        }

        public void c(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FontRequestEmojiCompatConfig.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b implements d.g {

        /* renamed from: a  reason: collision with root package name */
        private final Context f3102a;

        /* renamed from: b  reason: collision with root package name */
        private final androidx.core.provider.e f3103b;

        /* renamed from: c  reason: collision with root package name */
        private final a f3104c;

        /* renamed from: d  reason: collision with root package name */
        private final Object f3105d = new Object();

        /* renamed from: e  reason: collision with root package name */
        private Handler f3106e;

        /* renamed from: f  reason: collision with root package name */
        private Executor f3107f;

        /* renamed from: g  reason: collision with root package name */
        private ThreadPoolExecutor f3108g;

        /* renamed from: h  reason: collision with root package name */
        d.h f3109h;

        /* renamed from: i  reason: collision with root package name */
        private ContentObserver f3110i;

        /* renamed from: j  reason: collision with root package name */
        private Runnable f3111j;

        b(Context context, androidx.core.provider.e eVar, a aVar) {
            androidx.core.util.i.g(context, "Context cannot be null");
            androidx.core.util.i.g(eVar, "FontRequest cannot be null");
            this.f3102a = context.getApplicationContext();
            this.f3103b = eVar;
            this.f3104c = aVar;
        }

        private void b() {
            synchronized (this.f3105d) {
                this.f3109h = null;
                ContentObserver contentObserver = this.f3110i;
                if (contentObserver != null) {
                    this.f3104c.c(this.f3102a, contentObserver);
                    this.f3110i = null;
                }
                Handler handler = this.f3106e;
                if (handler != null) {
                    handler.removeCallbacks(this.f3111j);
                }
                this.f3106e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f3108g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f3107f = null;
                this.f3108g = null;
            }
        }

        private g.b e() {
            try {
                g.a b10 = this.f3104c.b(this.f3102a, this.f3103b);
                if (b10.c() == 0) {
                    g.b[] b11 = b10.b();
                    if (b11 != null && b11.length != 0) {
                        return b11[0];
                    }
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                throw new RuntimeException("fetchFonts failed (" + b10.c() + ")");
            } catch (PackageManager.NameNotFoundException e8) {
                throw new RuntimeException("provider not found", e8);
            }
        }

        @Override // androidx.emoji2.text.d.g
        public void a(d.h hVar) {
            androidx.core.util.i.g(hVar, "LoaderCallback cannot be null");
            synchronized (this.f3105d) {
                this.f3109h = hVar;
            }
            d();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void c() {
            synchronized (this.f3105d) {
                if (this.f3109h == null) {
                    return;
                }
                try {
                    g.b e8 = e();
                    int b10 = e8.b();
                    if (b10 == 2) {
                        synchronized (this.f3105d) {
                        }
                    }
                    if (b10 == 0) {
                        androidx.core.os.n.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        Typeface a10 = this.f3104c.a(this.f3102a, e8);
                        ByteBuffer f10 = androidx.core.graphics.l.f(this.f3102a, null, e8.d());
                        if (f10 != null && a10 != null) {
                            l b11 = l.b(a10, f10);
                            androidx.core.os.n.b();
                            synchronized (this.f3105d) {
                                d.h hVar = this.f3109h;
                                if (hVar != null) {
                                    hVar.b(b11);
                                }
                            }
                            b();
                            return;
                        }
                        throw new RuntimeException("Unable to open file.");
                    }
                    throw new RuntimeException("fetchFonts result is not OK. (" + b10 + ")");
                } catch (Throwable th) {
                    synchronized (this.f3105d) {
                        d.h hVar2 = this.f3109h;
                        if (hVar2 != null) {
                            hVar2.a(th);
                        }
                        b();
                    }
                }
            }
        }

        void d() {
            synchronized (this.f3105d) {
                if (this.f3109h == null) {
                    return;
                }
                if (this.f3107f == null) {
                    ThreadPoolExecutor b10 = androidx.emoji2.text.b.b("emojiCompat");
                    this.f3108g = b10;
                    this.f3107f = b10;
                }
                this.f3107f.execute(new Runnable() { // from class: androidx.emoji2.text.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        i.b.this.c();
                    }
                });
            }
        }

        public void f(Executor executor) {
            synchronized (this.f3105d) {
                this.f3107f = executor;
            }
        }
    }

    public i(Context context, androidx.core.provider.e eVar) {
        super(new b(context, eVar, f3101j));
    }

    public i c(Executor executor) {
        ((b) a()).f(executor);
        return this;
    }
}
