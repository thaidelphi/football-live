package c;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.n;
/* compiled from: ContextAwareHelper.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final Set<b> f5306a = new CopyOnWriteArraySet();

    /* renamed from: b  reason: collision with root package name */
    private volatile Context f5307b;

    public final void a(b listener) {
        n.f(listener, "listener");
        Context context = this.f5307b;
        if (context != null) {
            listener.a(context);
        }
        this.f5306a.add(listener);
    }

    public final void b() {
        this.f5307b = null;
    }

    public final void c(Context context) {
        n.f(context, "context");
        this.f5307b = context;
        for (b bVar : this.f5306a) {
            bVar.a(context);
        }
    }

    public final Context d() {
        return this.f5307b;
    }

    public final void e(b listener) {
        n.f(listener, "listener");
        this.f5306a.remove(listener);
    }
}
