package i4;

import android.net.Uri;
import i4.k;
import java.util.Collections;
import java.util.List;
import n3.m1;
import y5.q;
/* compiled from: Representation.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public final long f26568a;

    /* renamed from: b  reason: collision with root package name */
    public final m1 f26569b;

    /* renamed from: c  reason: collision with root package name */
    public final q<i4.b> f26570c;

    /* renamed from: d  reason: collision with root package name */
    public final long f26571d;

    /* renamed from: e  reason: collision with root package name */
    public final List<e> f26572e;

    /* renamed from: f  reason: collision with root package name */
    public final List<e> f26573f;

    /* renamed from: g  reason: collision with root package name */
    public final List<e> f26574g;

    /* renamed from: h  reason: collision with root package name */
    private final i f26575h;

    /* compiled from: Representation.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b extends j implements h4.f {

        /* renamed from: i  reason: collision with root package name */
        final k.a f26576i;

        public b(long j10, m1 m1Var, List<i4.b> list, k.a aVar, List<e> list2, List<e> list3, List<e> list4) {
            super(j10, m1Var, list, aVar, list2, list3, list4);
            this.f26576i = aVar;
        }

        @Override // h4.f
        public long a(long j10) {
            return this.f26576i.j(j10);
        }

        @Override // h4.f
        public long b(long j10, long j11) {
            return this.f26576i.h(j10, j11);
        }

        @Override // h4.f
        public long c(long j10, long j11) {
            return this.f26576i.d(j10, j11);
        }

        @Override // h4.f
        public long d(long j10, long j11) {
            return this.f26576i.f(j10, j11);
        }

        @Override // h4.f
        public i e(long j10) {
            return this.f26576i.k(this, j10);
        }

        @Override // h4.f
        public long f(long j10, long j11) {
            return this.f26576i.i(j10, j11);
        }

        @Override // h4.f
        public long g(long j10) {
            return this.f26576i.g(j10);
        }

        @Override // h4.f
        public boolean h() {
            return this.f26576i.l();
        }

        @Override // h4.f
        public long i() {
            return this.f26576i.e();
        }

        @Override // h4.f
        public long j(long j10, long j11) {
            return this.f26576i.c(j10, j11);
        }

        @Override // i4.j
        public String k() {
            return null;
        }

        @Override // i4.j
        public h4.f l() {
            return this;
        }

        @Override // i4.j
        public i m() {
            return null;
        }
    }

    /* compiled from: Representation.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class c extends j {

        /* renamed from: i  reason: collision with root package name */
        public final Uri f26577i;

        /* renamed from: j  reason: collision with root package name */
        public final long f26578j;

        /* renamed from: k  reason: collision with root package name */
        private final String f26579k;

        /* renamed from: l  reason: collision with root package name */
        private final i f26580l;

        /* renamed from: m  reason: collision with root package name */
        private final m f26581m;

        public c(long j10, m1 m1Var, List<i4.b> list, k.e eVar, List<e> list2, List<e> list3, List<e> list4, String str, long j11) {
            super(j10, m1Var, list, eVar, list2, list3, list4);
            this.f26577i = Uri.parse(list.get(0).f26515a);
            i c10 = eVar.c();
            this.f26580l = c10;
            this.f26579k = str;
            this.f26578j = j11;
            this.f26581m = c10 != null ? null : new m(new i(null, 0L, j11));
        }

        @Override // i4.j
        public String k() {
            return this.f26579k;
        }

        @Override // i4.j
        public h4.f l() {
            return this.f26581m;
        }

        @Override // i4.j
        public i m() {
            return this.f26580l;
        }
    }

    public static j o(long j10, m1 m1Var, List<i4.b> list, k kVar, List<e> list2, List<e> list3, List<e> list4, String str) {
        if (kVar instanceof k.e) {
            return new c(j10, m1Var, list, (k.e) kVar, list2, list3, list4, str, -1L);
        }
        if (kVar instanceof k.a) {
            return new b(j10, m1Var, list, (k.a) kVar, list2, list3, list4);
        }
        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
    }

    public abstract String k();

    public abstract h4.f l();

    public abstract i m();

    public i n() {
        return this.f26575h;
    }

    private j(long j10, m1 m1Var, List<i4.b> list, k kVar, List<e> list2, List<e> list3, List<e> list4) {
        List<e> unmodifiableList;
        a5.a.a(!list.isEmpty());
        this.f26568a = j10;
        this.f26569b = m1Var;
        this.f26570c = q.l(list);
        if (list2 == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(list2);
        }
        this.f26572e = unmodifiableList;
        this.f26573f = list3;
        this.f26574g = list4;
        this.f26575h = kVar.a(this);
        this.f26571d = kVar.b();
    }
}
