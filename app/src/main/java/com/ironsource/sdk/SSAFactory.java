package com.ironsource.sdk;

import android.app.Activity;
import android.content.Context;
import com.ironsource.gr;
import com.ironsource.vj;
@Deprecated
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class SSAFactory {
    public static gr getPublisherInstance(Activity activity) throws Exception {
        return vj.b((Context) activity);
    }

    public static gr getPublisherTestInstance(Activity activity, int i10) throws Exception {
        return vj.a(activity, i10);
    }
}
