package k0;

import androidx.lifecycle.k0;
import androidx.lifecycle.l0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.n;
import t8.l;
/* compiled from: InitializerViewModelFactory.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final List<f<?>> f27118a = new ArrayList();

    public final <T extends k0> void a(z8.c<T> clazz, l<? super a, ? extends T> initializer) {
        n.f(clazz, "clazz");
        n.f(initializer, "initializer");
        this.f27118a.add(new f<>(s8.a.a(clazz), initializer));
    }

    public final l0.b b() {
        f[] fVarArr = (f[]) this.f27118a.toArray(new f[0]);
        return new b((f[]) Arrays.copyOf(fVarArr, fVarArr.length));
    }
}
