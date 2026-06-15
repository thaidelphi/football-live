package com.unity3d.services.core.domain;

import com.unity3d.services.core.domain.task.InitializationException;
import i8.o;
import kotlin.jvm.internal.n;
/* compiled from: ResultExtensions.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class ResultExtensionsKt {
    public static final /* synthetic */ <E extends Exception> E getCustomExceptionOrNull(Object obj) {
        Throwable d10 = o.d(obj);
        n.k(3, "E");
        if (d10 instanceof Exception) {
            return (E) d10;
        }
        return null;
    }

    public static final /* synthetic */ <E extends Exception> E getCustomExceptionOrThrow(Object obj) {
        Throwable d10 = o.d(obj);
        n.k(3, "E");
        if (d10 instanceof Exception) {
            return (E) d10;
        }
        throw new IllegalArgumentException("Wrong Exception type found");
    }

    public static final InitializationException getInitializationExceptionOrNull(Object obj) {
        Throwable d10 = o.d(obj);
        if (d10 instanceof InitializationException) {
            return (InitializationException) d10;
        }
        return null;
    }

    public static final InitializationException getInitializationExceptionOrThrow(Object obj) {
        Throwable d10 = o.d(obj);
        if (d10 instanceof InitializationException) {
            return (InitializationException) d10;
        }
        throw new IllegalArgumentException("Wrong Exception type found");
    }
}
