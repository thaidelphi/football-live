package m9;

import i9.k0;
/* compiled from: Mutex.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final k0 f27813a = new k0("NO_OWNER");

    /* renamed from: b  reason: collision with root package name */
    private static final k0 f27814b = new k0("ALREADY_LOCKED_BY_OWNER");

    public static final a a(boolean z10) {
        return new b(z10);
    }

    public static /* synthetic */ a b(boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return a(z10);
    }
}
