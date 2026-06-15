package b5;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import n3.h;
/* compiled from: ColorInfo.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class c implements n3.h {

    /* renamed from: f  reason: collision with root package name */
    public static final c f5102f = new c(1, 2, 3, null);

    /* renamed from: g  reason: collision with root package name */
    public static final h.a<c> f5103g = new h.a() { // from class: b5.b
        @Override // n3.h.a
        public final n3.h a(Bundle bundle) {
            c e8;
            e8 = c.e(bundle);
            return e8;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final int f5104a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5105b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5106c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f5107d;

    /* renamed from: e  reason: collision with root package name */
    private int f5108e;

    public c(int i10, int i11, int i12, byte[] bArr) {
        this.f5104a = i10;
        this.f5105b = i11;
        this.f5106c = i12;
        this.f5107d = bArr;
    }

    public static int b(int i10) {
        if (i10 != 1) {
            if (i10 != 9) {
                return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
            }
            return 6;
        }
        return 1;
    }

    public static int c(int i10) {
        if (i10 != 1) {
            if (i10 != 16) {
                if (i10 != 18) {
                    return (i10 == 6 || i10 == 7) ? 3 : -1;
                }
                return 7;
            }
            return 6;
        }
        return 3;
    }

    private static String d(int i10) {
        return Integer.toString(i10, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ c e(Bundle bundle) {
        return new c(bundle.getInt(d(0), -1), bundle.getInt(d(1), -1), bundle.getInt(d(2), -1), bundle.getByteArray(d(3)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f5104a == cVar.f5104a && this.f5105b == cVar.f5105b && this.f5106c == cVar.f5106c && Arrays.equals(this.f5107d, cVar.f5107d);
    }

    public int hashCode() {
        if (this.f5108e == 0) {
            this.f5108e = ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f5104a) * 31) + this.f5105b) * 31) + this.f5106c) * 31) + Arrays.hashCode(this.f5107d);
        }
        return this.f5108e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ColorInfo(");
        sb.append(this.f5104a);
        sb.append(", ");
        sb.append(this.f5105b);
        sb.append(", ");
        sb.append(this.f5106c);
        sb.append(", ");
        sb.append(this.f5107d != null);
        sb.append(")");
        return sb.toString();
    }
}
