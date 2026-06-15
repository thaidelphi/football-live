package j8;

import com.google.android.gms.common.api.Api;
import java.util.Collections;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MapsJVM.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class i0 extends h0 {
    public static <K, V> Map<K, V> a(Map<K, V> builder) {
        kotlin.jvm.internal.n.f(builder, "builder");
        return ((k8.c) builder).i();
    }

    public static <K, V> Map<K, V> b() {
        return new k8.c();
    }

    public static int c(int i10) {
        return i10 < 0 ? i10 : i10 < 3 ? i10 + 1 : i10 < 1073741824 ? (int) ((i10 / 0.75f) + 1.0f) : Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    public static <K, V> Map<K, V> d(i8.n<? extends K, ? extends V> pair) {
        kotlin.jvm.internal.n.f(pair, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(pair.c(), pair.d());
        kotlin.jvm.internal.n.e(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    public static final <K, V> Map<K, V> e(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.n.f(map, "<this>");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        kotlin.jvm.internal.n.e(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }
}
