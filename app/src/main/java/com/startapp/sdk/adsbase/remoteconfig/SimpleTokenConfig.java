package com.startapp.sdk.adsbase.remoteconfig;

import android.content.Context;
import com.startapp.v1;
import java.io.Serializable;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class SimpleTokenConfig implements Serializable {
    private static final long serialVersionUID = 2058698844345650499L;
    private boolean enabled = false;

    public final boolean a(Context context) {
        com.startapp.sdk.components.a a10 = com.startapp.sdk.components.a.a(context);
        v1 a11 = a10.f23233i.a();
        if (a10.E.a().getBoolean("userDisabledSimpleToken", false) || !this.enabled) {
            return false;
        }
        Boolean b10 = a11.b();
        return b10 != null && b10.booleanValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.enabled == ((SimpleTokenConfig) obj).enabled;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.enabled).hashCode();
    }
}
