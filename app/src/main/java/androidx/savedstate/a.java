package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.p;
import androidx.savedstate.Recreator;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
import u0.d;
/* compiled from: SavedStateRegistry.kt */
@SuppressLint({"RestrictedApi"})
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a {

    /* renamed from: g  reason: collision with root package name */
    private static final b f4360g = new b(null);

    /* renamed from: b  reason: collision with root package name */
    private boolean f4362b;

    /* renamed from: c  reason: collision with root package name */
    private Bundle f4363c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f4364d;

    /* renamed from: e  reason: collision with root package name */
    private Recreator.b f4365e;

    /* renamed from: a  reason: collision with root package name */
    private final l.b<String, c> f4361a = new l.b<>();

    /* renamed from: f  reason: collision with root package name */
    private boolean f4366f = true;

    /* compiled from: SavedStateRegistry.kt */
    /* renamed from: androidx.savedstate.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface InterfaceC0077a {
        void a(d dVar);
    }

    /* compiled from: SavedStateRegistry.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class b {
        private b() {
        }

        public /* synthetic */ b(h hVar) {
            this();
        }
    }

    /* compiled from: SavedStateRegistry.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface c {
        Bundle a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(a this$0, p pVar, i.a event) {
        n.f(this$0, "this$0");
        n.f(pVar, "<anonymous parameter 0>");
        n.f(event, "event");
        if (event == i.a.ON_START) {
            this$0.f4366f = true;
        } else if (event == i.a.ON_STOP) {
            this$0.f4366f = false;
        }
    }

    public final Bundle b(String key) {
        n.f(key, "key");
        if (this.f4364d) {
            Bundle bundle = this.f4363c;
            if (bundle != null) {
                Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
                Bundle bundle3 = this.f4363c;
                if (bundle3 != null) {
                    bundle3.remove(key);
                }
                Bundle bundle4 = this.f4363c;
                boolean z10 = false;
                if (bundle4 != null && !bundle4.isEmpty()) {
                    z10 = true;
                }
                if (!z10) {
                    this.f4363c = null;
                }
                return bundle2;
            }
            return null;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    public final c c(String key) {
        n.f(key, "key");
        Iterator<Map.Entry<String, c>> it = this.f4361a.iterator();
        while (it.hasNext()) {
            Map.Entry<String, c> components = it.next();
            n.e(components, "components");
            c value = components.getValue();
            if (n.a(components.getKey(), key)) {
                return value;
            }
        }
        return null;
    }

    public final void e(i lifecycle) {
        n.f(lifecycle, "lifecycle");
        if (!this.f4362b) {
            lifecycle.a(new m() { // from class: u0.b
                @Override // androidx.lifecycle.m
                public final void onStateChanged(p pVar, i.a aVar) {
                    androidx.savedstate.a.d(androidx.savedstate.a.this, pVar, aVar);
                }
            });
            this.f4362b = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
    }

    public final void f(Bundle bundle) {
        if (this.f4362b) {
            if (!this.f4364d) {
                this.f4363c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
                this.f4364d = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
    }

    public final void g(Bundle outBundle) {
        n.f(outBundle, "outBundle");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f4363c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        l.b<String, c>.d c10 = this.f4361a.c();
        n.e(c10, "this.components.iteratorWithAdditions()");
        while (c10.hasNext()) {
            Map.Entry next = c10.next();
            bundle.putBundle((String) next.getKey(), ((c) next.getValue()).a());
        }
        if (bundle.isEmpty()) {
            return;
        }
        outBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
    }

    public final void h(String key, c provider) {
        n.f(key, "key");
        n.f(provider, "provider");
        if (!(this.f4361a.f(key, provider) == null)) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public final void i(Class<? extends InterfaceC0077a> clazz) {
        n.f(clazz, "clazz");
        if (this.f4366f) {
            Recreator.b bVar = this.f4365e;
            if (bVar == null) {
                bVar = new Recreator.b(this);
            }
            this.f4365e = bVar;
            try {
                clazz.getDeclaredConstructor(new Class[0]);
                Recreator.b bVar2 = this.f4365e;
                if (bVar2 != null) {
                    String name = clazz.getName();
                    n.e(name, "clazz.name");
                    bVar2.b(name);
                    return;
                }
                return;
            } catch (NoSuchMethodException e8) {
                throw new IllegalArgumentException("Class " + clazz.getSimpleName() + " must have default constructor in order to be automatically recreated", e8);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
    }
}
