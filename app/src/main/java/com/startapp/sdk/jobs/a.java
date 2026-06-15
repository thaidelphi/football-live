package com.startapp.sdk.jobs;

import android.content.Context;
import android.os.Bundle;
import com.startapp.f0;
import com.startapp.sdk.jobs.b;
import java.lang.reflect.Constructor;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class a {
    public abstract void a(b bVar);

    public final boolean a(Context context, String[] strArr, b.a aVar, Bundle bundle) {
        if (strArr == null || strArr.length == 0) {
            return false;
        }
        boolean z10 = false;
        for (String str : strArr) {
            Class cls = null;
            try {
                cls = Class.forName(str).asSubclass(b.class);
            } catch (Throwable unused) {
            }
            if (cls != null) {
                try {
                    Constructor declaredConstructor = cls.getDeclaredConstructor(Context.class, b.a.class, Bundle.class);
                    declaredConstructor.setAccessible(true);
                    Context a10 = f0.a(context);
                    if (a10 == null) {
                        a10 = context;
                    }
                    a((b) declaredConstructor.newInstance(a10, aVar, bundle));
                    z10 = true;
                } catch (Throwable unused2) {
                }
            }
        }
        return z10;
    }
}
