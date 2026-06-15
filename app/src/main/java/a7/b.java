package a7;

import com.google.firebase.components.ComponentRegistrar;
import f6.e;
import f6.h;
import f6.j;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ComponentMonitor.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class b implements j {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object c(String str, f6.c cVar, e eVar) {
        try {
            c.b(str);
            return cVar.h().a(eVar);
        } finally {
            c.a();
        }
    }

    @Override // f6.j
    public List<f6.c<?>> a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final f6.c<?> cVar : componentRegistrar.getComponents()) {
            final String i10 = cVar.i();
            if (i10 != null) {
                cVar = cVar.t(new h() { // from class: a7.a
                    @Override // f6.h
                    public final Object a(e eVar) {
                        Object c10;
                        c10 = b.c(i10, cVar, eVar);
                        return c10;
                    }
                });
            }
            arrayList.add(cVar);
        }
        return arrayList;
    }
}
