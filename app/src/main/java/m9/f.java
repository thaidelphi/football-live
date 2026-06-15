package m9;

import i9.h0;
import i9.k0;
import java.util.concurrent.atomic.AtomicReferenceArray;
import m8.g;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Semaphore.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class f extends h0<f> {

    /* renamed from: e  reason: collision with root package name */
    private final AtomicReferenceArray f27831e;

    public f(long j10, f fVar, int i10) {
        super(j10, fVar, i10);
        int i11;
        i11 = e.f27830f;
        this.f27831e = new AtomicReferenceArray(i11);
    }

    @Override // i9.h0
    public int n() {
        int i10;
        i10 = e.f27830f;
        return i10;
    }

    @Override // i9.h0
    public void o(int i10, Throwable th, g gVar) {
        k0 k0Var;
        k0Var = e.f27829e;
        r().set(i10, k0Var);
        p();
    }

    public final AtomicReferenceArray r() {
        return this.f27831e;
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.f26659c + ", hashCode=" + hashCode() + ']';
    }
}
