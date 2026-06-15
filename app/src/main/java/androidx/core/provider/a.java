package androidx.core.provider;

import android.graphics.Typeface;
import android.os.Handler;
import androidx.core.provider.f;
import androidx.core.provider.g;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CallbackWithHandler.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final g.c f2690a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f2691b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CallbackWithHandler.java */
    /* renamed from: androidx.core.provider.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class RunnableC0041a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g.c f2692a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Typeface f2693b;

        RunnableC0041a(g.c cVar, Typeface typeface) {
            this.f2692a = cVar;
            this.f2693b = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2692a.b(this.f2693b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CallbackWithHandler.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g.c f2695a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f2696b;

        b(g.c cVar, int i10) {
            this.f2695a = cVar;
            this.f2696b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2695a.a(this.f2696b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(g.c cVar, Handler handler) {
        this.f2690a = cVar;
        this.f2691b = handler;
    }

    private void a(int i10) {
        this.f2691b.post(new b(this.f2690a, i10));
    }

    private void c(Typeface typeface) {
        this.f2691b.post(new RunnableC0041a(this.f2690a, typeface));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(f.e eVar) {
        if (eVar.a()) {
            c(eVar.f2720a);
        } else {
            a(eVar.f2721b);
        }
    }
}
