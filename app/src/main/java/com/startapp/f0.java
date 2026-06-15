package com.startapp;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import java.lang.reflect.Method;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    public static volatile Application f21923a;

    public static Context a(Context context) {
        Application application;
        Context context2 = f21923a;
        if (context2 == null) {
            try {
                if (context instanceof Application) {
                    try {
                        f21923a = (Application) context;
                    } catch (Throwable unused) {
                    }
                    context2 = context;
                } else if (context instanceof ContextWrapper) {
                    Context baseContext = ((ContextWrapper) context).getBaseContext();
                    if (baseContext != null) {
                        context2 = a(baseContext);
                    }
                } else if (context != null) {
                    context2 = context.getApplicationContext();
                }
            } catch (Throwable unused2) {
            }
            if (context2 == null) {
                Application application2 = f21923a;
                context2 = application2;
                if (application2 == null) {
                    synchronized (f0.class) {
                        Application application3 = f21923a;
                        application = application3;
                        if (application3 == null) {
                            try {
                                Method declaredMethod = Class.forName(Activity.class.getName().concat(Thread.class.getSimpleName())).getDeclaredMethod("current".concat(Application.class.getSimpleName()), new Class[0]);
                                declaredMethod.setAccessible(true);
                                application3 = (Application) declaredMethod.invoke(null, new Object[0]);
                            } catch (Throwable unused3) {
                            }
                            f21923a = application3;
                            application = application3;
                        }
                    }
                    context2 = application;
                }
                if (context2 == null) {
                    return context;
                }
            }
        }
        return context2;
    }

    public static Context b(Context context) {
        Context a10 = a(context);
        return a10 != null ? a10 : context;
    }
}
