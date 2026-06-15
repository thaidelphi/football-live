package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.ironsource.b9;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzej {

    /* renamed from: b  reason: collision with root package name */
    protected static final AtomicReference f13473b = new AtomicReference();

    /* renamed from: c  reason: collision with root package name */
    protected static final AtomicReference f13474c = new AtomicReference();

    /* renamed from: d  reason: collision with root package name */
    protected static final AtomicReference f13475d = new AtomicReference();

    /* renamed from: a  reason: collision with root package name */
    private final zzei f13476a;

    public zzej(zzei zzeiVar) {
        this.f13476a = zzeiVar;
    }

    private static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        Preconditions.m(strArr);
        Preconditions.m(strArr2);
        Preconditions.m(atomicReference);
        Preconditions.a(strArr.length == strArr2.length);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            String str3 = strArr[i10];
            if (str == str3 || str.equals(str3)) {
                synchronized (atomicReference) {
                    String[] strArr3 = (String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i10];
                    if (str2 == null) {
                        str2 = strArr2[i10] + "(" + strArr[i10] + ")";
                        strArr3[i10] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    protected final String a(Object[] objArr) {
        String valueOf;
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(b9.i.f16696d);
        for (Object obj : objArr) {
            if (obj instanceof Bundle) {
                valueOf = b((Bundle) obj);
            } else {
                valueOf = String.valueOf(obj);
            }
            if (valueOf != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(valueOf);
            }
        }
        sb.append(b9.i.f16698e);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String b(Bundle bundle) {
        String valueOf;
        if (bundle == null) {
            return null;
        }
        if (!this.f13476a.zza()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(e(str));
            sb.append(b9.i.f16692b);
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                valueOf = a(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                valueOf = a((Object[]) obj);
            } else if (obj instanceof ArrayList) {
                valueOf = a(((ArrayList) obj).toArray());
            } else {
                valueOf = String.valueOf(obj);
            }
            sb.append(valueOf);
        }
        sb.append("}]");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String c(zzaw zzawVar) {
        String b10;
        if (!this.f13476a.zza()) {
            return zzawVar.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("origin=");
        sb.append(zzawVar.f13314c);
        sb.append(",name=");
        sb.append(d(zzawVar.f13312a));
        sb.append(",params=");
        zzau zzauVar = zzawVar.f13313b;
        if (zzauVar == null) {
            b10 = null;
        } else if (!this.f13476a.zza()) {
            b10 = zzauVar.toString();
        } else {
            b10 = b(zzauVar.n0());
        }
        sb.append(b10);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String d(String str) {
        if (str == null) {
            return null;
        }
        return !this.f13476a.zza() ? str : g(str, zzgv.f13587c, zzgv.f13585a, f13473b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String e(String str) {
        if (str == null) {
            return null;
        }
        return !this.f13476a.zza() ? str : g(str, zzgw.f13590b, zzgw.f13589a, f13474c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String f(String str) {
        if (str == null) {
            return null;
        }
        if (this.f13476a.zza()) {
            if (str.startsWith("_exp_")) {
                return "experiment_id(" + str + ")";
            }
            return g(str, zzgx.f13594b, zzgx.f13593a, f13475d);
        }
        return str;
    }
}
