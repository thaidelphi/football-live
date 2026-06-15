package a5;
/* compiled from: ConditionVariable.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private final d f426a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f427b;

    public g() {
        this(d.f412a);
    }

    public synchronized void a() throws InterruptedException {
        while (!this.f427b) {
            wait();
        }
    }

    public synchronized void b() {
        boolean z10 = false;
        while (!this.f427b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean c() {
        boolean z10;
        z10 = this.f427b;
        this.f427b = false;
        return z10;
    }

    public synchronized boolean d() {
        return this.f427b;
    }

    public synchronized boolean e() {
        if (this.f427b) {
            return false;
        }
        this.f427b = true;
        notifyAll();
        return true;
    }

    public g(d dVar) {
        this.f426a = dVar;
    }
}
