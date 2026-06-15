package androidx.lifecycle;

import android.os.Bundle;
import androidx.savedstate.a;
import java.util.Map;
/* compiled from: SavedStateHandleSupport.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class f0 implements a.c {

    /* renamed from: a  reason: collision with root package name */
    private final androidx.savedstate.a f3621a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f3622b;

    /* renamed from: c  reason: collision with root package name */
    private Bundle f3623c;

    /* renamed from: d  reason: collision with root package name */
    private final i8.g f3624d;

    /* compiled from: SavedStateHandleSupport.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static final class a extends kotlin.jvm.internal.o implements t8.a<g0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p0 f3625a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p0 p0Var) {
            super(0);
            this.f3625a = p0Var;
        }

        @Override // t8.a
        /* renamed from: b */
        public final g0 invoke() {
            return e0.e(this.f3625a);
        }
    }

    public f0(androidx.savedstate.a savedStateRegistry, p0 viewModelStoreOwner) {
        i8.g b10;
        kotlin.jvm.internal.n.f(savedStateRegistry, "savedStateRegistry");
        kotlin.jvm.internal.n.f(viewModelStoreOwner, "viewModelStoreOwner");
        this.f3621a = savedStateRegistry;
        b10 = i8.i.b(new a(viewModelStoreOwner));
        this.f3624d = b10;
    }

    private final g0 c() {
        return (g0) this.f3624d.getValue();
    }

    @Override // androidx.savedstate.a.c
    public Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f3623c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry<String, d0> entry : c().f().entrySet()) {
            String key = entry.getKey();
            Bundle a10 = entry.getValue().c().a();
            if (!kotlin.jvm.internal.n.a(a10, Bundle.EMPTY)) {
                bundle.putBundle(key, a10);
            }
        }
        this.f3622b = false;
        return bundle;
    }

    public final Bundle b(String key) {
        kotlin.jvm.internal.n.f(key, "key");
        d();
        Bundle bundle = this.f3623c;
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.f3623c;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.f3623c;
        boolean z10 = true;
        if (bundle4 == null || !bundle4.isEmpty()) {
            z10 = false;
        }
        if (z10) {
            this.f3623c = null;
        }
        return bundle2;
    }

    public final void d() {
        if (this.f3622b) {
            return;
        }
        this.f3623c = this.f3621a.b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        this.f3622b = true;
        c();
    }
}
