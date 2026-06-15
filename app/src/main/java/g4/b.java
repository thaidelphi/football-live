package g4;

import java.util.NoSuchElementException;
/* compiled from: BaseMediaChunkIterator.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class b implements o {

    /* renamed from: b  reason: collision with root package name */
    private final long f25711b;

    /* renamed from: c  reason: collision with root package name */
    private final long f25712c;

    /* renamed from: d  reason: collision with root package name */
    private long f25713d;

    public b(long j10, long j11) {
        this.f25711b = j10;
        this.f25712c = j11;
        f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c() {
        long j10 = this.f25713d;
        if (j10 < this.f25711b || j10 > this.f25712c) {
            throw new NoSuchElementException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long d() {
        return this.f25713d;
    }

    public boolean e() {
        return this.f25713d > this.f25712c;
    }

    public void f() {
        this.f25713d = this.f25711b - 1;
    }

    @Override // g4.o
    public boolean next() {
        this.f25713d++;
        return !e();
    }
}
