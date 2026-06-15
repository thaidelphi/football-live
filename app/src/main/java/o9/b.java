package o9;
/* compiled from: NamedRunnable.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public abstract class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    protected final String f29471a;

    public b(String str, Object... objArr) {
        this.f29471a = c.r(str, objArr);
    }

    protected abstract void k();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f29471a);
        try {
            k();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
