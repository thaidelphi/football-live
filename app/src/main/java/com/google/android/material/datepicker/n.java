package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;
/* compiled from: TimeSource.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
class n {

    /* renamed from: c  reason: collision with root package name */
    private static final n f14224c = new n(null, null);

    /* renamed from: a  reason: collision with root package name */
    private final Long f14225a;

    /* renamed from: b  reason: collision with root package name */
    private final TimeZone f14226b;

    private n(Long l10, TimeZone timeZone) {
        this.f14225a = l10;
        this.f14226b = timeZone;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static n c() {
        return f14224c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Calendar a() {
        return b(this.f14226b);
    }

    Calendar b(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l10 = this.f14225a;
        if (l10 != null) {
            calendar.setTimeInMillis(l10.longValue());
        }
        return calendar;
    }
}
