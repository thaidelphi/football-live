package n4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import n3.h;
import y5.q;
/* compiled from: CueGroup.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class e implements n3.h {

    /* renamed from: c  reason: collision with root package name */
    public static final e f28632c = new e(q.p(), 0);

    /* renamed from: d  reason: collision with root package name */
    public static final h.a<e> f28633d = new h.a() { // from class: n4.d
        @Override // n3.h.a
        public final n3.h a(Bundle bundle) {
            e b10;
            b10 = e.b(bundle);
            return b10;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final q<b> f28634a;

    /* renamed from: b  reason: collision with root package name */
    public final long f28635b;

    public e(List<b> list, long j10) {
        this.f28634a = q.l(list);
        this.f28635b = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e b(Bundle bundle) {
        q b10;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(c(0));
        if (parcelableArrayList == null) {
            b10 = q.p();
        } else {
            b10 = a5.c.b(b.f28596s, parcelableArrayList);
        }
        return new e(b10, bundle.getLong(c(1)));
    }

    private static String c(int i10) {
        return Integer.toString(i10, 36);
    }
}
