package androidx.lifecycle;

import android.content.Context;
import androidx.lifecycle.a0;
import java.util.List;
/* compiled from: ProcessLifecycleInitializer.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class ProcessLifecycleInitializer implements x0.a<p> {
    @Override // x0.a
    /* renamed from: a */
    public p create(Context context) {
        kotlin.jvm.internal.n.f(context, "context");
        androidx.startup.a e8 = androidx.startup.a.e(context);
        kotlin.jvm.internal.n.e(e8, "getInstance(context)");
        if (e8.g(ProcessLifecycleInitializer.class)) {
            l.a(context);
            a0.b bVar = a0.f3588i;
            bVar.b(context);
            return bVar.a();
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
    }

    @Override // x0.a
    public List<Class<? extends x0.a<?>>> dependencies() {
        List<Class<? extends x0.a<?>>> d10;
        d10 = j8.q.d();
        return d10;
    }
}
