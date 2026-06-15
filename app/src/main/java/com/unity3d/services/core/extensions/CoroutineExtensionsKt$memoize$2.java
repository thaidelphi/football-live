package com.unity3d.services.core.extensions;

import d9.k;
import d9.o0;
import d9.w0;
import i8.w;
import java.util.LinkedHashMap;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.m;
import m8.d;
import m9.a;
import t8.p;
/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: CoroutineExtensions.kt */
@f(c = "com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2", f = "CoroutineExtensions.kt", l = {53, 45}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class CoroutineExtensionsKt$memoize$2<T> extends l implements p<o0, d<? super T>, Object> {
    final /* synthetic */ t8.l<d<? super T>, Object> $action;
    final /* synthetic */ Object $key;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CoroutineExtensionsKt$memoize$2(Object obj, t8.l<? super d<? super T>, ? extends Object> lVar, d<? super CoroutineExtensionsKt$memoize$2> dVar) {
        super(2, dVar);
        this.$key = obj;
        this.$action = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        CoroutineExtensionsKt$memoize$2 coroutineExtensionsKt$memoize$2 = new CoroutineExtensionsKt$memoize$2(this.$key, this.$action, dVar);
        coroutineExtensionsKt$memoize$2.L$0 = obj;
        return coroutineExtensionsKt$memoize$2;
    }

    public final Object invoke(o0 o0Var, d<? super T> dVar) {
        return ((CoroutineExtensionsKt$memoize$2) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // t8.p
    public /* bridge */ /* synthetic */ Object invoke(o0 o0Var, Object obj) {
        return invoke(o0Var, (d) ((d) obj));
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        o0 o0Var;
        a mutex;
        t8.l<d<? super T>, Object> lVar;
        Object obj2;
        c10 = n8.d.c();
        int i10 = this.label;
        try {
            if (i10 == 0) {
                i8.p.b(obj);
                o0Var = (o0) this.L$0;
                mutex = CoroutineExtensionsKt.getMutex();
                Object obj3 = this.$key;
                lVar = this.$action;
                this.L$0 = o0Var;
                this.L$1 = mutex;
                this.L$2 = obj3;
                this.L$3 = lVar;
                this.label = 1;
                if (mutex.b(null, this) == c10) {
                    return c10;
                }
                obj2 = obj3;
            } else if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i8.p.b(obj);
            } else {
                lVar = (t8.l) this.L$3;
                obj2 = this.L$2;
                mutex = (a) this.L$1;
                o0Var = (o0) this.L$0;
                i8.p.b(obj);
            }
            LinkedHashMap<Object, w0<?>> deferreds = CoroutineExtensionsKt.getDeferreds();
            w0<?> w0Var = deferreds.get(obj2);
            if (w0Var == null) {
                w0Var = k.b(o0Var, null, null, new CoroutineExtensionsKt$memoize$2$deferred$1$1$1(lVar, null), 3, null);
                deferreds.put(obj2, w0Var);
            }
            w0<?> w0Var2 = w0Var;
            mutex.a(null);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 2;
            obj = w0Var2.C0(this);
            return obj == c10 ? c10 : obj;
        } catch (Throwable th) {
            mutex.a(null);
            throw th;
        }
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        o0 o0Var = (o0) this.L$0;
        a mutex = CoroutineExtensionsKt.getMutex();
        Object obj2 = this.$key;
        t8.l<d<? super T>, Object> lVar = this.$action;
        m.a(0);
        mutex.b(null, this);
        m.a(1);
        try {
            LinkedHashMap<Object, w0<?>> deferreds = CoroutineExtensionsKt.getDeferreds();
            w0<?> w0Var = deferreds.get(obj2);
            if (w0Var == null) {
                w0Var = k.b(o0Var, null, null, new CoroutineExtensionsKt$memoize$2$deferred$1$1$1(lVar, null), 3, null);
                deferreds.put(obj2, w0Var);
            }
            w0<?> w0Var2 = w0Var;
            mutex.a(null);
            m.a(0);
            Object C0 = w0Var2.C0(this);
            m.a(1);
            return C0;
        } catch (Throwable th) {
            mutex.a(null);
            throw th;
        }
    }
}
