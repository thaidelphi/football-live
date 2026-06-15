package g9;

import com.google.android.gms.common.api.Api;
/* compiled from: SharedFlow.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public static final i9.k0 f25871a = new i9.k0("NO_VALUE");

    public static final <T> v<T> a(int i10, int i11, f9.a aVar) {
        boolean z10 = true;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("replay cannot be negative, but was " + i10).toString());
        }
        if (i11 >= 0) {
            if (i10 <= 0 && i11 <= 0 && aVar != f9.a.SUSPEND) {
                z10 = false;
            }
            if (z10) {
                int i12 = i11 + i10;
                if (i12 < 0) {
                    i12 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                }
                return new b0(i10, i12, aVar);
            }
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + aVar).toString());
        }
        throw new IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + i11).toString());
    }

    public static /* synthetic */ v b(int i10, int i11, f9.a aVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            aVar = f9.a.SUSPEND;
        }
        return a(i10, i11, aVar);
    }

    public static final /* synthetic */ Object c(Object[] objArr, long j10) {
        return f(objArr, j10);
    }

    public static final /* synthetic */ void d(Object[] objArr, long j10, Object obj) {
        g(objArr, j10, obj);
    }

    public static final <T> e<T> e(a0<? extends T> a0Var, m8.g gVar, int i10, f9.a aVar) {
        return ((i10 == 0 || i10 == -3) && aVar == f9.a.SUSPEND) ? a0Var : new h9.h(a0Var, gVar, i10, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object f(Object[] objArr, long j10) {
        return objArr[((int) j10) & (objArr.length - 1)];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Object[] objArr, long j10, Object obj) {
        objArr[((int) j10) & (objArr.length - 1)] = obj;
    }
}
