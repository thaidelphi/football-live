package com.ironsource;

import android.app.Activity;
import android.content.Context;
import com.ironsource.eh;
import com.ironsource.mediationsdk.logger.IronLog;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class u5 {

    /* renamed from: a  reason: collision with root package name */
    public static u5 f20938a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f20939a;

        static {
            int[] iArr = new int[eh.a.values().length];
            f20939a = iArr;
            try {
                iArr[eh.a.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20939a[eh.a.Device.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20939a[eh.a.Controller.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static u5 a() {
        u5 u5Var = f20938a;
        return u5Var == null ? new u5() : u5Var;
    }

    public boolean a(Activity activity) {
        if (a.f20939a[ik.e().b().ordinal()] != 3) {
            return false;
        }
        try {
            com.ironsource.sdk.controller.v vVar = (com.ironsource.sdk.controller.v) vj.b((Context) activity).a().j();
            if (vVar != null) {
                vVar.k("back");
                return true;
            }
            return true;
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
            return false;
        }
    }
}
