package c6;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import f6.o;
import f6.x;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: FirebaseApp.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class e {

    /* renamed from: k  reason: collision with root package name */
    private static final Object f5545k = new Object();

    /* renamed from: l  reason: collision with root package name */
    static final Map<String, e> f5546l = new androidx.collection.a();

    /* renamed from: a  reason: collision with root package name */
    private final Context f5547a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5548b;

    /* renamed from: c  reason: collision with root package name */
    private final k f5549c;

    /* renamed from: d  reason: collision with root package name */
    private final o f5550d;

    /* renamed from: g  reason: collision with root package name */
    private final x<w6.a> f5553g;

    /* renamed from: h  reason: collision with root package name */
    private final q6.b<o6.f> f5554h;

    /* renamed from: e  reason: collision with root package name */
    private final AtomicBoolean f5551e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    private final AtomicBoolean f5552f = new AtomicBoolean();

    /* renamed from: i  reason: collision with root package name */
    private final List<a> f5555i = new CopyOnWriteArrayList();

    /* renamed from: j  reason: collision with root package name */
    private final List<Object> f5556j = new CopyOnWriteArrayList();

    /* compiled from: FirebaseApp.java */
    @KeepForSdk
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface a {
        @KeepForSdk
        void a(boolean z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FirebaseApp.java */
    @TargetApi(14)
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class b implements BackgroundDetector.BackgroundStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        private static AtomicReference<b> f5557a = new AtomicReference<>();

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void c(Context context) {
            if (PlatformVersion.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f5557a.get() == null) {
                    b bVar = new b();
                    if (f5557a.compareAndSet(null, bVar)) {
                        BackgroundDetector.c(application);
                        BackgroundDetector.b().a(bVar);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public void a(boolean z10) {
            synchronized (e.f5545k) {
                Iterator it = new ArrayList(e.f5546l.values()).iterator();
                while (it.hasNext()) {
                    e eVar = (e) it.next();
                    if (eVar.f5551e.get()) {
                        eVar.x(z10);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FirebaseApp.java */
    @TargetApi(24)
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class c extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<c> f5558b = new AtomicReference<>();

        /* renamed from: a  reason: collision with root package name */
        private final Context f5559a;

        public c(Context context) {
            this.f5559a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (f5558b.get() == null) {
                c cVar = new c(context);
                if (f5558b.compareAndSet(null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.f5559a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (e.f5545k) {
                for (e eVar : e.f5546l.values()) {
                    eVar.o();
                }
            }
            c();
        }
    }

    protected e(final Context context, String str, k kVar) {
        this.f5547a = (Context) Preconditions.m(context);
        this.f5548b = Preconditions.g(str);
        this.f5549c = (k) Preconditions.m(kVar);
        l b10 = FirebaseInitProvider.b();
        a7.c.b("Firebase");
        a7.c.b("ComponentDiscovery");
        List<q6.b<ComponentRegistrar>> b11 = f6.g.c(context, ComponentDiscoveryService.class).b();
        a7.c.a();
        a7.c.b("Runtime");
        o.b g10 = o.k(g6.k.INSTANCE).d(b11).c(new FirebaseCommonRegistrar()).c(new ExecutorsRegistrar()).b(f6.c.s(context, Context.class, new Class[0])).b(f6.c.s(this, e.class, new Class[0])).b(f6.c.s(kVar, k.class, new Class[0])).g(new a7.b());
        if (androidx.core.os.o.a(context) && FirebaseInitProvider.c()) {
            g10.b(f6.c.s(b10, l.class, new Class[0]));
        }
        o e8 = g10.e();
        this.f5550d = e8;
        a7.c.a();
        this.f5553g = new x<>(new q6.b() { // from class: c6.d
            @Override // q6.b
            public final Object get() {
                w6.a u10;
                u10 = e.this.u(context);
                return u10;
            }
        });
        this.f5554h = e8.e(o6.f.class);
        g(new a() { // from class: c6.c
            @Override // c6.e.a
            public final void a(boolean z10) {
                e.this.v(z10);
            }
        });
        a7.c.a();
    }

    private void h() {
        Preconditions.q(!this.f5552f.get(), "FirebaseApp was deleted");
    }

    public static e k() {
        e eVar;
        synchronized (f5545k) {
            eVar = f5546l.get("[DEFAULT]");
            if (eVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (!androidx.core.os.o.a(this.f5547a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + l());
            c.b(this.f5547a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + l());
        this.f5550d.n(t());
        this.f5554h.get().l();
    }

    public static e p(Context context) {
        synchronized (f5545k) {
            if (f5546l.containsKey("[DEFAULT]")) {
                return k();
            }
            k a10 = k.a(context);
            if (a10 == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            return q(context, a10);
        }
    }

    public static e q(Context context, k kVar) {
        return r(context, kVar, "[DEFAULT]");
    }

    public static e r(Context context, k kVar, String str) {
        e eVar;
        b.c(context);
        String w10 = w(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f5545k) {
            Map<String, e> map = f5546l;
            boolean z10 = !map.containsKey(w10);
            Preconditions.q(z10, "FirebaseApp name " + w10 + " already exists!");
            Preconditions.n(context, "Application context cannot be null.");
            eVar = new e(context, w10, kVar);
            map.put(w10, eVar);
        }
        eVar.o();
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ w6.a u(Context context) {
        return new w6.a(context, n(), (n6.c) this.f5550d.a(n6.c.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(boolean z10) {
        if (z10) {
            return;
        }
        this.f5554h.get().l();
    }

    private static String w(String str) {
        return str.trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(boolean z10) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        for (a aVar : this.f5555i) {
            aVar.a(z10);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f5548b.equals(((e) obj).l());
        }
        return false;
    }

    @KeepForSdk
    public void g(a aVar) {
        h();
        if (this.f5551e.get() && BackgroundDetector.b().d()) {
            aVar.a(true);
        }
        this.f5555i.add(aVar);
    }

    public int hashCode() {
        return this.f5548b.hashCode();
    }

    @KeepForSdk
    public <T> T i(Class<T> cls) {
        h();
        return (T) this.f5550d.a(cls);
    }

    public Context j() {
        h();
        return this.f5547a;
    }

    public String l() {
        h();
        return this.f5548b;
    }

    public k m() {
        h();
        return this.f5549c;
    }

    @KeepForSdk
    public String n() {
        return Base64Utils.c(l().getBytes(Charset.defaultCharset())) + "+" + Base64Utils.c(m().c().getBytes(Charset.defaultCharset()));
    }

    @KeepForSdk
    public boolean s() {
        h();
        return this.f5553g.get().b();
    }

    @KeepForSdk
    public boolean t() {
        return "[DEFAULT]".equals(l());
    }

    public String toString() {
        return Objects.c(this).a("name", this.f5548b).a("options", this.f5549c).toString();
    }
}
