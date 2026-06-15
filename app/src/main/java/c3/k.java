package c3;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: MetadataBackendRegistry.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class k implements e {

    /* renamed from: a  reason: collision with root package name */
    private final a f5436a;

    /* renamed from: b  reason: collision with root package name */
    private final i f5437b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, m> f5438c;

    /* compiled from: MetadataBackendRegistry.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f5439a;

        /* renamed from: b  reason: collision with root package name */
        private Map<String, String> f5440b = null;

        a(Context context) {
            this.f5439a = context;
        }

        private Map<String, String> a(Context context) {
            Bundle d10 = d(context);
            if (d10 == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String str : d10.keySet()) {
                Object obj = d10.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String trim = str2.trim();
                        if (!trim.isEmpty()) {
                            hashMap.put(trim, str.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        private Map<String, String> c() {
            if (this.f5440b == null) {
                this.f5440b = a(this.f5439a);
            }
            return this.f5440b;
        }

        private static Bundle d(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, TransportBackendDiscovery.class), 128);
                if (serviceInfo == null) {
                    Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        d b(String str) {
            String str2 = c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (d) Class.forName(str2).asSubclass(d.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e8) {
                Log.w("BackendRegistry", String.format("Class %s is not found.", str2), e8);
                return null;
            } catch (IllegalAccessException e10) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e10);
                return null;
            } catch (InstantiationException e11) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e11);
                return null;
            } catch (NoSuchMethodException e12) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e12);
                return null;
            } catch (InvocationTargetException e13) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e13);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(Context context, i iVar) {
        this(new a(context), iVar);
    }

    @Override // c3.e
    public synchronized m get(String str) {
        if (this.f5438c.containsKey(str)) {
            return this.f5438c.get(str);
        }
        d b10 = this.f5436a.b(str);
        if (b10 == null) {
            return null;
        }
        m create = b10.create(this.f5437b.a(str));
        this.f5438c.put(str, create);
        return create;
    }

    k(a aVar, i iVar) {
        this.f5438c = new HashMap();
        this.f5436a = aVar;
        this.f5437b = iVar;
    }
}
