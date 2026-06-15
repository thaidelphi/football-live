package com.startapp;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class d5 {

    /* renamed from: d  reason: collision with root package name */
    public static final d5 f21874d = new d5();

    /* renamed from: a  reason: collision with root package name */
    public final String f21875a;

    /* renamed from: b  reason: collision with root package name */
    public final String f21876b;

    /* renamed from: c  reason: collision with root package name */
    public final String f21877c;

    public d5(Locale locale, LinkedHashSet linkedHashSet) {
        this.f21875a = locale.toString();
        this.f21876b = a(null, linkedHashSet, ';');
        this.f21877c = a(locale, linkedHashSet, ',');
    }

    public static String a(Locale locale, LinkedHashSet linkedHashSet, char c10) {
        boolean z10;
        StringBuilder sb;
        if (locale != null) {
            sb = new StringBuilder();
            sb.append(locale);
            z10 = true;
        } else {
            z10 = false;
            sb = null;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            Locale locale2 = (Locale) it.next();
            if (locale2 != null) {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                if (z10) {
                    sb.append(c10);
                }
                sb.append(locale2);
                z10 = true;
            }
        }
        if (sb != null) {
            return sb.toString();
        }
        return null;
    }

    public d5() {
        this.f21875a = null;
        this.f21876b = null;
        this.f21877c = null;
    }
}
