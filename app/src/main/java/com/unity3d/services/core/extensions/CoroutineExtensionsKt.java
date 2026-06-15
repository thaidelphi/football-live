package com.unity3d.services.core.extensions;

import d9.p0;
import d9.w0;
import i8.o;
import i8.p;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import m8.d;
import m9.a;
import m9.c;
import t8.l;
/* compiled from: CoroutineExtensions.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class CoroutineExtensionsKt {
    private static final LinkedHashMap<Object, w0<?>> deferreds = new LinkedHashMap<Object, w0<?>>() { // from class: com.unity3d.services.core.extensions.CoroutineExtensionsKt$deferreds$1
        public /* bridge */ boolean containsValue(w0<?> w0Var) {
            return super.containsValue((Object) w0Var);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<Map.Entry<Object, w0<?>>> entrySet() {
            return getEntries();
        }

        public /* bridge */ Set<Map.Entry<Object, w0<?>>> getEntries() {
            return super.entrySet();
        }

        public /* bridge */ Set<Object> getKeys() {
            return super.keySet();
        }

        public /* bridge */ int getSize() {
            return super.size();
        }

        public /* bridge */ Collection<w0<?>> getValues() {
            return super.values();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<Object> keySet() {
            return getKeys();
        }

        public /* bridge */ boolean remove(Object obj, w0<?> w0Var) {
            return super.remove(obj, (Object) w0Var);
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry<Object, w0<?>> eldest) {
            n.f(eldest, "eldest");
            return size() > 100;
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Collection<w0<?>> values() {
            return getValues();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof w0) {
                return containsValue((w0) obj);
            }
            return false;
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (obj != null && (obj2 instanceof w0)) {
                return remove(obj, (w0) obj2);
            }
            return false;
        }
    };
    private static final a mutex = c.b(false, 1, null);

    public static final LinkedHashMap<Object, w0<?>> getDeferreds() {
        return deferreds;
    }

    public static final a getMutex() {
        return mutex;
    }

    public static final <T> Object memoize(Object obj, l<? super d<? super T>, ? extends Object> lVar, d<? super T> dVar) {
        return p0.e(new CoroutineExtensionsKt$memoize$2(obj, lVar, null), dVar);
    }

    private static final <T> Object memoize$$forInline(Object obj, l<? super d<? super T>, ? extends Object> lVar, d<? super T> dVar) {
        CoroutineExtensionsKt$memoize$2 coroutineExtensionsKt$memoize$2 = new CoroutineExtensionsKt$memoize$2(obj, lVar, null);
        m.a(0);
        Object e8 = p0.e(coroutineExtensionsKt$memoize$2, dVar);
        m.a(1);
        return e8;
    }

    public static final <R> Object runReturnSuspendCatching(t8.a<? extends R> block) {
        Object b10;
        n.f(block, "block");
        try {
            o.a aVar = o.f26626b;
            b10 = o.b(block.invoke());
        } catch (CancellationException e8) {
            throw e8;
        } catch (Throwable th) {
            o.a aVar2 = o.f26626b;
            b10 = o.b(p.a(th));
        }
        if (o.g(b10)) {
            o.a aVar3 = o.f26626b;
            return o.b(b10);
        }
        Throwable d10 = o.d(b10);
        if (d10 != null) {
            o.a aVar4 = o.f26626b;
            return o.b(p.a(d10));
        }
        return b10;
    }

    public static final <R> Object runSuspendCatching(t8.a<? extends R> block) {
        n.f(block, "block");
        try {
            o.a aVar = o.f26626b;
            return o.b(block.invoke());
        } catch (CancellationException e8) {
            throw e8;
        } catch (Throwable th) {
            o.a aVar2 = o.f26626b;
            return o.b(p.a(th));
        }
    }
}
