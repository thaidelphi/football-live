package com.ironsource;

import java.lang.ref.WeakReference;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class ve {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a<T> implements v8.a<Object, T> {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<T> f21136a;

        a(T t10) {
            this.f21136a = new WeakReference<>(t10);
        }

        public final WeakReference<T> a() {
            return this.f21136a;
        }

        public final void a(WeakReference<T> weakReference) {
            kotlin.jvm.internal.n.f(weakReference, "<set-?>");
            this.f21136a = weakReference;
        }

        public T getValue(Object thisRef, z8.h<?> property) {
            kotlin.jvm.internal.n.f(thisRef, "thisRef");
            kotlin.jvm.internal.n.f(property, "property");
            return this.f21136a.get();
        }

        public void setValue(Object thisRef, z8.h<?> property, T t10) {
            kotlin.jvm.internal.n.f(thisRef, "thisRef");
            kotlin.jvm.internal.n.f(property, "property");
            this.f21136a = new WeakReference<>(t10);
        }
    }

    public static final <T> v8.a<Object, T> a(T t10) {
        return new a(t10);
    }

    public static /* synthetic */ v8.a a(Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = null;
        }
        return a(obj);
    }
}
