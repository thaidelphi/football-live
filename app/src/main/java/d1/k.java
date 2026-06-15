package d1;

import java.util.HashSet;
import java.util.Set;
/* compiled from: StartupApiFeature.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class k {

    /* renamed from: c  reason: collision with root package name */
    private static final Set<k> f23888c = new HashSet();

    /* renamed from: a  reason: collision with root package name */
    private final String f23889a;

    /* renamed from: b  reason: collision with root package name */
    private final String f23890b;

    /* compiled from: StartupApiFeature.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a extends k {
        /* JADX INFO: Access modifiers changed from: package-private */
        public a(String str, String str2) {
            super(str, str2);
        }
    }

    /* compiled from: StartupApiFeature.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b extends k {
        /* JADX INFO: Access modifiers changed from: package-private */
        public b(String str, String str2) {
            super(str, str2);
        }
    }

    k(String str, String str2) {
        this.f23889a = str;
        this.f23890b = str2;
        f23888c.add(this);
    }
}
