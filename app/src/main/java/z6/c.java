package z6;

import f6.r;
import java.util.Iterator;
import java.util.Set;
/* compiled from: DefaultUserAgentPublisher.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class c implements i {

    /* renamed from: a  reason: collision with root package name */
    private final String f33716a;

    /* renamed from: b  reason: collision with root package name */
    private final d f33717b;

    c(Set<f> set, d dVar) {
        this.f33716a = e(set);
        this.f33717b = dVar;
    }

    public static f6.c<i> c() {
        return f6.c.e(i.class).b(r.l(f.class)).f(new f6.h() { // from class: z6.b
            @Override // f6.h
            public final Object a(f6.e eVar) {
                i d10;
                d10 = c.d(eVar);
                return d10;
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i d(f6.e eVar) {
        return new c(eVar.b(f.class), d.a());
    }

    private static String e(Set<f> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<f> it = set.iterator();
        while (it.hasNext()) {
            f next = it.next();
            sb.append(next.b());
            sb.append('/');
            sb.append(next.c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // z6.i
    public String a() {
        if (this.f33717b.b().isEmpty()) {
            return this.f33716a;
        }
        return this.f33716a + ' ' + e(this.f33717b.b());
    }
}
