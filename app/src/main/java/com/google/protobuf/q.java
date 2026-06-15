package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: ListFieldSchema.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
abstract class q {

    /* renamed from: a  reason: collision with root package name */
    private static final q f15503a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final q f15504b = new c();

    /* compiled from: ListFieldSchema.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    private static final class b extends q {

        /* renamed from: c  reason: collision with root package name */
        private static final Class<?> f15505c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private b() {
            super();
        }

        static <E> List<E> f(Object obj, long j10) {
            return (List) t0.H(obj, j10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static <L> List<L> g(Object obj, long j10, int i10) {
            LazyStringArrayList lazyStringArrayList;
            List<L> arrayList;
            List<L> f10 = f(obj, j10);
            if (f10.isEmpty()) {
                if (f10 instanceof LazyStringList) {
                    arrayList = new LazyStringArrayList(i10);
                } else if ((f10 instanceof g0) && (f10 instanceof Internal.ProtobufList)) {
                    arrayList = ((Internal.ProtobufList) f10).mutableCopyWithCapacity(i10);
                } else {
                    arrayList = new ArrayList<>(i10);
                }
                t0.Y(obj, j10, arrayList);
                return arrayList;
            }
            if (f15505c.isAssignableFrom(f10.getClass())) {
                ArrayList arrayList2 = new ArrayList(f10.size() + i10);
                arrayList2.addAll(f10);
                t0.Y(obj, j10, arrayList2);
                lazyStringArrayList = arrayList2;
            } else if (f10 instanceof UnmodifiableLazyStringList) {
                LazyStringArrayList lazyStringArrayList2 = new LazyStringArrayList(f10.size() + i10);
                lazyStringArrayList2.addAll((UnmodifiableLazyStringList) f10);
                t0.Y(obj, j10, lazyStringArrayList2);
                lazyStringArrayList = lazyStringArrayList2;
            } else if ((f10 instanceof g0) && (f10 instanceof Internal.ProtobufList)) {
                Internal.ProtobufList protobufList = (Internal.ProtobufList) f10;
                if (protobufList.isModifiable()) {
                    return f10;
                }
                Internal.ProtobufList mutableCopyWithCapacity = protobufList.mutableCopyWithCapacity(f10.size() + i10);
                t0.Y(obj, j10, mutableCopyWithCapacity);
                return mutableCopyWithCapacity;
            } else {
                return f10;
            }
            return lazyStringArrayList;
        }

        @Override // com.google.protobuf.q
        void c(Object obj, long j10) {
            Object unmodifiableList;
            List list = (List) t0.H(obj, j10);
            if (list instanceof LazyStringList) {
                unmodifiableList = ((LazyStringList) list).getUnmodifiableView();
            } else if (f15505c.isAssignableFrom(list.getClass())) {
                return;
            } else {
                if ((list instanceof g0) && (list instanceof Internal.ProtobufList)) {
                    Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
                    if (protobufList.isModifiable()) {
                        protobufList.makeImmutable();
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            }
            t0.Y(obj, j10, unmodifiableList);
        }

        @Override // com.google.protobuf.q
        <E> void d(Object obj, Object obj2, long j10) {
            List f10 = f(obj2, j10);
            List g10 = g(obj, j10, f10.size());
            int size = g10.size();
            int size2 = f10.size();
            if (size > 0 && size2 > 0) {
                g10.addAll(f10);
            }
            if (size > 0) {
                f10 = g10;
            }
            t0.Y(obj, j10, f10);
        }

        @Override // com.google.protobuf.q
        <L> List<L> e(Object obj, long j10) {
            return g(obj, j10, 10);
        }
    }

    /* compiled from: ListFieldSchema.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    private static final class c extends q {
        private c() {
            super();
        }

        static <E> Internal.ProtobufList<E> f(Object obj, long j10) {
            return (Internal.ProtobufList) t0.H(obj, j10);
        }

        @Override // com.google.protobuf.q
        void c(Object obj, long j10) {
            f(obj, j10).makeImmutable();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
        @Override // com.google.protobuf.q
        <E> void d(Object obj, Object obj2, long j10) {
            Internal.ProtobufList<E> f10 = f(obj, j10);
            Internal.ProtobufList<E> f11 = f(obj2, j10);
            int size = f10.size();
            int size2 = f11.size();
            Internal.ProtobufList<E> protobufList = f10;
            protobufList = f10;
            if (size > 0 && size2 > 0) {
                boolean isModifiable = f10.isModifiable();
                Internal.ProtobufList<E> protobufList2 = f10;
                if (!isModifiable) {
                    protobufList2 = f10.mutableCopyWithCapacity(size2 + size);
                }
                protobufList2.addAll(f11);
                protobufList = protobufList2;
            }
            if (size > 0) {
                f11 = protobufList;
            }
            t0.Y(obj, j10, f11);
        }

        @Override // com.google.protobuf.q
        <L> List<L> e(Object obj, long j10) {
            Internal.ProtobufList f10 = f(obj, j10);
            if (f10.isModifiable()) {
                return f10;
            }
            int size = f10.size();
            Internal.ProtobufList mutableCopyWithCapacity = f10.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
            t0.Y(obj, j10, mutableCopyWithCapacity);
            return mutableCopyWithCapacity;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static q a() {
        return f15503a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static q b() {
        return f15504b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void c(Object obj, long j10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> void d(Object obj, Object obj2, long j10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> List<L> e(Object obj, long j10);

    private q() {
    }
}
