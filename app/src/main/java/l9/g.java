package l9;

import i8.w;
import t8.q;
/* compiled from: Select.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class g<Q> implements f<Q> {

    /* renamed from: a  reason: collision with root package name */
    private final Object f27579a;

    /* renamed from: b  reason: collision with root package name */
    private final q<Object, j<?>, Object, w> f27580b;

    /* renamed from: c  reason: collision with root package name */
    private final q<Object, Object, Object, Object> f27581c;

    /* renamed from: d  reason: collision with root package name */
    private final q<j<?>, Object, Object, t8.l<Throwable, w>> f27582d;

    /* JADX WARN: Multi-variable type inference failed */
    public g(Object obj, q<Object, ? super j<?>, Object, w> qVar, q<Object, Object, Object, ? extends Object> qVar2, q<? super j<?>, Object, Object, ? extends t8.l<? super Throwable, w>> qVar3) {
        this.f27579a = obj;
        this.f27580b = qVar;
        this.f27581c = qVar2;
        this.f27582d = qVar3;
    }

    @Override // l9.h
    public q<Object, j<?>, Object, w> a() {
        return this.f27580b;
    }

    @Override // l9.h
    public q<j<?>, Object, Object, t8.l<Throwable, w>> b() {
        return this.f27582d;
    }

    @Override // l9.h
    public q<Object, Object, Object, Object> c() {
        return this.f27581c;
    }

    @Override // l9.h
    public Object d() {
        return this.f27579a;
    }
}
