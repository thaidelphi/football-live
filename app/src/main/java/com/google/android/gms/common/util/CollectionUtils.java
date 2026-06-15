package com.google.android.gms.common.util;

import androidx.collection.a;
import androidx.collection.b;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class CollectionUtils {
    private CollectionUtils() {
    }

    @KeepForSdk
    @Deprecated
    public static <T> List<T> a(T t10) {
        return Collections.singletonList(t10);
    }

    @KeepForSdk
    @Deprecated
    public static <T> List<T> b(T... tArr) {
        int length = tArr.length;
        if (length != 0) {
            if (length != 1) {
                return Collections.unmodifiableList(Arrays.asList(tArr));
            }
            return Collections.singletonList(tArr[0]);
        }
        return Collections.emptyList();
    }

    @KeepForSdk
    public static <K, V> Map<K, V> c(K k10, V v10, K k11, V v11, K k12, V v12) {
        Map g10 = g(3, false);
        g10.put(k10, v10);
        g10.put(k11, v11);
        g10.put(k12, v12);
        return Collections.unmodifiableMap(g10);
    }

    @KeepForSdk
    public static <K, V> Map<K, V> d(K[] kArr, V[] vArr) {
        int length = kArr.length;
        int length2 = vArr.length;
        if (length != length2) {
            throw new IllegalArgumentException("Key and values array lengths not equal: " + length + " != " + length2);
        } else if (length != 0) {
            if (length != 1) {
                Map g10 = g(length, false);
                for (int i10 = 0; i10 < kArr.length; i10++) {
                    g10.put(kArr[i10], vArr[i10]);
                }
                return Collections.unmodifiableMap(g10);
            }
            return Collections.singletonMap(kArr[0], vArr[0]);
        } else {
            return Collections.emptyMap();
        }
    }

    @KeepForSdk
    @Deprecated
    public static <T> Set<T> e(T t10, T t11, T t12) {
        Set h10 = h(3, false);
        h10.add(t10);
        h10.add(t11);
        h10.add(t12);
        return Collections.unmodifiableSet(h10);
    }

    @KeepForSdk
    @Deprecated
    public static <T> Set<T> f(T... tArr) {
        int length = tArr.length;
        if (length != 0) {
            if (length != 1) {
                if (length == 2) {
                    T t10 = tArr[0];
                    T t11 = tArr[1];
                    Set h10 = h(2, false);
                    h10.add(t10);
                    h10.add(t11);
                    return Collections.unmodifiableSet(h10);
                } else if (length != 3) {
                    if (length != 4) {
                        Set h11 = h(length, false);
                        Collections.addAll(h11, tArr);
                        return Collections.unmodifiableSet(h11);
                    }
                    T t12 = tArr[0];
                    T t13 = tArr[1];
                    T t14 = tArr[2];
                    T t15 = tArr[3];
                    Set h12 = h(4, false);
                    h12.add(t12);
                    h12.add(t13);
                    h12.add(t14);
                    h12.add(t15);
                    return Collections.unmodifiableSet(h12);
                } else {
                    return e(tArr[0], tArr[1], tArr[2]);
                }
            }
            return Collections.singleton(tArr[0]);
        }
        return Collections.emptySet();
    }

    private static Map g(int i10, boolean z10) {
        if (i10 <= 256) {
            return new a(i10);
        }
        return new HashMap(i10, 1.0f);
    }

    private static Set h(int i10, boolean z10) {
        if (i10 <= (true != z10 ? 256 : 128)) {
            return new b(i10);
        }
        return new HashSet(i10, true != z10 ? 1.0f : 0.75f);
    }
}
