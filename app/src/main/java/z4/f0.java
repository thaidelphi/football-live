package z4;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: HttpDataSource.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, String> f33493a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private Map<String, String> f33494b;

    public synchronized void a(Map<String, String> map) {
        this.f33494b = null;
        this.f33493a.clear();
        this.f33493a.putAll(map);
    }

    public synchronized Map<String, String> b() {
        if (this.f33494b == null) {
            this.f33494b = Collections.unmodifiableMap(new HashMap(this.f33493a));
        }
        return this.f33494b;
    }
}
