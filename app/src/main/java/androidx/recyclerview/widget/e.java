package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GapWorker.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class e implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    static final ThreadLocal<e> f4080e = new ThreadLocal<>();

    /* renamed from: f  reason: collision with root package name */
    static Comparator<c> f4081f = new a();

    /* renamed from: b  reason: collision with root package name */
    long f4083b;

    /* renamed from: c  reason: collision with root package name */
    long f4084c;

    /* renamed from: a  reason: collision with root package name */
    ArrayList<RecyclerView> f4082a = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    private ArrayList<c> f4085d = new ArrayList<>();

    /* compiled from: GapWorker.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Comparator<c> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f4093d;
            if ((recyclerView == null) != (cVar2.f4093d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z10 = cVar.f4090a;
            if (z10 != cVar2.f4090a) {
                return z10 ? -1 : 1;
            }
            int i10 = cVar2.f4091b - cVar.f4091b;
            if (i10 != 0) {
                return i10;
            }
            int i11 = cVar.f4092c - cVar2.f4092c;
            if (i11 != 0) {
                return i11;
            }
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GapWorker.java */
    @SuppressLint({"VisibleForTests"})
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b implements RecyclerView.p.c {

        /* renamed from: a  reason: collision with root package name */
        int f4086a;

        /* renamed from: b  reason: collision with root package name */
        int f4087b;

        /* renamed from: c  reason: collision with root package name */
        int[] f4088c;

        /* renamed from: d  reason: collision with root package name */
        int f4089d;

        @Override // androidx.recyclerview.widget.RecyclerView.p.c
        public void a(int i10, int i11) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i11 >= 0) {
                int i12 = this.f4089d * 2;
                int[] iArr = this.f4088c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f4088c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i12 >= iArr.length) {
                    int[] iArr3 = new int[i12 * 2];
                    this.f4088c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f4088c;
                iArr4[i12] = i10;
                iArr4[i12 + 1] = i11;
                this.f4089d++;
                return;
            }
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void b() {
            int[] iArr = this.f4088c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f4089d = 0;
        }

        void c(RecyclerView recyclerView, boolean z10) {
            this.f4089d = 0;
            int[] iArr = this.f4088c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.p pVar = recyclerView.mLayout;
            if (recyclerView.mAdapter == null || pVar == null || !pVar.u0()) {
                return;
            }
            if (z10) {
                if (!recyclerView.mAdapterHelper.p()) {
                    pVar.p(recyclerView.mAdapter.getItemCount(), this);
                }
            } else if (!recyclerView.hasPendingAdapterUpdates()) {
                pVar.o(this.f4086a, this.f4087b, recyclerView.mState, this);
            }
            int i10 = this.f4089d;
            if (i10 > pVar.f3878m) {
                pVar.f3878m = i10;
                pVar.f3879n = z10;
                recyclerView.mRecycler.K();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean d(int i10) {
            if (this.f4088c != null) {
                int i11 = this.f4089d * 2;
                for (int i12 = 0; i12 < i11; i12 += 2) {
                    if (this.f4088c[i12] == i10) {
                        return true;
                    }
                }
            }
            return false;
        }

        void e(int i10, int i11) {
            this.f4086a = i10;
            this.f4087b = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GapWorker.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f4090a;

        /* renamed from: b  reason: collision with root package name */
        public int f4091b;

        /* renamed from: c  reason: collision with root package name */
        public int f4092c;

        /* renamed from: d  reason: collision with root package name */
        public RecyclerView f4093d;

        /* renamed from: e  reason: collision with root package name */
        public int f4094e;

        c() {
        }

        public void a() {
            this.f4090a = false;
            this.f4091b = 0;
            this.f4092c = 0;
            this.f4093d = null;
            this.f4094e = 0;
        }
    }

    private void b() {
        c cVar;
        int size = this.f4082a.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView = this.f4082a.get(i11);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.mPrefetchRegistry.c(recyclerView, false);
                i10 += recyclerView.mPrefetchRegistry.f4089d;
            }
        }
        this.f4085d.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView2 = this.f4082a.get(i13);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.mPrefetchRegistry;
                int abs = Math.abs(bVar.f4086a) + Math.abs(bVar.f4087b);
                for (int i14 = 0; i14 < bVar.f4089d * 2; i14 += 2) {
                    if (i12 >= this.f4085d.size()) {
                        cVar = new c();
                        this.f4085d.add(cVar);
                    } else {
                        cVar = this.f4085d.get(i12);
                    }
                    int[] iArr = bVar.f4088c;
                    int i15 = iArr[i14 + 1];
                    cVar.f4090a = i15 <= abs;
                    cVar.f4091b = abs;
                    cVar.f4092c = i15;
                    cVar.f4093d = recyclerView2;
                    cVar.f4094e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(this.f4085d, f4081f);
    }

    private void c(c cVar, long j10) {
        RecyclerView.c0 i10 = i(cVar.f4093d, cVar.f4094e, cVar.f4090a ? Long.MAX_VALUE : j10);
        if (i10 == null || i10.mNestedRecyclerView == null || !i10.isBound() || i10.isInvalid()) {
            return;
        }
        h(i10.mNestedRecyclerView.get(), j10);
    }

    private void d(long j10) {
        for (int i10 = 0; i10 < this.f4085d.size(); i10++) {
            c cVar = this.f4085d.get(i10);
            if (cVar.f4093d == null) {
                return;
            }
            c(cVar, j10);
            cVar.a();
        }
    }

    static boolean e(RecyclerView recyclerView, int i10) {
        int j10 = recyclerView.mChildHelper.j();
        for (int i11 = 0; i11 < j10; i11++) {
            RecyclerView.c0 childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.i(i11));
            if (childViewHolderInt.mPosition == i10 && !childViewHolderInt.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    private void h(RecyclerView recyclerView, long j10) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.mDataSetHasChangedAfterLayout && recyclerView.mChildHelper.j() != 0) {
            recyclerView.removeAndRecycleViews();
        }
        b bVar = recyclerView.mPrefetchRegistry;
        bVar.c(recyclerView, true);
        if (bVar.f4089d != 0) {
            try {
                androidx.core.os.n.a("RV Nested Prefetch");
                recyclerView.mState.f(recyclerView.mAdapter);
                for (int i10 = 0; i10 < bVar.f4089d * 2; i10 += 2) {
                    i(recyclerView, bVar.f4088c[i10], j10);
                }
            } finally {
                androidx.core.os.n.b();
            }
        }
    }

    private RecyclerView.c0 i(RecyclerView recyclerView, int i10, long j10) {
        if (e(recyclerView, i10)) {
            return null;
        }
        RecyclerView.v vVar = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.c0 I = vVar.I(i10, false, j10);
            if (I != null) {
                if (I.isBound() && !I.isInvalid()) {
                    vVar.B(I.itemView);
                } else {
                    vVar.a(I, false);
                }
            }
            return I;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }

    public void a(RecyclerView recyclerView) {
        this.f4082a.add(recyclerView);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.isAttachedToWindow() && this.f4083b == 0) {
            this.f4083b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.mPrefetchRegistry.e(i10, i11);
    }

    void g(long j10) {
        b();
        d(j10);
    }

    public void j(RecyclerView recyclerView) {
        this.f4082a.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            androidx.core.os.n.a("RV Prefetch");
            if (!this.f4082a.isEmpty()) {
                int size = this.f4082a.size();
                long j10 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    RecyclerView recyclerView = this.f4082a.get(i10);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j10 = Math.max(recyclerView.getDrawingTime(), j10);
                    }
                }
                if (j10 != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(j10) + this.f4084c);
                }
            }
        } finally {
            this.f4083b = 0L;
            androidx.core.os.n.b();
        }
    }
}
