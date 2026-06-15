package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;
import com.ironsource.sdk.controller.v;
import com.ironsource.sdk.utils.Logger;
import java.lang.reflect.Method;
import java.security.AccessControlException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class b {

    /* renamed from: b  reason: collision with root package name */
    private static final String f20233b = "b";

    /* renamed from: a  reason: collision with root package name */
    private final v.r f20234a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(v.r rVar) {
        this.f20234a = rVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str) {
        v.r rVar = this.f20234a;
        if (rVar != null) {
            rVar.c(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(String str, String str2) throws Exception {
        if (this.f20234a == null) {
            Logger.e(f20233b, "!!! nativeAPI == null !!!");
            return;
        }
        Method declaredMethod = v.r.class.getDeclaredMethod(str, String.class);
        if (declaredMethod.isAnnotationPresent(JavascriptInterface.class)) {
            declaredMethod.invoke(this.f20234a, str2);
            return;
        }
        throw new AccessControlException("Trying to access a private function: " + str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(String str) {
        v.r rVar = this.f20234a;
        if (rVar != null) {
            rVar.d(str);
        }
    }
}
