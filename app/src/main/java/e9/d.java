package e9;

import android.os.Handler;
import android.os.Looper;
import d9.d2;
import d9.f1;
import d9.g1;
import d9.n;
import d9.n2;
import i8.w;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.o;
import m8.g;
import t8.l;
import y8.i;
/* compiled from: HandlerDispatcher.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class d extends e {
    private volatile d _immediate;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f25195b;

    /* renamed from: c  reason: collision with root package name */
    private final String f25196c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f25197d;

    /* renamed from: e  reason: collision with root package name */
    private final d f25198e;

    /* compiled from: Runnable.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f25199a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f25200b;

        public a(n nVar, d dVar) {
            this.f25199a = nVar;
            this.f25200b = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f25199a.g(this.f25200b, w.f26638a);
        }
    }

    /* compiled from: HandlerDispatcher.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    static final class b extends o implements l<Throwable, w> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Runnable f25202b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Runnable runnable) {
            super(1);
            this.f25202b = runnable;
        }

        @Override // t8.l
        public /* bridge */ /* synthetic */ w invoke(Throwable th) {
            invoke2(th);
            return w.f26638a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            d.this.f25195b.removeCallbacks(this.f25202b);
        }
    }

    private d(Handler handler, String str, boolean z10) {
        super(null);
        this.f25195b = handler;
        this.f25196c = str;
        this.f25197d = z10;
        this._immediate = z10 ? this : null;
        d dVar = this._immediate;
        if (dVar == null) {
            dVar = new d(handler, str, true);
            this._immediate = dVar;
        }
        this.f25198e = dVar;
    }

    private final void O0(g gVar, Runnable runnable) {
        d2.c(gVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        f1.b().G0(gVar, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q0(d dVar, Runnable runnable) {
        dVar.f25195b.removeCallbacks(runnable);
    }

    @Override // d9.j0
    public void G0(g gVar, Runnable runnable) {
        if (this.f25195b.post(runnable)) {
            return;
        }
        O0(gVar, runnable);
    }

    @Override // d9.j0
    public boolean I0(g gVar) {
        return (this.f25197d && kotlin.jvm.internal.n.a(Looper.myLooper(), this.f25195b.getLooper())) ? false : true;
    }

    @Override // d9.k2
    /* renamed from: P0 */
    public d K0() {
        return this.f25198e;
    }

    @Override // d9.y0
    public void R(long j10, n<? super w> nVar) {
        long d10;
        a aVar = new a(nVar, this);
        Handler handler = this.f25195b;
        d10 = i.d(j10, 4611686018427387903L);
        if (handler.postDelayed(aVar, d10)) {
            nVar.r(new b(aVar));
        } else {
            O0(nVar.getContext(), aVar);
        }
    }

    @Override // e9.e, d9.y0
    public g1 X(long j10, final Runnable runnable, g gVar) {
        long d10;
        Handler handler = this.f25195b;
        d10 = i.d(j10, 4611686018427387903L);
        if (handler.postDelayed(runnable, d10)) {
            return new g1() { // from class: e9.c
                @Override // d9.g1
                public final void d() {
                    d.Q0(d.this, runnable);
                }
            };
        }
        O0(gVar, runnable);
        return n2.f24492a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof d) && ((d) obj).f25195b == this.f25195b;
    }

    public int hashCode() {
        return System.identityHashCode(this.f25195b);
    }

    @Override // d9.k2, d9.j0
    public String toString() {
        String L0 = L0();
        if (L0 == null) {
            String str = this.f25196c;
            if (str == null) {
                str = this.f25195b.toString();
            }
            if (this.f25197d) {
                return str + ".immediate";
            }
            return str;
        }
        return L0;
    }

    public /* synthetic */ d(Handler handler, String str, int i10, h hVar) {
        this(handler, (i10 & 2) != 0 ? null : str);
    }

    public d(Handler handler, String str) {
        this(handler, str, false);
    }
}
