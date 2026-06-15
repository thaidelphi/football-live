package x5;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
/* compiled from: Predicates.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class i {

    /* compiled from: Predicates.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    private static class b<T> implements h<T>, Serializable {

        /* renamed from: a  reason: collision with root package name */
        private final List<? extends h<? super T>> f32754a;

        @Override // x5.h
        public boolean apply(T t10) {
            for (int i10 = 0; i10 < this.f32754a.size(); i10++) {
                if (!this.f32754a.get(i10).apply(t10)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f32754a.equals(((b) obj).f32754a);
            }
            return false;
        }

        public int hashCode() {
            return this.f32754a.hashCode() + 306654252;
        }

        public String toString() {
            return i.d("and", this.f32754a);
        }

        private b(List<? extends h<? super T>> list) {
            this.f32754a = list;
        }
    }

    public static <T> h<T> b(h<? super T> hVar, h<? super T> hVar2) {
        return new b(c((h) g.i(hVar), (h) g.i(hVar2)));
    }

    private static <T> List<h<? super T>> c(h<? super T> hVar, h<? super T> hVar2) {
        return Arrays.asList(hVar, hVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(String str, Iterable<?> iterable) {
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append(str);
        sb.append('(');
        boolean z10 = true;
        for (Object obj : iterable) {
            if (!z10) {
                sb.append(',');
            }
            sb.append(obj);
            z10 = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
