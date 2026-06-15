package f6;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: ComponentDiscovery.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class g<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f25442a;

    /* renamed from: b  reason: collision with root package name */
    private final c<T> f25443b;

    /* compiled from: ComponentDiscovery.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    private static class b implements c<Context> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<? extends Service> f25444a;

        private Bundle b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.f25444a), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", this.f25444a + " has no service info.");
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        @Override // f6.g.c
        /* renamed from: c */
        public List<String> a(Context context) {
            Bundle b10 = b(context);
            if (b10 == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : b10.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(b10.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }

        private b(Class<? extends Service> cls) {
            this.f25444a = cls;
        }
    }

    /* compiled from: ComponentDiscovery.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    interface c<T> {
        List<String> a(T t10);
    }

    g(T t10, c<T> cVar) {
        this.f25442a = t10;
        this.f25443b = cVar;
    }

    public static g<Context> c(Context context, Class<? extends Service> cls) {
        return new g<>(context, new b(cls));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ComponentRegistrar d(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new w(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e8) {
            throw new w(String.format("Could not instantiate %s.", str), e8);
        } catch (InstantiationException e10) {
            throw new w(String.format("Could not instantiate %s.", str), e10);
        } catch (NoSuchMethodException e11) {
            throw new w(String.format("Could not instantiate %s", str), e11);
        } catch (InvocationTargetException e12) {
            throw new w(String.format("Could not instantiate %s", str), e12);
        }
    }

    public List<q6.b<ComponentRegistrar>> b() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.f25443b.a(this.f25442a)) {
            arrayList.add(new q6.b() { // from class: f6.f
                @Override // q6.b
                public final Object get() {
                    ComponentRegistrar d10;
                    d10 = g.d(str);
                    return d10;
                }
            });
        }
        return arrayList;
    }
}
