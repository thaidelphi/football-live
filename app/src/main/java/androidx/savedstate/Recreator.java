package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.p;
import androidx.savedstate.a;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
import u0.d;
/* compiled from: Recreator.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class Recreator implements m {

    /* renamed from: b  reason: collision with root package name */
    public static final a f4357b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final d f4358a;

    /* compiled from: Recreator.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    /* compiled from: Recreator.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b implements a.c {

        /* renamed from: a  reason: collision with root package name */
        private final Set<String> f4359a;

        public b(androidx.savedstate.a registry) {
            n.f(registry, "registry");
            this.f4359a = new LinkedHashSet();
            registry.h("androidx.savedstate.Restarter", this);
        }

        @Override // androidx.savedstate.a.c
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f4359a));
            return bundle;
        }

        public final void b(String className) {
            n.f(className, "className");
            this.f4359a.add(className);
        }
    }

    public Recreator(d owner) {
        n.f(owner, "owner");
        this.f4358a = owner;
    }

    private final void g(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(a.InterfaceC0077a.class);
            n.e(asSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    Object newInstance = declaredConstructor.newInstance(new Object[0]);
                    n.e(newInstance, "{\n                constr…wInstance()\n            }");
                    ((a.InterfaceC0077a) newInstance).a(this.f4358a);
                } catch (Exception e8) {
                    throw new RuntimeException("Failed to instantiate " + str, e8);
                }
            } catch (NoSuchMethodException e10) {
                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
            }
        } catch (ClassNotFoundException e11) {
            throw new RuntimeException("Class " + str + " wasn't found", e11);
        }
    }

    @Override // androidx.lifecycle.m
    public void onStateChanged(p source, i.a event) {
        n.f(source, "source");
        n.f(event, "event");
        if (event == i.a.ON_CREATE) {
            source.getLifecycle().d(this);
            Bundle b10 = this.f4358a.getSavedStateRegistry().b("androidx.savedstate.Restarter");
            if (b10 == null) {
                return;
            }
            ArrayList<String> stringArrayList = b10.getStringArrayList("classes_to_restore");
            if (stringArrayList != null) {
                for (String str : stringArrayList) {
                    g(str);
                }
                return;
            }
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
