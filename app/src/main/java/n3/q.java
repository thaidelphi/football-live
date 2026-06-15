package n3;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import n3.h;
/* compiled from: ExoPlaybackException.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class q extends l2 {

    /* renamed from: k  reason: collision with root package name */
    public static final h.a<q> f28291k = new h.a() { // from class: n3.p
        @Override // n3.h.a
        public final h a(Bundle bundle) {
            return q.e(bundle);
        }
    };

    /* renamed from: d  reason: collision with root package name */
    public final int f28292d;

    /* renamed from: e  reason: collision with root package name */
    public final String f28293e;

    /* renamed from: f  reason: collision with root package name */
    public final int f28294f;

    /* renamed from: g  reason: collision with root package name */
    public final m1 f28295g;

    /* renamed from: h  reason: collision with root package name */
    public final int f28296h;

    /* renamed from: i  reason: collision with root package name */
    public final e4.r f28297i;

    /* renamed from: j  reason: collision with root package name */
    final boolean f28298j;

    private q(int i10, Throwable th, int i11) {
        this(i10, th, null, i11, null, -1, null, 4, false);
    }

    public static /* synthetic */ q e(Bundle bundle) {
        return new q(bundle);
    }

    public static q g(Throwable th, String str, int i10, m1 m1Var, int i11, boolean z10, int i12) {
        return new q(1, th, null, i12, str, i10, m1Var, m1Var == null ? 4 : i11, z10);
    }

    public static q h(IOException iOException, int i10) {
        return new q(0, iOException, i10);
    }

    @Deprecated
    public static q i(RuntimeException runtimeException) {
        return j(runtimeException, 1000);
    }

    public static q j(RuntimeException runtimeException, int i10) {
        return new q(2, runtimeException, i10);
    }

    private static String k(int i10, String str, String str2, int i11, m1 m1Var, int i12) {
        String str3;
        if (i10 == 0) {
            str3 = "Source error";
        } else if (i10 != 1) {
            str3 = i10 != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i11 + ", format=" + m1Var + ", format_supported=" + a5.p0.V(i12);
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return str3 + ": " + str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q f(e4.r rVar) {
        return new q((String) a5.p0.j(getMessage()), getCause(), this.f28126a, this.f28292d, this.f28293e, this.f28294f, this.f28295g, this.f28296h, rVar, this.f28127b, this.f28298j);
    }

    private q(int i10, Throwable th, String str, int i11, String str2, int i12, m1 m1Var, int i13, boolean z10) {
        this(k(i10, str, str2, i12, m1Var, i13), th, i11, i10, str2, i12, m1Var, i13, null, SystemClock.elapsedRealtime(), z10);
    }

    private q(Bundle bundle) {
        super(bundle);
        this.f28292d = bundle.getInt(l2.d(1001), 2);
        this.f28293e = bundle.getString(l2.d(1002));
        this.f28294f = bundle.getInt(l2.d(1003), -1);
        Bundle bundle2 = bundle.getBundle(l2.d(1004));
        this.f28295g = bundle2 == null ? null : m1.H.a(bundle2);
        this.f28296h = bundle.getInt(l2.d(1005), 4);
        this.f28298j = bundle.getBoolean(l2.d(1006), false);
        this.f28297i = null;
    }

    private q(String str, Throwable th, int i10, int i11, String str2, int i12, m1 m1Var, int i13, e4.r rVar, long j10, boolean z10) {
        super(str, th, i10, j10);
        boolean z11 = false;
        a5.a.a(!z10 || i11 == 1);
        a5.a.a((th != null || i11 == 3) ? true : z11);
        this.f28292d = i11;
        this.f28293e = str2;
        this.f28294f = i12;
        this.f28295g = m1Var;
        this.f28296h = i13;
        this.f28297i = rVar;
        this.f28298j = z10;
    }
}
