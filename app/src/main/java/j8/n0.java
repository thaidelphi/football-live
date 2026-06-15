package j8;

import java.util.Collections;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SetsJVM.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class n0 {
    public static <T> Set<T> a(T t10) {
        Set<T> singleton = Collections.singleton(t10);
        kotlin.jvm.internal.n.e(singleton, "singleton(element)");
        return singleton;
    }
}
