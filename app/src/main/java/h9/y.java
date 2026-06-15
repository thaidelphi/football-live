package h9;

import com.google.android.gms.common.api.Api;
import g9.b0;
import g9.j0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AbstractSharedFlow.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class y extends b0<Integer> implements j0<Integer> {
    public y(int i10) {
        super(1, Api.BaseClientBuilder.API_PRIORITY_OTHER, f9.a.DROP_OLDEST);
        c(Integer.valueOf(i10));
    }

    @Override // g9.j0
    /* renamed from: Y */
    public Integer getValue() {
        Integer valueOf;
        synchronized (this) {
            valueOf = Integer.valueOf(L().intValue());
        }
        return valueOf;
    }

    public final boolean Z(int i10) {
        boolean c10;
        synchronized (this) {
            c10 = c(Integer.valueOf(L().intValue() + i10));
        }
        return c10;
    }
}
