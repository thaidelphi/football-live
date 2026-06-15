package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: ViewModel.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class k0 {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Object> f3649a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Set<Closeable> f3650b = new LinkedHashSet();

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f3651c = false;

    private static void b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e8) {
                throw new RuntimeException(e8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.f3651c = true;
        Map<String, Object> map = this.f3649a;
        if (map != null) {
            synchronized (map) {
                for (Object obj : this.f3649a.values()) {
                    b(obj);
                }
            }
        }
        Set<Closeable> set = this.f3650b;
        if (set != null) {
            synchronized (set) {
                for (Closeable closeable : this.f3650b) {
                    b(closeable);
                }
            }
        }
        d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <T> T c(String str) {
        T t10;
        Map<String, Object> map = this.f3649a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t10 = (T) this.f3649a.get(str);
        }
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <T> T e(String str, T t10) {
        Object obj;
        synchronized (this.f3649a) {
            obj = this.f3649a.get(str);
            if (obj == null) {
                this.f3649a.put(str, t10);
            }
        }
        if (obj != null) {
            t10 = obj;
        }
        if (this.f3651c) {
            b(t10);
        }
        return t10;
    }
}
