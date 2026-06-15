package com.startapp;

import java.lang.Comparable;
import java.util.regex.Pattern;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class v9<T extends Comparable<T>> implements Comparable<v9<T>> {

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f23479c = Pattern.compile("\\d{2}:\\d{2}:\\d{2}(.\\d{3})?");

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f23480d = Pattern.compile("((\\d{1,2})|(100))%");

    /* renamed from: a  reason: collision with root package name */
    public final String f23481a;

    /* renamed from: b  reason: collision with root package name */
    public final T f23482b;

    public v9(String str, T t10) {
        this.f23481a = str;
        this.f23482b = t10;
    }

    public static Integer a(String str) {
        String[] split = str.split(":");
        if (split.length == 3) {
            try {
                return Integer.valueOf((Integer.parseInt(split[1]) * 60 * 1000) + (Integer.parseInt(split[0]) * 60 * 60 * 1000) + ((int) (Float.parseFloat(split[2]) * 1000.0f)));
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f23482b.compareTo(((v9) obj).f23482b);
    }
}
