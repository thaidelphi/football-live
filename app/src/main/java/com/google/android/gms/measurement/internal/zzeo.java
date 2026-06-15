package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzeo extends y0 {

    /* renamed from: c  reason: collision with root package name */
    private char f13481c;

    /* renamed from: d  reason: collision with root package name */
    private long f13482d;

    /* renamed from: e  reason: collision with root package name */
    private String f13483e;

    /* renamed from: f  reason: collision with root package name */
    private final zzem f13484f;

    /* renamed from: g  reason: collision with root package name */
    private final zzem f13485g;

    /* renamed from: h  reason: collision with root package name */
    private final zzem f13486h;

    /* renamed from: i  reason: collision with root package name */
    private final zzem f13487i;

    /* renamed from: j  reason: collision with root package name */
    private final zzem f13488j;

    /* renamed from: k  reason: collision with root package name */
    private final zzem f13489k;

    /* renamed from: l  reason: collision with root package name */
    private final zzem f13490l;

    /* renamed from: m  reason: collision with root package name */
    private final zzem f13491m;

    /* renamed from: n  reason: collision with root package name */
    private final zzem f13492n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeo(zzfy zzfyVar) {
        super(zzfyVar);
        this.f13481c = (char) 0;
        this.f13482d = -1L;
        this.f13484f = new zzem(this, 6, false, false);
        this.f13485g = new zzem(this, 6, true, false);
        this.f13486h = new zzem(this, 6, false, true);
        this.f13487i = new zzem(this, 5, false, false);
        this.f13488j = new zzem(this, 5, true, false);
        this.f13489k = new zzem(this, 5, false, true);
        this.f13490l = new zzem(this, 4, false, false);
        this.f13491m = new zzem(this, 3, false, false);
        this.f13492n = new zzem(this, 2, false, false);
    }

    private static String B(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? str : str.substring(0, lastIndexOf);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object u(String str) {
        if (str == null) {
            return null;
        }
        return new r(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String v(boolean z10, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String w10 = w(z10, obj);
        String w11 = w(z10, obj2);
        String w12 = w(z10, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(w10)) {
            sb.append(str2);
            sb.append(w10);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(w11)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(w11);
        }
        if (!TextUtils.isEmpty(w12)) {
            sb.append(str3);
            sb.append(w12);
        }
        return sb.toString();
    }

    @VisibleForTesting
    static String w(boolean z10, Object obj) {
        String str;
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i10 = 0;
        if (obj instanceof Long) {
            if (!z10) {
                return obj.toString();
            }
            Long l10 = (Long) obj;
            if (Math.abs(l10.longValue()) < 100) {
                return obj.toString();
            }
            String str2 = obj.toString().charAt(0) == '-' ? "-" : "";
            String valueOf = String.valueOf(Math.abs(l10.longValue()));
            long round = Math.round(Math.pow(10.0d, valueOf.length() - 1));
            long round2 = Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
            return str2 + round + "..." + str2 + round2;
        } else if (obj instanceof Boolean) {
            return obj.toString();
        } else {
            if (obj instanceof Throwable) {
                Throwable th = (Throwable) obj;
                StringBuilder sb = new StringBuilder(z10 ? th.getClass().getName() : th.toString());
                String B = B(zzfy.class.getCanonicalName());
                StackTraceElement[] stackTrace = th.getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i10];
                    if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && B(className).equals(B)) {
                        sb.append(": ");
                        sb.append(stackTraceElement);
                        break;
                    }
                    i10++;
                }
                return sb.toString();
            } else if (!(obj instanceof r)) {
                return z10 ? "-" : obj.toString();
            } else {
                str = ((r) obj).f13126a;
                return str;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void A(int i10, boolean z10, boolean z11, String str, Object obj, Object obj2, Object obj3) {
        if (!z10 && Log.isLoggable(x(), i10)) {
            Log.println(i10, x(), v(false, str, obj, obj2, obj3));
        }
        if (z11 || i10 < 5) {
            return;
        }
        Preconditions.m(str);
        zzfv B = this.f13220a.B();
        if (B == null) {
            Log.println(6, x(), "Scheduler not set. Not logging error/warn");
        } else if (!B.i()) {
            Log.println(6, x(), "Scheduler not initialized. Not logging error/warn");
        } else {
            if (i10 >= 9) {
                i10 = 8;
            }
            B.u(new q(this, i10, str, obj, obj2, obj3));
        }
    }

    @Override // com.google.android.gms.measurement.internal.y0
    protected final boolean e() {
        return false;
    }

    public final zzem l() {
        return this.f13491m;
    }

    public final zzem m() {
        return this.f13484f;
    }

    public final zzem n() {
        return this.f13486h;
    }

    public final zzem o() {
        return this.f13485g;
    }

    public final zzem p() {
        return this.f13490l;
    }

    public final zzem q() {
        return this.f13492n;
    }

    public final zzem r() {
        return this.f13487i;
    }

    public final zzem s() {
        return this.f13489k;
    }

    public final zzem t() {
        return this.f13488j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @VisibleForTesting
    public final String x() {
        String str;
        synchronized (this) {
            if (this.f13483e == null) {
                if (this.f13220a.L() != null) {
                    this.f13483e = this.f13220a.L();
                } else {
                    this.f13483e = this.f13220a.u().r();
                }
            }
            Preconditions.m(this.f13483e);
            str = this.f13483e;
        }
        return str;
    }
}
