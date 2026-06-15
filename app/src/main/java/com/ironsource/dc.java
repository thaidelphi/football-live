package com.ironsource;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public interface dc<T> {

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a<T> implements dc<T> {

        /* renamed from: a  reason: collision with root package name */
        private final ArrayList<T> f17004a;

        /* renamed from: b  reason: collision with root package name */
        private final ArrayList<T> f17005b;

        public a(ArrayList<T> a10, ArrayList<T> b10) {
            kotlin.jvm.internal.n.f(a10, "a");
            kotlin.jvm.internal.n.f(b10, "b");
            this.f17004a = a10;
            this.f17005b = b10;
        }

        @Override // com.ironsource.dc
        public boolean contains(T t10) {
            return this.f17004a.contains(t10) || this.f17005b.contains(t10);
        }

        @Override // com.ironsource.dc
        public int size() {
            return this.f17004a.size() + this.f17005b.size();
        }

        @Override // com.ironsource.dc
        public List<T> value() {
            List<T> E;
            E = j8.y.E(this.f17004a, this.f17005b);
            return E;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class b<T> implements dc<T> {

        /* renamed from: a  reason: collision with root package name */
        private final dc<T> f17006a;

        /* renamed from: b  reason: collision with root package name */
        private final Comparator<T> f17007b;

        public b(dc<T> collection, Comparator<T> comparator) {
            kotlin.jvm.internal.n.f(collection, "collection");
            kotlin.jvm.internal.n.f(comparator, "comparator");
            this.f17006a = collection;
            this.f17007b = comparator;
        }

        @Override // com.ironsource.dc
        public boolean contains(T t10) {
            return this.f17006a.contains(t10);
        }

        @Override // com.ironsource.dc
        public int size() {
            return this.f17006a.size();
        }

        @Override // com.ironsource.dc
        public List<T> value() {
            List<T> I;
            I = j8.y.I(this.f17006a.value(), this.f17007b);
            return I;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class c<T> implements dc<T> {

        /* renamed from: a  reason: collision with root package name */
        private final int f17008a;

        /* renamed from: b  reason: collision with root package name */
        private final List<T> f17009b;

        public c(dc<T> collection, int i10) {
            kotlin.jvm.internal.n.f(collection, "collection");
            this.f17008a = i10;
            this.f17009b = collection.value();
        }

        public final List<T> a() {
            List<T> d10;
            int size = this.f17009b.size();
            int i10 = this.f17008a;
            if (size <= i10) {
                d10 = j8.q.d();
                return d10;
            }
            List<T> list = this.f17009b;
            return list.subList(i10, list.size());
        }

        public final List<T> b() {
            int c10;
            List<T> list = this.f17009b;
            c10 = y8.i.c(list.size(), this.f17008a);
            return list.subList(0, c10);
        }

        @Override // com.ironsource.dc
        public boolean contains(T t10) {
            return this.f17009b.contains(t10);
        }

        @Override // com.ironsource.dc
        public int size() {
            return this.f17009b.size();
        }

        @Override // com.ironsource.dc
        public List<T> value() {
            return this.f17009b;
        }
    }

    boolean contains(T t10);

    int size();

    List<T> value();
}
