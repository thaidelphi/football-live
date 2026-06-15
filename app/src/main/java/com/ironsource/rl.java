package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public interface rl<T> {

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a<T> implements rl<T> {

        /* renamed from: a  reason: collision with root package name */
        private final IronSourceError f19993a;

        public a(IronSourceError error) {
            kotlin.jvm.internal.n.f(error, "error");
            this.f19993a = error;
        }

        public static /* synthetic */ a a(a aVar, IronSourceError ironSourceError, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                ironSourceError = aVar.f19993a;
            }
            return aVar.a(ironSourceError);
        }

        public final IronSourceError a() {
            return this.f19993a;
        }

        public final a<T> a(IronSourceError error) {
            kotlin.jvm.internal.n.f(error, "error");
            return new a<>(error);
        }

        public final IronSourceError b() {
            return this.f19993a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.n.a(this.f19993a, ((a) obj).f19993a);
        }

        public int hashCode() {
            return this.f19993a.hashCode();
        }

        public String toString() {
            return "Failure(error=" + this.f19993a + ')';
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class b<T> implements rl<T> {

        /* renamed from: a  reason: collision with root package name */
        private final T f19994a;

        public b(T t10) {
            this.f19994a = t10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b a(b bVar, Object obj, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                obj = bVar.f19994a;
            }
            return bVar.a(obj);
        }

        public final b<T> a(T t10) {
            return new b<>(t10);
        }

        public final T a() {
            return this.f19994a;
        }

        public final T b() {
            return this.f19994a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.n.a(this.f19994a, ((b) obj).f19994a);
        }

        public int hashCode() {
            T t10 = this.f19994a;
            if (t10 == null) {
                return 0;
            }
            return t10.hashCode();
        }

        public String toString() {
            return "Success(value=" + this.f19994a + ')';
        }
    }
}
