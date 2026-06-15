package n3;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import n3.h;
/* compiled from: DeviceInfo.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class o implements h {

    /* renamed from: d  reason: collision with root package name */
    public static final o f28253d = new o(0, 0, 0);

    /* renamed from: e  reason: collision with root package name */
    public static final h.a<o> f28254e = new h.a() { // from class: n3.n
        @Override // n3.h.a
        public final h a(Bundle bundle) {
            o c10;
            c10 = o.c(bundle);
            return c10;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final int f28255a;

    /* renamed from: b  reason: collision with root package name */
    public final int f28256b;

    /* renamed from: c  reason: collision with root package name */
    public final int f28257c;

    public o(int i10, int i11, int i12) {
        this.f28255a = i10;
        this.f28256b = i11;
        this.f28257c = i12;
    }

    private static String b(int i10) {
        return Integer.toString(i10, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ o c(Bundle bundle) {
        return new o(bundle.getInt(b(0), 0), bundle.getInt(b(1), 0), bundle.getInt(b(2), 0));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            return this.f28255a == oVar.f28255a && this.f28256b == oVar.f28256b && this.f28257c == oVar.f28257c;
        }
        return false;
    }

    public int hashCode() {
        return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f28255a) * 31) + this.f28256b) * 31) + this.f28257c;
    }
}
