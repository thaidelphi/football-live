package com.appnext.actionssdk;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.io.Serializable;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class ActionData implements Serializable {
    private String Y;
    private long Z;

    /* renamed from: aa  reason: collision with root package name */
    private String f10006aa;
    private String acid;
    private String action;
    private String action_name;
    private String bicon;

    public ActionData() {
        this.Y = "";
        this.f10006aa = "white";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(long j10) {
        this.Z = j10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void g(String str) {
        this.action_name = str;
    }

    public String getActionDynamicMessage() {
        return this.Y;
    }

    public Drawable getActionIcon(Context context) {
        try {
            if (ActionSDK.aM) {
                Resources resources = context.getResources();
                Resources resources2 = context.getResources();
                return resources.getDrawable(resources2.getIdentifier("apnxt_" + getActionParam() + "_" + this.f10006aa, "drawable", context.getPackageName()));
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getActionName() {
        return this.action_name;
    }

    public String getActionParam() {
        return this.action;
    }

    public long getExpire() {
        return this.Z / 1000;
    }

    public long getExpireMillis() {
        return this.Z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void h(String str) {
        this.action = str;
    }

    protected final void i(String str) {
        this.bicon = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void j(String str) {
        this.acid = str;
    }

    protected final void k(String str) {
        this.Y = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void l(String str) {
        this.f10006aa = str;
    }

    protected final String n() {
        return this.bicon;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String o() {
        return this.acid;
    }

    protected final String p() {
        return this.f10006aa;
    }

    public ActionData(ActionData actionData) {
        this.Y = "";
        this.f10006aa = "white";
        this.action_name = actionData.action_name;
        this.bicon = actionData.bicon;
        this.action = actionData.action;
        this.acid = actionData.acid;
        this.Y = actionData.Y;
        this.Z = actionData.Z;
        this.f10006aa = actionData.f10006aa;
    }
}
