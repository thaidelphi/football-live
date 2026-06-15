package androidx.room;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: EntityInsertionAdapter.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class p<T> extends w0 {
    public p(q0 q0Var) {
        super(q0Var);
    }

    protected abstract void bind(v0.k kVar, T t10);

    public final void insert(T t10) {
        v0.k acquire = acquire();
        try {
            bind(acquire, t10);
            acquire.a0();
        } finally {
            release(acquire);
        }
    }

    public final long insertAndReturnId(T t10) {
        v0.k acquire = acquire();
        try {
            bind(acquire, t10);
            return acquire.a0();
        } finally {
            release(acquire);
        }
    }

    public final long[] insertAndReturnIdsArray(Collection<? extends T> collection) {
        v0.k acquire = acquire();
        try {
            long[] jArr = new long[collection.size()];
            int i10 = 0;
            for (T t10 : collection) {
                bind(acquire, t10);
                jArr[i10] = acquire.a0();
                i10++;
            }
            return jArr;
        } finally {
            release(acquire);
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(Collection<? extends T> collection) {
        v0.k acquire = acquire();
        try {
            Long[] lArr = new Long[collection.size()];
            int i10 = 0;
            for (T t10 : collection) {
                bind(acquire, t10);
                lArr[i10] = Long.valueOf(acquire.a0());
                i10++;
            }
            return lArr;
        } finally {
            release(acquire);
        }
    }

    public final List<Long> insertAndReturnIdsList(T[] tArr) {
        v0.k acquire = acquire();
        try {
            ArrayList arrayList = new ArrayList(tArr.length);
            int i10 = 0;
            for (T t10 : tArr) {
                bind(acquire, t10);
                arrayList.add(i10, Long.valueOf(acquire.a0()));
                i10++;
            }
            return arrayList;
        } finally {
            release(acquire);
        }
    }

    public final void insert(T[] tArr) {
        v0.k acquire = acquire();
        try {
            for (T t10 : tArr) {
                bind(acquire, t10);
                acquire.a0();
            }
        } finally {
            release(acquire);
        }
    }

    public final long[] insertAndReturnIdsArray(T[] tArr) {
        v0.k acquire = acquire();
        try {
            long[] jArr = new long[tArr.length];
            int i10 = 0;
            for (T t10 : tArr) {
                bind(acquire, t10);
                jArr[i10] = acquire.a0();
                i10++;
            }
            return jArr;
        } finally {
            release(acquire);
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(T[] tArr) {
        v0.k acquire = acquire();
        try {
            Long[] lArr = new Long[tArr.length];
            int i10 = 0;
            for (T t10 : tArr) {
                bind(acquire, t10);
                lArr[i10] = Long.valueOf(acquire.a0());
                i10++;
            }
            return lArr;
        } finally {
            release(acquire);
        }
    }

    public final List<Long> insertAndReturnIdsList(Collection<? extends T> collection) {
        v0.k acquire = acquire();
        try {
            ArrayList arrayList = new ArrayList(collection.size());
            int i10 = 0;
            for (T t10 : collection) {
                bind(acquire, t10);
                arrayList.add(i10, Long.valueOf(acquire.a0()));
                i10++;
            }
            return arrayList;
        } finally {
            release(acquire);
        }
    }

    public final void insert(Iterable<? extends T> iterable) {
        v0.k acquire = acquire();
        try {
            for (T t10 : iterable) {
                bind(acquire, t10);
                acquire.a0();
            }
        } finally {
            release(acquire);
        }
    }
}
