package y8;

import j8.f0;
import java.util.NoSuchElementException;
/* compiled from: ProgressionIterators.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class e extends f0 {

    /* renamed from: a  reason: collision with root package name */
    private final long f33334a;

    /* renamed from: b  reason: collision with root package name */
    private final long f33335b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f33336c;

    /* renamed from: d  reason: collision with root package name */
    private long f33337d;

    public e(long j10, long j11, long j12) {
        this.f33334a = j12;
        this.f33335b = j11;
        boolean z10 = true;
        if (j12 <= 0 ? j10 < j11 : j10 > j11) {
            z10 = false;
        }
        this.f33336c = z10;
        this.f33337d = z10 ? j10 : j11;
    }

    @Override // j8.f0
    public long a() {
        long j10 = this.f33337d;
        if (j10 == this.f33335b) {
            if (this.f33336c) {
                this.f33336c = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f33337d = this.f33334a + j10;
        }
        return j10;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f33336c;
    }
}
