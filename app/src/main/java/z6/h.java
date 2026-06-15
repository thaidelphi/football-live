package z6;

import android.content.Context;
import f6.r;
/* compiled from: LibraryVersionComponent.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class h {

    /* compiled from: LibraryVersionComponent.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface a<T> {
        String a(T t10);
    }

    public static f6.c<?> b(String str, String str2) {
        return f6.c.l(f.a(str, str2), f.class);
    }

    public static f6.c<?> c(final String str, final a<Context> aVar) {
        return f6.c.m(f.class).b(r.j(Context.class)).f(new f6.h() { // from class: z6.g
            @Override // f6.h
            public final Object a(f6.e eVar) {
                f d10;
                d10 = h.d(str, aVar, eVar);
                return d10;
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f d(String str, a aVar, f6.e eVar) {
        return f.a(str, aVar.a((Context) eVar.a(Context.class)));
    }
}
