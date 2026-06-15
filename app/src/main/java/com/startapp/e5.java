package com.startapp;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import java.util.LinkedHashSet;
import java.util.Locale;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class e5 extends x1<d5> {
    public e5(Context context) {
        super(context);
    }

    @Override // com.startapp.x1
    public final d5 a() {
        Locale locale;
        Locale locale2;
        Configuration configuration;
        LocaleList locales;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Resources resources = this.f23531a.getResources();
        if (resources == null || (configuration = resources.getConfiguration()) == null) {
            locale = null;
        } else {
            locale = configuration.locale;
            if (Build.VERSION.SDK_INT >= 24 && (locales = configuration.getLocales()) != null && locales.size() > 0) {
                int size = locales.size();
                boolean z10 = true;
                for (int i10 = 0; i10 < size; i10++) {
                    Locale locale3 = locales.get(i10);
                    if (locale3 != null) {
                        if (linkedHashSet.size() < 11) {
                            linkedHashSet.add(locale3);
                        }
                        if (z10) {
                            z10 = false;
                            locale = locale3;
                        }
                    }
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 24 && (locale2 = Locale.getDefault(Locale.Category.DISPLAY)) != null) {
            if (locale == null) {
                locale = locale2;
            }
            if (linkedHashSet.size() < 11) {
                linkedHashSet.add(locale2);
            }
        }
        Locale locale4 = Locale.getDefault();
        if (locale4 != null) {
            if (locale == null) {
                locale = locale4;
            }
            if (linkedHashSet.size() < 11) {
                linkedHashSet.add(locale4);
            }
        }
        if (locale == null) {
            locale = new Locale("en");
        }
        linkedHashSet.remove(locale);
        return new d5(locale, linkedHashSet);
    }

    @Override // com.startapp.x1
    public final d5 c() {
        return d5.f21874d;
    }
}
