package androidx.room;

import androidx.room.q0;
import java.util.concurrent.Executor;
import v0.h;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: QueryInterceptorOpenHelperFactory.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class i0 implements h.c {

    /* renamed from: a  reason: collision with root package name */
    private final h.c f4199a;

    /* renamed from: b  reason: collision with root package name */
    private final q0.f f4200b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f4201c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i0(h.c cVar, q0.f fVar, Executor executor) {
        this.f4199a = cVar;
        this.f4200b = fVar;
        this.f4201c = executor;
    }

    @Override // v0.h.c
    public v0.h a(h.b bVar) {
        return new h0(this.f4199a.a(bVar), this.f4200b, this.f4201c);
    }
}
