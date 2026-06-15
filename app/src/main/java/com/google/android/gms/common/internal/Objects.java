package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.ironsource.b9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class Objects {

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    @KeepForSdk
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class ToStringHelper {

        /* renamed from: a  reason: collision with root package name */
        private final List f12519a;

        /* renamed from: b  reason: collision with root package name */
        private final Object f12520b;

        /* synthetic */ ToStringHelper(Object obj, zzai zzaiVar) {
            Preconditions.m(obj);
            this.f12520b = obj;
            this.f12519a = new ArrayList();
        }

        @KeepForSdk
        public ToStringHelper a(String str, Object obj) {
            Preconditions.m(str);
            String valueOf = String.valueOf(obj);
            this.f12519a.add(str + b9.i.f16692b + valueOf);
            return this;
        }

        @KeepForSdk
        public String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f12520b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f12519a.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb.append((String) this.f12519a.get(i10));
                if (i10 < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    private Objects() {
        throw new AssertionError("Uninstantiable");
    }

    @KeepForSdk
    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    @KeepForSdk
    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @KeepForSdk
    public static ToStringHelper c(Object obj) {
        return new ToStringHelper(obj, null);
    }
}
