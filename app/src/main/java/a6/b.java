package a6;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import x5.g;
/* compiled from: Ints.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class b extends c {

    /* compiled from: Ints.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    private static class a extends AbstractList<Integer> implements RandomAccess, Serializable {

        /* renamed from: a  reason: collision with root package name */
        final int[] f559a;

        /* renamed from: b  reason: collision with root package name */
        final int f560b;

        /* renamed from: c  reason: collision with root package name */
        final int f561c;

        a(int[] iArr) {
            this(iArr, 0, iArr.length);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: a */
        public Integer get(int i10) {
            g.g(i10, size());
            return Integer.valueOf(this.f559a[this.f560b + i10]);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: b */
        public Integer set(int i10, Integer num) {
            g.g(i10, size());
            int[] iArr = this.f559a;
            int i11 = this.f560b;
            int i12 = iArr[i11 + i10];
            iArr[i11 + i10] = ((Integer) g.i(num)).intValue();
            return Integer.valueOf(i12);
        }

        int[] c() {
            return Arrays.copyOfRange(this.f559a, this.f560b, this.f561c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Integer) && b.h(this.f559a, ((Integer) obj).intValue(), this.f560b, this.f561c) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                int size = size();
                if (aVar.size() != size) {
                    return false;
                }
                for (int i10 = 0; i10 < size; i10++) {
                    if (this.f559a[this.f560b + i10] != aVar.f559a[aVar.f560b + i10]) {
                        return false;
                    }
                }
                return true;
            }
            return super.equals(obj);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i10 = 1;
            for (int i11 = this.f560b; i11 < this.f561c; i11++) {
                i10 = (i10 * 31) + b.f(this.f559a[i11]);
            }
            return i10;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int h10;
            if (!(obj instanceof Integer) || (h10 = b.h(this.f559a, ((Integer) obj).intValue(), this.f560b, this.f561c)) < 0) {
                return -1;
            }
            return h10 - this.f560b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int i10;
            if (!(obj instanceof Integer) || (i10 = b.i(this.f559a, ((Integer) obj).intValue(), this.f560b, this.f561c)) < 0) {
                return -1;
            }
            return i10 - this.f560b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f561c - this.f560b;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Integer> subList(int i10, int i11) {
            g.m(i10, i11, size());
            if (i10 == i11) {
                return Collections.emptyList();
            }
            int[] iArr = this.f559a;
            int i12 = this.f560b;
            return new a(iArr, i10 + i12, i12 + i11);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 5);
            sb.append('[');
            sb.append(this.f559a[this.f560b]);
            int i10 = this.f560b;
            while (true) {
                i10++;
                if (i10 < this.f561c) {
                    sb.append(", ");
                    sb.append(this.f559a[i10]);
                } else {
                    sb.append(']');
                    return sb.toString();
                }
            }
        }

        a(int[] iArr, int i10, int i11) {
            this.f559a = iArr;
            this.f560b = i10;
            this.f561c = i11;
        }
    }

    public static List<Integer> c(int... iArr) {
        if (iArr.length == 0) {
            return Collections.emptyList();
        }
        return new a(iArr);
    }

    public static int d(long j10) {
        int i10 = (int) j10;
        g.f(((long) i10) == j10, "Out of range: %s", j10);
        return i10;
    }

    public static int e(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 > i11 ? 1 : 0;
    }

    public static int f(int i10) {
        return i10;
    }

    public static int g(int[] iArr, int i10) {
        return h(iArr, i10, 0, iArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int h(int[] iArr, int i10, int i11, int i12) {
        while (i11 < i12) {
            if (iArr[i11] == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int i(int[] iArr, int i10, int i11, int i12) {
        for (int i13 = i12 - 1; i13 >= i11; i13--) {
            if (iArr[i13] == i10) {
                return i13;
            }
        }
        return -1;
    }

    public static int j(long j10) {
        return j10 > 2147483647L ? Api.BaseClientBuilder.API_PRIORITY_OTHER : j10 < -2147483648L ? RecyclerView.UNDEFINED_DURATION : (int) j10;
    }

    public static int[] k(Collection<? extends Number> collection) {
        if (collection instanceof a) {
            return ((a) collection).c();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = ((Number) g.i(array[i10])).intValue();
        }
        return iArr;
    }
}
