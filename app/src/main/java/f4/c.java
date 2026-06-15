package f4;

import a5.p0;
import android.net.Uri;
import android.os.Bundle;
import f4.c;
import java.util.ArrayList;
import java.util.Arrays;
import n3.h;
/* compiled from: AdPlaybackState.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class c implements h {

    /* renamed from: g  reason: collision with root package name */
    public static final c f25390g = new c(null, new a[0], 0, -9223372036854775807L, 0);

    /* renamed from: h  reason: collision with root package name */
    private static final a f25391h = new a(0).j(0);

    /* renamed from: i  reason: collision with root package name */
    public static final h.a<c> f25392i = new h.a() { // from class: f4.a
        @Override // n3.h.a
        public final h a(Bundle bundle) {
            c b10;
            b10 = c.b(bundle);
            return b10;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final Object f25393a;

    /* renamed from: b  reason: collision with root package name */
    public final int f25394b;

    /* renamed from: c  reason: collision with root package name */
    public final long f25395c;

    /* renamed from: d  reason: collision with root package name */
    public final long f25396d;

    /* renamed from: e  reason: collision with root package name */
    public final int f25397e;

    /* renamed from: f  reason: collision with root package name */
    private final a[] f25398f;

    /* compiled from: AdPlaybackState.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a implements h {

        /* renamed from: i  reason: collision with root package name */
        public static final h.a<a> f25399i = new h.a() { // from class: f4.b
            @Override // n3.h.a
            public final h a(Bundle bundle) {
                c.a d10;
                d10 = c.a.d(bundle);
                return d10;
            }
        };

        /* renamed from: a  reason: collision with root package name */
        public final long f25400a;

        /* renamed from: b  reason: collision with root package name */
        public final int f25401b;

        /* renamed from: c  reason: collision with root package name */
        public final int f25402c;

        /* renamed from: d  reason: collision with root package name */
        public final Uri[] f25403d;

        /* renamed from: e  reason: collision with root package name */
        public final int[] f25404e;

        /* renamed from: f  reason: collision with root package name */
        public final long[] f25405f;

        /* renamed from: g  reason: collision with root package name */
        public final long f25406g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f25407h;

        public a(long j10) {
            this(j10, -1, -1, new int[0], new Uri[0], new long[0], 0L, false);
        }

        private static long[] b(long[] jArr, int i10) {
            int length = jArr.length;
            int max = Math.max(i10, length);
            long[] copyOf = Arrays.copyOf(jArr, max);
            Arrays.fill(copyOf, length, max, -9223372036854775807L);
            return copyOf;
        }

        private static int[] c(int[] iArr, int i10) {
            int length = iArr.length;
            int max = Math.max(i10, length);
            int[] copyOf = Arrays.copyOf(iArr, max);
            Arrays.fill(copyOf, length, max, 0);
            return copyOf;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static a d(Bundle bundle) {
            long j10 = bundle.getLong(h(0));
            int i10 = bundle.getInt(h(1), -1);
            int i11 = bundle.getInt(h(7), -1);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(h(2));
            int[] intArray = bundle.getIntArray(h(3));
            long[] longArray = bundle.getLongArray(h(4));
            long j11 = bundle.getLong(h(5));
            boolean z10 = bundle.getBoolean(h(6));
            if (intArray == null) {
                intArray = new int[0];
            }
            return new a(j10, i10, i11, intArray, parcelableArrayList == null ? new Uri[0] : (Uri[]) parcelableArrayList.toArray(new Uri[0]), longArray == null ? new long[0] : longArray, j11, z10);
        }

        private static String h(int i10) {
            return Integer.toString(i10, 36);
        }

        public int e() {
            return f(-1);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f25400a == aVar.f25400a && this.f25401b == aVar.f25401b && this.f25402c == aVar.f25402c && Arrays.equals(this.f25403d, aVar.f25403d) && Arrays.equals(this.f25404e, aVar.f25404e) && Arrays.equals(this.f25405f, aVar.f25405f) && this.f25406g == aVar.f25406g && this.f25407h == aVar.f25407h;
        }

        public int f(int i10) {
            int i11 = i10 + 1;
            while (true) {
                int[] iArr = this.f25404e;
                if (i11 >= iArr.length || this.f25407h || iArr[i11] == 0 || iArr[i11] == 1) {
                    break;
                }
                i11++;
            }
            return i11;
        }

        public boolean g() {
            if (this.f25401b == -1) {
                return true;
            }
            for (int i10 = 0; i10 < this.f25401b; i10++) {
                int[] iArr = this.f25404e;
                if (iArr[i10] == 0 || iArr[i10] == 1) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            long j10 = this.f25400a;
            long j11 = this.f25406g;
            return (((((((((((((this.f25401b * 31) + this.f25402c) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Arrays.hashCode(this.f25403d)) * 31) + Arrays.hashCode(this.f25404e)) * 31) + Arrays.hashCode(this.f25405f)) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f25407h ? 1 : 0);
        }

        public boolean i() {
            return this.f25401b == -1 || e() < this.f25401b;
        }

        public a j(int i10) {
            int[] c10 = c(this.f25404e, i10);
            long[] b10 = b(this.f25405f, i10);
            return new a(this.f25400a, i10, this.f25402c, c10, (Uri[]) Arrays.copyOf(this.f25403d, i10), b10, this.f25406g, this.f25407h);
        }

        private a(long j10, int i10, int i11, int[] iArr, Uri[] uriArr, long[] jArr, long j11, boolean z10) {
            a5.a.a(iArr.length == uriArr.length);
            this.f25400a = j10;
            this.f25401b = i10;
            this.f25402c = i11;
            this.f25404e = iArr;
            this.f25403d = uriArr;
            this.f25405f = jArr;
            this.f25406g = j11;
            this.f25407h = z10;
        }
    }

    private c(Object obj, a[] aVarArr, long j10, long j11, int i10) {
        this.f25393a = obj;
        this.f25395c = j10;
        this.f25396d = j11;
        this.f25394b = aVarArr.length + i10;
        this.f25398f = aVarArr;
        this.f25397e = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static c b(Bundle bundle) {
        a[] aVarArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(g(1));
        if (parcelableArrayList == null) {
            aVarArr = new a[0];
        } else {
            a[] aVarArr2 = new a[parcelableArrayList.size()];
            for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
                aVarArr2[i10] = a.f25399i.a((Bundle) parcelableArrayList.get(i10));
            }
            aVarArr = aVarArr2;
        }
        return new c(null, aVarArr, bundle.getLong(g(2), 0L), bundle.getLong(g(3), -9223372036854775807L), bundle.getInt(g(4)));
    }

    private boolean f(long j10, long j11, int i10) {
        if (j10 == Long.MIN_VALUE) {
            return false;
        }
        long j12 = c(i10).f25400a;
        return j12 == Long.MIN_VALUE ? j11 == -9223372036854775807L || j10 < j11 : j10 < j12;
    }

    private static String g(int i10) {
        return Integer.toString(i10, 36);
    }

    public a c(int i10) {
        int i11 = this.f25397e;
        if (i10 < i11) {
            return f25391h;
        }
        return this.f25398f[i10 - i11];
    }

    public int d(long j10, long j11) {
        if (j10 != Long.MIN_VALUE) {
            if (j11 == -9223372036854775807L || j10 < j11) {
                int i10 = this.f25397e;
                while (i10 < this.f25394b && ((c(i10).f25400a != Long.MIN_VALUE && c(i10).f25400a <= j10) || !c(i10).i())) {
                    i10++;
                }
                if (i10 < this.f25394b) {
                    return i10;
                }
                return -1;
            }
            return -1;
        }
        return -1;
    }

    public int e(long j10, long j11) {
        int i10 = this.f25394b - 1;
        while (i10 >= 0 && f(j10, j11, i10)) {
            i10--;
        }
        if (i10 < 0 || !c(i10).g()) {
            return -1;
        }
        return i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return p0.c(this.f25393a, cVar.f25393a) && this.f25394b == cVar.f25394b && this.f25395c == cVar.f25395c && this.f25396d == cVar.f25396d && this.f25397e == cVar.f25397e && Arrays.equals(this.f25398f, cVar.f25398f);
    }

    public int hashCode() {
        int i10 = this.f25394b * 31;
        Object obj = this.f25393a;
        return ((((((((i10 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f25395c)) * 31) + ((int) this.f25396d)) * 31) + this.f25397e) * 31) + Arrays.hashCode(this.f25398f);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdPlaybackState(adsId=");
        sb.append(this.f25393a);
        sb.append(", adResumePositionUs=");
        sb.append(this.f25395c);
        sb.append(", adGroups=[");
        for (int i10 = 0; i10 < this.f25398f.length; i10++) {
            sb.append("adGroup(timeUs=");
            sb.append(this.f25398f[i10].f25400a);
            sb.append(", ads=[");
            for (int i11 = 0; i11 < this.f25398f[i10].f25404e.length; i11++) {
                sb.append("ad(state=");
                int i12 = this.f25398f[i10].f25404e[i11];
                if (i12 == 0) {
                    sb.append('_');
                } else if (i12 == 1) {
                    sb.append('R');
                } else if (i12 == 2) {
                    sb.append('S');
                } else if (i12 == 3) {
                    sb.append('P');
                } else if (i12 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(this.f25398f[i10].f25405f[i11]);
                sb.append(')');
                if (i11 < this.f25398f[i10].f25404e.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i10 < this.f25398f.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        return sb.toString();
    }
}
