package m4;

import a5.n0;
import a5.p0;
import android.net.Uri;
import com.google.android.exoplayer2.offline.StreamKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import n3.m1;
import v3.j;
/* compiled from: SsManifest.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class a implements d4.a<a> {

    /* renamed from: a  reason: collision with root package name */
    public final int f27692a;

    /* renamed from: b  reason: collision with root package name */
    public final int f27693b;

    /* renamed from: c  reason: collision with root package name */
    public final int f27694c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f27695d;

    /* renamed from: e  reason: collision with root package name */
    public final C0313a f27696e;

    /* renamed from: f  reason: collision with root package name */
    public final b[] f27697f;

    /* renamed from: g  reason: collision with root package name */
    public final long f27698g;

    /* renamed from: h  reason: collision with root package name */
    public final long f27699h;

    /* compiled from: SsManifest.java */
    /* renamed from: m4.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class C0313a {

        /* renamed from: a  reason: collision with root package name */
        public final UUID f27700a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f27701b;

        /* renamed from: c  reason: collision with root package name */
        public final j[] f27702c;

        public C0313a(UUID uuid, byte[] bArr, j[] jVarArr) {
            this.f27700a = uuid;
            this.f27701b = bArr;
            this.f27702c = jVarArr;
        }
    }

    public a(int i10, int i11, long j10, long j11, long j12, int i12, boolean z10, C0313a c0313a, b[] bVarArr) {
        this(i10, i11, j11 == 0 ? -9223372036854775807L : p0.O0(j11, 1000000L, j10), j12 != 0 ? p0.O0(j12, 1000000L, j10) : -9223372036854775807L, i12, z10, c0313a, bVarArr);
    }

    @Override // d4.a
    /* renamed from: b */
    public final a a(List<StreamKey> list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        b bVar = null;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            StreamKey streamKey = (StreamKey) arrayList.get(i10);
            b bVar2 = this.f27697f[streamKey.f10651b];
            if (bVar2 != bVar && bVar != null) {
                arrayList2.add(bVar.b((m1[]) arrayList3.toArray(new m1[0])));
                arrayList3.clear();
            }
            arrayList3.add(bVar2.f27712j[streamKey.f10652c]);
            i10++;
            bVar = bVar2;
        }
        if (bVar != null) {
            arrayList2.add(bVar.b((m1[]) arrayList3.toArray(new m1[0])));
        }
        return new a(this.f27692a, this.f27693b, this.f27698g, this.f27699h, this.f27694c, this.f27695d, this.f27696e, (b[]) arrayList2.toArray(new b[0]));
    }

    /* compiled from: SsManifest.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f27703a;

        /* renamed from: b  reason: collision with root package name */
        public final String f27704b;

        /* renamed from: c  reason: collision with root package name */
        public final long f27705c;

        /* renamed from: d  reason: collision with root package name */
        public final String f27706d;

        /* renamed from: e  reason: collision with root package name */
        public final int f27707e;

        /* renamed from: f  reason: collision with root package name */
        public final int f27708f;

        /* renamed from: g  reason: collision with root package name */
        public final int f27709g;

        /* renamed from: h  reason: collision with root package name */
        public final int f27710h;

        /* renamed from: i  reason: collision with root package name */
        public final String f27711i;

        /* renamed from: j  reason: collision with root package name */
        public final m1[] f27712j;

        /* renamed from: k  reason: collision with root package name */
        public final int f27713k;

        /* renamed from: l  reason: collision with root package name */
        private final String f27714l;

        /* renamed from: m  reason: collision with root package name */
        private final String f27715m;

        /* renamed from: n  reason: collision with root package name */
        private final List<Long> f27716n;

        /* renamed from: o  reason: collision with root package name */
        private final long[] f27717o;

        /* renamed from: p  reason: collision with root package name */
        private final long f27718p;

        public b(String str, String str2, int i10, String str3, long j10, String str4, int i11, int i12, int i13, int i14, String str5, m1[] m1VarArr, List<Long> list, long j11) {
            this(str, str2, i10, str3, j10, str4, i11, i12, i13, i14, str5, m1VarArr, list, p0.P0(list, 1000000L, j10), p0.O0(j11, 1000000L, j10));
        }

        public Uri a(int i10, int i11) {
            a5.a.f(this.f27712j != null);
            a5.a.f(this.f27716n != null);
            a5.a.f(i11 < this.f27716n.size());
            String num = Integer.toString(this.f27712j[i10].f28181h);
            String l10 = this.f27716n.get(i11).toString();
            return n0.e(this.f27714l, this.f27715m.replace("{bitrate}", num).replace("{Bitrate}", num).replace("{start time}", l10).replace("{start_time}", l10));
        }

        public b b(m1[] m1VarArr) {
            return new b(this.f27714l, this.f27715m, this.f27703a, this.f27704b, this.f27705c, this.f27706d, this.f27707e, this.f27708f, this.f27709g, this.f27710h, this.f27711i, m1VarArr, this.f27716n, this.f27717o, this.f27718p);
        }

        public long c(int i10) {
            if (i10 == this.f27713k - 1) {
                return this.f27718p;
            }
            long[] jArr = this.f27717o;
            return jArr[i10 + 1] - jArr[i10];
        }

        public int d(long j10) {
            return p0.i(this.f27717o, j10, true, true);
        }

        public long e(int i10) {
            return this.f27717o[i10];
        }

        private b(String str, String str2, int i10, String str3, long j10, String str4, int i11, int i12, int i13, int i14, String str5, m1[] m1VarArr, List<Long> list, long[] jArr, long j11) {
            this.f27714l = str;
            this.f27715m = str2;
            this.f27703a = i10;
            this.f27704b = str3;
            this.f27705c = j10;
            this.f27706d = str4;
            this.f27707e = i11;
            this.f27708f = i12;
            this.f27709g = i13;
            this.f27710h = i14;
            this.f27711i = str5;
            this.f27712j = m1VarArr;
            this.f27716n = list;
            this.f27717o = jArr;
            this.f27718p = j11;
            this.f27713k = list.size();
        }
    }

    private a(int i10, int i11, long j10, long j11, int i12, boolean z10, C0313a c0313a, b[] bVarArr) {
        this.f27692a = i10;
        this.f27693b = i11;
        this.f27698g = j10;
        this.f27699h = j11;
        this.f27694c = i12;
        this.f27695d = z10;
        this.f27696e = c0313a;
        this.f27697f = bVarArr;
    }
}
