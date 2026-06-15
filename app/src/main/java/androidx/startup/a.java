package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import x0.b;
import x0.c;
/* compiled from: AppInitializer.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    private static volatile a f4367d;

    /* renamed from: e  reason: collision with root package name */
    private static final Object f4368e = new Object();

    /* renamed from: c  reason: collision with root package name */
    final Context f4371c;

    /* renamed from: b  reason: collision with root package name */
    final Set<Class<? extends x0.a<?>>> f4370b = new HashSet();

    /* renamed from: a  reason: collision with root package name */
    final Map<Class<?>, Object> f4369a = new HashMap();

    a(Context context) {
        this.f4371c = context.getApplicationContext();
    }

    private <T> T d(Class<? extends x0.a<?>> cls, Set<Class<?>> set) {
        T t10;
        if (z0.a.d()) {
            try {
                z0.a.a(cls.getSimpleName());
            } finally {
                z0.a.b();
            }
        }
        if (!set.contains(cls)) {
            if (!this.f4369a.containsKey(cls)) {
                set.add(cls);
                x0.a<?> newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class<? extends x0.a<?>>> dependencies = newInstance.dependencies();
                if (!dependencies.isEmpty()) {
                    for (Class<? extends x0.a<?>> cls2 : dependencies) {
                        if (!this.f4369a.containsKey(cls2)) {
                            d(cls2, set);
                        }
                    }
                }
                t10 = (T) newInstance.create(this.f4371c);
                set.remove(cls);
                this.f4369a.put(cls, t10);
            } else {
                t10 = (T) this.f4369a.get(cls);
            }
            return t10;
        }
        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
    }

    public static a e(Context context) {
        if (f4367d == null) {
            synchronized (f4368e) {
                if (f4367d == null) {
                    f4367d = new a(context);
                }
            }
        }
        return f4367d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        try {
            try {
                z0.a.a("Startup");
                b(this.f4371c.getPackageManager().getProviderInfo(new ComponentName(this.f4371c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            } catch (PackageManager.NameNotFoundException e8) {
                throw new c(e8);
            }
        } finally {
            z0.a.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    void b(Bundle bundle) {
        String string = this.f4371c.getString(b.f32386a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (x0.a.class.isAssignableFrom(cls)) {
                            this.f4370b.add(cls);
                        }
                    }
                }
                for (Class<? extends x0.a<?>> cls2 : this.f4370b) {
                    d(cls2, hashSet);
                }
            } catch (ClassNotFoundException e8) {
                throw new c(e8);
            }
        }
    }

    <T> T c(Class<? extends x0.a<?>> cls) {
        T t10;
        synchronized (f4368e) {
            t10 = (T) this.f4369a.get(cls);
            if (t10 == null) {
                t10 = (T) d(cls, new HashSet());
            }
        }
        return t10;
    }

    public <T> T f(Class<? extends x0.a<T>> cls) {
        return (T) c(cls);
    }

    public boolean g(Class<? extends x0.a<?>> cls) {
        return this.f4370b.contains(cls);
    }
}
