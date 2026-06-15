package com.appnext.core.ra.a;

import android.content.Context;
import android.os.Bundle;
import java.text.SimpleDateFormat;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class b {
    private static SimpleDateFormat er = new SimpleDateFormat("dd/MM/yyyy");
    private Context aO;
    private Bundle es;

    public b(Context context, Bundle bundle) {
        this.aO = context;
        this.es = bundle;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static SimpleDateFormat av() {
        return er;
    }

    protected abstract void ar();

    protected abstract boolean as();

    public final void at() {
        if (!as() || (as() && com.appnext.core.ra.a.r(this.aO).al())) {
            ar();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Bundle au() {
        return this.es;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Context getContext() {
        return this.aO;
    }
}
