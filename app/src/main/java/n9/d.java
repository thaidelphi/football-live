package n9;

import com.google.android.gms.common.api.Api;
import java.util.concurrent.TimeUnit;
/* compiled from: CacheControl.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class d {

    /* renamed from: n  reason: collision with root package name */
    public static final d f28753n = new a().c().a();

    /* renamed from: o  reason: collision with root package name */
    public static final d f28754o = new a().e().b(Api.BaseClientBuilder.API_PRIORITY_OTHER, TimeUnit.SECONDS).a();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f28755a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f28756b;

    /* renamed from: c  reason: collision with root package name */
    private final int f28757c;

    /* renamed from: d  reason: collision with root package name */
    private final int f28758d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f28759e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f28760f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f28761g;

    /* renamed from: h  reason: collision with root package name */
    private final int f28762h;

    /* renamed from: i  reason: collision with root package name */
    private final int f28763i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f28764j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f28765k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f28766l;

    /* renamed from: m  reason: collision with root package name */
    String f28767m;

    /* compiled from: CacheControl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        boolean f28768a;

        /* renamed from: b  reason: collision with root package name */
        boolean f28769b;

        /* renamed from: c  reason: collision with root package name */
        int f28770c = -1;

        /* renamed from: d  reason: collision with root package name */
        int f28771d = -1;

        /* renamed from: e  reason: collision with root package name */
        int f28772e = -1;

        /* renamed from: f  reason: collision with root package name */
        boolean f28773f;

        /* renamed from: g  reason: collision with root package name */
        boolean f28774g;

        /* renamed from: h  reason: collision with root package name */
        boolean f28775h;

        public d a() {
            return new d(this);
        }

        public a b(int i10, TimeUnit timeUnit) {
            if (i10 >= 0) {
                long seconds = timeUnit.toSeconds(i10);
                this.f28771d = seconds > 2147483647L ? Api.BaseClientBuilder.API_PRIORITY_OTHER : (int) seconds;
                return this;
            }
            throw new IllegalArgumentException("maxStale < 0: " + i10);
        }

        public a c() {
            this.f28768a = true;
            return this;
        }

        public a d() {
            this.f28769b = true;
            return this;
        }

        public a e() {
            this.f28773f = true;
            return this;
        }
    }

    private d(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str) {
        this.f28755a = z10;
        this.f28756b = z11;
        this.f28757c = i10;
        this.f28758d = i11;
        this.f28759e = z12;
        this.f28760f = z13;
        this.f28761g = z14;
        this.f28762h = i12;
        this.f28763i = i13;
        this.f28764j = z15;
        this.f28765k = z16;
        this.f28766l = z17;
        this.f28767m = str;
    }

    private String a() {
        StringBuilder sb = new StringBuilder();
        if (this.f28755a) {
            sb.append("no-cache, ");
        }
        if (this.f28756b) {
            sb.append("no-store, ");
        }
        if (this.f28757c != -1) {
            sb.append("max-age=");
            sb.append(this.f28757c);
            sb.append(", ");
        }
        if (this.f28758d != -1) {
            sb.append("s-maxage=");
            sb.append(this.f28758d);
            sb.append(", ");
        }
        if (this.f28759e) {
            sb.append("private, ");
        }
        if (this.f28760f) {
            sb.append("public, ");
        }
        if (this.f28761g) {
            sb.append("must-revalidate, ");
        }
        if (this.f28762h != -1) {
            sb.append("max-stale=");
            sb.append(this.f28762h);
            sb.append(", ");
        }
        if (this.f28763i != -1) {
            sb.append("min-fresh=");
            sb.append(this.f28763i);
            sb.append(", ");
        }
        if (this.f28764j) {
            sb.append("only-if-cached, ");
        }
        if (this.f28765k) {
            sb.append("no-transform, ");
        }
        if (this.f28766l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static n9.d k(n9.r r22) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.d.k(n9.r):n9.d");
    }

    public boolean b() {
        return this.f28759e;
    }

    public boolean c() {
        return this.f28760f;
    }

    public int d() {
        return this.f28757c;
    }

    public int e() {
        return this.f28762h;
    }

    public int f() {
        return this.f28763i;
    }

    public boolean g() {
        return this.f28761g;
    }

    public boolean h() {
        return this.f28755a;
    }

    public boolean i() {
        return this.f28756b;
    }

    public boolean j() {
        return this.f28764j;
    }

    public String toString() {
        String str = this.f28767m;
        if (str != null) {
            return str;
        }
        String a10 = a();
        this.f28767m = a10;
        return a10;
    }

    d(a aVar) {
        this.f28755a = aVar.f28768a;
        this.f28756b = aVar.f28769b;
        this.f28757c = aVar.f28770c;
        this.f28758d = -1;
        this.f28759e = false;
        this.f28760f = false;
        this.f28761g = false;
        this.f28762h = aVar.f28771d;
        this.f28763i = aVar.f28772e;
        this.f28764j = aVar.f28773f;
        this.f28765k = aVar.f28774g;
        this.f28766l = aVar.f28775h;
    }
}
