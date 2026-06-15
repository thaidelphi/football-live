package o2;
/* compiled from: RequestCoordinator.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface d {

    /* compiled from: RequestCoordinator.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum a {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);
        

        /* renamed from: a  reason: collision with root package name */
        private final boolean f29101a;

        a(boolean z10) {
            this.f29101a = z10;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean a() {
            return this.f29101a;
        }
    }

    boolean a(c cVar);

    boolean b();

    boolean c(c cVar);

    boolean d(c cVar);

    void f(c cVar);

    d getRoot();

    void i(c cVar);
}
