package com.startapp;

import android.content.Context;
import android.util.AttributeSet;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class j0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f22117a;

    /* renamed from: b  reason: collision with root package name */
    public final String f22118b;

    public j0(Context context, AttributeSet attributeSet) {
        this.f22117a = context;
        this.f22118b = a(attributeSet);
    }

    public final String a(AttributeSet attributeSet) {
        String attributeValue;
        try {
            int attributeResourceValue = attributeSet.getAttributeResourceValue(null, "adTag", -1);
            if (attributeResourceValue != -1) {
                attributeValue = this.f22117a.getResources().getString(attributeResourceValue);
            } else {
                attributeValue = attributeSet.getAttributeValue(null, "adTag");
            }
            return attributeValue;
        } catch (Exception unused) {
            return null;
        }
    }
}
