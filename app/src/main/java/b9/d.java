package b9;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Strings.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class d implements a9.f<y8.c> {

    /* renamed from: a  reason: collision with root package name */
    private final CharSequence f5289a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5290b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5291c;

    /* renamed from: d  reason: collision with root package name */
    private final t8.p<CharSequence, Integer, i8.n<Integer, Integer>> f5292d;

    /* compiled from: Strings.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a implements Iterator<y8.c> {

        /* renamed from: a  reason: collision with root package name */
        private int f5293a = -1;

        /* renamed from: b  reason: collision with root package name */
        private int f5294b;

        /* renamed from: c  reason: collision with root package name */
        private int f5295c;

        /* renamed from: d  reason: collision with root package name */
        private y8.c f5296d;

        /* renamed from: e  reason: collision with root package name */
        private int f5297e;

        a() {
            int e8;
            e8 = y8.i.e(d.this.f5290b, 0, d.this.f5289a.length());
            this.f5294b = e8;
            this.f5295c = e8;
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
            if (r0 < r6.f5298f.f5291c) goto L13;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void a() {
            /*
                r6 = this;
                int r0 = r6.f5295c
                r1 = 0
                if (r0 >= 0) goto Lc
                r6.f5293a = r1
                r0 = 0
                r6.f5296d = r0
                goto L9e
            Lc:
                b9.d r0 = b9.d.this
                int r0 = b9.d.d(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L23
                int r0 = r6.f5297e
                int r0 = r0 + r3
                r6.f5297e = r0
                b9.d r4 = b9.d.this
                int r4 = b9.d.d(r4)
                if (r0 >= r4) goto L31
            L23:
                int r0 = r6.f5295c
                b9.d r4 = b9.d.this
                java.lang.CharSequence r4 = b9.d.c(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L47
            L31:
                y8.c r0 = new y8.c
                int r1 = r6.f5294b
                b9.d r4 = b9.d.this
                java.lang.CharSequence r4 = b9.d.c(r4)
                int r4 = b9.p.D(r4)
                r0.<init>(r1, r4)
                r6.f5296d = r0
                r6.f5295c = r2
                goto L9c
            L47:
                b9.d r0 = b9.d.this
                t8.p r0 = b9.d.b(r0)
                b9.d r4 = b9.d.this
                java.lang.CharSequence r4 = b9.d.c(r4)
                int r5 = r6.f5295c
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                i8.n r0 = (i8.n) r0
                if (r0 != 0) goto L77
                y8.c r0 = new y8.c
                int r1 = r6.f5294b
                b9.d r4 = b9.d.this
                java.lang.CharSequence r4 = b9.d.c(r4)
                int r4 = b9.p.D(r4)
                r0.<init>(r1, r4)
                r6.f5296d = r0
                r6.f5295c = r2
                goto L9c
            L77:
                java.lang.Object r2 = r0.a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f5294b
                y8.c r4 = y8.g.h(r4, r2)
                r6.f5296d = r4
                int r2 = r2 + r0
                r6.f5294b = r2
                if (r0 != 0) goto L99
                r1 = r3
            L99:
                int r2 = r2 + r1
                r6.f5295c = r2
            L9c:
                r6.f5293a = r3
            L9e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: b9.d.a.a():void");
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public y8.c next() {
            if (this.f5293a == -1) {
                a();
            }
            if (this.f5293a != 0) {
                y8.c cVar = this.f5296d;
                kotlin.jvm.internal.n.d(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f5296d = null;
                this.f5293a = -1;
                return cVar;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f5293a == -1) {
                a();
            }
            return this.f5293a == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(CharSequence input, int i10, int i11, t8.p<? super CharSequence, ? super Integer, i8.n<Integer, Integer>> getNextMatch) {
        kotlin.jvm.internal.n.f(input, "input");
        kotlin.jvm.internal.n.f(getNextMatch, "getNextMatch");
        this.f5289a = input;
        this.f5290b = i10;
        this.f5291c = i11;
        this.f5292d = getNextMatch;
    }

    @Override // a9.f
    public Iterator<y8.c> iterator() {
        return new a();
    }
}
