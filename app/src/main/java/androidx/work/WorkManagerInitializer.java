package androidx.work;

import android.content.Context;
import androidx.work.b;
import java.util.Collections;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class WorkManagerInitializer implements x0.a<a0> {

    /* renamed from: a  reason: collision with root package name */
    private static final String f4571a = p.f("WrkMgrInitializer");

    @Override // x0.a
    /* renamed from: a */
    public a0 create(Context context) {
        p.c().a(f4571a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        a0.l(context, new b.C0083b().a());
        return a0.j(context);
    }

    @Override // x0.a
    public List<Class<? extends x0.a<?>>> dependencies() {
        return Collections.emptyList();
    }
}
