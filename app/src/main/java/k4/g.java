package k4;

import android.net.Uri;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.offline.StreamKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import y5.q;
import y5.r;
import y5.t;
/* compiled from: HlsMediaPlaylist.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class g extends i {

    /* renamed from: d  reason: collision with root package name */
    public final int f27166d;

    /* renamed from: e  reason: collision with root package name */
    public final long f27167e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f27168f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f27169g;

    /* renamed from: h  reason: collision with root package name */
    public final long f27170h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f27171i;

    /* renamed from: j  reason: collision with root package name */
    public final int f27172j;

    /* renamed from: k  reason: collision with root package name */
    public final long f27173k;

    /* renamed from: l  reason: collision with root package name */
    public final int f27174l;

    /* renamed from: m  reason: collision with root package name */
    public final long f27175m;

    /* renamed from: n  reason: collision with root package name */
    public final long f27176n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f27177o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f27178p;

    /* renamed from: q  reason: collision with root package name */
    public final DrmInitData f27179q;

    /* renamed from: r  reason: collision with root package name */
    public final List<d> f27180r;

    /* renamed from: s  reason: collision with root package name */
    public final List<b> f27181s;

    /* renamed from: t  reason: collision with root package name */
    public final Map<Uri, c> f27182t;

    /* renamed from: u  reason: collision with root package name */
    public final long f27183u;

    /* renamed from: v  reason: collision with root package name */
    public final f f27184v;

    /* compiled from: HlsMediaPlaylist.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b extends e {

        /* renamed from: l  reason: collision with root package name */
        public final boolean f27185l;

        /* renamed from: m  reason: collision with root package name */
        public final boolean f27186m;

        public b(String str, d dVar, long j10, int i10, long j11, DrmInitData drmInitData, String str2, String str3, long j12, long j13, boolean z10, boolean z11, boolean z12) {
            super(str, dVar, j10, i10, j11, drmInitData, str2, str3, j12, j13, z10);
            this.f27185l = z11;
            this.f27186m = z12;
        }

        public b b(long j10, int i10) {
            return new b(this.f27192a, this.f27193b, this.f27194c, i10, j10, this.f27197f, this.f27198g, this.f27199h, this.f27200i, this.f27201j, this.f27202k, this.f27185l, this.f27186m);
        }
    }

    /* compiled from: HlsMediaPlaylist.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f27187a;

        /* renamed from: b  reason: collision with root package name */
        public final long f27188b;

        /* renamed from: c  reason: collision with root package name */
        public final int f27189c;

        public c(Uri uri, long j10, int i10) {
            this.f27187a = uri;
            this.f27188b = j10;
            this.f27189c = i10;
        }
    }

    /* compiled from: HlsMediaPlaylist.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class e implements Comparable<Long> {

        /* renamed from: a  reason: collision with root package name */
        public final String f27192a;

        /* renamed from: b  reason: collision with root package name */
        public final d f27193b;

        /* renamed from: c  reason: collision with root package name */
        public final long f27194c;

        /* renamed from: d  reason: collision with root package name */
        public final int f27195d;

        /* renamed from: e  reason: collision with root package name */
        public final long f27196e;

        /* renamed from: f  reason: collision with root package name */
        public final DrmInitData f27197f;

        /* renamed from: g  reason: collision with root package name */
        public final String f27198g;

        /* renamed from: h  reason: collision with root package name */
        public final String f27199h;

        /* renamed from: i  reason: collision with root package name */
        public final long f27200i;

        /* renamed from: j  reason: collision with root package name */
        public final long f27201j;

        /* renamed from: k  reason: collision with root package name */
        public final boolean f27202k;

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(Long l10) {
            if (this.f27196e > l10.longValue()) {
                return 1;
            }
            return this.f27196e < l10.longValue() ? -1 : 0;
        }

        private e(String str, d dVar, long j10, int i10, long j11, DrmInitData drmInitData, String str2, String str3, long j12, long j13, boolean z10) {
            this.f27192a = str;
            this.f27193b = dVar;
            this.f27194c = j10;
            this.f27195d = i10;
            this.f27196e = j11;
            this.f27197f = drmInitData;
            this.f27198g = str2;
            this.f27199h = str3;
            this.f27200i = j12;
            this.f27201j = j13;
            this.f27202k = z10;
        }
    }

    /* compiled from: HlsMediaPlaylist.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final long f27203a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f27204b;

        /* renamed from: c  reason: collision with root package name */
        public final long f27205c;

        /* renamed from: d  reason: collision with root package name */
        public final long f27206d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f27207e;

        public f(long j10, boolean z10, long j11, long j12, boolean z11) {
            this.f27203a = j10;
            this.f27204b = z10;
            this.f27205c = j11;
            this.f27206d = j12;
            this.f27207e = z11;
        }
    }

    public g(int i10, String str, List<String> list, long j10, boolean z10, long j11, boolean z11, int i11, long j12, int i12, long j13, long j14, boolean z12, boolean z13, boolean z14, DrmInitData drmInitData, List<d> list2, List<b> list3, f fVar, Map<Uri, c> map) {
        super(str, list, z12);
        this.f27166d = i10;
        this.f27170h = j11;
        this.f27169g = z10;
        this.f27171i = z11;
        this.f27172j = i11;
        this.f27173k = j12;
        this.f27174l = i12;
        this.f27175m = j13;
        this.f27176n = j14;
        this.f27177o = z13;
        this.f27178p = z14;
        this.f27179q = drmInitData;
        this.f27180r = q.l(list2);
        this.f27181s = q.l(list3);
        this.f27182t = r.c(map);
        if (!list3.isEmpty()) {
            b bVar = (b) t.c(list3);
            this.f27183u = bVar.f27196e + bVar.f27194c;
        } else if (!list2.isEmpty()) {
            d dVar = (d) t.c(list2);
            this.f27183u = dVar.f27196e + dVar.f27194c;
        } else {
            this.f27183u = 0L;
        }
        long j15 = -9223372036854775807L;
        if (j10 != -9223372036854775807L) {
            if (j10 >= 0) {
                j15 = Math.min(this.f27183u, j10);
            } else {
                j15 = Math.max(0L, this.f27183u + j10);
            }
        }
        this.f27167e = j15;
        this.f27168f = j10 >= 0;
        this.f27184v = fVar;
    }

    @Override // d4.a
    /* renamed from: b */
    public g a(List<StreamKey> list) {
        return this;
    }

    public g c(long j10, int i10) {
        return new g(this.f27166d, this.f27229a, this.f27230b, this.f27167e, this.f27169g, j10, true, i10, this.f27173k, this.f27174l, this.f27175m, this.f27176n, this.f27231c, this.f27177o, this.f27178p, this.f27179q, this.f27180r, this.f27181s, this.f27184v, this.f27182t);
    }

    public g d() {
        return this.f27177o ? this : new g(this.f27166d, this.f27229a, this.f27230b, this.f27167e, this.f27169g, this.f27170h, this.f27171i, this.f27172j, this.f27173k, this.f27174l, this.f27175m, this.f27176n, this.f27231c, true, this.f27178p, this.f27179q, this.f27180r, this.f27181s, this.f27184v, this.f27182t);
    }

    public long e() {
        return this.f27170h + this.f27183u;
    }

    public boolean f(g gVar) {
        if (gVar != null) {
            long j10 = this.f27173k;
            long j11 = gVar.f27173k;
            if (j10 > j11) {
                return true;
            }
            if (j10 < j11) {
                return false;
            }
            int size = this.f27180r.size() - gVar.f27180r.size();
            if (size != 0) {
                return size > 0;
            }
            int size2 = this.f27181s.size();
            int size3 = gVar.f27181s.size();
            if (size2 <= size3) {
                return size2 == size3 && this.f27177o && !gVar.f27177o;
            }
            return true;
        }
        return true;
    }

    /* compiled from: HlsMediaPlaylist.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class d extends e {

        /* renamed from: l  reason: collision with root package name */
        public final String f27190l;

        /* renamed from: m  reason: collision with root package name */
        public final List<b> f27191m;

        public d(String str, long j10, long j11, String str2, String str3) {
            this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j10, j11, false, q.p());
        }

        public d b(long j10, int i10) {
            ArrayList arrayList = new ArrayList();
            long j11 = j10;
            for (int i11 = 0; i11 < this.f27191m.size(); i11++) {
                b bVar = this.f27191m.get(i11);
                arrayList.add(bVar.b(j11, i10));
                j11 += bVar.f27194c;
            }
            return new d(this.f27192a, this.f27193b, this.f27190l, this.f27194c, i10, j10, this.f27197f, this.f27198g, this.f27199h, this.f27200i, this.f27201j, this.f27202k, arrayList);
        }

        public d(String str, d dVar, String str2, long j10, int i10, long j11, DrmInitData drmInitData, String str3, String str4, long j12, long j13, boolean z10, List<b> list) {
            super(str, dVar, j10, i10, j11, drmInitData, str3, str4, j12, j13, z10);
            this.f27190l = str2;
            this.f27191m = q.l(list);
        }
    }
}
