package l9;

import i8.w;
import t8.q;
/* compiled from: Select.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class e implements d {

    /* renamed from: a  reason: collision with root package name */
    private final Object f27575a;

    /* renamed from: b  reason: collision with root package name */
    private final q<Object, j<?>, Object, w> f27576b;

    /* renamed from: c  reason: collision with root package name */
    private final q<j<?>, Object, Object, t8.l<Throwable, w>> f27577c;

    /* renamed from: d  reason: collision with root package name */
    private final q<Object, Object, Object, Object> f27578d;

    /* JADX WARN: Multi-variable type inference failed */
    public e(Object obj, q<Object, ? super j<?>, Object, w> qVar, q<? super j<?>, Object, Object, ? extends t8.l<? super Throwable, w>> qVar2) {
        q<Object, Object, Object, Object> qVar3;
        this.f27575a = obj;
        this.f27576b = qVar;
        this.f27577c = qVar2;
        qVar3 = k.f27605a;
        this.f27578d = qVar3;
    }

    @Override // l9.h
    public q<Object, j<?>, Object, w> a() {
        return this.f27576b;
    }

    @Override // l9.h
    public q<j<?>, Object, Object, t8.l<Throwable, w>> b() {
        return this.f27577c;
    }

    @Override // l9.h
    public q<Object, Object, Object, Object> c() {
        return this.f27578d;
    }

    @Override // l9.h
    public Object d() {
        return this.f27575a;
    }

    public /* synthetic */ e(Object obj, q qVar, q qVar2, int i10, kotlin.jvm.internal.h hVar) {
        this(obj, qVar, (i10 & 4) != 0 ? null : qVar2);
    }
}
