package n3;

import android.os.Looper;
import java.util.concurrent.TimeoutException;
/* compiled from: PlayerMessage.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class t2 {

    /* renamed from: a  reason: collision with root package name */
    private final b f28354a;

    /* renamed from: b  reason: collision with root package name */
    private final a f28355b;

    /* renamed from: c  reason: collision with root package name */
    private final a5.d f28356c;

    /* renamed from: d  reason: collision with root package name */
    private final l3 f28357d;

    /* renamed from: e  reason: collision with root package name */
    private int f28358e;

    /* renamed from: f  reason: collision with root package name */
    private Object f28359f;

    /* renamed from: g  reason: collision with root package name */
    private Looper f28360g;

    /* renamed from: h  reason: collision with root package name */
    private int f28361h;

    /* renamed from: i  reason: collision with root package name */
    private long f28362i = -9223372036854775807L;

    /* renamed from: j  reason: collision with root package name */
    private boolean f28363j = true;

    /* renamed from: k  reason: collision with root package name */
    private boolean f28364k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f28365l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f28366m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f28367n;

    /* compiled from: PlayerMessage.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        void d(t2 t2Var);
    }

    /* compiled from: PlayerMessage.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b {
        void j(int i10, Object obj) throws q;
    }

    public t2(a aVar, b bVar, l3 l3Var, int i10, a5.d dVar, Looper looper) {
        this.f28355b = aVar;
        this.f28354a = bVar;
        this.f28357d = l3Var;
        this.f28360g = looper;
        this.f28356c = dVar;
        this.f28361h = i10;
    }

    public synchronized boolean a(long j10) throws InterruptedException, TimeoutException {
        boolean z10;
        a5.a.f(this.f28364k);
        a5.a.f(this.f28360g.getThread() != Thread.currentThread());
        long b10 = this.f28356c.b() + j10;
        while (true) {
            z10 = this.f28366m;
            if (z10 || j10 <= 0) {
                break;
            }
            this.f28356c.e();
            wait(j10);
            j10 = b10 - this.f28356c.b();
        }
        if (!z10) {
            throw new TimeoutException("Message delivery timed out.");
        }
        return this.f28365l;
    }

    public boolean b() {
        return this.f28363j;
    }

    public Looper c() {
        return this.f28360g;
    }

    public int d() {
        return this.f28361h;
    }

    public Object e() {
        return this.f28359f;
    }

    public long f() {
        return this.f28362i;
    }

    public b g() {
        return this.f28354a;
    }

    public l3 h() {
        return this.f28357d;
    }

    public int i() {
        return this.f28358e;
    }

    public synchronized boolean j() {
        return this.f28367n;
    }

    public synchronized void k(boolean z10) {
        this.f28365l = z10 | this.f28365l;
        this.f28366m = true;
        notifyAll();
    }

    public t2 l() {
        a5.a.f(!this.f28364k);
        if (this.f28362i == -9223372036854775807L) {
            a5.a.a(this.f28363j);
        }
        this.f28364k = true;
        this.f28355b.d(this);
        return this;
    }

    public t2 m(Object obj) {
        a5.a.f(!this.f28364k);
        this.f28359f = obj;
        return this;
    }

    public t2 n(int i10) {
        a5.a.f(!this.f28364k);
        this.f28358e = i10;
        return this;
    }
}
