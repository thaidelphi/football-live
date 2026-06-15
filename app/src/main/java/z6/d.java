package z6;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: GlobalLibraryVersionRegistrar.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class d {

    /* renamed from: b  reason: collision with root package name */
    private static volatile d f33718b;

    /* renamed from: a  reason: collision with root package name */
    private final Set<f> f33719a = new HashSet();

    d() {
    }

    public static d a() {
        d dVar = f33718b;
        if (dVar == null) {
            synchronized (d.class) {
                dVar = f33718b;
                if (dVar == null) {
                    dVar = new d();
                    f33718b = dVar;
                }
            }
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Set<f> b() {
        Set<f> unmodifiableSet;
        synchronized (this.f33719a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f33719a);
        }
        return unmodifiableSet;
    }
}
